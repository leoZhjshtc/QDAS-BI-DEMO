/**
 * 
 */
package cn.qdas.core.controller;

import java.io.*;
import java.util.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import cn.qdas.core.utils.PropertiesUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.qdas.core.bean.SystemSetupBean;
import cn.qdas.core.service.ISystemSetupService;

/**
 * @author leo.Zhou 周钧
 * 2019年7月25日
 */
@Controller
@RequestMapping("/system")
public class SystemSetupController {
	@Resource
	ISystemSetupService isss;
	@RequestMapping("initPage")
	public String initSystemSetupPage() {
		 return "base/systemSetup";
	}
	@RequestMapping("getMenuData")
	@ResponseBody
	public List getMenuData(HttpServletRequest request) {
		String path = request.getContextPath();
		String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
		List list=isss.getMenuData(basePath);
		return list;
	}
	@RequestMapping("initFactorySetup")
	public String initFactorySetup() {
		return "base/factorySetup";
	}
	@RequestMapping("getFactoryData")
	@ResponseBody
	public List getFactoryData() {
		List list=isss.getFactoryData();
		return list;
	}
	@RequestMapping("addFactory")
	@ResponseBody
	public Map  addFactory(SystemSetupBean ssb,HttpServletRequest request) {
		Map map =new HashMap<String , Object>();
		String path = request.getSession().getServletContext().getRealPath("/resources/images/drawing");
		String fileName=ssb.getFactoryIcon().getOriginalFilename();
		File targetFile=new File(path, fileName);
		if(targetFile.exists()) {
			map.put("message", "文件已存在");
			map.put("error", "1");
			return map;
		}
		try {
			ssb.getFactoryIcon().transferTo(targetFile);
		} catch (Exception e) {
			map.put("message", "文件上传失败");
			map.put("error", "1");
			e.printStackTrace();
			return map;
		} 
		isss.addNewFactory(ssb.getFactoryName(), fileName);
		return map;
	}
	@RequestMapping("initWorkShopPage")
	public String initWorkShopPage() {
		return "base/workShopSetup";
	}
	@RequestMapping("getWorkShop")
	@ResponseBody
	public List getWorkShop() {
		List list =isss.getWorkShop();
		return list;
	}
	@RequestMapping("addWorkShop")
	@ResponseBody
	public Map  addWorkShop(SystemSetupBean ssb,HttpServletRequest request) {
		Map map =new HashMap<String , Object>();
		String path = request.getSession().getServletContext().getRealPath("/resources/images/drawing");
		String fileName=ssb.getWorkShopDrawing().getOriginalFilename();
		File targetFile=new File(path, fileName);
		if(targetFile.exists()) {
			map.put("message", "图纸文件已存在");
			map.put("error", "1");
			return map;
		}
		try {
			ssb.getWorkShopDrawing().transferTo(targetFile);
		} catch (Exception e) {
			map.put("message", "文件上传失败");
			map.put("error", "1");
			e.printStackTrace();
			return map;
		} 
		isss.addNewWorkShop(ssb, fileName);
		return map;
	}
	@RequestMapping("delWorkShop")
	@ResponseBody
	public Map delWorkShop(SystemSetupBean ssb,HttpServletRequest request) {
		String path = request.getSession().getServletContext().getRealPath("/resources/images/drawing");
		Map map=new HashMap<String, Object>();
		try {
			isss.delWorkShop(ssb, path);
		} catch (Exception e) {
			map.put("error", "1");
			e.printStackTrace();
			return map;
		}
		map.put("error", "0");
		return map;
	}
	@RequestMapping("initProductLineSetup")
	public String initProductLineSetup(SystemSetupBean ssb,Model model) {
		List list=isss.getProdectLineByFactory(ssb);
		
		model.addAttribute("plList", list);
		model.addAttribute("factoryName", ssb.getFactoryName());
		model.addAttribute("workShopName", ssb.getWorkShopName());
		model.addAttribute("workShopDrawing", ssb.getWorkShopDrawingStr());
		return "base/productLineSetup";
	}
	@RequestMapping("addNewProductLine")
	@ResponseBody
	public Map addNewProductLine(SystemSetupBean ssb) {
		Map map = isss.addNewProductLine(ssb);
		return map;
	}
	@RequestMapping("delProductLine")
	@ResponseBody
	public void delProductLine(SystemSetupBean ssb) {
		isss.delProductLine(ssb);
	}
	@RequestMapping("delFactory")
	@ResponseBody
	public Map delFactory(SystemSetupBean ssb,HttpServletRequest request) {
		String path = request.getSession().getServletContext().getRealPath("/resources/images/drawing");
		Map map=isss.delFactory(ssb,path);
		return map;
	}
	@RequestMapping("getProductLineCombobox")
	@ResponseBody
	public List getProductLineCombobox() {
		List list=isss.getProductLineCombobox();
		for(int i=0;i<list.size();i++) {
			if(list.get(i)==null) {
				list.remove(i);
				i--;
			}
		}
		return list;
	}
	@RequestMapping("initQaSetUp")
	public String initQaSetUp() {
		return "bi/qa/qaSetUp";
	}
	@RequestMapping("initQmSetUp")
	public String initQmSetUp(Model model){
		Properties pro =null;
		String path = this.getClass().getClassLoader().getResource("setUp.properties").getPath();
		try {
			pro= PropertiesUtils.readProperties(path);
		}catch (Exception e){
			e.printStackTrace();
		}
		model.addAttribute("qmInterval",pro.getProperty("qmInterval"));
		return "base/modelSetup/qmSetup";
	}
	@RequestMapping("qmIntervalSetup")
	@ResponseBody
	public Map qmIntervalSetup(String intervalTime) {
		Map map=new HashMap();
		map.put("mess",1);
		try {
			PropertiesUtils.writeProperties("qmInterval",intervalTime,new Date().toString(),this.getClass().getClassLoader().getResource("setUp.properties").getPath());
		}catch (Exception e){
			e.printStackTrace();
			map.put("mess",0);
		}

		return map;
	}

	@RequestMapping("initMmSetup")
	public String initMmSetup(){
		return "base/modelSetup/mmSetup";
	}
	@RequestMapping("getAllCheckType")
	@ResponseBody
	public List getAllCheckType(){
		Properties pro =null;
		String path = this.getClass().getClassLoader().getResource("setUp.properties").getPath();
		try {
			pro= PropertiesUtils.readProperties(path);
		}catch (Exception e){
			e.printStackTrace();
		}
		List<Map> list=isss.getAllCheckTypeService();
		for (int i=0;i<list.size();i++){
			Map map=list.get(i);
			map.put("color",pro.getProperty("katkey."+map.get("KATKEY")));
		}
		return list;
	}
	@RequestMapping("mmColorSetup")
	@ResponseBody
	public Map mmColorSetup(String katkey,String katkeyColor){
		Map map=new HashMap();
		map.put("mess",1);
		try {
			PropertiesUtils.writeProperties("katkey."+katkey,katkeyColor,new Date().toString(),this.getClass().getClassLoader().getResource("setUp.properties").getPath());
		}catch (Exception e){
			e.printStackTrace();
			map.put("mess",0);
		}

		return map;
	}

}
