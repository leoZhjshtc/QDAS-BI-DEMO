package cn.qdas.getrag.dao;

import cn.qdas.getrag.bean.MissionManageGetragBean;

import java.util.List;
import java.util.Map;

public interface MissionManageGetragMapper {
    List getMissionManageChartDataMapper(MissionManageGetragBean missionManageGetragBean);
    Map getMissionManageTeilInfoMapper(MissionManageGetragBean missionManageGetragBean);
    List missionManageDetailsMerkmalMapper(MissionManageGetragBean missionManageGetragBean);
}
