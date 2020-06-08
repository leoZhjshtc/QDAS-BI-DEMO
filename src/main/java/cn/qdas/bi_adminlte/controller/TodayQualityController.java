package cn.qdas.bi_adminlte.controller;

import cn.qdas.bi_adminlte.service.ITodayQualityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/batq")
public class TodayQualityController {
    @Resource
    ITodayQualityService todayQualityService;
    @RequestMapping("initTodayPage")
    public String initTodayPage(Model model){
        List list=todayQualityService.getTeilDataService();
        model.addAttribute("teilList",list);
        return "bi_adminlte/tq/todayQualityPage";
    }

}
