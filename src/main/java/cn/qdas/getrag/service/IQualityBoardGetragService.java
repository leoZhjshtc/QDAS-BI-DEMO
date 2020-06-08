package cn.qdas.getrag.service;


import cn.qdas.getrag.bean.QualityBoardGetrag;

import java.util.List;
import java.util.Map;

public interface IQualityBoardGetragService {
    List getTeilDataService(QualityBoardGetrag qualityBoard);
    List getProcedureDataService(QualityBoardGetrag qualityBoard);
    List getMerkmalDataService(QualityBoardGetrag qualityBoard);
    List getChartDataService(QualityBoardGetrag qualityBoard);
    Map getQbShowFormInfoService(QualityBoardGetrag qualityBoard);
}
