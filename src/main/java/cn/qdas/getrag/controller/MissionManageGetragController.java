package cn.qdas.getrag.controller;

import cn.qdas.getrag.bean.MissionManageGetragBean;
import cn.qdas.getrag.service.IMissionManageGetragService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
public class MissionManageGetragController {
    @Resource
    IMissionManageGetragService missionManageGetragService;
    @RequestMapping("getragInitManageMainPage")
    public String initManageMainPage(){
        return "getrag/mm/manageMainPage";
    }
    @RequestMapping("getragInitMissionManage")
    public String initMissionManage(){
        return "getrag/mm/missionManagePage";
    }
    @RequestMapping("getragMissionManageChartData")
    @ResponseBody
    public List getMissionManageChartData(MissionManageGetragBean missionManageGetragBean){
        List list=missionManageGetragService.getMissionManageChartDataService(missionManageGetragBean);
        return list;
    }
    @RequestMapping("initMissionManageDetailsPage")
    public String initMissionManageDetailsPage(MissionManageGetragBean missionManageGetragBean, Model model){
        Map infoMap = missionManageGetragService.getMissionManageTeilInfoService(missionManageGetragBean);
        infoMap.put("wvwertnr",missionManageGetragBean.getWvwertnr());
        model.addAttribute("infoMap",infoMap);
        return "getrag/mm/missionManageDetailsPage";
    }
    @RequestMapping("missionManageDetailsMerkmalTable")
    @ResponseBody
    public List missionManageDetailsMerkmalTable(MissionManageGetragBean missionManageGetragBean){
        List list = missionManageGetragService.missionManageDetailsMerkmalMapper(missionManageGetragBean);
        return list;
    }
}
