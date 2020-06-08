/**
 * 
 */
package cn.qdas.bi.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.rmi.RemoteException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.xml.rpc.holders.DoubleHolder;
import javax.xml.rpc.holders.IntHolder;
import javax.xml.rpc.holders.StringHolder;

import org.apache.axis.types.UnsignedByte;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;

import cn.qdas.bi.bean.QaMerkmalBean;
import cn.qdas.bi.bean.QaTeilBean;
import cn.qdas.bi.bean.QualityBoard;
import cn.qdas.bi.service.IQualityAnalyseService;
import cn.qdas.core.V11Webservice.IQdas_Web_Service;
import cn.qdas.core.V11Webservice.IQdas_Web_ServiceserviceLocator;

/**
 * @author leo.Zhou 周钧
 * 2019年12月19日
 */
public class QualityAnalyseUtils {
	public static void synchronizedDataBase(IQualityAnalyseService iqas) {
		doLog("开始同步零件和参数信息");
		// 同步数据库 teil，merkmal
//		String localMaxTeil = iqas.getLocalMaxTeil().get("MAXTEIL").toString();
//		String qdasMaxTeil = iqas.getQdasMaxTeil().get("MAXTEIL").toString();
//		if (Integer.parseInt(localMaxTeil) < Integer.parseInt(qdasMaxTeil)) {
		try {
			iqas.deleteAllTeilData();
			iqas.deleteAllMerkmalData();
		} catch (Exception e) {
			doLog("清空本地零件参数信息出错");
		}
			
			List<QaTeilBean> qdasTeilList = iqas.getAllTeil();
			// List insertMerkmalList=new ArrayList<QaMerkmalBean>();
			List<QaMerkmalBean> synMerkmalList = new ArrayList<QaMerkmalBean>();
			for (int i = 0; i < qdasTeilList.size(); i++) {
				int dlCount = 0;
				QaTeilBean qtb = qdasTeilList.get(i);
				List<QaMerkmalBean> merkmalList = qtb.getMerkmalList();
				synMerkmalList.addAll(merkmalList);
				if (merkmalList.size() != 0) {
					qtb.setMerkmalCount(merkmalList.size());
					for (int j = 0; j < merkmalList.size(); j++) {
						QaMerkmalBean qmb = merkmalList.get(j);
						if (!"1".equals(qmb.getMemerkart()) && qmb.getMemerkart() != null) {
							dlCount += 1;
						}
					}
				}
				qtb.setDlCount(dlCount);
			}
			try {
				iqas.synchronizedLocalTeil(qdasTeilList);
			} catch (Exception e) {
				doLog("存储零件数据至本地出错");
			}
			try {
				iqas.synchronizedLocalMerkmal(synMerkmalList);
			} catch (Exception e) {
				e.printStackTrace();
				doLog("存储参数数据至本地出错");
			}
//		}
		doLog("同步零件和参数数据成功");
	}
	public static void countMerkmalPassRate(IQualityAnalyseService iqas) {
		doLog("计算每日参数数据开始");
		List<Map> merkmalList = iqas.getAllMerkmalList();
		Map webMap=getWsConnectInfo();
		IQdas_Web_Service client = null;
		int sessionHandle = 0;
		int connResult=-1;
		try {
			IQdas_Web_ServiceserviceLocator iqws=new IQdas_Web_ServiceserviceLocator(webMap.get("url").toString());
			client=iqws.getIQdas_Web_ServicePort();
			IntHolder webConnectResult=new IntHolder();
			IntHolder webConnectHandle=new IntHolder();
			client.webConnect(20, 44, webMap.get("user").toString(), webMap.get("password").toString(), "0.0.0.0", webConnectResult, webConnectHandle);
			connResult=webConnectResult.value;
			sessionHandle=webConnectHandle.value;
		} catch (Exception e) {
			doLog("与QDAS-WS连接失败");
		}
		if(connResult!=0) {
			doLog("获取QDAS-WS连接失败");
		}
		for(int i=0;i<merkmalList.size();i++) {
			List<Map> wvList=iqas.getWertevarByTeilAndMerkmal(merkmalList.get(i).get("METEIL").toString(),merkmalList.get(i).get("MEMERKMAL").toString());
			int cmkAlarm=0;
			int totalCount = wvList.size();
			int nokCount=0;
			int alarmCount=0;
			if(totalCount>0) {
				for(int j=0;j<wvList.size();j++) {
					if("1".equals(merkmalList.get(i).get("MEMERKART").toString())) {
						if(wvList.get(j).get("WVWERT")!=null&&Float.parseFloat(wvList.get(j).get("WVWERT").toString().substring(wvList.get(j).get("WVWERT").toString().indexOf(".")-1))>0) {
							nokCount += 1;
							cmkAlarm=2;
						}
					}else {
						if((merkmalList.get(i).get("MEUGW")!=null&&wvList.get(j).get("WVWERT")!=null&&
								Float.parseFloat(String.valueOf(wvList.get(j).get("WVWERT")))<Float.parseFloat(String.valueOf(merkmalList.get(i).get("MEUGW"))))||
								(merkmalList.get(i).get("MEOGW")!=null&&wvList.get(j).get("WVWERT")!=null&&
								Float.parseFloat(String.valueOf(wvList.get(j).get("WVWERT")))>Float.parseFloat(String.valueOf(merkmalList.get(i).get("MEOGW"))))) {
							nokCount += 1;
							cmkAlarm=2;
							continue;
						}else if((merkmalList.get(i).get("MENORMISTUN")!=null&&wvList.get(j).get("WVWERT")!=null&&Float.parseFloat(String.valueOf(wvList.get(j).get("WVWERT")))<Float.parseFloat(String.valueOf(merkmalList.get(i).get("MENORMISTUN"))))||
								(merkmalList.get(i).get("MENORMISTOB")!=null&&wvList.get(j).get("WVWERT")!=null&&Float.parseFloat(String.valueOf(wvList.get(j).get("WVWERT")))>Float.parseFloat(String.valueOf(merkmalList.get(i).get("MENORMISTOB"))))) {
							alarmCount +=1;
							cmkAlarm=1;
						}
					}
				}
				int cpkAlarm=0;
				String cpk="";
				String upCl="";
				String lowCl="";
				if(connResult==0) {
					if(!"1".equals(merkmalList.get(i).get("MEMERKART").toString())) {
						int maxWvnr=Integer.parseInt(wvList.get(0).get("WVWERTNR").toString());
						int startIndex=0;
						if(maxWvnr>125) {
							startIndex=Integer.parseInt(wvList.get(0).get("WVWERTNR").toString())-125;
						}
						double cmk=0;
						if(null!=merkmalList.get(i).get("CMK")) {
							cmk=Double.parseDouble(merkmalList.get(i).get("CMK").toString());
							
						}
						//double cmk=1.5;
						if(1.33<cmk&&cmk<1.67) {
							try {
								IntHolder createQueryResult=new IntHolder();
								IntHolder queryHandle=new IntHolder();
								client.createQuery(sessionHandle, createQueryResult, queryHandle);
								IntHolder filterResult1=new IntHolder();
								IntHolder filterHandle1=new IntHolder();
								client.createFilterFromSQL(sessionHandle, "TETEIL="+merkmalList.get(i).get("METEIL"), filterResult1, filterHandle1);
								int addFilterToQuery1=client.addFilterToQuery(sessionHandle, queryHandle.value, filterHandle1.value, new UnsignedByte(0), 0, 0);
								IntHolder filterResult2=new IntHolder();
								IntHolder filterHandle2=new IntHolder();
								client.createFilterFromSQL(sessionHandle, "MEMERKMAL="+merkmalList.get(i).get("MEMERKMAL"), filterResult2, filterHandle2);
								int addFilterToQuery2=client.addFilterToQuery(sessionHandle, queryHandle.value, filterHandle2.value, new UnsignedByte(1), 0, 0);
								IntHolder filterResult3=new IntHolder();
								IntHolder filterHandle3=new IntHolder();
								client.createFilterFromSQL(sessionHandle, "WVWERTNR>"+startIndex, filterResult3, filterHandle3);
								int addFilterToQuery3= client.addFilterToQuery(sessionHandle, queryHandle.value, filterHandle3.value, new UnsignedByte(2), 0, 0);
								String part_Char_List="";
								int executeQuery =client.executeQuery(sessionHandle, queryHandle.value, part_Char_List);
								int evaluateChar=client.evaluateChar(sessionHandle, 1, 1, true, 0, 0);
								//CPK
								IntHolder result2=new IntHolder();
								StringHolder statResult_str2=new StringHolder();
								DoubleHolder statResult_db2=new DoubleHolder();
								client.getStatResult(sessionHandle, 5220, 1, 1, new UnsignedByte(0), result2, statResult_str2, statResult_db2);
								//下控制限
								IntHolder lowClResult=new IntHolder();
								StringHolder lowClResult_str=new StringHolder();
								DoubleHolder lowClResult_db=new DoubleHolder();
								client.getStatResult(sessionHandle, 8012, 1, 1, new UnsignedByte(0), lowClResult, lowClResult_str, lowClResult_db);
								//上控制限
								IntHolder upClResult=new IntHolder();
								StringHolder upClResult_str=new StringHolder();
								DoubleHolder upClResult_db=new DoubleHolder();
								client.getStatResult(sessionHandle, 8013, 1, 1, new UnsignedByte(0), upClResult, upClResult_str, upClResult_db);
								
								cpk=statResult_str2.value;
								lowCl=lowClResult_str.value;
								upCl=upClResult_str.value;
								if((!"".equals(cpk))&&cpk!=null) {
									if(Double.parseDouble(cpk)>=1.67) {
										cpkAlarm=0;
									}else if(Double.parseDouble(cpk)>=1.33&&Double.parseDouble(cpk)<1.67){
										cpkAlarm=1;
									}else {
										cpkAlarm=2;
									}
								}
								
								int aa =client.freeFilter(sessionHandle, filterHandle1.value);
								int bb =client.freeFilter(sessionHandle, filterHandle2.value);
								client.freeFilter(sessionHandle, filterHandle3.value);
								int cc =client.freeQuery(sessionHandle, queryHandle.value);
								
							} catch (RemoteException e) {
								doLog("获取零件号"+merkmalList.get(i).get("METEIL")+"参数号"+merkmalList.get(i).get("MEMERKMAL")+"CPK数据失败;---已经获取"+(i+1)+"个参数数据");
								e.printStackTrace();
							}
							/*catch (Exception e) {
								System.out.println("22222222");
								e.printStackTrace();
								doLog("获取零件号"+merkmalList.get(i).get("METEIL")+"参数号"+merkmalList.get(i).get("MEMERKMAL")+"CPK数据失败");
							}*/
						}else {
							cpkAlarm=cmkAlarm;
							
						}
					}
				}
				try {
					System.out.println(cpkAlarm+"====================="+cmkAlarm);
					iqas.updateMerkalCountData(merkmalList.get(i).get("METEIL").toString(), merkmalList.get(i).get("MEMERKMAL").toString(), String.valueOf(alarmCount), String.valueOf(nokCount), String.valueOf(totalCount),cpk,String.valueOf(cpkAlarm),lowCl,upCl);
				} catch (Exception e) {
					doLog("更新零件号"+merkmalList.get(i).get("METEIL")+"参数号"+merkmalList.get(i).get("MEMERKMAL")+"数据发生错误");
				}
				
			}
		}
		if(connResult==0) {
			try {
				int dd =client.clientDisconnect(sessionHandle);
			} catch (RemoteException e) {
				doLog("断开QDAS-WS连接失败");
				e.printStackTrace();
			}
		}
		
		doLog("计算每日参数数据结束");
	}
	public static void getLastMonthData(IQualityAnalyseService iqas,String startTime,String endTime) {
		doLog("开始计算上月数据");
		//ws
		Map webMap=getWsConnectInfo();
		IQdas_Web_Service client = null;
		int sessionHandle = 0;
		int connResult=-1;
		try {
			IQdas_Web_ServiceserviceLocator iqws=new IQdas_Web_ServiceserviceLocator(webMap.get("url").toString());
			client=iqws.getIQdas_Web_ServicePort();
			IntHolder webConnectResult=new IntHolder();
			IntHolder webConnectHandle=new IntHolder();
			client.webConnect(20, 44, webMap.get("user").toString(), webMap.get("password").toString(), "0.0.0.0", webConnectResult, webConnectHandle);
			connResult=webConnectResult.value;
			sessionHandle=webConnectHandle.value;
		} catch (Exception e) {
			doLog("与QDAS-WS连接失败");
		}
		if(connResult!=0) {
			doLog("获取QDAS-WS连接失败");
		}
		List<Map> merkmalList = iqas.getAllMerkmalList();
		List insertList=new ArrayList<Map>();
		for(int i=0;i<merkmalList.size();i++) {
			QualityBoard qb=new QualityBoard();
			qb.setTeilId(merkmalList.get(i).get("METEIL").toString());
			qb.setMerkmalId(merkmalList.get(i).get("MEMERKMAL").toString());
			qb.setStartTime(startTime);
			qb.setEndTime(endTime);
			List<Map> wvList=iqas.getMonthReportData(qb);
			int totalCount=wvList.size();
			int nokCount=0;
			int alarmCount=0;
			int cmkAlarm=0;
			if(totalCount>0) {
				for(int j=0;j<wvList.size();j++) {
					if("1".equals(merkmalList.get(i).get("MEMERKART").toString())) {
						if(wvList.get(j).get("WVWERT")!=null&&Float.parseFloat(wvList.get(j).get("WVWERT").toString().substring(wvList.get(j).get("WVWERT").toString().indexOf(".")-1))>0) {
							nokCount += 1;
							cmkAlarm=2;
						}
					}else {
						if((merkmalList.get(i).get("MEUGW")!=null&&wvList.get(j).get("WVWERT")!=null&&
								Float.parseFloat(String.valueOf(wvList.get(j).get("WVWERT")))<Float.parseFloat(String.valueOf(merkmalList.get(i).get("MEUGW"))))||
								(merkmalList.get(i).get("MEOGW")!=null&&wvList.get(j).get("WVWERT")!=null&&
								Float.parseFloat(String.valueOf(wvList.get(j).get("WVWERT")))>Float.parseFloat(String.valueOf(merkmalList.get(i).get("MEOGW"))))) {
							nokCount += 1;
							cmkAlarm=2;
							continue;
						}else if((merkmalList.get(i).get("MENORMISTUN")!=null&&wvList.get(j).get("WVWERT")!=null&&Float.parseFloat(String.valueOf(wvList.get(j).get("WVWERT")))<Float.parseFloat(String.valueOf(merkmalList.get(i).get("MENORMISTUN"))))||
								(merkmalList.get(i).get("MENORMISTOB")!=null&&wvList.get(j).get("WVWERT")!=null&&Float.parseFloat(String.valueOf(wvList.get(j).get("WVWERT")))>Float.parseFloat(String.valueOf(merkmalList.get(i).get("MENORMISTOB"))))) {
							alarmCount +=1;
							cmkAlarm=1;
						}
					}
				}
				int okCount=totalCount-nokCount;
				double passrate=okCount/(double)totalCount*100;
				String passratestr=formatPassRate(passrate);
				
				int cpkAlarm=0;
				String cpk="";
				if(connResult==0) {
					if(!"1".equals(merkmalList.get(i).get("MEMERKART").toString())) {
						double cmk=0;
						if(null!=merkmalList.get(i).get("CMK")) {
							cmk=Double.parseDouble(merkmalList.get(i).get("CMK").toString());
							
						}
//						double cmk=1.5;
						if(1.33<cmk&&cmk<1.67) {
							try {
								IntHolder createQueryResult=new IntHolder();
								IntHolder queryHandle=new IntHolder();
								client.createQuery(sessionHandle, createQueryResult, queryHandle);
								IntHolder filterResult1=new IntHolder();
								IntHolder filterHandle1=new IntHolder();
								client.createFilterFromSQL(sessionHandle, "TETEIL="+merkmalList.get(i).get("METEIL"), filterResult1, filterHandle1);
								int addFilterToQuery1=client.addFilterToQuery(sessionHandle, queryHandle.value, filterHandle1.value, new UnsignedByte(0), 0, 0);
								IntHolder filterResult2=new IntHolder();
								IntHolder filterHandle2=new IntHolder();
								client.createFilterFromSQL(sessionHandle, "MEMERKMAL="+merkmalList.get(i).get("MEMERKMAL"), filterResult2, filterHandle2);
								int addFilterToQuery2=client.addFilterToQuery(sessionHandle, queryHandle.value, filterHandle2.value, new UnsignedByte(1), 0, 0);
								IntHolder filterResult3=new IntHolder();
								IntHolder filterHandle3=new IntHolder();
								client.createFilterFromSQL(sessionHandle, "WVDATZEIT>'"+startTime+"' and WVDATZEIT<'"+endTime+"'", filterResult3, filterHandle3);
								int addFilterToQuery3= client.addFilterToQuery(sessionHandle, queryHandle.value, filterHandle3.value, new UnsignedByte(2), 0, 0);
								String part_Char_List="";
								int executeQuery =client.executeQuery(sessionHandle, queryHandle.value, part_Char_List);
								int evaluateChar=client.evaluateChar(sessionHandle, 1, 1, true, 0, 0);
								IntHolder result2=new IntHolder();
								StringHolder statResult_str2=new StringHolder();
								DoubleHolder statResult_db2=new DoubleHolder();
								client.getStatResult(sessionHandle, 5220, 1, 1, new UnsignedByte(0), result2, statResult_str2, statResult_db2);
								cpk=statResult_str2.value;
								System.out.println("cpk======"+cpk);
								if((!"".equals(cpk))&&cpk!=null) {
									if(Double.parseDouble(cpk)>=1.67) {
										cpkAlarm=0;
									}else if(Double.parseDouble(cpk)>=1.33&&Double.parseDouble(cpk)<1.67){
										cpkAlarm=1;
									}else {
										cpkAlarm=2;
									}
								}
								int aa =client.freeFilter(sessionHandle, filterHandle1.value);
								int bb =client.freeFilter(sessionHandle, filterHandle2.value);
								client.freeFilter(sessionHandle, filterHandle3.value);
								int cc =client.freeQuery(sessionHandle, queryHandle.value);
								
							} catch (RemoteException e) {
								doLog("获取零件号"+merkmalList.get(i).get("METEIL")+"参数号"+merkmalList.get(i).get("MEMERKMAL")+"CPK数据失败;---已经获取"+(i+1)+"个参数数据");
								e.printStackTrace();
							}
						}else {
							cpkAlarm=cmkAlarm;
							
						}
					}
				}
				Map insertMap=new HashMap<String, Object>();
				insertMap.put("MTEIL", merkmalList.get(i).get("METEIL").toString());
				insertMap.put("MMERKMAL", merkmalList.get(i).get("MEMERKMAL").toString());
				insertMap.put("MONTH", startTime.substring(0, 10));
				insertMap.put("PASSRATE", passratestr);
				insertMap.put("MEMERKART", merkmalList.get(i).get("MEMERKART").toString());
				insertMap.put("CPK", cpk);
				insertMap.put("CPKALARM", cpkAlarm);
				//insertMap.put("YEAR", totalCount+"/"+nokCount+"/"+alarmCount+"/"+passrate);
				insertList.add(insertMap);
			}
		}
		try {
			iqas.insertMonthReport(insertList);
		} catch (Exception e) {
			doLog("插入"+startTime.substring(0, 10)+"数据失败");
		}
		
		if(connResult==0) {
			try {
				int dd =client.clientDisconnect(sessionHandle);
			} catch (RemoteException e) {
				doLog("断开QDAS-WS连接失败");
				e.printStackTrace();
			}
		}
		doLog("计算上月数据结束");
	}
	public static Map getThreeMonthAgo() {
		Date today= new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(today);
		calendar.add(Calendar.MONTH, -1);
		Date lastMouth=calendar.getTime();
		SimpleDateFormat lastsdf=new SimpleDateFormat("yyyy-MM-01 00:00:00");
		String startTime=lastsdf.format(lastMouth);
		String endTime=lastsdf.format(today);
		Map map =new HashMap<String, String>();
		map.put("startTime", startTime);
		map.put("endTime", endTime);
//		map.put("startTime", "2019-08-01 00:00:00");
//		map.put("endTime", "2019-09-01 00:00:00");
		return map;
	}
	public static String formatPassRate(double dd) {
		DecimalFormat df = new DecimalFormat("#.####");
		return df.format(dd);
	}
	public void getAllRunningThread() {
		ThreadGroup currentGroup=Thread.currentThread().getThreadGroup();
		int noThreads = currentGroup.activeCount();
		Thread[] lstThreads = new Thread[noThreads];
	    currentGroup.enumerate(lstThreads);
	    for (int i = 0; i < noThreads; i++)
	    System.out.println("线程号：" + i + " = " + lstThreads[i].getName());
	}
	public static Map getWsConnectInfo() {
		Map map=new HashMap<String, Object>();
		Properties prop = new Properties();
		try {
			prop.load(Test.class.getResourceAsStream("/jdbc.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		map.put("user", prop.getProperty("webservice.user"));
		map.put("url", prop.getProperty("webservice.url"));
		map.put("password", prop.getProperty("webservice.password"));
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
	public static Map getCpkAndZftBy125(QualityBoard qb,Map indexMap) {
		Map imgMap=new HashMap<String ,Object>();
		try {
			Map webMap=getWsConnectInfo();
			IQdas_Web_ServiceserviceLocator iqws=new IQdas_Web_ServiceserviceLocator(webMap.get("url").toString());
			IQdas_Web_Service client=iqws.getIQdas_Web_ServicePort();
			IntHolder webConnectResult=new IntHolder();
			IntHolder webConnectHandle=new IntHolder();
			client.webConnect(20, 44, webMap.get("user").toString(), webMap.get("password").toString(), "0.0.0.0", webConnectResult, webConnectHandle);
			int sessionHandle=webConnectHandle.value;
			IntHolder createQueryResult=new IntHolder();
			IntHolder queryHandle=new IntHolder();
			client.createQuery(sessionHandle, createQueryResult, queryHandle);
			IntHolder filterResult1=new IntHolder();
			IntHolder filterHandle1=new IntHolder();
			client.createFilterFromSQL(sessionHandle, "TETEIL="+qb.getTeilId(), filterResult1, filterHandle1);
			int addFilterToQuery1=client.addFilterToQuery(sessionHandle, queryHandle.value, filterHandle1.value, new UnsignedByte(0), 0, 0);
			IntHolder filterResult2=new IntHolder();
			IntHolder filterHandle2=new IntHolder();
			client.createFilterFromSQL(sessionHandle, "MEMERKMAL="+qb.getMerkmalId(), filterResult2, filterHandle2);
			int addFilterToQuery2=client.addFilterToQuery(sessionHandle, queryHandle.value, filterHandle2.value, new UnsignedByte(1), 0, 0);

			IntHolder filterResult3=new IntHolder();
			IntHolder filterHandle3=new IntHolder();
			client.createFilterFromSQL(sessionHandle, "WVWERTNR>"+(Integer.parseInt(indexMap.get("startIndex").toString())-1), filterResult3, filterHandle3);
			int addFilterToQuery3= client.addFilterToQuery(sessionHandle, queryHandle.value, filterHandle3.value, new UnsignedByte(2), 0, 0);
			
			
			
			String part_Char_List="";
			int executeQuery =client.executeQuery(sessionHandle, queryHandle.value, part_Char_List);
			int evaluateAllChars= client.evaluateAllChars(sessionHandle);
			
			
			int evaluateChar=client.evaluateChar(sessionHandle, 1, 1, true, 0, 0);
			
			/*IntHolder result1=new IntHolder();
			StringHolder statResult_str1=new StringHolder();
			DoubleHolder statResult_dbl=new DoubleHolder();
			client.getStatResult(sessionHandle, 5210, 1, 1, new UnsignedByte(0), result1, statResult_str1, statResult_dbl);*/
			IntHolder result2=new IntHolder();
			StringHolder statResult_str2=new StringHolder();
			DoubleHolder statResult_db2=new DoubleHolder();
			client.getStatResult(sessionHandle, 5220, 1, 1, new UnsignedByte(0), result2, statResult_str2, statResult_db2);

			
			
			/*StringHolder graphicStr1=new StringHolder();
			IntHolder getGraphicResult1=new IntHolder();
			client.getGraphic(sessionHandle, 3100, 1, 1, 650, 350, getGraphicResult1, graphicStr1);*/
			StringHolder graphicStr2=new StringHolder();
			IntHolder getGraphicResult2=new IntHolder();
			client.getGraphic(sessionHandle, 3300, 1, 1, 650, 350, getGraphicResult2, graphicStr2);
			/*StringHolder graphicStr3=new StringHolder();
			IntHolder getGraphicResult3=new IntHolder();
			client.getGraphic(sessionHandle, 6103, 1, 1, 650, 350, getGraphicResult3, graphicStr3);
			StringHolder graphicStr4=new StringHolder();
			IntHolder getGraphicResult4=new IntHolder();
			client.getGraphic(sessionHandle, 5203, 1, 1, 510, 730, getGraphicResult4, graphicStr4);*/
			
			/*String imagexml1=graphicStr1.value;
			Document doc1=DocumentHelper.parseText(imagexml1);
			Element rootele1=doc1.getRootElement();
			Node imgNode1=rootele1.selectSingleNode("Image");*/
			
			String imagexml2=graphicStr2.value;
			Document doc2=DocumentHelper.parseText(imagexml2);
			Element rootele2=doc2.getRootElement();
			Node imgNode2=rootele2.selectSingleNode("Image");
			
			/*String imagexml3=graphicStr3.value;
			Document doc3=DocumentHelper.parseText(imagexml3);
			Element rootele3=doc3.getRootElement();
			Node imgNode3=rootele3.selectSingleNode("Image");
			
			String imagexml4=graphicStr4.value;
			Document doc4=DocumentHelper.parseText(imagexml4);
			Element rootele4=doc4.getRootElement();
			Node imgNode4=rootele4.selectSingleNode("Image");*/
			
			
			//imgMap.put("dzt", imgNode1.getText());
			imgMap.put("zft", imgNode2.getText());
			//imgMap.put("kzt", imgNode3.getText());
			//imgMap.put("bg3", imgNode4.getText());
			//imgMap.put("cp", statResult_str1.value);
			imgMap.put("cpk", statResult_str2.value);
			imgMap.put("mess", 1);
			int aa =client.freeFilter(sessionHandle, filterHandle1.value);
			int bb =client.freeFilter(sessionHandle, filterHandle2.value);
			int ee =client.freeFilter(sessionHandle, filterHandle3.value);
			int cc =client.freeQuery(sessionHandle, queryHandle.value);
			int dd =client.clientDisconnect(sessionHandle);
		} catch (Exception e) {
			imgMap.put("mess", -1);
		}
		
		return imgMap;
	}
	public static Map getCpkAndZftByTime(QualityBoard qb) {
		Map imgMap=new HashMap<String ,Object>();
		try {
			Map webMap=getWsConnectInfo();
			IQdas_Web_ServiceserviceLocator iqws=new IQdas_Web_ServiceserviceLocator(webMap.get("url").toString());
			IQdas_Web_Service client=iqws.getIQdas_Web_ServicePort();
			IntHolder webConnectResult=new IntHolder();
			IntHolder webConnectHandle=new IntHolder();
			client.webConnect(20, 44, webMap.get("user").toString(), webMap.get("password").toString(), "0.0.0.0", webConnectResult, webConnectHandle);
			int sessionHandle=webConnectHandle.value;
			IntHolder createQueryResult=new IntHolder();
			IntHolder queryHandle=new IntHolder();
			client.createQuery(sessionHandle, createQueryResult, queryHandle);
			IntHolder filterResult1=new IntHolder();
			IntHolder filterHandle1=new IntHolder();
			client.createFilterFromSQL(sessionHandle, "TETEIL="+qb.getTeilId(), filterResult1, filterHandle1);
			int addFilterToQuery1=client.addFilterToQuery(sessionHandle, queryHandle.value, filterHandle1.value, new UnsignedByte(0), 0, 0);
			IntHolder filterResult2=new IntHolder();
			IntHolder filterHandle2=new IntHolder();
			client.createFilterFromSQL(sessionHandle, "MEMERKMAL="+qb.getMerkmalId(), filterResult2, filterHandle2);
			int addFilterToQuery2=client.addFilterToQuery(sessionHandle, queryHandle.value, filterHandle2.value, new UnsignedByte(1), 0, 0);
			String searchDate="";
			if(qb.getStartTime()==null||"".equals(qb.getStartTime())||"undefined".equals(qb.getStartTime())) {
				searchDate="WVDATZEIT<'"+qb.getEndTime()+"'";
			}else if(qb.getEndTime()==null||"".equals(qb.getEndTime())||"undefined".equals(qb.getEndTime())){
				searchDate="WVDATZEIT>'"+qb.getStartTime()+"'";
			}else {
				
				searchDate="WVDATZEIT>'"+qb.getStartTime()+"' and WVDATZEIT<'"+qb.getEndTime()+"'";
			}
			IntHolder filterResult3=new IntHolder();
			IntHolder filterHandle3=new IntHolder();
			client.createFilterFromSQL(sessionHandle, searchDate, filterResult3, filterHandle3);
			int addFilterToQuery3= client.addFilterToQuery(sessionHandle, queryHandle.value, filterHandle3.value, new UnsignedByte(2), 0, 0);
			
			
			
			String part_Char_List="";
			int executeQuery =client.executeQuery(sessionHandle, queryHandle.value, part_Char_List);
			int evaluateAllChars= client.evaluateAllChars(sessionHandle);
			
			
			//int evaluateChar=client.evaluateChar(sessionHandle, 1, 1, true, 0, 0);
			
			/*IntHolder result1=new IntHolder();
			StringHolder statResult_str1=new StringHolder();
			DoubleHolder statResult_dbl=new DoubleHolder();
			client.getStatResult(sessionHandle, 5210, 1, 1, new UnsignedByte(0), result1, statResult_str1, statResult_dbl);*/
			IntHolder result2=new IntHolder();
			StringHolder statResult_str2=new StringHolder();
			DoubleHolder statResult_db2=new DoubleHolder();
			client.getStatResult(sessionHandle, 5220, 1, 1, new UnsignedByte(0), result2, statResult_str2, statResult_db2);

			
			
			/*StringHolder graphicStr1=new StringHolder();
			IntHolder getGraphicResult1=new IntHolder();
			client.getGraphic(sessionHandle, 3100, 1, 1, 650, 350, getGraphicResult1, graphicStr1);*/
			StringHolder graphicStr2=new StringHolder();
			IntHolder getGraphicResult2=new IntHolder();
			client.getGraphic(sessionHandle, 3300, 1, 1, 650, 350, getGraphicResult2, graphicStr2);
			/*StringHolder graphicStr3=new StringHolder();
			IntHolder getGraphicResult3=new IntHolder();
			client.getGraphic(sessionHandle, 6103, 1, 1, 650, 350, getGraphicResult3, graphicStr3);
			StringHolder graphicStr4=new StringHolder();
			IntHolder getGraphicResult4=new IntHolder();
			client.getGraphic(sessionHandle, 5203, 1, 1, 510, 730, getGraphicResult4, graphicStr4);*/
			
			/*String imagexml1=graphicStr1.value;
			Document doc1=DocumentHelper.parseText(imagexml1);
			Element rootele1=doc1.getRootElement();
			Node imgNode1=rootele1.selectSingleNode("Image");*/
			
			String imagexml2=graphicStr2.value;
			Document doc2=DocumentHelper.parseText(imagexml2);
			Element rootele2=doc2.getRootElement();
			Node imgNode2=rootele2.selectSingleNode("Image");
			
			/*String imagexml3=graphicStr3.value;
			Document doc3=DocumentHelper.parseText(imagexml3);
			Element rootele3=doc3.getRootElement();
			Node imgNode3=rootele3.selectSingleNode("Image");
			
			String imagexml4=graphicStr4.value;
			Document doc4=DocumentHelper.parseText(imagexml4);
			Element rootele4=doc4.getRootElement();
			Node imgNode4=rootele4.selectSingleNode("Image");*/
			
			
			//imgMap.put("dzt", imgNode1.getText());
			imgMap.put("zft", imgNode2.getText());
			//imgMap.put("kzt", imgNode3.getText());
			//imgMap.put("bg3", imgNode4.getText());
			//imgMap.put("cp", statResult_str1.value);
			imgMap.put("cpk", statResult_str2.value);
			imgMap.put("mess", 1);
			int aa =client.freeFilter(sessionHandle, filterHandle1.value);
			int bb =client.freeFilter(sessionHandle, filterHandle2.value);
			int ee =client.freeFilter(sessionHandle, filterHandle3.value);
			int cc =client.freeQuery(sessionHandle, queryHandle.value);
			int dd =client.clientDisconnect(sessionHandle);
		} catch (Exception e) {
			imgMap.put("mess", -1);
		}
		
		return imgMap;
	}
}
