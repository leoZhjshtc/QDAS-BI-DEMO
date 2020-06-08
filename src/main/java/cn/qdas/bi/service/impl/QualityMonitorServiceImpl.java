/**
 * 
 */
package cn.qdas.bi.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


import cn.qdas.bi.bean.QualityMonitorBean;
import cn.qdas.bi.dao.QualityMonitorMapper;
import cn.qdas.bi.service.IQualityMonitorService;

/**
 * @author leo.Zhou 周钧
 * 2019年9月26日
 */
@Service
public class QualityMonitorServiceImpl implements IQualityMonitorService{
	@Resource
	QualityMonitorMapper qmm;
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityMonitorService#getProductLineAlarmData(cn.qdas.bi.bean.QualityMonitorBean)
	 */
	@Override
	public List getProductLineAlarmData(QualityMonitorBean qmb,List<Map> plList) {
		/*for(int i=0;i<list.size();i++){
			Map map=list.get(i);
			if(null==map.get("TEKOSTST")||"".equals(map.get("TEKOSTST"))){
				list.remove(i);
				i--;
			}else{
				if(Integer.parseInt(String.valueOf(map.get("wvCount")))==0){
					map.put("qualityLevel","3");
				}else if(Integer.parseInt(String.valueOf(map.get("alarmCount1")))>0||Integer.parseInt(String.valueOf(map.get("alarmCount2")))>0||Integer.parseInt(String.valueOf(map.get("alarmCount65536")))>0){
					map.put("qualityLevel","2");
				}else if(Integer.parseInt(String.valueOf(map.get("alarmCount16")))>0||Integer.parseInt(String.valueOf(map.get("alarmCount32")))>0){
					map.put("qualityLevel","1");
				}else{
					map.put("qualityLevel","0");
				}
				map.put("buttonId",String.valueOf(map.get("TEKOSTST")).replaceAll(" ", "-"));
			}
		}*/
		if(plList.size()!=0) {
			qmb.setStartTime(getThreeMonthAgo());
			String [] plArr=new String[plList.size()];
        	for(int i=0;i<plList.size();i++) {
        		plArr[i]=(String) plList.get(i).get("productLine_name");
        	}
        	qmb.setProductLineNames(plArr);
        	List<Map> list=qmm.getProductLineAlarmData(qmb);
        	for(int i=0;i<plList.size();i++) {
        		Map plMap= plList.get(i);
    			plMap.put("qualityLevel", "3");
    			plMap.put("buttonId", plList.get(i).get("productLine_name").toString().replaceAll(" ", "-"));
    			for(int j=0;j<list.size();j++) {
    				if(plMap.get("productLine_name").equals(list.get(j).get("TEKOSTST"))) {
    					if("3".equals(plMap.get("qualityLevel").toString())) {
    						plMap.put("qualityLevel", "0");
    					}
    					if("1".equals(list.get(j).get("MEMERKART").toString())) {
    						//if(Float.parseFloat(String.valueOf(list.get(j).get("WVWERT")))>1000) {
    						if(Float.parseFloat(list.get(j).get("WVWERT").toString().substring(list.get(j).get("WVWERT").toString().indexOf(".")-1))>0) {
    							plMap.put("qualityLevel", "2");
    							plMap.put("alarmTeil", list.get(j).get("TETEILNR"));
    							plMap.put("alarmMerkmal", list.get(j).get("MEMERKBEZ"));
    							plMap.put("alarmTime", list.get(j).get("WVDATZEIT"));
    							plMap.put("alarmResult", "不合格");
    							break;
    						}
    					}else {
    						if(list.get(j).get("MEUGW")!=null&&Float.parseFloat(String.valueOf(list.get(j).get("WVWERT")))<Float.parseFloat(String.valueOf(list.get(j).get("MEUGW")))) {
    							plMap.put("qualityLevel", "2");
    							plMap.put("alarmTeil", list.get(j).get("TETEILNR"));
    							plMap.put("alarmMerkmal", list.get(j).get("MEMERKBEZ"));
    							plMap.put("alarmTime", list.get(j).get("WVDATZEIT"));
    							plMap.put("alarmResult", "测量数据超下限");
    							break;
    						}else if(list.get(j).get("MEOGW")!=null&&Float.parseFloat(String.valueOf(list.get(j).get("WVWERT")))>Float.parseFloat(String.valueOf(list.get(j).get("MEOGW")))) {
    							plMap.put("qualityLevel", "2");
    							plMap.put("alarmTeil", list.get(j).get("TETEILNR"));
    							plMap.put("alarmMerkmal", list.get(j).get("MEMERKBEZ"));
    							plMap.put("alarmTime", list.get(j).get("WVDATZEIT"));
    							plMap.put("alarmResult", "测量数据超上限");
    							break;
    						}else if(list.get(j).get("MENORMISTUN")!=null&&Float.parseFloat(String.valueOf(list.get(j).get("WVWERT")))<Float.parseFloat(String.valueOf(list.get(j).get("MENORMISTUN")))) {
    							if("0".equals(plMap.get("qualityLevel").toString())) {
    								plMap.put("qualityLevel", "1");
        							plMap.put("alarmTeil", list.get(j).get("TETEILNR"));
        							plMap.put("alarmMerkmal", list.get(j).get("MEMERKBEZ"));
        							plMap.put("alarmTime", list.get(j).get("WVDATZEIT"));
        							plMap.put("alarmResult", "测量数据超下警戒限");
    							}
    						}else if(list.get(j).get("MENORMISTOB")!=null&&Float.parseFloat(String.valueOf(list.get(j).get("WVWERT")))>Float.parseFloat(String.valueOf(list.get(j).get("MENORMISTOB")))) {
    							if("0".equals(plMap.get("qualityLevel").toString())) {
    								plMap.put("qualityLevel", "1");
        							plMap.put("alarmTeil", list.get(j).get("TETEILNR"));
        							plMap.put("alarmMerkmal", list.get(j).get("MEMERKBEZ"));
        							plMap.put("alarmTime", list.get(j).get("WVDATZEIT"));
        							plMap.put("alarmResult", "测量数据超下警戒限");
    							}
    						}
    					}
    				}
    			}
        	}
		}
		/*List<Map> list=qmm.getProductLineAlarmData(qmb);
		String [] plArr=qmb.getProductLineNames();
		List<Map> alarmList=new ArrayList<Map>();
		for(int i=0;i<plArr.length;i++) {
			Map plMap= new HashMap<String,String>();
			plMap.put("TEKOSTST", plArr[i]);
			plMap.put("qualityLevel", "0");
			plMap.put("buttonId", plArr[i].replaceAll(" ", "-"));
			alarmList.add(plMap);
		}
		for(int i=0;i<alarmList.size();i++) {
			Map aMap=alarmList.get(i);
			for(int j=0;j<list.size();j++) {
				if(aMap.get("TEKOSTST").equals(list.get(j).get("TEKOSTST"))) {
					if("0".equals(list.get(j).get("MEMERKART"))) {
						if(!"1000".equals(list.get(j).get("WVWERT"))) {
							aMap.put("qualityLevel", "2");
							break;
						}
					}else {
						if(list.get(j).get("MEUGW")!=null&&Float.parseFloat(String.valueOf(list.get(j).get("WVWERT")))<Float.parseFloat(String.valueOf(list.get(j).get("MEUGW")))) {
							aMap.put("qualityLevel", "2");
							break;
						}else if(list.get(j).get("MEOGW")!=null&&Float.parseFloat(String.valueOf(list.get(j).get("WVWERT")))>Float.parseFloat(String.valueOf(list.get(j).get("MEOGW")))) {
							aMap.put("qualityLevel", "2");
							break;
						}
					}
				}
			}
		}*/
		return plList;
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityMonitorService#getProcessAlarmData(cn.qdas.bi.bean.QualityMonitorBean)
	 */
	@Override
	public List getProcessAlarmData(QualityMonitorBean qmb) {
		qmb.setStartTime(getThreeMonthAgo());
		List<Map> list=qmm.getProcessAlarmData(qmb);
		if(list.size()!=0) {
			for(int i=0;i<list.size();i++) {
				Map map =list.get(i);
				map.put("qualityLevel",0);
				map.put("buttonId",map.get("TEAUFTRAGSTR").toString().replaceAll("/", "").replaceAll(" ", "-"));
				List<Map> infoList=(List) map.get("MEASURELIST");
				if(infoList.size()!=0) {
					for(int j=0;j<infoList.size();j++) {
						if("1".equals(infoList.get(j).get("MEMERKART").toString())) {
							if(infoList.get(j).get("WVWERT")!=null&&Float.parseFloat(infoList.get(j).get("WVWERT").toString().substring(infoList.get(j).get("WVWERT").toString().indexOf(".")-1))>0) {
								map.put("qualityLevel",2);
								break;
							}
						}else {
							if((infoList.get(j).get("MEUGW")!=null&&infoList.get(j).get("WVWERT")!=null&&
									Float.parseFloat(String.valueOf(infoList.get(j).get("WVWERT")))<Float.parseFloat(String.valueOf(infoList.get(j).get("MEUGW"))))||
									(infoList.get(j).get("MEOGW")!=null&&infoList.get(j).get("WVWERT")!=null&&
									Float.parseFloat(String.valueOf(infoList.get(j).get("WVWERT")))>Float.parseFloat(String.valueOf(infoList.get(j).get("MEOGW"))))) {
								map.put("qualityLevel",2);
								break;
							}else if((infoList.get(j).get("MENORMISTUN")!=null&&infoList.get(j).get("WVWERT")!=null&&Float.parseFloat(String.valueOf(infoList.get(j).get("WVWERT")))<Float.parseFloat(String.valueOf(infoList.get(j).get("MENORMISTUN"))))||
									(infoList.get(j).get("MENORMISTOB")!=null&&infoList.get(j).get("WVWERT")!=null&&Float.parseFloat(String.valueOf(infoList.get(j).get("WVWERT")))>Float.parseFloat(String.valueOf(infoList.get(j).get("MENORMISTOB"))))) {
								map.put("qualityLevel",1);
							}
						}
					}
				}
			}
		}
		return list;
	}

	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityMonitorService#getProdectLineByFactory(cn.qdas.core.bean.SystemSetupBean)
	 */
	@Override
	public List getProductLineByFactory(QualityMonitorBean qmb) {
		List list=qmm.getProductLineByFactory(qmb);
		return list;
	}

	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityMonitorService#getMachineAlarmData(cn.qdas.bi.bean.QualityMonitorBean)
	 */
	@Override
	public List getMachineAlarmData(QualityMonitorBean qmb) {
		qmb.setStartTime(getThreeMonthAgo());
		List<Map> list=qmm.getMachineAlarmData(qmb);
		if(list.size()!=0) {
			for(int i=0;i<list.size();i++) {
				Map map =list.get(i);
				map.put("qualityLevel",0);
				map.put("buttonId",map.get("TEPREINRNR").toString().replaceAll("/", "").replaceAll(" ", "-"));
				List<Map> infoList=(List) map.get("MEASURELIST");
				if(infoList.size()!=0) {
					for(int j=0;j<infoList.size();j++) {
						if("1".equals(infoList.get(j).get("MEMERKART").toString())) {
							if(infoList.get(j).get("WVWERT")!=null&&Float.parseFloat(infoList.get(j).get("WVWERT").toString().substring(infoList.get(j).get("WVWERT").toString().indexOf(".")-1))>0) {
								map.put("qualityLevel",2);
								break;
							}
						}else {
							if((infoList.get(j).get("MEUGW")!=null&&infoList.get(j).get("WVWERT")!=null&&
									Float.parseFloat(String.valueOf(infoList.get(j).get("WVWERT")))<Float.parseFloat(String.valueOf(infoList.get(j).get("MEUGW"))))||
									(infoList.get(j).get("MEOGW")!=null&&infoList.get(j).get("WVWERT")!=null&&
									Float.parseFloat(String.valueOf(infoList.get(j).get("WVWERT")))>Float.parseFloat(String.valueOf(infoList.get(j).get("MEOGW"))))) {
								map.put("qualityLevel",2);
								break;
							}else if((infoList.get(j).get("MENORMISTUN")!=null&&infoList.get(j).get("WVWERT")!=null&&Float.parseFloat(String.valueOf(infoList.get(j).get("WVWERT")))<Float.parseFloat(String.valueOf(infoList.get(j).get("MENORMISTUN"))))||
									(infoList.get(j).get("MENORMISTOB")!=null&&infoList.get(j).get("WVWERT")!=null&&Float.parseFloat(String.valueOf(infoList.get(j).get("WVWERT")))>Float.parseFloat(String.valueOf(infoList.get(j).get("MENORMISTOB"))))) {
								map.put("qualityLevel",1);
							}
						}
					}
				}
			}
		}
		return list;
	}

	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityMonitorService#getTeilAlarmData(cn.qdas.bi.bean.QualityMonitorBean)
	 */
	@Override
	public List getTeilAlarmData(QualityMonitorBean qmb) {
		qmb.setStartTime(getThreeMonthAgo());
		List<Map> list=qmm.getTeilAlarmData(qmb);
		if(list.size()!=0) {
			for(int i=0;i<list.size();i++) {
				Map map =list.get(i);
				map.put("qualityLevel",0);
				map.put("buttonId",map.get("TETEILNR").toString().replaceAll("/", "").replaceAll(" ", "-"));
				List<Map> infoList=(List) map.get("MEASURELIST");
				if(infoList.size()!=0) {
					for(int j=0;j<infoList.size();j++) {
						if("1".equals(infoList.get(j).get("MEMERKART").toString())) {
							if(infoList.get(j).get("WVWERT")!=null&&Float.parseFloat(infoList.get(j).get("WVWERT").toString().substring(infoList.get(j).get("WVWERT").toString().indexOf(".")-1))>0) {
								map.put("qualityLevel",2);
								break;
							}
						}else {
							if((infoList.get(j).get("MEUGW")!=null&&infoList.get(j).get("WVWERT")!=null&&
									Float.parseFloat(String.valueOf(infoList.get(j).get("WVWERT")))<Float.parseFloat(String.valueOf(infoList.get(j).get("MEUGW"))))||
									(infoList.get(j).get("MEOGW")!=null&&infoList.get(j).get("WVWERT")!=null&&
									Float.parseFloat(String.valueOf(infoList.get(j).get("WVWERT")))>Float.parseFloat(String.valueOf(infoList.get(j).get("MEOGW"))))) {
								map.put("qualityLevel",2);
								break;
							}else if((infoList.get(j).get("MENORMISTUN")!=null&&infoList.get(j).get("WVWERT")!=null&&Float.parseFloat(String.valueOf(infoList.get(j).get("WVWERT")))<Float.parseFloat(String.valueOf(infoList.get(j).get("MENORMISTUN"))))||
									(infoList.get(j).get("MENORMISTOB")!=null&&infoList.get(j).get("WVWERT")!=null&&Float.parseFloat(String.valueOf(infoList.get(j).get("WVWERT")))>Float.parseFloat(String.valueOf(infoList.get(j).get("MENORMISTOB"))))) {
								map.put("qualityLevel",1);
							}
						}
					}
				}
			}
		}
		return list;
	}

	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityMonitorService#getTeilTop3Value(cn.qdas.bi.bean.QualityMonitorBean)
	 */
	@Override
	public List getTeilTop3Value(QualityMonitorBean qmb) {
		qmb.setStartTime(getThreeMonthAgo());
		List<Map> list=qmm.getTeilTop3Value(qmb);
		for(int i=0;i<list.size();i++) {
			Map map=list.get(i);
			map.put("qualityLevel", "合格");
			List<Map> mList=(List) map.get("MEASURELIST");
			map.put("WVDATZEIT", mList.get(0).get("WVDATZEIT"));
			map.put("PRVORNAME", mList.get(0).get("PRVORNAME"));
			for(int j=0;j<mList.size();j++) {
				if("1".equals(mList.get(j).get("MEMERKART").toString())) {
					if(Float.parseFloat(mList.get(j).get("WVWERT").toString().substring(mList.get(j).get("WVWERT").toString().indexOf(".")-1))>0) {
						map.put("qualityLevel", "不合格");
						map.put("WVDATZEIT", mList.get(j).get("WVDATZEIT"));
						map.put("PRVORNAME", mList.get(j).get("PRVORNAME"));
					}
				}else {
					if((mList.get(j).get("MEUGW")!=null&&mList.get(j).get("WVWERT")!=null&&
							Float.parseFloat(String.valueOf(mList.get(j).get("WVWERT")))<Float.parseFloat(String.valueOf(mList.get(j).get("MEUGW"))))||
							(mList.get(j).get("MEOGW")!=null&&mList.get(j).get("WVWERT")!=null&&
							Float.parseFloat(String.valueOf(mList.get(j).get("WVWERT")))>Float.parseFloat(String.valueOf(mList.get(j).get("MEOGW"))))) {
						map.put("qualityLevel", "不合格");
						map.put("WVDATZEIT", mList.get(j).get("WVDATZEIT"));
						map.put("PRVORNAME", mList.get(j).get("PRVORNAME"));
						break;
					}else if((mList.get(j).get("MENORMISTUN")!=null&&mList.get(j).get("WVWERT")!=null&&Float.parseFloat(String.valueOf(mList.get(j).get("WVWERT")))<Float.parseFloat(String.valueOf(mList.get(j).get("MENORMISTUN"))))||
							(mList.get(j).get("MENORMISTOB")!=null&&mList.get(j).get("WVWERT")!=null&&Float.parseFloat(String.valueOf(mList.get(j).get("WVWERT")))>Float.parseFloat(String.valueOf(mList.get(j).get("MENORMISTOB"))))) {
						map.put("qualityLevel", "超警戒");
						map.put("WVDATZEIT", mList.get(j).get("WVDATZEIT"));
						map.put("PRVORNAME", mList.get(j).get("PRVORNAME"));
					}
				}
			}
		}
		return list;
	}

	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityMonitorService#getMerkmalData(cn.qdas.bi.bean.QualityMonitorBean)
	 */
	@Override
	public List getMerkmalData(QualityMonitorBean qmb) {
		/*Map map=new HashMap<String, Object>();
		Page page = PageHelper.startPage(qmb.getPage(), qmb.getRows(), true);*/
		List list=qmm.getMerkmalData(qmb);
	/*	map.put("rows", list);
		map.put("total", page.getTotal());*/
		return list;
	}

	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityMonitorService#getRecentlyTeilMap(cn.qdas.bi.bean.QualityMonitorBean)
	 */
	@Override
	public Map getRecentlyTeilMap(QualityMonitorBean qmb) {
		List list=qmm.getRecentlyTeilMap(qmb);
		Map map=new HashMap<String, Object>();
		if(list.size()>0) {
			map= (Map) list.get(0);
		}
		return map;
	}

	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityMonitorService#getLastAlarmDataByPl(cn.qdas.bi.bean.QualityMonitorBean)
	 */
	@Override
	public List getLastAlarmDataByPl(QualityMonitorBean qmb) {
		String startTime=getThreeMonthAgo();
		qmb.setStartTime(startTime);
		List<Map> list=qmm.getLastAlarmDataByPl(qmb);
		List relist=new ArrayList<Map>();
		if(list.size()!=0) {
			Map map=new HashMap<String, String>();
			map.put("text", "零件："+list.get(0).get("TETEILNR"));
			Map map2=new HashMap<String, String>();
			map2.put("text", "参数："+list.get(0).get("MEMERKBEZ"));
			Map map3=new HashMap<String, String>();
			map3.put("text", "测量时间："+list.get(0).get("WVDATZEIT"));
			Map map4=new HashMap<String, String>();
			map4.put("text", "测量结果：合格");
			relist.add(map);
			relist.add(map2);
			relist.add(map3);
			relist.add(map4);
		}
		return relist;
	}

	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityMonitorService#getWorkShopByFactory(cn.qdas.bi.bean.QualityMonitorBean)
	 */
	@Override
	public Map getWorkShopByFactory(QualityMonitorBean qmb) {
		Map map=new HashMap<String, Object>();
		qmb.setPage(qmb.getPage()-1);
		String totalRows=qmm.getWorkShopCountByFactory(qmb).get("wsCount").toString();
		List list=qmm.getWorkShopByFactory(qmb);
		if(list.size()>0) {
			map.put("rows", list.get(0));
			map.put("total", totalRows);
		}
		return map;
	}
	public String getThreeMonthAgo() {
		Date today= new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(today);
		calendar.add(Calendar.MONTH, -3);
		Date threeMouth=calendar.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String startTime=sdf.format(threeMouth);
		return startTime;
	}

}
