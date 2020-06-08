package cn.qdas.getrag.dao;



import cn.qdas.getrag.bean.QualityBoardGetrag;

import java.util.List;

public interface QualityBoardGetragMapper {
	List getTeilDataMapper(QualityBoardGetrag qb);
	List getProcedureDataMapper(QualityBoardGetrag qb);
	List getMerkmalDataMapper(QualityBoardGetrag qb);
	List getChartDataMapper(QualityBoardGetrag qualityBoard);
	List getQbShowFormInfoMapper(QualityBoardGetrag qualityBoard);
}
