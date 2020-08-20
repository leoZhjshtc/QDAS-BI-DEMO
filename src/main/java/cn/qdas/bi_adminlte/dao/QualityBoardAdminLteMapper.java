package cn.qdas.bi_adminlte.dao;


import cn.qdas.bi_adminlte.bean.TeilBean;

import java.util.List;

public interface QualityBoardAdminLteMapper {
    List getProductLineDataMapper(TeilBean teilBean);
    List getProductLineDataMapperByCount(TeilBean teilBean);
    List getProcessDataMapperByCount(TeilBean teilBean);
    List getProcessDataMapper(TeilBean teilBean);
    List getMerkmalDataMapper(TeilBean teilBean);
    List getMerkmalDataMapperByCount(TeilBean teilBean);
    List getPlMissionManageChartDataMapper(TeilBean teilBean);
    List getProcessMissionManageChartDataMapper(TeilBean teilBean);
    List getMerkmalChartDataMapper(TeilBean teilBean);
    List getMerkmalChartDataMapperByCount(TeilBean teilBean);
    List getMissionManageDetailsMapper(TeilBean teilBean);
    List getProductLineRecent24HoursDataMapper(TeilBean teilBean);
    List getProductLineMonthReportDataMapper(TeilBean teilBean);
    List getYearComboboxDataMapper();
    List getProductLineYearReportDataMapper(TeilBean teilBean);
    List getProcessRecent24HoursDataMapper(TeilBean teilBean);
    List getProcessMonthReportDataMapper(TeilBean teilBean);
    List getProcessYearReportDataMapper(TeilBean teilBean);
    List getQaMerkmalDataMapper(TeilBean teilBean);
    List getRecent125NumMapper(TeilBean teilBean);
    List getQbShowFormInfoMapper(TeilBean teilBean);
}
