package cn.qdas.bi.service.impl;


import javax.annotation.Resource;

import cn.qdas.bi.bean.QualityBoard;

import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import cn.qdas.bi.dao.QualityBoardMapper;
import cn.qdas.bi.service.IQualityBoardService;
import cn.qdas.core.V11Webservice.V11WebServiceClient;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
@SuppressWarnings(value = { "all" })
public class QualityBoardServiceImpl implements IQualityBoardService{
	@Resource
	QualityBoardMapper qbm;


	@Override
	public List getProductLineDataService(QualityBoard qualityBoard) {
		List<Map> list=qbm.getProductLineDataMapper(qualityBoard);
		if(list.size()>0){
			for(int i=0;i<list.size();i++){
				Map plMap=list.get(i);
				plMap.put("qualityLevel","0");
				List<Map> wvList= (List) plMap.get("wvList");
				for(int j=0;j<wvList.size();j++){
					if("1".equals(wvList.get(j).get("MEMERKART").toString())){
						if(wvList.get(j).get("WVWERT")!=null&&Float.parseFloat(wvList.get(j).get("WVWERT").toString().substring(wvList.get(j).get("WVWERT").toString().indexOf(".")-1))>0){
							plMap.put("qualityLevel","2");
							break;
						}
					}else {
						if((wvList.get(j).get("MEUGW")!=null&&wvList.get(j).get("WVWERT")!=null&&
								Float.parseFloat(String.valueOf(wvList.get(j).get("WVWERT")))<Float.parseFloat(String.valueOf(wvList.get(j).get("MEUGW"))))||
								(wvList.get(j).get("MEOGW")!=null&&wvList.get(j).get("WVWERT")!=null&&
										Float.parseFloat(String.valueOf(wvList.get(j).get("WVWERT")))>Float.parseFloat(String.valueOf(wvList.get(j).get("MEOGW"))))) {
							plMap.put("qualityLevel","2");
							break;
						}
					}
				}
			}
		}
		return list;
	}

	@Override
	public List getTeilDataService(QualityBoard qualityBoard) {
		List<Map> list=qbm.getTeilDataMapper(qualityBoard);
		if(list.size()>0){
			for(int i=0;i<list.size();i++){
				Map plMap=list.get(i);
				plMap.put("qualityLevel","0");
				List<Map> wvList= (List) plMap.get("wvList");
				for(int j=0;j<wvList.size();j++){
					if("1".equals(wvList.get(j).get("MEMERKART").toString())){
						if(wvList.get(j).get("WVWERT")!=null&&Float.parseFloat(wvList.get(j).get("WVWERT").toString().substring(wvList.get(j).get("WVWERT").toString().indexOf(".")-1))>0){
							plMap.put("qualityLevel","2");
							break;
						}
					}else {
						if((wvList.get(j).get("MEUGW")!=null&&wvList.get(j).get("WVWERT")!=null&&
								Float.parseFloat(String.valueOf(wvList.get(j).get("WVWERT")))<Float.parseFloat(String.valueOf(wvList.get(j).get("MEUGW"))))||
								(wvList.get(j).get("MEOGW")!=null&&wvList.get(j).get("WVWERT")!=null&&
										Float.parseFloat(String.valueOf(wvList.get(j).get("WVWERT")))>Float.parseFloat(String.valueOf(wvList.get(j).get("MEOGW"))))) {
							plMap.put("qualityLevel","2");
							break;
						}
					}
				}
			}
		}
		return list;
	}

	@Override
	public List getMerkmalDataService(QualityBoard qualityBoard) {
		List<Map> list=qbm.getMerkmalDataMapper(qualityBoard);
		if(list.size()>0){
			for(int i=0;i<list.size();i++){
				Map plMap=list.get(i);
				plMap.put("qualityLevel","0");
				List<Map> wvList= (List) plMap.get("wvList");
				for(int j=0;j<wvList.size();j++){
					if("1".equals(wvList.get(j).get("MEMERKART").toString())){
						if(wvList.get(j).get("WVWERT")!=null&&Float.parseFloat(wvList.get(j).get("WVWERT").toString().substring(wvList.get(j).get("WVWERT").toString().indexOf(".")-1))>0){
							plMap.put("qualityLevel","2");
							break;
						}
					}else {
						if((wvList.get(j).get("MEUGW")!=null&&wvList.get(j).get("WVWERT")!=null&&
								Float.parseFloat(String.valueOf(wvList.get(j).get("WVWERT")))<Float.parseFloat(String.valueOf(wvList.get(j).get("MEUGW"))))||
								(wvList.get(j).get("MEOGW")!=null&&wvList.get(j).get("WVWERT")!=null&&
										Float.parseFloat(String.valueOf(wvList.get(j).get("WVWERT")))>Float.parseFloat(String.valueOf(wvList.get(j).get("MEOGW"))))) {
							plMap.put("qualityLevel","2");
							break;
						}
					}
				}
			}
		}
		return list;
	}

	@Override
	public List getChartDataService(QualityBoard qualityBoard) {
		List list=qbm.getChartDataMapper(qualityBoard);
		return list;
	}

	@Override
	public Map getQbShowFormInfoService(QualityBoard qualityBoard) {
		Page page=PageHelper.startPage(qualityBoard.getPage(),1,true);
		List<Map> list=qbm.getQbShowFormInfoMapper(qualityBoard);
		qualityBoard.setTeilId(list.get(0).get("METEIL").toString());
		qualityBoard.setMerkmalId(list.get(0).get("MEMERKMAL").toString());
		List chartList=qbm.getChartDataMapper(qualityBoard);
		Map map=new HashMap<String,Object>();
		map.put("rows", list);
		map.put("chartList", chartList);
		map.put("total", page.getTotal());
		return map;
	}
}
