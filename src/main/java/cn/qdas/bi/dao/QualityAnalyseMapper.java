/**
 * 
 */
package cn.qdas.bi.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.qdas.bi.bean.QualityBoard;

/**
 * @author leo.Zhou 周钧
 * 2019年8月26日
 */
public interface QualityAnalyseMapper {
	List getTeilTableData(QualityBoard qb);
	List getMerkmalDataByTeilId(QualityBoard qb);
	List getMerkmalByTeilId(QualityBoard qb);
	List getChartDataByMerkmalIds(@Param("teilNum") String teilNum, @Param("merkmalIds") String[] merkmalIds);
	List getAllTeil();
	void synchronizedLocalTeil(List teilList);
	void synchronizedLocalMerkmal(List merkmalList);
	Map getLocalMaxTeil();
	Map getQdasMaxTeil();
	List<Map> getProductLineData(@Param("productLines") String[] productLines);
	List getAllMerkmalList();
	List getWertevarByTeilAndMerkmal(@Param("teilId") String teilId, @Param("merkmalId") String merkmalId);
	void updateMerkalCountData(@Param("teilId") String teilId, @Param("merkmalId") String merkmalId, @Param("alarmCount") String alarmCount, @Param("nokCount") String nokCount, @Param("totalCount") String totalCount, @Param("cpk") String cpk, @Param("cpkAlarm") String cpkAlarm, @Param("lowCl") String lowCl, @Param("upCl") String upCl);
	void batchUpdateMerkalCountData(List list);
	List getQaProcessData(QualityBoard qb);
	List getQaMachineData(@Param("productLineName") String productLineName, @Param("processNum") String processNum);
	List getQaTeilData(@Param("productLineName") String productLineName, @Param("machineName") String machineName, @Param("processNum") String processNum);
	void deleteAllCountData();
	List getDztChartData125(QualityBoard qb);
	List getDztChartDataByDate(QualityBoard qb);
	List getMonthReportData(QualityBoard qb);
	void insertMonthReport(List list);
	List getPlMonthReportData(@Param("reportYear") String reportYear, @Param("productLines") String[] productLines);
	List getMachineMonthReportData(QualityBoard qb);
	List getTeilMonthReportData(QualityBoard qb);
	void deleteAllTeilData();
	void deleteAllMerkmalData();
	List getChartDataByTeilAndMerkmal(@Param("teilId") String teilId, @Param("merkmalId") String merkmalId, @Param("startTime") String startTime, @Param("endTime") String endTime);
	
	List getMonthReportCombobox();
	
	List getQaMerkmalDetails(QualityBoard qb);
	List getStartIndex(QualityBoard qb);
	List getAllProductLineByFactoryName(@Param("factoryName") String factoryName);
}
