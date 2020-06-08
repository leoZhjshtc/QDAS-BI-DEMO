package cn.qdas.getrag.controller;

import cn.qdas.bi.bean.QualityBoard;
import cn.qdas.bi.controller.Test;
import cn.qdas.core.V11Webservice.IQdas_Web_Service;
import cn.qdas.core.V11Webservice.IQdas_Web_ServiceserviceLocator;
import cn.qdas.getrag.bean.QualityBoardGetrag;
import cn.qdas.getrag.service.IGetragQualityBoardService;
import org.apache.axis.types.UnsignedByte;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.xml.rpc.holders.DoubleHolder;
import javax.xml.rpc.holders.IntHolder;
import javax.xml.rpc.holders.StringHolder;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

@Controller
@RequestMapping("/gqb")
public class GetragQualityBoardController {
    @Resource
    IGetragQualityBoardService getragQualityBoardService;
    @RequestMapping("initQualityBoardPage")
    public String initQualityBoardPage(){
        return "getrag/gqb/qualityBoardPage";
    }
    @RequestMapping("initProductLinePage")
    public String initProductLinePage(){
        return "getrag/gqb/productLinePage";
    }

    @RequestMapping("getProductLineData")
    @ResponseBody
    public List getProductLineData(QualityBoardGetrag qualityBoardGetrag){
        return getragQualityBoardService.getProductLineDataService(qualityBoardGetrag);
    }
    @RequestMapping("initProcessPage")
    public String initProcessPage(QualityBoardGetrag qualityBoardGetrag, Model model){
        model.addAttribute("pTeilInfo",qualityBoardGetrag);
        return "getrag/gqb/processChartsPage";
    }
    @RequestMapping("getMissionManageChartData")
    @ResponseBody
    public List getMissionManageChartData(QualityBoardGetrag qualityBoardGetrag){
        return getragQualityBoardService.getMissionManageChartDataService(qualityBoardGetrag);
    }
    @RequestMapping("initMissionManageDetailsPage")
    public String initMissionManageDetailsPage(QualityBoardGetrag qualityBoardGetrag, Model model){
        Map infoMap = getragQualityBoardService.getMissionManageTeilInfoService(qualityBoardGetrag);
        infoMap.put("wvwertnr",qualityBoardGetrag.getWvwertnr());
        model.addAttribute("infoMap",infoMap);
        return "getrag/gqb/missionManageDetailsPage";
    }
    @RequestMapping("missionManageDetailsMerkmalTable")
    @ResponseBody
    public List missionManageDetailsMerkmalTable(QualityBoardGetrag qualityBoardGetrag){
        return getragQualityBoardService.missionManageDetailsMerkmalService(qualityBoardGetrag);
    }
    @RequestMapping("getProcessRecent24HoursData")
    @ResponseBody
    public List getProcessRecent24HoursData(QualityBoardGetrag qualityBoardGetrag){
        return getragQualityBoardService.getProcessRecent24HoursDataService(qualityBoardGetrag);
    }
    @RequestMapping("initMerkmalQualityAnalyse")
    public String initMerkmalQualityAnalyse(QualityBoardGetrag qualityBoardGetrag,Model model){
        model.addAttribute("qaMerkmalTeilId",qualityBoardGetrag.getTeilId());
        return "getrag/gqb/merkmalQualityAnalyse";
    }
    @RequestMapping("getMerkmalRecent24HoursData")
    @ResponseBody
    public List getMerkmalRecent24HoursData(QualityBoardGetrag qualityBoardGetrag){
        return getragQualityBoardService.getMerkmalRecent24HoursDataService(qualityBoardGetrag);
    }
    @RequestMapping("getProcessMonthReportData")
    @ResponseBody
    public List getProcessMonthReportData(QualityBoardGetrag qualityBoardGetrag){
        return getragQualityBoardService.getProcessMonthReportDataService(qualityBoardGetrag);
    }
    @RequestMapping("getYearComboboxData")
    @ResponseBody
    public List getYearComboboxData(){
        return getragQualityBoardService.getYearComboboxDataService();
    }

    @RequestMapping("getProcessYearReportData")
    @ResponseBody
    public List getProcessYearReportData(QualityBoardGetrag qualityBoardGetrag){
        return getragQualityBoardService.getProcessYearReportDataMapper(qualityBoardGetrag);
    }
    @RequestMapping("getCpkData")
    @ResponseBody
    public Map getCpkData(QualityBoardGetrag qualityBoardGetrag){
        Map map=new HashMap();
        if("1".equals(qualityBoardGetrag.getType())){
            List<Map> list=getragQualityBoardService.getRecent125NumMapper(qualityBoardGetrag);
            String num=list.get(list.size()-1).get("WVWERTNR").toString();
            map=getCpkAndZftByTime(qualityBoardGetrag,"WVWERTNR>"+num);
        }else{
            map=getCpkAndZftByTime(qualityBoardGetrag,"WVDATZEIT>'"+qualityBoardGetrag.getStartTime()+"' and WVDATZEIT<'"+qualityBoardGetrag.getEndTime()+"'");
        }

        return map;
    }
    @RequestMapping("initQbShowPage")
    public String initQbShowPage(){
        return "getrag/gqb/qbShowPage";
    }
    @RequestMapping("getQbShowFormInfo")
    @ResponseBody
    public Map getQbShowFormInfo(QualityBoardGetrag qbg){
        Map map=getragQualityBoardService.getQbShowFormInfoService(qbg);
        return map;
    }
    @RequestMapping("getProductLineComboData")
    @ResponseBody
    public List getProductLineComboData(QualityBoardGetrag qbg){
        return getragQualityBoardService.getProductLineComboDataService(qbg);
    }
    public static Map getCpkAndZftByTime(QualityBoardGetrag qb,String searchStr) {
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
            client.createFilterFromSQL(sessionHandle, "TETEIL="+qb.getTeilId(), filterResult1, filterHandle1);
            int addFilterToQuery1=client.addFilterToQuery(sessionHandle, queryHandle.value, filterHandle1.value, new UnsignedByte(0), 0, 0);
            IntHolder filterResult2=new IntHolder();
            IntHolder filterHandle2=new IntHolder();
            client.createFilterFromSQL(sessionHandle, "MEMERKMAL="+qb.getMerkmalId(), filterResult2, filterHandle2);
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
