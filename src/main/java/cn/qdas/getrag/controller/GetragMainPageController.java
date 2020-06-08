package cn.qdas.getrag.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GetragMainPageController {
    @RequestMapping("getragFrameworkPage")
    public String  initGetragFrameworkPage(){
        return "getrag/getragFrameworkPage";
    }
}
