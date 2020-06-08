/**
 * 
 */
package cn.qdas.getrag.controller;

import cn.qdas.bi.controller.QualityAnalyseScheduled;
import cn.qdas.core.utils.ApplicationContextUtil;
import cn.qdas.getrag.bean.QualityAnalyseGetragBean;
import cn.qdas.getrag.service.IQualityAnalyseGetragService;
import org.apache.poi.util.SystemOutLogger;

import java.io.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author leo.Zhou 周钧 2019年11月6日
 */
public class QualityAnalyseScheduledGetrag {
	//@Scheduled(cron = "0 0 23 * * ?")
	// @Scheduled(cron="0/30 * * * * ?")
	public void doSynchronizedGetrag() {
		IQualityAnalyseGetragService iQualityAnalyseGetragService = (IQualityAnalyseGetragService) ApplicationContextUtil.getBean("qualityAnalyseGetragService");
		getLocalData(iQualityAnalyseGetragService);
	}
	public void getLocalData(IQualityAnalyseGetragService iQualityAnalyseGetragService){
		Map timeMap= getYesterdayTime();
		QualityAnalyseGetragBean qualityAnalyseGetragBean=new QualityAnalyseGetragBean();
		qualityAnalyseGetragBean.setStartTime(timeMap.get("startTime").toString());
		qualityAnalyseGetragBean.setEndTime(timeMap.get("endTime").toString());
		List<Map> yesterDayList=iQualityAnalyseGetragService.getLocalEveryDayDataService(qualityAnalyseGetragBean);
		//List saveList= new ArrayList<Map>();
		for(int i=0;i<yesterDayList.size();i++){
			Map saveMap=yesterDayList.get(i);
			List<Map> wvList= (List) saveMap.get("wvList");
			int nokCount=0;
			for(int j=0;j<wvList.size();j++){
				if(null!=wvList.get(j).get("MEMERKART")&&"1".equals(wvList.get(j).get("MEMERKART").toString())){
					if(wvList.get(j).get("WVWERT")!=null&&Float.parseFloat(wvList.get(j).get("WVWERT").toString().substring(wvList.get(j).get("WVWERT").toString().indexOf(".")-1))>0){
						nokCount += 1;
					}
				}else {
					if((wvList.get(j).get("MEUGW")!=null&&wvList.get(j).get("WVWERT")!=null&&
							Float.parseFloat(String.valueOf(wvList.get(j).get("WVWERT")))<Float.parseFloat(String.valueOf(wvList.get(j).get("MEUGW"))))||
							(wvList.get(j).get("MEOGW")!=null&&wvList.get(j).get("WVWERT")!=null&&
									Float.parseFloat(String.valueOf(wvList.get(j).get("WVWERT")))>Float.parseFloat(String.valueOf(wvList.get(j).get("MEOGW"))))) {
						nokCount += 1;
					}
				}
			}
			int okCount=wvList.size()-nokCount;
			float passRate=(float)okCount*100/wvList.size();
			DecimalFormat decimalFormat=new DecimalFormat(".00");
			saveMap.put("passRate",decimalFormat.format(passRate));
			saveMap.put("startTime", timeMap.get("startTime"));
		}

		//保存数据
		iQualityAnalyseGetragService.synchronizedLocalDataService(yesterDayList);
	}
	public void synchronizedDataBase(IQualityAnalyseGetragService iQualityAnalyseGetragService) {
		doLog("开始同步零件和参数信息");
		// 同步数据库 teil，merkmal
		try {
			iQualityAnalyseGetragService.delTeilTableDataService();
			iQualityAnalyseGetragService.delMerkmalTableDataService();
		} catch (Exception e) {
			doLog("清空本地零件参数信息出错");
		}
			
			List<Map> qdasTeilList = iQualityAnalyseGetragService.getTeilAndMerkmalDataService();
			List synMerkmalList=new ArrayList();
			for (int i = 0; i < qdasTeilList.size(); i++) {
				int dlCount = 0;
				Map teilMap = qdasTeilList.get(i);
				List<Map> merkmalList = (List<Map>) teilMap.get("merkmalList");
				synMerkmalList.addAll(merkmalList);
				if (merkmalList.size() != 0) {
					teilMap.put("merkmalCount",merkmalList.size());
					for (int j = 0; j < merkmalList.size(); j++) {
						Map merkmalMap = merkmalList.get(j);
						if (null!=merkmalMap.get("MEMERKART")&&!"1".equals(merkmalMap.get("MEMERKART").toString())) {
							dlCount += 1;
						}
					}
				}
				teilMap.put("dlCount",dlCount);
			}
			try {
				iQualityAnalyseGetragService.synchronizedLocalTeilService(qdasTeilList);
			} catch (Exception e) {
				e.printStackTrace();
				doLog("存储零件数据至本地出错");
			}
			try {
				iQualityAnalyseGetragService.synchronizedLocalMerkmalService(synMerkmalList);
			} catch (Exception e) {
				e.printStackTrace();
				doLog("存储参数数据至本地出错");
			}
//		}
		doLog("同步零件和参数数据成功");
	}

	public static Map getYesterdayTime(){
		SimpleDateFormat startFormat=new SimpleDateFormat("yyyy-MM-dd 00:00:00");
		Date today=new Date();
		Calendar calendar=Calendar.getInstance();
		calendar.add(Calendar.DATE,-1);
		Date yesterdayDate=calendar.getTime();
		Map map=new HashMap();
		map.put("startTime",startFormat.format(yesterdayDate));
		map.put("endTime",startFormat.format(today));
//		map.put("startTime","2020-04-08 00:00:00");
//		map.put("endTime","2020-04-09 00:00:00");
		return map;
	}
	public static void doLog(String logStr) {
		Properties prop = new Properties();
		try {
			prop.load(QualityAnalyseScheduled.class.getResourceAsStream("/jdbc.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String filePath=prop.getProperty("cpkLogFile");

		Date now=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String nowStr=sdf.format(new Date());
		File logFile=new File(filePath);
		if(!logFile.exists()) {
			try {
				logFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		BufferedWriter write = null;
		try {
			fos = new FileOutputStream(logFile,true);
			osw=new OutputStreamWriter(fos, "UTF-8");
			write=new BufferedWriter(osw);
			write.write(nowStr+"-----"+logStr+"\r\n");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				write.close();
				osw.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}


	}
}
