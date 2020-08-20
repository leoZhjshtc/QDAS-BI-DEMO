package cn.qdas.core.service;

import cn.qdas.core.utils.PropertiesUtils;
import cn.qdas.core.utils.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BaseService {
    public Map toleranceChange(String meugw, String meogw, float percentage){
        Map remap=new HashMap<String,Object>();
        if(!StringUtils.isBlank(meugw)&&StringUtils.isBlank(meogw)){
            if("0".equals(meugw)){
                remap.put("meugw","0");
            }else {
                remap.put("meugw",Float.parseFloat(meugw)*percentage);
            }
            remap.put("meogw",null);
            return remap;
        }else if(StringUtils.isBlank(meugw)&&!StringUtils.isBlank(meogw)){
            if("0".equals(meogw)){
                remap.put("meogw","0");
            }else {
                remap.put("meogw",Float.parseFloat(meogw)*percentage);
            }
            remap.put("meugw",null);
            return remap;
        }else if(!StringUtils.isBlank(meugw)&&!StringUtils.isBlank(meogw)){
            if("0".equals(meugw)){
                remap.put("meugw",meugw);
                remap.put("meogw",Float.parseFloat(meogw)*percentage);
                return remap;
            }else if("0".equals(meogw)){
                remap.put("meogw",meogw);
                remap.put("meugw",Float.parseFloat(meugw)*percentage);
                return remap;
            }else{
                float tolerance=Float.parseFloat(meogw)-Float.parseFloat(meugw);
                float newTolerance=((Float.parseFloat(meogw)-Float.parseFloat(meugw))*percentage-tolerance)/2;
                remap.put("meugw",Float.parseFloat(meugw)-newTolerance);
                remap.put("meogw",Float.parseFloat(meogw)+newTolerance);
                return remap;
            }
        }else{
            remap.put("meugw",meugw);
            remap.put("meogw",meogw);
        }
        return remap;
    }
    public Map getSetupInfo(){
        Map map=new HashMap<String,Object>();
        Properties pro =null;
        String path = this.getClass().getClassLoader().getResource("setUp.properties").getPath();
        try {
            pro= PropertiesUtils.readProperties(path);
        }catch (Exception e){
            e.printStackTrace();
        }
        map.put("ifSetupTolerance",pro.getProperty("ifSetupTolerance"));
        map.put("tolerance",pro.getProperty("tolerance"));
        map.put("ifSetupDecimal",pro.getProperty("ifSetupDecimal"));
        map.put("decimal",pro.getProperty("decimal"));
        map.put("ifQbSerchWertCount",pro.getProperty("ifQbSerchWertCount"));
        map.put("qbSerchWertCount",pro.getProperty("qbSerchWertCount"));
        return map;
    }
}
