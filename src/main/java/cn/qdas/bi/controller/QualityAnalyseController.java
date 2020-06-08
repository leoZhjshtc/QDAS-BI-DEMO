/**
 * 
 */
package cn.qdas.bi.controller;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;

import cn.qdas.bi.bean.QualityBoard;
import cn.qdas.bi.service.IQualityAnalyseService;
import cn.qdas.core.utils.ExcelUtil;
import cn.qdas.core.utils.StringUtils;

/**
 * @author leo.Zhou 周钧
 * 2019年8月26日
 */

@Controller
@RequestMapping("/qa")
public class QualityAnalyseController {
	@Resource
	IQualityAnalyseService iqas;
	@RequestMapping("initQualityAnalysePage")
	public String initQualityAnalysePage(Model model,String factoryName) {
		model.addAttribute("qaFactoryName", factoryName);
		return "bi/qa/qualityAnalyse";
	}
	@RequestMapping("initQaTeilPage")
	public String initQaTeilPage() {
		return "bi/qa/qaTeil";
	}
	@RequestMapping("getQaTeilTableData")
	@ResponseBody
	public List getQaTeilTableData(QualityBoard qb) {
		List list=iqas.getQaTeilTableData(qb);
		return list;
	}
	@RequestMapping("getQaMerkmalTableData")
	@ResponseBody
	public List getQaMerkmalTableData(QualityBoard qb) {
		List list=iqas.getQaMerkmalTableData(qb);
		return list;
	}
	@RequestMapping("initQaChartsPage")
	public String initQaChartsPage(Model model,QualityBoard qb) {
		List<Map> list=iqas.getQaMerkmalByTeilId(qb);
		model.addAttribute("qaMerkmalList", list);
		model.addAttribute("qaTeilId", qb.getTeilNum());
		return "bi/qa/qaCharts";
	}
	@RequestMapping("getChartDataByTeilAndMerkmal")
	@ResponseBody
	public List getChartDataByTeilAndMerkmal(@RequestBody Map<String,Object> teilAndMerkmal) {
		List list=iqas.getChartDataByTeilAndMerkmal((List<Map>) teilAndMerkmal.get("dlList"),teilAndMerkmal.get("startTime").toString(),teilAndMerkmal.get("endTime").toString());
		return list;
	}
	@RequestMapping("getChartDataByMerkmalIds")
	@ResponseBody
	public List getChartDataByMerkmalIds(QualityBoard qb,String [] merkmalIds) {
		List list=iqas.getChartDataByMerkmalIds(qb, merkmalIds);
		return list;
	}
	@RequestMapping("initQualityAnalyseAbility")
	public String initQualityAnalyseAbility(String factoryName,Model model) {
		String fnbg="";
		if(null!=factoryName&&"上海工厂".equals(factoryName)) {
			fnbg="ShP-bg.jpg";
		}else if(null!=factoryName&&"烟台工厂".equals(factoryName)) {
			fnbg="YtP-bg.jpg";
		}else if(null!=factoryName&&"武汉工厂".equals(factoryName)) {
			fnbg="Wh-bg.jpg";
		}else if(null!=factoryName&&"南京工厂".equals(factoryName)) {
			fnbg="NjP-bg.jpg";
		}
		model.addAttribute("factoryBgImg", fnbg);
		return "bi/qa/qaProductLineAbility";
	}
	@RequestMapping("initQaMachineAbility")
	public String initQaMachineAbility(QualityBoard qb,Model model) {
		List list =iqas.getQaProcessData(qb);
		model.addAttribute("qaMachinePlName", qb.getProductLineName());
		model.addAttribute("qaProcessList", list);
		return "bi/qa/qaMachineAbility";
	}
	@RequestMapping("initQaTeilAbility")
	public String initQaTeilAbility(QualityBoard qb,Model model) {
		model.addAttribute("qaTeilPlName", qb.getProductLineName());
		model.addAttribute("qaTeilMachineName", qb.getMachineName());
		model.addAttribute("qaTeilProcessNum", qb.getProcessNum());
		return "bi/qa/qaTeilAbility";
	}
	@RequestMapping("getQaTeilAbilityData")
	@ResponseBody
	public List getQaTeilAbilityData(QualityBoard qb) {
		List list=iqas.getQaTeilData(qb.getProductLineName(), qb.getMachineName(),qb.getProcessNum());
		return list;
	}
	@RequestMapping("initQaMerkmalAbility")
	public String initQaMerkmalAbility(QualityBoard qb,Model model) {
//		List<Map> list=iqas.getQaMerkmalByTeilId(qb);
//		model.addAttribute("qaMerkmalList", list);
		model.addAttribute("qaTeilNum", qb.getTeilNum());
		model.addAttribute("qaMerkmalPlName", qb.getProductLineName());
		model.addAttribute("qaMerkmalProcessName", qb.getProcessNum());
		model.addAttribute("qaMerkmalMachineName", qb.getMachineName());
		model.addAttribute("qaMerkmalId", qb.getMerkmalId());
		model.addAttribute("qaTeilId", qb.getTeilId());
		return "bi/qa/qaMerkmalAbility";
	}
	@RequestMapping("getQaMerkmalDetails")
	@ResponseBody
	public List getQaMerkmalDetails(QualityBoard qb) {
		List list=iqas.getQaMerkmalDetails(qb);
		/*if(StringUtils.isBlank((qb.getStartTime()))&&StringUtils.isBlank((qb.getEndTime()))) {
			list=iqas.getQaMerkmalDetails(qb);
		}else {
			
			
		}*/
		return list;
	}
	@RequestMapping("getProductLineData")
	@ResponseBody
	public List getProductLineData(String factoryName) {
		List<Map> plList=iqas.getAllProductLineByFactoryName(factoryName);
		String [] productLineArr = null;
		if(plList.size()>0) {
			productLineArr=new String[plList.size()];
			for(int i=0;i<plList.size();i++){
				productLineArr[i]=plList.get(i).get("productLine_name").toString();
			}
		}
		List list=iqas.getProductLineData(productLineArr);
		return list;
	}
	@RequestMapping("getQaMachineData")
	@ResponseBody
	public List getQaMachineData(QualityBoard qb) {
		List list=iqas.getQaMachineData(qb.getProductLineName(),qb.getProcessNum());
		return list;
	}
	@RequestMapping("getDztChartData")
	@ResponseBody
	public List getDztChartData(QualityBoard qb) {
		return iqas.getDztChartData(qb);
	}
	@RequestMapping("getPlMonthReportData")
	@ResponseBody
	public List getPlMonthReportData(String year,String factoryName) {
		List<Map> plList=iqas.getAllProductLineByFactoryName(factoryName);
		String [] productLineArr = null;
		if(plList.size()>0) {
			productLineArr=new String[plList.size()];
			for(int i=0;i<plList.size();i++){
				productLineArr[i]=plList.get(i).get("productLine_name").toString();
			}
		}
		return iqas.getPlMonthReportData(year,productLineArr);
	}
	@RequestMapping("getProcessByPl")
	@ResponseBody
	public List getProcessByPl(QualityBoard qb) {
		return iqas.getQaProcessData(qb);
	}
	@RequestMapping("getMachineMonthReportData")
	@ResponseBody
	public List getMachineMonthReportData(QualityBoard qb) {
		return iqas.getMachineMonthReportData(qb);
	}
	@RequestMapping("getTeilMonthReportData")
	@ResponseBody
	public List getTeilMonthReportData(QualityBoard qb) {
		return iqas.getTeilMonthReportData(qb);
	}
	@RequestMapping("getMonthReportCombobox")
	@ResponseBody
	public List getMonthReportCombobox() {
		return iqas.getMonthReportCombobox();
	}
	@RequestMapping("doCountPassRate")
	public void doCountPassRate() {
		QualityAnalyseUtils.synchronizedDataBase(iqas);
		QualityAnalyseUtils.countMerkmalPassRate(iqas);
	}
	@RequestMapping("doMonthReport")
	public void doMonthReport(QualityBoard qb) {
		QualityAnalyseUtils.getLastMonthData(iqas, qb.getStartTime(), qb.getEndTime());
	}
	@RequestMapping("getCpkAndZftByTime")
	@ResponseBody
	public Map getCpkAndZftByTime(QualityBoard qb) {
		Map reMap=new HashMap<String, Object>();
		if(("".equals(qb.getStartTime())||qb.getStartTime()==null||"undefined".equals(qb.getStartTime()))&&("".equals(qb.getEndTime())||qb.getEndTime()==null||"undefined".equals(qb.getEndTime()))) {
			Map indexMap=iqas.getStartIndex(qb);
			reMap=QualityAnalyseUtils.getCpkAndZftBy125(qb, indexMap);
		}else {
			reMap=QualityAnalyseUtils.getCpkAndZftByTime(qb);
		}
		return reMap;
	}
	@RequestMapping("qaExportExcel")
	@ResponseBody
	public void qaExportExcel(QualityBoard qb,HttpServletResponse res) throws Exception {
		List list = iqas.getDztChartData(qb);
		String [] title= {"参数名","测量值","名义值","上公差限","下公差限","测量时间","测量员","事件","追溯码"};
		String[][] listValue=new String[list.size()][];
		for(int i=0;i<list.size();i++) {
			Map map=(Map) list.get(i);
			String[] mapValue=new String[9];
			mapValue[0]=nullToSpace(String.valueOf(map.get("MEMERKBEZ")));
			mapValue[1]=formatWvwert(String.valueOf(map.get("MEMERKART")),nullToSpace(String.valueOf(map.get("WVWERT"))));
			mapValue[2]=nullToSpace(String.valueOf(map.get("MENENNMAS")));
			mapValue[3]=nullToSpace(String.valueOf(map.get("MEOGW")));
			mapValue[4]=nullToSpace(String.valueOf(map.get("MEUGW")));
			mapValue[5]=nullToSpace(String.valueOf(map.get("WVDATZEIT")));
			mapValue[6]=nullToSpace(String.valueOf(map.get("PRVORNAME")));
			mapValue[7]=nullToSpace(String.valueOf(map.get("ETTEXT")));
			mapValue[8]=nullToSpace(String.valueOf(map.get("WV0014")));
			listValue[i]=mapValue;
		}
		ExcelUtil.exportExcelMcSearch("测量数据.xls", "sheet1", title, listValue, res);
	}
	public String nullToSpace(String str) {
		if(str==null||"null".equals(str)) {
			str="";
		}
		return str;
	}
	public String formatWvwert(String index,String str) {
		if("1".equals(index)) {
			if(Float.parseFloat(str.substring(str.indexOf(".")-1))>0) {
				return "不合格";
			}else {
				return "合格";
			}
		}
		return str;
	}
}
