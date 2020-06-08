/**
 * 
 */
package cn.qdas.bi.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.qdas.bi.bean.MissionManageBean;
import cn.qdas.bi.service.IMissionManageService;
import cn.qdas.core.utils.ExcelUtil;

/**
 * @author leo.Zhou 周钧
 * 2019年8月16日
 */
@Controller
@RequestMapping("/mc")
public class MissionManageController {
	@Resource
	IMissionManageService imms;
	@RequestMapping("initMissionManage")
	public String initMissionManage(MissionManageBean mmb,Model model) {
		model.addAttribute("mmFactoryName", mmb.getFactoryName());
//		model.addAttribute("mmWorkShopName", mmb.getWorkShopName());
//		model.addAttribute("mmWorkShopDrawingStr", mmb.getWorkShopDrawingStr());
		return "bi/mc/missionManage";
	}
	@RequestMapping("initMissionManageOne")
	public String initMissionManageOne(MissionManageBean mmb,Model model) {
		model.addAttribute("mmFactoryName", mmb.getFactoryName());
		return "bi/mc/missionManageOne"; 
	}
	@RequestMapping("initMissionManageTwo")
	public String initMissionManageTwo(MissionManageBean mmb,Model model) {
		Map map=imms.getDetailsTeilTable(mmb);
		model.addAttribute("mmTeilId", mmb.getTeilId());
		model.addAttribute("mmWvwertnr", mmb.getWvwertnr());
		model.addAttribute("mmTeilMap", map);
		model.addAttribute("mmTwoCheckMan", mmb.getCheckMan());
		model.addAttribute("mmTwoWV0063", mmb.getWv0063());
		model.addAttribute("mmTwoWV0063Id", mmb.getWv0063Id());
		model.addAttribute("mmTekurzbezeich", mmb.getTekurzbezeich());
		return "bi/mc/missionManageTwo"; 
	}
	@RequestMapping("getProductionPlanChartData")
	@ResponseBody
	public List getProductionPlanChartData(MissionManageBean mmb) {
		String [] productLineArr = null;
		if(mmb.getProductLine()!=null&&!"".equals(mmb.getProductLine())) {
			productLineArr=new String[1];
			productLineArr[0]=mmb.getProductLine();
		}else {
			List<Map> plList=imms.getAllProductLineByfw(mmb);
			productLineArr=new String[plList.size()];
			for(int i=0;i<plList.size();i++){
				productLineArr[i]=plList.get(i).get("productLine_name").toString();
			}
		}
		List  list=imms.getProductionPlanChartData(mmb,productLineArr);
		return list;
		
	}
	
	@RequestMapping("getProductionPlanChartDataByK1002")
	@ResponseBody
	public List getProductionPlanChartDataByK1002() {
		List  list=imms.getProductionPlanChartDataByK1002();
		return list;
		
	}
	@RequestMapping("getCheckMissionData")
	@ResponseBody
	public Map getCheckMissionData(MissionManageBean mmb) {
		String [] productLineArr = null;
		if(mmb.getProductLine()!=null&&!"".equals(mmb.getProductLine())) {
			productLineArr=new String[1];
			productLineArr[0]=mmb.getProductLine();
		}else {
			List<Map> plList=imms.getAllProductLineByfw(mmb);
			productLineArr=new String[plList.size()];
			for(int i=0;i<plList.size();i++){
				productLineArr[i]=plList.get(i).get("productLine_name").toString();
			}
		}
		return imms.getCheckMissionData(mmb,productLineArr);
	}
	@RequestMapping("getAllProductLineComboBox")
	@ResponseBody
	public List getAllProductLineComboBox(MissionManageBean mmb){
		return imms.getProductLineByfw(mmb);
	}
	@RequestMapping("getAllProductClassComboBox")
	@ResponseBody
	public List getAllProductClassComboBox() {
		return imms.getAllProductClassComboBox();
	}
	@RequestMapping("getAllCheckTypeComboBox")
	@ResponseBody
	public List getAllCheckTypeComboBox() {
		return imms.getAllCheckTypeComboBox();
	}
	@RequestMapping("getAllTeilNumComboBox")
	@ResponseBody
	public List getAllTeilNumComboBox() {
		return imms.getAllTeilNumComboBox();
	}
	@RequestMapping("getAllCheckPlanNumComboBox")
	@ResponseBody
	public List getAllCheckPlanNumComboBox() {
		return imms.getAllCheckPlanNumComboBox();
	}
	
	@RequestMapping("getAllTeilNameComboBox")
	@ResponseBody
	public List getAllTeilNameComboBox() {
		return imms.getAllTeilNameComboBox();
		
	}
	@RequestMapping("getAllCheckManComboBox")
	@ResponseBody
	public List getAllCheckManComboBox() {
		return imms.getAllCheckManComboBox();
	}
	@RequestMapping("getProcedureComboBox")
	@ResponseBody
	public List getProcedureComboBox() {
		return imms.getProcedureComboBox();
	}
	@RequestMapping("getDetailsTeilTable")
	@ResponseBody
	public Map getDetailsTeilTable(MissionManageBean mmb) {
		Map map=imms.getDetailsTeilTable(mmb);
		return map;
	}
	@RequestMapping("getDetailsMerkmalTable")
	@ResponseBody
	public List getDetailsMerkmalTable(MissionManageBean mmb) {
		List map=imms.getDetailsMerkmalTable(mmb);
		return map;
	}
	@RequestMapping("mcExportExcel")
	@ResponseBody
	public void mcExportExcel(MissionManageBean mmb,HttpServletResponse res) throws Exception {
		String [] productLineArr = null;
		if(mmb.getProductLine()!=null&&!"".equals(mmb.getProductLine())) {
			productLineArr=new String[1];
			productLineArr[0]=mmb.getProductLine();
		}else {
			List<Map> plList=imms.getAllProductLineByfw(mmb);
			productLineArr=new String[plList.size()];
			for(int i=0;i<plList.size();i++){
				productLineArr[i]=plList.get(i).get("productLine_name").toString();
			}
		}
		List<Map> list= imms.getCheckMissionDataExcel(mmb,productLineArr);
		String [] title= {"零件号","检验计划编号","生产线","工序","产品组","零件名","检验类型","检测时间","检验人员"};
		String[][] listValue=new String[list.size()][];
		for(int i=0;i<list.size();i++) {
			Map map=list.get(i);
			String[] mapValue=new String[9];
			mapValue[0]=nullToSpace(String.valueOf(map.get("TETEILNR")));
			mapValue[1]=nullToSpace(String.valueOf(map.get("TE_1341")));
			mapValue[2]=nullToSpace(String.valueOf(map.get("TEKOSTST")));
			mapValue[3]=nullToSpace(String.valueOf(map.get("TEAUFTRAGGBBEZ")));
			mapValue[4]=nullToSpace(String.valueOf(map.get("TEKURZBEZEICH")));
			mapValue[5]=nullToSpace(String.valueOf(map.get("TEBEZEICH")));
			mapValue[6]=nullToSpace(String.valueOf(map.get("TEPRGRUNDBEZ")));
			mapValue[7]=nullToSpace(String.valueOf(map.get("WVDATZEIT")));
			mapValue[8]=nullToSpace(String.valueOf(map.get("PRVORNAME")));
			listValue[i]=mapValue;
		}
		ExcelUtil.exportExcelMcSearch("任务管理.xls", "sheet1", title, listValue, res);
	}
	public String nullToSpace(String str) {
		if(str==null||"null".equals(str)) {
			str="";
		}
		return str;
	}
}
