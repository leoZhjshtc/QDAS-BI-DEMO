/**
 * 
 */
package cn.qdas.bi.service;

import java.util.List;
import java.util.Map;


import cn.qdas.bi.bean.QualityBoard;
import cn.qdas.core.db.DataSource;

/**
 * @author leo.Zhou 周钧
 * 2019年8月26日
 */
public interface IQualityAnalyseService {
	List getQaTeilTableData(QualityBoard qb);
	List getQaMerkmalTableData(QualityBoard qb);
	
	List getQaMerkmalByTeilId(QualityBoard qb);
	List getChartDataByMerkmalIds(QualityBoard qb, String[] merkmalIds);
	List getChartDataByTeilAndMerkmal(List<Map> list, String startTime, String endTime);
	
	List getAllTeil();
	@DataSource("sqliteDataSource")
	void synchronizedLocalTeil(List list);
	@DataSource("sqliteDataSource")
	void synchronizedLocalMerkmal(List list);
	@DataSource("sqliteDataSource")
	Map getLocalMaxTeil();
	Map getQdasMaxTeil();
	@DataSource("sqliteDataSource")
	List getProductLineData(String[] productLines);
	@DataSource("sqliteDataSource")
	List getAllMerkmalList();
	List getWertevarByTeilAndMerkmal(String teilId, String merkmalId);
	@DataSource("sqliteDataSource")
	void updateMerkalCountData(String teilId, String merkmalId, String alarmCount, String nokCount, String totalCount, String cpk, String cpkAlarm, String lowCl, String upCl);
	@DataSource("sqliteDataSource")
	void batchUpdateMerkalCountData(List list);
	@DataSource("sqliteDataSource")
	List getQaProcessData(QualityBoard qb);
	@DataSource("sqliteDataSource")
	List getQaMachineData(String productLineName, String processNum);
	@DataSource("sqliteDataSource")
	List getQaTeilData(String productLineName, String machineName, String processNum);
	@DataSource("sqliteDataSource")
	void deleteAllCountData();
	List getDztChartData(QualityBoard qb);
	List getMonthReportData(QualityBoard qb);
	@DataSource("sqliteDataSource")
	void insertMonthReport(List list);
	@DataSource("sqliteDataSource")
	List getPlMonthReportData(String year, String[] productLines);
	@DataSource("sqliteDataSource")
	List getMachineMonthReportData(QualityBoard qb);
	@DataSource("sqliteDataSource")
	List getTeilMonthReportData(QualityBoard qb);
	@DataSource("sqliteDataSource")
	void deleteAllTeilData();
	@DataSource("sqliteDataSource")
	void deleteAllMerkmalData();
	@DataSource("sqliteDataSource")
	List getMonthReportCombobox();
	@DataSource("sqliteDataSource")
	List getQaMerkmalDetails(QualityBoard qb);
	List getQaMerkmalDetailsByDate(QualityBoard qb);
	Map getCpkAndZftByTime(QualityBoard qb);
	Map getStartIndex(QualityBoard qb);
	@DataSource("sqliteDataSource")
	List getAllProductLineByFactoryName(String factoryName);
}
