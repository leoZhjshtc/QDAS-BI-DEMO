package cn.qdas.getrag.dao;

import cn.qdas.getrag.bean.QualityBoardGetrag;

import java.util.List;
import java.util.Map;

public interface GetragQualityBoardMapper {
    List getProductLineDataMapper(QualityBoardGetrag qualityBoardGetrag);
    List getMissionManageChartDataMapper(QualityBoardGetrag qualityBoardGetrag);
    Map getMissionManageTeilInfoMapper(QualityBoardGetrag qualityBoardGetrag);
    List missionManageDetailsMerkmalMapper(QualityBoardGetrag qualityBoardGetrag);
    List getProcessRecent24HoursDataMapper(QualityBoardGetrag qualityBoardGetrag);
    List getMerkmalRecent24HoursDataMapper(QualityBoardGetrag qualityBoardGetrag);
    List getProcessMonthReportDataMapper(QualityBoardGetrag qualityBoardGetrag);
    List getYearComboboxDataMapper();
    List getProcessYearReportDataMapper(QualityBoardGetrag qualityBoardGetrag);
    List getRecent125NumMapper(QualityBoardGetrag qualityBoardGetrag);
    List getChartDataMapper(QualityBoardGetrag qualityBoard);
    List getQbShowFormInfoMapper(QualityBoardGetrag qualityBoard);
    List getProductLineComboDataMapper(QualityBoardGetrag qualityBoard);
}
