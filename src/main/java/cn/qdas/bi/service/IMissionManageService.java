/**
 * 
 */
package cn.qdas.bi.service;

import java.util.List;
import java.util.Map;

import cn.qdas.bi.bean.MissionManageBean;
import cn.qdas.core.db.DataSource;

/**
 * @author leo.Zhou 周钧
 * 2019年8月22日
 */
public interface IMissionManageService {
	List getProductionPlanChartData(MissionManageBean mmb, String[] productLineArr);
	List getProductionPlanChartDataByK1002();
	Map getCheckMissionData(MissionManageBean mmb, String[] productLineArr);
	List getCheckMissionDataExcel(MissionManageBean mmb, String[] productLineArr);
	List getAllProductClassComboBox();
	List getAllCheckTypeComboBox();
	List getAllCheckPlanNumComboBox();
	List getAllTeilNameComboBox();
	List getAllCheckManComboBox();
	List getAllTeilNumComboBox();
	List getProcedureComboBox();
	@DataSource("sqliteDataSource")
	List getAllProductLineByfw(MissionManageBean mmb);
	@DataSource("sqliteDataSource")
	List getProductLineByfw(MissionManageBean mmb);
	Map getDetailsTeilTable(MissionManageBean mmb);
	List getDetailsMerkmalTable(MissionManageBean mmb);
	
}
