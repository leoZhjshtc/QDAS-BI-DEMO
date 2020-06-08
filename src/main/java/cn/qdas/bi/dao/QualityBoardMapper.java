package cn.qdas.bi.dao;


import cn.qdas.bi.bean.QualityBoard;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface QualityBoardMapper {
	List getProductLineDataMapper(QualityBoard qb);
	List getTeilDataMapper(QualityBoard qb);
	List getMerkmalDataMapper(QualityBoard qb);
	List getChartDataMapper(QualityBoard qualityBoard);
	List getQbShowFormInfoMapper(QualityBoard qualityBoard);
}
