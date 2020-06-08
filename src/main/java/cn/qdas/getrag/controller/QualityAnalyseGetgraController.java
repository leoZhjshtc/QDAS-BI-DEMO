package cn.qdas.getrag.controller;

import cn.qdas.getrag.bean.QualityAnalyseGetragBean;
import cn.qdas.getrag.service.IQualityAnalyseGetragService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/getragQa")
public class QualityAnalyseGetgraController {
    @Resource
    IQualityAnalyseGetragService qualityAnalyseGetragService;
    @RequestMapping("initGetgraQaPage")
    public String initGetgraQaPage(){
        return "getrag/qa/qualityAnalysePage";
    }
    @RequestMapping("initTeilQualityAnalyse")
    public String initTeilQualityAnalyse(){
        return "getrag/qa/qaTeil";
    }
    @RequestMapping("getTeilData")
    @ResponseBody
    public List getTeilData(){
        List list = qualityAnalyseGetragService.getTeilDataService();
        return list;
    }

    //new
    @RequestMapping("getTeilRecent24HoursData")
    @ResponseBody
    public List getTeilRecent24HoursData(){
        return qualityAnalyseGetragService.getTeilRecent24HoursDataService();
    }
    @RequestMapping("initProcedureQualityAnalyse")
    public String initProcedureQualityAnalyse(QualityAnalyseGetragBean qualityAnalyseGetragBean, Model model){
        Map map=new HashMap<String,Object>();
        map.put("qaProcedureTeilNum",qualityAnalyseGetragBean.getTeilNum());
        map.put("qaProcedureTeilName",qualityAnalyseGetragBean.getTeilName());
        map.put("qaProcedureTeilD",qualityAnalyseGetragBean.getTeilDescription());
        model.addAttribute("qaProcedureMap",map);
        return "getrag/qa/qaProcedure";
    }
    @RequestMapping("getProcedureRecent24HoursData")
    @ResponseBody
    public List getProcedureRecent24HoursData(QualityAnalyseGetragBean qualityAnalyseGetragBean){
        return qualityAnalyseGetragService.getProcedureRecent24HoursDataService(qualityAnalyseGetragBean);
    }
    @RequestMapping("initMerkmalQualityAnalyse")
    public String initMerkmalQualityAnalyse(QualityAnalyseGetragBean qualityAnalyseGetragBean, Model model){
        model.addAttribute("qaMerkmalTeilId",qualityAnalyseGetragBean.getTeilId());
        return "getrag/qa/qaMerkmal";
    }
    @RequestMapping("getMerkmalRecent24HoursData")
    @ResponseBody
    public List getMerkmalRecent24HoursData(QualityAnalyseGetragBean qualityAnalyseGetragBean){
        return qualityAnalyseGetragService.getMerkmalRecent24HoursDataService(qualityAnalyseGetragBean);
    }
    @RequestMapping("getYearComboboxData")
    @ResponseBody
    public List getYearComboboxData(){
        return qualityAnalyseGetragService.getYearComboboxDataMapper();
    }
    @RequestMapping("getTeilMonthReportData")
    @ResponseBody
    public List getTeilMonthReportData(QualityAnalyseGetragBean qualityAnalyseGetragBean){
        return qualityAnalyseGetragService.getTeilMonthReportDataService(qualityAnalyseGetragBean);
    }
    @RequestMapping("getProcedureMonthReportData")
    @ResponseBody
    public List getProcedureMonthReportData(QualityAnalyseGetragBean qualityAnalyseGetragBean){
        return qualityAnalyseGetragService.getProcedureMonthReportDataService(qualityAnalyseGetragBean);
    }
    @RequestMapping("getTeilYearReportData")
    @ResponseBody
    public List getTeilYearReportData(QualityAnalyseGetragBean qualityAnalyseGetragBean){
        return qualityAnalyseGetragService.getTeilYearReportDataService(qualityAnalyseGetragBean);
    }
    @RequestMapping("getProcedureYearReportData")
    @ResponseBody
    public List getProcedureYearReportData(QualityAnalyseGetragBean qualityAnalyseGetragBean){
        return qualityAnalyseGetragService.getProcedureYearReportDataService(qualityAnalyseGetragBean);
    }
}
