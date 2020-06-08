package cn.qdas.getrag.service;

import cn.qdas.getrag.bean.MissionManageGetragBean;

import java.util.List;
import java.util.Map;

public interface IMissionManageGetragService {
    List getMissionManageChartDataService(MissionManageGetragBean missionManageGetragBean);
    Map getMissionManageTeilInfoService(MissionManageGetragBean missionManageGetragBean);
    List missionManageDetailsMerkmalMapper(MissionManageGetragBean missionManageGetragBean);
}
