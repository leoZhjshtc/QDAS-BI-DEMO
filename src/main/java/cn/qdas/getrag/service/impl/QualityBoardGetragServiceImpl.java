package cn.qdas.getrag.service.impl;


import cn.qdas.getrag.bean.QualityBoardGetrag;
import cn.qdas.getrag.dao.QualityBoardGetragMapper;
import cn.qdas.getrag.service.IQualityBoardGetragService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@SuppressWarnings(value = { "all" })
public class QualityBoardGetragServiceImpl implements IQualityBoardGetragService {
	@Resource
	QualityBoardGetragMapper qbm;

	@Override
	public List getTeilDataService(QualityBoardGetrag qualityBoard) {
		List<Map> list=qbm.getTeilDataMapper(qualityBoard);
		if(list.size()>0){
			for(int i=0;i<list.size();i++){
				Map plMap=list.get(i);
				plMap.put("qualityLevel","0");
				List<Map> wvList= (List) plMap.get("wvList");
				for(int j=0;j<wvList.size();j++){
					if(null!=wvList.get(j).get("MEMERKART")&&"1".equals(wvList.get(j).get("MEMERKART").toString())){
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
	public List getProcedureDataService(QualityBoardGetrag qualityBoard) {
		List<Map> list=qbm.getProcedureDataMapper(qualityBoard);
		if(list.size()>0){
			for(int i=0;i<list.size();i++){
				Map plMap=list.get(i);
				plMap.put("qualityLevel","0");
				List<Map> wvList= (List) plMap.get("wvList");
				for(int j=0;j<wvList.size();j++){
					if(null!=wvList.get(j).get("MEMERKART")&&"1".equals(wvList.get(j).get("MEMERKART").toString())){
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
	public List getMerkmalDataService(QualityBoardGetrag qualityBoard) {
		List<Map> list=qbm.getMerkmalDataMapper(qualityBoard);
		if(list.size()>0){
			for(int i=0;i<list.size();i++){
				Map plMap=list.get(i);
				plMap.put("qualityLevel","0");
				List<Map> wvList= (List) plMap.get("wvList");
				for(int j=0;j<wvList.size();j++){
					if(null!=wvList.get(j).get("MEMERKART")&&"1".equals(wvList.get(j).get("MEMERKART").toString())){
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
	public List getChartDataService(QualityBoardGetrag qualityBoard) {
		List list=qbm.getChartDataMapper(qualityBoard);
		return list;
	}

	@Override
	public Map getQbShowFormInfoService(QualityBoardGetrag qualityBoard) {
		Page page=PageHelper.startPage(qualityBoard.getPage(),1,true);
		List<Map> list=qbm.getQbShowFormInfoMapper(qualityBoard);
		List chartList=new ArrayList();
		Map map=new HashMap<String,Object>();
		if(list.size()>0){
			qualityBoard.setTeilId(list.get(0).get("WVTEIL").toString());
			qualityBoard.setMerkmalId(list.get(0).get("WVMERKMAL").toString());
			chartList=qbm.getChartDataMapper(qualityBoard);
			map.put("rows", chartList.get(0));
		}
		map.put("chartList", chartList);
		map.put("total", page.getTotal());
		return map;
	}
}
