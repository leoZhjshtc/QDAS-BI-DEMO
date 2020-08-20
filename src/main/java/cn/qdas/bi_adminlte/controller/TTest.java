package cn.qdas.bi_adminlte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TTest {
    @RequestMapping("initTestMMchart")
    public String initTestMMchart(){
        return "bi_adminlte/testqb/testMMchart";
    }
}
