/**
 * 
 */
package cn.qdas.bi.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.qdas.bi.bean.QualityBoard;
import cn.qdas.bi.dao.QualityAnalyseMapper;
import cn.qdas.bi.service.IQualityAnalyseService;

/**
 * @author leo.Zhou 周钧
 * 2019年8月26日
 */
@Service("qualityAnalyseService")
public class QualityAnalyseServiceImpl implements IQualityAnalyseService {
	@Resource
	QualityAnalyseMapper qam;
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityAnalyseService#getQaTeilTableData()
	 */
	@Override
	public List getQaTeilTableData(QualityBoard qb) {
		List list=qam.getTeilTableData(qb);
		return list;
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityAnalyseService#getQaMerkmalTableData()
	 */
	@Override
	public List getQaMerkmalTableData(QualityBoard qb) {
		List list=qam.getMerkmalDataByTeilId(qb);
		return list;
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityAnalyseService#getQaMerkmalByTeilId(cn.qdas.bi.bean.QualityBoard)
	 */
	@Override
	public List getQaMerkmalByTeilId(QualityBoard qb) {
		List list=qam.getMerkmalByTeilId(qb);
		return list;
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityAnalyseService#getChartDataByMerkmalIds(cn.qdas.bi.bean.QualityBoard, java.lang.String[])
	 */
	@Override
	public List getChartDataByMerkmalIds(QualityBoard qb, String[] merkmalIds) {
		List list=qam.getChartDataByMerkmalIds(qb.getTeilNum(), merkmalIds);
		return list;
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityAnalyseService#getAllTeil()
	 */
	@Override
	public List getAllTeil() {
		List list= qam.getAllTeil();
		return list;
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityAnalyseService#testSql()
	 */
	@Override
	public void synchronizedLocalTeil(List list) {
		qam.synchronizedLocalTeil(list);
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityAnalyseService#getLocalMaxTeil()
	 */
	@Override
	public Map getLocalMaxTeil() {
		Map map=qam.getLocalMaxTeil();
		return map;
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityAnalyseService#getQdasMaxTeil()
	 */
	@Override
	public Map getQdasMaxTeil() {
		return qam.getQdasMaxTeil();
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityAnalyseService#getProductLineData()
	 */
	@Override
	public List getProductLineData(String [] productLines) {
		List<Map> list=qam.getProductLineData(productLines);
		return list;
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityAnalyseService#synchronizedLocalMerkmal(java.util.List)
	 */
	@Override
	public void synchronizedLocalMerkmal(List list) {
		if(list.size()>=1000) {
			int listSize=0;
			if(list.size()%1000>0) {
				listSize=list.size()/1000+1;
			}else {
				listSize=list.size()/1000;
				
			}
			for(int i=0;i<listSize;i++) {
				List newList=new ArrayList<Map>();
				if(i!=listSize-1) {
					System.out.println(i*1000+"====="+((i+1)*1000));
					newList=list.subList(i*1000, (i+1)*1000);
				}else {
					System.out.println(i*1000+"====="+list.size());
					newList=list.subList(i*1000,list.size());
				}
				qam.synchronizedLocalMerkmal(newList);
			}
		}else {
			qam.synchronizedLocalMerkmal(list);
		}
		
		
		
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityAnalyseService#getAllMerkmalList()
	 */
	@Override
	public List getAllMerkmalList() {
		return qam.getAllMerkmalList();
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityAnalyseService#getWertevarByTeilAndMerkmal()
	 */
	@Override
	public List getWertevarByTeilAndMerkmal(String teilId,String merkmalId) {
		return qam.getWertevarByTeilAndMerkmal(teilId,merkmalId);
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityAnalyseService#updateMerkalCountData(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void updateMerkalCountData(String teilId, String merkmalId, String alarmCount, String nokCount,
			String totalCount,String cpk,String cpkAlarm,String lowCl,String upCl) {
		qam.updateMerkalCountData(teilId, merkmalId, alarmCount, nokCount, totalCount, cpk, cpkAlarm,lowCl,upCl);
		
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityAnalyseService#batchUpdateMerkalCountData(java.util.List)
	 */
	@Override
	public void batchUpdateMerkalCountData(List list) {
		qam.batchUpdateMerkalCountData(list);
		
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityAnalyseService#getQaMachineData(java.lang.String)
	 */
	@Override
	public List getQaMachineData(String productLineName,String processNum) {
		List list=qam.getQaMachineData(productLineName,processNum);
		return list;
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityAnalyseService#getQaTeilData(java.lang.String, java.lang.String)
	 */
	@Override
	public List getQaTeilData(String productLineName, String machineName,String processNum) {
		List list=qam.getQaTeilData(productLineName, machineName,processNum);
		return list;
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityAnalyseService#deleteAllCountData()
	 */
	@Override
	public void deleteAllCountData() {
		qam.deleteAllCountData();
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityAnalyseService#getQaProcessData(java.lang.String)
	 */
	@Override
	public List getQaProcessData(QualityBoard qb) {
		return qam.getQaProcessData(qb);
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityAnalyseService#getDztChartData(cn.qdas.bi.bean.QualityBoard)
	 */
	@Override
	public List getDztChartData(QualityBoard qb) {
		List list;
		if(("".equals(qb.getStartTime())||qb.getStartTime()==null||"undefined".equals(qb.getStartTime()))&&("".equals(qb.getEndTime())||qb.getEndTime()==null||"undefined".equals(qb.getEndTime()))) {
			list= qam.getDztChartData125(qb);
		}else {
			list= qam.getDztChartDataByDate(qb);
		}
		return list;
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityAnalyseService#getMonthReportData(cn.qdas.bi.bean.QualityBoard)
	 */
	@Override
	public List getMonthReportData(QualityBoard qb) {
		return qam.getMonthReportData(qb);
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityAnalyseService#insertMonthReport(java.util.List)
	 */
	@Override
	public void insertMonthReport(List list) {
		qam.insertMonthReport(list);
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityAnalyseService#getPlMonthReportData()
	 */
	@Override
	public List getPlMonthReportData(String year,String [] productLines) {
		return qam.getPlMonthReportData(year,productLines);
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityAnalyseService#getMachineMonthReportData(cn.qdas.bi.bean.QualityBoard)
	 */
	@Override
	public List getMachineMonthReportData(QualityBoard qb) {
		return qam.getMachineMonthReportData(qb);
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityAnalyseService#getTeilMonthReportData(cn.qdas.bi.bean.QualityBoard)
	 */
	@Override
	public List getTeilMonthReportData(QualityBoard qb) {
		return qam.getTeilMonthReportData(qb);
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityAnalyseService#deleteAllTeilData()
	 */
	@Override
	public void deleteAllTeilData() {
		qam.deleteAllTeilData();
		
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityAnalyseService#deleteAllMerkmalData()
	 */
	@Override
	public void deleteAllMerkmalData() {
		qam.deleteAllMerkmalData();
		
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityAnalyseService#getChartDataByTeilAndMerkmal(java.util.List)
	 */
	@Override
	public List getChartDataByTeilAndMerkmal(List<Map> list,String startTime,String endTime) {
		List reList=new ArrayList<Map>();
		if(list.size()!=0) {
			for(int i=0;i<list.size();i++) {
				List dataList=qam.getChartDataByTeilAndMerkmal(list.get(i).get("meteil").toString(), list.get(i).get("memerkmal").toString(),startTime,endTime);
				reList.addAll(dataList);
			}
		}
		return reList;
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityAnalyseService#getMonthReportCombobox()
	 */
	@Override
	public List getMonthReportCombobox() {
		List<Map> list= qam.getMonthReportCombobox();
		List<Map> reList=new ArrayList<Map>();
		Map map =new HashMap<String, String>();
		map.put("text", "显示所有");
		map.put("value", "");
		reList.add(map);
		for(int i=0;i<list.size();i++) {
			Map rmap =new HashMap<String, String>();
			rmap.put("text",list.get(i).get("YEAR")+"年");
			rmap.put("value",list.get(i).get("YEAR"));
			reList.add(rmap);
		}
		return reList;
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityAnalyseService#getQaMerkmalDetails(cn.qdas.bi.bean.QualityBoard)
	 */
	@Override
	public List getQaMerkmalDetails(QualityBoard qb) {
		List list=qam.getQaMerkmalDetails(qb);
		return list;
	}
	public List getQaMerkmalDetailsByDate(QualityBoard qb) {
		return null;
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityAnalyseService#getCpkAndZftByTime(cn.qdas.bi.bean.QualityBoard)
	 */
	@Override
	public Map getCpkAndZftByTime(QualityBoard qb) {
		// TODO Auto-generated method stub
		return null;
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityAnalyseService#getStartIndex(cn.qdas.bi.bean.QualityBoard)
	 */
	@Override
	public Map getStartIndex(QualityBoard qb) {
		List<Map> list=qam.getStartIndex(qb);
		Map map = new HashMap<String,Object>();
		int listIndex=0;
		if(list.size()>0) {
			listIndex=list.size()-1;
			map.put("startIndex", list.get(listIndex).get("WVWERTNR"));
		}else {
			map.put("startIndex", 0);
		}
		
		return map;
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityAnalyseService#getAllProductLineByFactoryName(java.lang.String)
	 */
	@Override
	public List getAllProductLineByFactoryName(String factoryName) {
		return qam.getAllProductLineByFactoryName(factoryName);
	}
}
