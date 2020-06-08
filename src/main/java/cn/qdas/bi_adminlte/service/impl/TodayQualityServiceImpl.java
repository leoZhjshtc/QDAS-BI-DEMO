package cn.qdas.bi_adminlte.service.impl;

import cn.qdas.bi_adminlte.bean.TeilBean;
import cn.qdas.bi_adminlte.dao.TodayQualityMapper;
import cn.qdas.bi_adminlte.service.ITodayQualityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class TodayQualityServiceImpl implements ITodayQualityService {
    @Resource
    TodayQualityMapper todayQualityMapper;
    @Override
    public List getTeilDataService() {
        TeilBean teilBean=new TeilBean();
        Date today=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd 00:00:00");
        teilBean.setStartTime(sdf.format(today));
        List list=todayQualityMapper.getTeilDataMapper(teilBean);
        if(list.size()>0){
            for(int i=0;i<list.size();i++){
                Map plMap= (Map) list.get(i);
                plMap.put("qualityLevel","0");
                List<Map> wvList= (List) plMap.get("wvList");
                int nokcount=0;
                int total=wvList.size();
                for(int j=0;j<wvList.size();j++){
                    if(null!=wvList.get(j).get("MEMERKART")&&"1".equals(wvList.get(j).get("MEMERKART").toString())){
                        if(wvList.get(j).get("WVWERT")!=null&&Float.parseFloat(wvList.get(j).get("WVWERT").toString().substring(wvList.get(j).get("WVWERT").toString().indexOf(".")-1))>0){
                            //plMap.put("qualityLevel","2");
                            nokcount+=1;
                           // break;
                        }
                    }else {
                        if((wvList.get(j).get("MEUGW")!=null&&wvList.get(j).get("WVWERT")!=null&&
                                Float.parseFloat(String.valueOf(wvList.get(j).get("WVWERT")))<Float.parseFloat(String.valueOf(wvList.get(j).get("MEUGW"))))||
                                (wvList.get(j).get("MEOGW")!=null&&wvList.get(j).get("WVWERT")!=null&&
                                        Float.parseFloat(String.valueOf(wvList.get(j).get("WVWERT")))>Float.parseFloat(String.valueOf(wvList.get(j).get("MEOGW"))))) {
                            //plMap.put("qualityLevel","2");
                            nokcount+=1;
                           // break;
                        }
                    }
                }
                if(nokcount>0){
                    plMap.put("qualityLevel","2");
                }
//                DecimalFormat df = new DecimalFormat("#.00");
                double passrate=(double)(total-nokcount)*100/total;
                plMap.put("passrate",String.format("%.2f", passrate));
            }
        }
        return list;
    }
}
