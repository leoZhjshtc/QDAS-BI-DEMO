package cn.qdas.bi.controller;

import cn.qdas.bi.bean.QualityBoard;
import cn.qdas.bi.service.IQualityBoardService;
import cn.qdas.core.bean.SystemSetupBean;
import cn.qdas.core.service.ISystemSetupService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: Leo-Zhou 周钧
 * @Date: 2019/6/28
 * @Description: cn.qdas.bi.controller
 */
@Controller
@RequestMapping("/qb")
public class QualityBoardController {
    @Resource
    IQualityBoardService qualityBoardService;

    @RequestMapping("initQb")
    public String initQualityBoard(){
        return "bi/qb/qualityBoard";
    }
    @RequestMapping("initProductLine")
    public String initProductLine(QualityBoard qualityBoard,Model model){
        List list=qualityBoardService.getProductLineDataService(qualityBoard);
        model.addAttribute("plList",list);
        return "bi/qb/qbProductLine";
    }
    @RequestMapping("initTeil")
    public String initTeil(QualityBoard qualityBoard,Model model){
        List list = qualityBoardService.getTeilDataService(qualityBoard);
        model.addAttribute("teilList",list);
        return "bi/qb/qbTeil";
    }
    @RequestMapping("initMerkmal")
    public String initMerkmal(QualityBoard qualityBoard,Model model){
        List<Map> list = qualityBoardService.getMerkmalDataService(qualityBoard);
        model.addAttribute("merkmalList",list);
        model.addAttribute("merkmalPageTeilId",list.get(0).get("WVTEIL"));
        return "bi/qb/qbMerkmal";
    }
    @RequestMapping("getChartData")
    @ResponseBody
    public List getChartData(QualityBoard qualityBoard){
        List list=qualityBoardService.getChartDataService(qualityBoard);
        return list;
    }
    @RequestMapping("getQbShowFormInfo")
    @ResponseBody
    public Map getQbShowFormInfo(QualityBoard qualityBoard){
        Map map=qualityBoardService.getQbShowFormInfoService(qualityBoard);
        return map;
    }
}
