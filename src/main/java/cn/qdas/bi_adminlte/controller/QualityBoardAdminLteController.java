package cn.qdas.bi_adminlte.controller;

import cn.qdas.bi.controller.Test;
import cn.qdas.bi_adminlte.bean.TeilBean;
import cn.qdas.bi_adminlte.service.IQualityBoardAdminLteService;
import cn.qdas.core.V11Webservice.IQdas_Web_Service;
import cn.qdas.core.V11Webservice.IQdas_Web_ServiceserviceLocator;
import cn.qdas.core.utils.PropertiesUtils;
import org.apache.axis.types.UnsignedByte;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.xml.rpc.holders.DoubleHolder;
import javax.xml.rpc.holders.IntHolder;
import javax.xml.rpc.holders.StringHolder;
import java.io.IOException;
import java.util.*;

@Controller
@RequestMapping("/baqb")
public class QualityBoardAdminLteController {
    @Resource
    IQualityBoardAdminLteService qualityBoardAdminLteService;
    @RequestMapping("initFrameworkPage")
    public String initFrameworkPage(){
        return "bi_adminlte/qb/frameworkPage";
    }
    @RequestMapping("initSetupTolerance")
    @ResponseBody
    public Map initSetupTolerance(){
        Map map=qualityBoardAdminLteService.getSetupInfoMap();
        return map;
    }
    @RequestMapping("initQualityBoardPage")
    public String initQualityBoardPage(){
        return "bi_adminlte/qb/qualityBoardPage";
    }
    @RequestMapping("initMissionManagePage")
    public String initMissionManagePage(){
        return "bi_adminlte/qb/missionManagePage";
    }
    @RequestMapping("initQualityAnalysePage")
    public String initQualityAnalysePage(){
        return "bi_adminlte/qb/qualityAnalysePage";
    }
    @RequestMapping("initPruductLineQbPage")
    public String initPruductLineQbPage(TeilBean teilBean, Model model){
        List list =qualityBoardAdminLteService.getProductLineDataService(teilBean);
        model.addAttribute("plList",list);
        return "bi_adminlte/qb/productLinePage";
    }
    @RequestMapping("initProcessQbPage")
    public String initProcessQbPage(TeilBean teilBean, Model model){
        List list=qualityBoardAdminLteService.getProcessDataService(teilBean);
        model.addAttribute("processList",list);
        return "bi_adminlte/qb/processPage";
    }
    @RequestMapping("initMerkmalQbPage")
    public String initMerkmalQbPage(TeilBean teilBean, Model model){
        List list=qualityBoardAdminLteService.getMerkmalDataService(teilBean);
        model.addAttribute("merkmalList",list);
        return "bi_adminlte/qb/merkmalPage";
    }
    @RequestMapping("getPlMissionManageChartData")
    @ResponseBody
    public List getPlMissionManageChartData(TeilBean teilBean){
        return qualityBoardAdminLteService.getPlMissionManageChartDataService(teilBean);
    }
    @RequestMapping("getProcessMissionManageChartData")
    @ResponseBody
    public List getProcessMissionManageChartData(TeilBean teilBean){
        return qualityBoardAdminLteService.getProcessMissionManageChartDataService(teilBean);
    }
    @RequestMapping("getMerkmalChartData")
    @ResponseBody
    public List getMerkmalChartData(TeilBean teilBean){
        return qualityBoardAdminLteService.getMerkmalChartDataService(teilBean);
    }
    @RequestMapping("getMissionManageDetails")
    public String getMissionManageDetails(TeilBean teilBean,Model model){
        List list=qualityBoardAdminLteService.getMissionManageDetailsService(teilBean);
        model.addAttribute("mmList",list);
        return "bi_adminlte/qb/mmDetailsPage";
    }
    @RequestMapping("initQaProductLinePage")
    public String initQaProductLinePage(Model model){
        model.addAttribute("yearList",qualityBoardAdminLteService.getYearComboboxDataService());
        return "bi_adminlte/qb/qaProductLinePage";
    }
    @RequestMapping("getProductLineRecent24HoursData")
    @ResponseBody
    public List getProductLineRecent24HoursData(TeilBean teilBean){
        return qualityBoardAdminLteService.getProductLineRecent24HoursDataService(teilBean);
    }
    @RequestMapping("getProductLineMonthReportData")
    @ResponseBody
    public List getProductLineMonthReportData(TeilBean teilBean){
        return qualityBoardAdminLteService.getProductLineMonthReportDataService(teilBean);
    }
    @RequestMapping("getProductLineYearReportData")
    @ResponseBody
    public List getProductLineYearReportData(TeilBean teilBean){
        return qualityBoardAdminLteService.getProductLineYearReportDataService(teilBean);
    }
    @RequestMapping("initQaProcessPage")
    public String initQaProcessPage(Model model,TeilBean teilBean){
        model.addAttribute("yearList",qualityBoardAdminLteService.getYearComboboxDataService());
        Map map=new HashMap<String,Object>();
        map.put("qaProcessTeilNum",teilBean.getTeilNum());
        map.put("qaProcessTeilName",teilBean.getTeilName());
        map.put("qaProcessTeilK1003",teilBean.getTeilK1003());
        model.addAttribute("qaProcessMap",map);
        return "bi_adminlte/qb/qaProcessPage";
    }
    @RequestMapping("getProcessRecent24HoursData")
    @ResponseBody
    public List getProcessRecent24HoursData(TeilBean teilBean){
        return qualityBoardAdminLteService.getProcessRecent24HoursDataService(teilBean);
    }
    @RequestMapping("getProcessMonthReportData")
    @ResponseBody
    public List getProcessMonthReportData(TeilBean teilBean){
        return qualityBoardAdminLteService.getProcessMonthReportDataService(teilBean);
    }
    @RequestMapping("getProcessYearReportData")
    @ResponseBody
    public List getProcessYearReportData(TeilBean teilBean){
        return qualityBoardAdminLteService.getProcessYearReportDataService(teilBean);
    }
    @RequestMapping("initQaMerkmalPage")
    public String initQaMerkmalPage(TeilBean teilBean,Model model){
        List list=qualityBoardAdminLteService.getQaMerkmalDataService(teilBean);
        model.addAttribute("qaMerkmalList",list);
        return "bi_adminlte/qb/qaMerkmalPage";
    }

    @RequestMapping("getCpkData")
    @ResponseBody
    public Map getCpkData(TeilBean teilBean){
        Map map=new HashMap();
        if("1".equals(teilBean.getType())){
            List<Map> list=qualityBoardAdminLteService.getRecent125NumService(teilBean);
            String num=list.get(list.size()-1).get("WVWERTNR").toString();
            map=getCpkAndZftByTime(teilBean,"WVWERTNR>"+num);
        }else{
            map=getCpkAndZftByTime(teilBean,"WVDATZEIT>'"+teilBean.getStartTime()+"' and WVDATZEIT<'"+teilBean.getEndTime()+"'");
        }

        return map;
    }

    @RequestMapping("initQbShowPage")
    public String initQbShowPage(TeilBean teilBean){
        return "bi_adminlte/qb/qbShowPage";
    }
    @RequestMapping("getQbShowFormInfo")
    @ResponseBody
    public Map getQbShowFormInfo(TeilBean teilBean){
        return qualityBoardAdminLteService.getQbShowFormInfoService(teilBean);
    }
    @RequestMapping("setupTolerance")
    @ResponseBody
    public Map setupTolerance(String ifSetupTolerance,String tolerance){
        Map map=new HashMap();
        map.put("mess",1);
        try {
            PropertiesUtils.writeProperties("ifSetupTolerance",ifSetupTolerance,new Date().toString(),this.getClass().getClassLoader().getResource("setUp.properties").getPath());
            PropertiesUtils.writeProperties("tolerance",tolerance,new Date().toString(),this.getClass().getClassLoader().getResource("setUp.properties").getPath());
        }catch (Exception e){
            e.printStackTrace();
            map.put("mess",0);
        }
        return map;
    }
    @RequestMapping("initSetupDecimal")
    @ResponseBody
    public Map initSetupDecimal(){
        Map map=qualityBoardAdminLteService.getSetupInfoMap();
        return map;
    }
    public static Map getCpkAndZftByTime(TeilBean teilBean,String searchStr) {
        Map imgMap=new HashMap<String ,Object>();
        try {
            Map webMap=getWsConnectInfo();
            IQdas_Web_ServiceserviceLocator iqws=new IQdas_Web_ServiceserviceLocator(webMap.get("url").toString());
            IQdas_Web_Service client=iqws.getIQdas_Web_ServicePort();
            IntHolder webConnectResult=new IntHolder();
            IntHolder webConnectHandle=new IntHolder();
            client.webConnect(20, 44, webMap.get("user").toString(), webMap.get("password").toString(), "0.0.0.0", webConnectResult, webConnectHandle);
            int sessionHandle=webConnectHandle.value;
            IntHolder createQueryResult=new IntHolder();
            IntHolder queryHandle=new IntHolder();
            client.createQuery(sessionHandle, createQueryResult, queryHandle);
            IntHolder filterResult1=new IntHolder();
            IntHolder filterHandle1=new IntHolder();
            client.createFilterFromSQL(sessionHandle, "TETEIL="+teilBean.getTeilId(), filterResult1, filterHandle1);
            int addFilterToQuery1=client.addFilterToQuery(sessionHandle, queryHandle.value, filterHandle1.value, new UnsignedByte(0), 0, 0);
            IntHolder filterResult2=new IntHolder();
            IntHolder filterHandle2=new IntHolder();
            client.createFilterFromSQL(sessionHandle, "MEMERKMAL="+teilBean.getMerkmalId(), filterResult2, filterHandle2);
            int addFilterToQuery2=client.addFilterToQuery(sessionHandle, queryHandle.value, filterHandle2.value, new UnsignedByte(1), 0, 0);
            IntHolder filterResult3=new IntHolder();
            IntHolder filterHandle3=new IntHolder();
            client.createFilterFromSQL(sessionHandle, searchStr, filterResult3, filterHandle3);
            int addFilterToQuery3= client.addFilterToQuery(sessionHandle, queryHandle.value, filterHandle3.value, new UnsignedByte(2), 0, 0);

            String part_Char_List="";
            int executeQuery =client.executeQuery(sessionHandle, queryHandle.value, part_Char_List);
            int evaluateAllChars= client.evaluateAllChars(sessionHandle);

            IntHolder result2=new IntHolder();
            StringHolder statResult_str2=new StringHolder();
            DoubleHolder statResult_db2=new DoubleHolder();
            client.getStatResult(sessionHandle, 5220, 1, 1, new UnsignedByte(0), result2, statResult_str2, statResult_db2);


            imgMap.put("mess", 1);
            imgMap.put("cpk", statResult_str2.value);
            int aa =client.freeFilter(sessionHandle, filterHandle1.value);
            int bb =client.freeFilter(sessionHandle, filterHandle2.value);
            int ee =client.freeFilter(sessionHandle, filterHandle3.value);
            int cc =client.freeQuery(sessionHandle, queryHandle.value);
            int dd =client.clientDisconnect(sessionHandle);
        } catch (Exception e) {
            imgMap.put("mess", 0);
            imgMap.put("cpk", "出错啦！！！");
        }

        return imgMap;
    }
    public static Map getWsConnectInfo() {
        Map map=new HashMap<String, Object>();
        Properties prop = new Properties();
        try {
            prop.load(Test.class.getResourceAsStream("/jdbc.properties"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        map.put("user", prop.getProperty("webservice.user"));
        map.put("url", prop.getProperty("webservice.url"));
        map.put("password", prop.getProperty("webservice.password"));
        return map;
    }
}
