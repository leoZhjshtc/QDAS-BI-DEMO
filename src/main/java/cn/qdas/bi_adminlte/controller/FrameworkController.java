package cn.qdas.bi_adminlte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ba")
public class FrameworkController {
    @RequestMapping("initLoginPage")
    public String initLoginPage(){
        return "bi_adminlte/framework/login";
    }
    @RequestMapping("doLogin")
    public String doLogin(){
        return "bi_adminlte/framework/frameworkPage";
    }
}
