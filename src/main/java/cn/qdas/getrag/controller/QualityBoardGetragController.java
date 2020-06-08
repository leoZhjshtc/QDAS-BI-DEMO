package cn.qdas.getrag.controller;

import cn.qdas.getrag.bean.QualityBoardGetrag;
import cn.qdas.getrag.service.IQualityBoardGetragService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Auther: Leo-Zhou 周钧
 * @Date: 2019/6/28
 * @Description: cn.qdas.bi.controller
 */
@Controller
@RequestMapping("/qbGetrag")
public class QualityBoardGetragController {
    @Resource
    IQualityBoardGetragService qualityBoardGetragService;

    @RequestMapping("initQb")
    public String initQualityBoard(){
        return "getrag/qb/qualityBoard";
    }
    @RequestMapping("initTeilPage")
    public String initTeilPage(QualityBoardGetrag qbg,Model model){
        List list=qualityBoardGetragService.getTeilDataService(qbg);
        model.addAttribute("teilList",list);
        return "getrag/qb/qbTeilPage";
    }
    @RequestMapping("initProcedurePage")
    public String initProcedurePage(QualityBoardGetrag qbg,Model model){
        List list = qualityBoardGetragService.getProcedureDataService(qbg);
        model.addAttribute("procedureList",list);
        model.addAttribute("procedureTeilNum", qbg.getTeilNum());
        model.addAttribute("procedureTeilName",qbg.getTeilName());
        model.addAttribute("procedureTeilK1003",qbg.getProductClass());
        return "getrag/qb/qbProcedurePage";
    }
    @RequestMapping("initMerkmal")
    public String initMerkmal(QualityBoardGetrag qbg,Model model){
        List<Map> list = qualityBoardGetragService.getMerkmalDataService(qbg);
        model.addAttribute("merkmalList",list);
        model.addAttribute("merkmalPageTeilId",list.get(0).get("WVTEIL"));
        return "getrag/qb/qbMerkmal";
    }
    @RequestMapping("getChartData")
    @ResponseBody
    public List getChartData(QualityBoardGetrag qbg){
        List list=qualityBoardGetragService.getChartDataService(qbg);
        return list;
    }
    @RequestMapping("getQbShowFormInfo")
    @ResponseBody
    public Map getQbShowFormInfo(QualityBoardGetrag qbg){
        Map map=qualityBoardGetragService.getQbShowFormInfoService(qbg);
        return map;
    }
    @RequestMapping("initQbShowPage")
    public String initQbShowPage(){
        return "getrag/qb/qbShowPage";
    }
}
