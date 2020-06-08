package cn.qdas.core.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.qdas.core.bean.SystemSetupBean;
import cn.qdas.core.service.ISystemSetupService;

/**
 * @Auther: Leo-Zhou 周钧
 * @Date: 2019/6/28
 * @Description: cn.qdas.core.controller
 */
@Controller
@RequestMapping("/main")
public class MainPageController {
	@Resource
	ISystemSetupService isss;
	@RequestMapping("factoryList")
	public String factoryListPage(String currentUrl,Model model) {
		//return "base/factoryList";
		model.addAttribute("currentUrl", currentUrl);
		return "base/factoryLinePage";
	}
	 @RequestMapping("getAllFactory")
	   @ResponseBody
	    public List getAllFactory(HttpServletRequest request) {
	    	List<Map> list=isss.getFactoryAndWorShop();
	    	String path = request.getContextPath();
	    	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	    	for(int i=0;i<list.size();i++) {
	    		Map map=list.get(i);
	    		map.put("factoryIcon", "<img style='height:50%;width:80%' src='"+basePath+"resources/images/drawing/"+map.get("factory_icon")+"'/>");
	    	}
	    	return list;
	    }
    @RequestMapping("mainPage")
    public String initMainPage(Model model,SystemSetupBean ssb){
    	/*model.addAttribute("mainPageFactoryName", ssb.getFactoryName());
    	model.addAttribute("mainPageWorkShopName", ssb.getWorkShopName());
    	model.addAttribute("mainPageWorkShopDrawing", ssb.getWorkShopDrawingStr());*/
    	model.addAttribute("mainPageFactoryName", "烟台");
    	model.addAttribute("mainPageWorkShopName", "车间1");
    	model.addAttribute("mainPageWorkShopDrawing","YtP-Shopfloor1.png");
        return "base/mainPage";
    }
    @RequestMapping("initProductLineSet")
    public String initProductLineSet() {
    	return "base/productLineSet";
    }
    @RequestMapping("factoryLinePage")
    public String initfactoryLinePage() {
    	return "base/factoryLinePage";
    }
}
