package cn.qdas.getrag.service.impl;

import cn.qdas.getrag.bean.MissionManageGetragBean;
import cn.qdas.getrag.dao.MissionManageGetragMapper;
import cn.qdas.getrag.service.IMissionManageGetragService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class MissionManageGetragServiceImpl implements IMissionManageGetragService {
    @Resource
    MissionManageGetragMapper missionManageGetragMapper;

    @Override
    public List getMissionManageChartDataService(MissionManageGetragBean missionManageGetragBean) {
        List list=missionManageGetragMapper.getMissionManageChartDataMapper(missionManageGetragBean);
        return list;
    }

    @Override
    public Map getMissionManageTeilInfoService(MissionManageGetragBean missionManageGetragBean) {
        Map map= missionManageGetragMapper.getMissionManageTeilInfoMapper(missionManageGetragBean);
        return map;
    }

    @Override
    public List missionManageDetailsMerkmalMapper(MissionManageGetragBean missionManageGetragBean) {
        List list = missionManageGetragMapper.missionManageDetailsMerkmalMapper(missionManageGetragBean);
        return list;
    }
}
