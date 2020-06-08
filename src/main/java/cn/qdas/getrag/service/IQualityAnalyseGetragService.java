package cn.qdas.getrag.service;

import cn.qdas.core.db.DataSource;
import cn.qdas.getrag.bean.QualityAnalyseGetragBean;

import java.util.List;

public interface IQualityAnalyseGetragService {
    @DataSource("sqliteGetragDataSource")
    void delTeilTableDataService();
    @DataSource("sqliteGetragDataSource")
    void delMerkmalTableDataService();
    List getTeilAndMerkmalDataService();
    @DataSource("sqliteGetragDataSource")
    void synchronizedLocalTeilService(List list);
    @DataSource("sqliteGetragDataSource")
    void synchronizedLocalMerkmalService(List list);
    @DataSource("sqliteGetragDataSource")
    List getTeilDataService();


    List getTeilRecent24HoursDataService();
    List getProcedureRecent24HoursDataService(QualityAnalyseGetragBean qualityAnalyseGetragBean);
    List getMerkmalRecent24HoursDataService(QualityAnalyseGetragBean qualityAnalyseGetragBean);
    List getLocalEveryDayDataService(QualityAnalyseGetragBean qualityAnalyseGetragBean);
    @DataSource("sqliteGetragDataSource")
    void synchronizedLocalDataService(List list);
    @DataSource("sqliteGetragDataSource")
    List getYearComboboxDataMapper();
    @DataSource("sqliteGetragDataSource")
    List getTeilMonthReportDataService(QualityAnalyseGetragBean qualityAnalyseGetragBean);
    @DataSource("sqliteGetragDataSource")
    List getProcedureMonthReportDataService(QualityAnalyseGetragBean qualityAnalyseGetragBean);
    @DataSource("sqliteGetragDataSource")
    List getTeilYearReportDataService(QualityAnalyseGetragBean qualityAnalyseGetragBean);
    @DataSource("sqliteGetragDataSource")
    List getProcedureYearReportDataService(QualityAnalyseGetragBean qualityAnalyseGetragBean);


}
