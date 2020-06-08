package cn.qdas.bi_adminlte.service;

import cn.qdas.bi_adminlte.bean.TeilBean;
import cn.qdas.core.db.DataSource;

import java.util.List;
import java.util.Map;

public interface IQualityBoardAdminLteService {
    List getProductLineDataService(TeilBean teilBean);
    List getProcessDataService(TeilBean teilBean);
    List getMerkmalDataService(TeilBean teilBean);
    List getPlMissionManageChartDataService(TeilBean teilBean);
    List getProcessMissionManageChartDataService(TeilBean teilBean);
    List getMerkmalChartDataService(TeilBean teilBean);
    List getMissionManageDetailsService(TeilBean teilBean);
    List getProductLineRecent24HoursDataService(TeilBean teilBean);
    @DataSource("sqliteGetragDataSource")
    List getProductLineMonthReportDataService(TeilBean teilBean);
    @DataSource("sqliteGetragDataSource")
    List getYearComboboxDataService();
    @DataSource("sqliteGetragDataSource")
    List getProductLineYearReportDataService(TeilBean teilBean);
    List getProcessRecent24HoursDataService(TeilBean teilBean);
    @DataSource("sqliteGetragDataSource")
    List getProcessMonthReportDataService(TeilBean teilBean);
    @DataSource("sqliteGetragDataSource")
    List getProcessYearReportDataService(TeilBean teilBean);
    List getQaMerkmalDataService(TeilBean teilBean);
    List getRecent125NumService(TeilBean teilBean);
    Map getQbShowFormInfoService(TeilBean teilBean);

    Map getSetupInfoMap();
}
