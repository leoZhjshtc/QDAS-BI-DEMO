package cn.qdas.bi.service;


import cn.qdas.bi.bean.QbProductLine;
import cn.qdas.bi.bean.QualityBoard;
import cn.qdas.core.bean.SystemSetupBean;
import cn.qdas.core.db.DataSource;

import java.util.List;
import java.util.Map;

public interface IQualityBoardService {
    List getProductLineDataService(QualityBoard qualityBoard);
    List getTeilDataService(QualityBoard qualityBoard);
    List getMerkmalDataService(QualityBoard qualityBoard);
    List getChartDataService(QualityBoard qualityBoard);
    Map getQbShowFormInfoService(QualityBoard qualityBoard);
}
