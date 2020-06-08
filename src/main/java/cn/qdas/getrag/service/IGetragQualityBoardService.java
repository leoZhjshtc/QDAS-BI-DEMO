package cn.qdas.getrag.service;

import cn.qdas.core.db.DataSource;
import cn.qdas.getrag.bean.QualityBoardGetrag;

import java.util.List;
import java.util.Map;

public interface IGetragQualityBoardService {
    List getProductLineDataService(QualityBoardGetrag qualityBoardGetrag);
    List getMissionManageChartDataService(QualityBoardGetrag qualityBoardGetrag);
    Map getMissionManageTeilInfoService(QualityBoardGetrag qualityBoardGetrag);
    List missionManageDetailsMerkmalService(QualityBoardGetrag qualityBoardGetrag);
    List getProcessRecent24HoursDataService(QualityBoardGetrag qualityBoardGetrag);
    List getMerkmalRecent24HoursDataService(QualityBoardGetrag qualityBoardGetrag);
    @DataSource("sqliteGetragDataSource")
    List getProcessMonthReportDataService(QualityBoardGetrag qualityBoardGetrag);
    @DataSource("sqliteGetragDataSource")
    List getYearComboboxDataService();
    @DataSource("sqliteGetragDataSource")
    List getProcessYearReportDataMapper(QualityBoardGetrag qualityBoardGetrag);
    List getRecent125NumMapper(QualityBoardGetrag qualityBoardGetrag);
    Map getQbShowFormInfoService(QualityBoardGetrag qualityBoard);
    List getProductLineComboDataService(QualityBoardGetrag qualityBoard);
}
