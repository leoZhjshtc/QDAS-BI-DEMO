package cn.qdas.bi.dao;

import java.util.List;
import cn.qdas.bi.bean.MissionManageBean;

public interface MissionManageMapper {
	List getProductionPlanChartData(MissionManageBean mmb);
	List getProductionPlanChartDataByK1002();
	List getCheckMissionData(MissionManageBean mmb);
	List getAllProductClassComboBox();
	List getAllCheckTypeComboBox();
	List getAllCheckPlanNumComboBox();
	List getAllTeilNameComboBox();
	List getAllCheckManComboBox();
	List getAllTeilNumComboBox();
	List getProcedureComboBox();
	List getProductLineByFw(MissionManageBean mmb);
	List getDetailsTeilTable(MissionManageBean mmb);
	List getDetailsMerkmalTable(MissionManageBean mmb);
}
