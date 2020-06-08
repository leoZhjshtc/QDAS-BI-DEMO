/**
 * 
 */
package cn.qdas.bi.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;

import cn.qdas.core.utils.PropertiesUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.qdas.bi.bean.QualityMonitorBean;
import cn.qdas.bi.service.IQualityMonitorService;
import cn.qdas.core.bean.SystemSetupBean;

/**
 * @author leo.Zhou 周钧
 * 2019年9月26日
 */
@Controller
@RequestMapping("/qm")
public class QualityMonitorController {
	@Resource
    IQualityMonitorService iqms;
	@RequestMapping("initQm")
	public String initQmPage(SystemSetupBean ssb,Model model) {
//    	model.addAttribute("qmFactoryName", ssb.getFactoryName());
//    	model.addAttribute("qmWorkShopName", ssb.getWorkShopName());
//    	model.addAttribute("qmWorkShopDrawing", ssb.getWorkShopDrawingStr());
		Properties pro =null;
		String path = this.getClass().getClassLoader().getResource("setUp.properties").getPath();
		try {
			pro= PropertiesUtils.readProperties(path);
		}catch (Exception e){
			e.printStackTrace();
		}
		model.addAttribute("qmInterval",pro.getProperty("qmInterval"));
    	model.addAttribute("qmFactoryName", ssb.getFactoryName());
    	System.out.println("================================");
        return "bi/qm/qualityMonitor";
	}
	@RequestMapping("initProductLine")
	public String initProductLinePage(QualityMonitorBean qmb,Model model) {
		Map map=iqms.getWorkShopByFactory(qmb);
		if(map.isEmpty()) {
			return "<p>未配置工厂</p>";
			
		}
		String workShopName=(String) ((Map) map.get("rows")).get("workShop_name");
		String workShopDrawing=(String) ((Map) map.get("rows")).get("workShop_drawing");
		String totalRows=String.valueOf(iqms.getWorkShopByFactory(qmb).get("total"));
		qmb.setWorkShopName(workShopName);
    	List<Map> pllist=iqms.getProductLineByFactory(qmb);
    	List<Map> list=iqms.getProductLineAlarmData(qmb,pllist);
    	/*if(pllist.size()>0) {
    		String [] plArr=new String[pllist.size()];
        	for(int i=0;i<pllist.size();i++) {
        		plArr[i]=(String) pllist.get(i).get("productLine_name");
        	}
        	qmb.setProductLineNames(plArr);
        	list=iqms.getProductLineAlarmData(qmb);
        	 if(pllist.size()!=0) {
                 for(int i=0;i<list.size();i++){
         			Map map=list.get(i);
         			for(int j=0;j<pllist.size();j++) {
         				if(map.get("TEKOSTST").equals(pllist.get(j).get("productLine_name"))) {
         					map.put("productLine_topPosition", pllist.get(j).get("productLine_topPosition"));
         					map.put("productLine_leftPosition", pllist.get(j).get("productLine_leftPosition"));
         					map.put("point_topPosition", pllist.get(j).get("point_topPosition"));
         					map.put("point_leftPosition", pllist.get(j).get("point_leftPosition"));
         					break;
         				}
         			}
         		}
             }
    		
    	}
    	*/
    	model.addAttribute("qmPlFactoryName", qmb.getFactoryName());
     	model.addAttribute("qmPlWorkShopName",workShopName);
     	model.addAttribute("qmPlWorkShopDrawing",workShopDrawing);
    	model.addAttribute("qmPlList", list);
    	model.addAttribute("qmTotalWP", totalRows);
		return "bi/qm/qmProductLine";
	}
	@RequestMapping("initProcessPage")
	public String initProcessPage(QualityMonitorBean qmb,Model model) {
		List list =iqms.getProcessAlarmData(qmb);
		model.addAttribute("qmProcessPlName", qmb.getProductLineName());
		model.addAttribute("qmProcessList", list);
		return "bi/qm/qmProcess";
	}
	@RequestMapping("initMachine")
	public String initMachinePage(QualityMonitorBean qmb,Model model) {
		List list=iqms.getMachineAlarmData(qmb);
		model.addAttribute("qmMachineList", list);
		model.addAttribute("qmMachinePl", qmb.getProductLineName());
		model.addAttribute("qmMachineProcess", qmb.getProcessId());
		return "bi/qm/qmMachine";
	}
	@RequestMapping("initTeil")
	public String initTeilPage(QualityMonitorBean qmb,Model model) {
		List list=iqms.getTeilAlarmData(qmb);
		model.addAttribute("qmTeilMachineName", qmb.getMachineName());
		model.addAttribute("qmTeilPlName", qmb.getProductLineName());
		model.addAttribute("qmTeilProcessName", qmb.getProcessId());
		model.addAttribute("qmTeilList", list);
		return "bi/qm/qmTeil";
	}
	@RequestMapping("getTeilTop3Value")
	@ResponseBody
	public List getTeilTop3Value(QualityMonitorBean qmb) {
		
		return iqms.getTeilTop3Value(qmb);
	}
	@RequestMapping("initMerkmal")
	public String initMerkmalPage(QualityMonitorBean qmb,Model model) {
		Map tableMap=iqms.getRecentlyTeilMap(qmb);
		model.addAttribute("qmMerkmalTeilId", qmb.getTeilId());
//		model.addAttribute("qmMerkmalTeilNum", qmb.getTeilNum());
//		model.addAttribute("qmMerkmalTeilName", qmb.getTeilName());
		model.addAttribute("qmMerkmalWertevarId", qmb.getWertevarId());
//		model.addAttribute("qmMerkmalPlName", qmb.getProductLineName());
//		model.addAttribute("qmMerkmalMachineName", qmb.getMachineName());
//		model.addAttribute("qmMerkmalProcess", qmb.getProcessId());
		model.addAttribute("tableMap", tableMap);
		model.addAttribute("qmPRVORNAME",qmb.getOperator());
		return "bi/qm/qmMerkmal";
	}
	@RequestMapping("getMerkmalData")
	@ResponseBody
	public List getMerkmalData(QualityMonitorBean qmb) {
		return iqms.getMerkmalData(qmb);
		
	}
	@RequestMapping("getLastAlarmDataByPl")
	@ResponseBody
	public List getLastAlarmDataByPl(QualityMonitorBean qmb) {
		return iqms.getLastAlarmDataByPl(qmb);
	}
}
