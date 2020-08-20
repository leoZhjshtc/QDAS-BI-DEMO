package cn.qdas.getrag.dao;

import cn.qdas.getrag.bean.QualityAnalyseGetragBean;

import java.util.List;

public interface QualityAnalyseGetragMapper {
    void delTeilTableDataMapper();
    void delMerkmalTableDataMapper();
    List getTeilAndMerkmalDataMapper();
    void synchronizedLocalTeilMapper(List list);
    void synchronizedLocalMerkmalMapper(List list);
    List getTeilDataMapper();

    //new
    List getTeilRecent24HoursDataMapper(QualityAnalyseGetragBean qualityAnalyseGetragBean);
    List getProcedureRecent24HoursDataMapper(QualityAnalyseGetragBean qualityAnalyseGetragBean);
    List getMerkmalRecent24HoursDataMapper(QualityAnalyseGetragBean qualityAnalyseGetragBean);

    List getLocalEveryDayDataMapper(QualityAnalyseGetragBean qualityAnalyseGetragBean);
    void synchronizedLocalDataMapper(List list);
    List getYearComboboxDataMapper();
    List getTeilMonthReportDataMapper(QualityAnalyseGetragBean qualityAnalyseGetragBean);
    List getProcedureMonthReportDataMapper(QualityAnalyseGetragBean qualityAnalyseGetragBean);
    List getTeilYearReportDataMapper(QualityAnalyseGetragBean qualityAnalyseGetragBean);
    List getProcedureYearReportDataMapper(QualityAnalyseGetragBean qualityAnalyseGetragBean);
}
