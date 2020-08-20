/**
 * 
 */
package cn.qdas.bi.service.impl;

import java.util.*;

import javax.annotation.Resource;

import cn.qdas.core.utils.PropertiesUtils;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import cn.qdas.bi.bean.MissionManageBean;
import cn.qdas.bi.bean.MmChartTeilBean;
import cn.qdas.bi.bean.MmChartWvBean;
import cn.qdas.bi.dao.MissionManageMapper;
import cn.qdas.bi.service.IMissionManageService;

/**
 * @author leo.Zhou 周钧
 * 2019年8月22日
 */

@Service
public class MissionManageServiceImpl implements IMissionManageService {
	@Resource
	MissionManageMapper mmm;
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IMissionManageService#getProductionPlanChartData()
	 */
	@Override
	public List getProductionPlanChartData(MissionManageBean mmb,String[] productLineArr) {

		Properties pro =null;
		String path = this.getClass().getClassLoader().getResource("setUp.properties").getPath();
		try {
			pro= PropertiesUtils.readProperties(path);
		}catch (Exception e){
			e.printStackTrace();
		}

		mmb.setProductLines(productLineArr);
		List<MmChartTeilBean> list=mmm.getProductionPlanChartData(mmb);
		for(int i=0;i<list.size();i++) {
			MmChartTeilBean mctb=list.get(i);
			if(null==mctb.getWV0063Id()||"".equals(mctb.getWV0063Id())||"0".equals(mctb.getWV0063Id())){
				mctb.setChartColor(pro.getProperty("katkey.kong"));
			}else{
				mctb.setChartColor(pro.getProperty("katkey."+mctb.getWV0063Id()));
			}

			List<MmChartWvBean> wvlist=mctb.getWvList();
			int redCount=0;
			int yellowCount=0;
			if(wvlist.size()!=0) {
//				mctb.setStartTime(wvlist.get(0).getStartTime());
//				mctb.setEndTime(wvlist.get(wvlist.size()-1).getEndTime());
				mctb.setStartTime(wvlist.get(0).getWVDATZEIT());
				mctb.setEndTime(wvlist.get(wvlist.size()-1).getWVDATZEIT());
				for(int j=0;j<wvlist.size();j++) {
					MmChartWvBean mcwb=wvlist.get(j);
					if("1".equals(mcwb.getMEMERKART())) {
						if(mcwb.getWVWERT().indexOf(".")!=0&&Float.parseFloat(mcwb.getWVWERT().substring(mcwb.getWVWERT().indexOf(".")-1))>0) {
							//mctb.setAlarmRed(mctb.getAlarmRed()+1);
							redCount += 1;
						}
					}else {
						if((mcwb.getMENORMISTUN()!=null&&Float.parseFloat(mcwb.getWVWERT())<Float.parseFloat(mcwb.getMENORMISTUN()))||
								(mcwb.getMENORMISTOB()!=null&&Float.parseFloat(mcwb.getWVWERT())>Float.parseFloat(mcwb.getMENORMISTOB()))) {
//							mctb.setAlarmYellow(mctb.getAlarmYellow()+1);
							yellowCount += 1;
						}else if((mcwb.getMEUGW()!=null&&Float.parseFloat(mcwb.getWVWERT())<Float.parseFloat(mcwb.getMEUGW()))||
								(mcwb.getMEOGW()!=null&&Float.parseFloat(mcwb.getWVWERT())>Float.parseFloat(mcwb.getMEOGW()))) {
//							mctb.setAlarmRed(mctb.getAlarmRed()+1);
							redCount += 1;
						}
					}
				}
			}
			mctb.setAlarmRed(redCount);
			mctb.setAlarmYellow(yellowCount);
		}
		return list;
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IMissionManageService#getProductionPlanChartDataByK1002()
	 */
	@Override
	public List getProductionPlanChartDataByK1002() {
		List list=mmm.getProductionPlanChartDataByK1002();
		return list;
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IMissionManageService#getCheckMissionData(cn.qdas.bi.bean.MissionManageBean)
	 */
	@Override
	public Map getCheckMissionData(MissionManageBean mmb,String[] productLineArr) {
		Map map=new HashMap<String, Object>();
		mmb.setProductLines(productLineArr);
		PageHelper.clearPage();
		Page page = PageHelper.startPage(mmb.getPage(), mmb.getRows(), true);
		List list=mmm.getCheckMissionData(mmb);
		map.put("rows", list);
		map.put("total", page.getTotal());
		return map;
	}
	public List getCheckMissionDataExcel(MissionManageBean mmb,String[] productLineArr) {
		mmb.setProductLines(productLineArr);
		return mmm.getCheckMissionData(mmb);
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IMissionManageService#getAllProductClassComboBox()
	 */
	@Override
	public List getAllProductClassComboBox() {
		List reList=new ArrayList<Map>();
		Map oneMap=new HashMap<String, Object>();
		oneMap.put("text", "显示所有");
		oneMap.put("value", "");
		reList.add(oneMap);
		List getList=mmm.getAllProductClassComboBox();
		reList.addAll(getList);
		return reList;
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IMissionManageService#getAllCheckTypeComboBox()
	 */
	@Override
	public List getAllCheckTypeComboBox() {
		List reList=new ArrayList<Map>();
		Map oneMap=new HashMap<String, Object>();
		oneMap.put("text", "显示所有");
		oneMap.put("value", "");
		reList.add(oneMap);
		List<Map> getList=mmm.getAllCheckTypeComboBox();

		Properties pro =null;
		String path = this.getClass().getClassLoader().getResource("setUp.properties").getPath();
		try {
			pro= PropertiesUtils.readProperties(path);
		}catch (Exception e){
			e.printStackTrace();
		}
		for(int i=0;i<getList.size();i++){
			Map map=getList.get(i);
			map.put("color",pro.getProperty("katkey."+map.get("value")));
		}
		/*for(int i=0;i<getList.size();i++) {
			switch (Integer.parseInt(getList.get(i).get("value").toString())) {
			case 1:
				getList.get(i).put("iconCls", "icon-mr1Icon");
				break;
			case 2:
				getList.get(i).put("iconCls", "icon-mr2Icon");
				break;
			case 3:
				getList.get(i).put("iconCls", "icon-mr3Icon");
				break;
			case 4:
				getList.get(i).put("iconCls", "icon-mr4Icon");
				break;
			case 5:
				getList.get(i).put("iconCls", "icon-mr5Icon");
				break;
			case 6:
				getList.get(i).put("iconCls", "icon-mr6Icon");
				break;
			default:
				break;
			}
			
		}*/
		reList.addAll(getList);
		return reList;
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IMissionManageService#getAllCheckPlanNumComboBox()
	 */
	@Override
	public List getAllCheckPlanNumComboBox() {
		List reList=new ArrayList<Map>();
		Map oneMap=new HashMap<String, Object>();
		oneMap.put("text", "显示所有");
		oneMap.put("value", "");
		reList.add(oneMap);
		List getList=mmm.getAllCheckPlanNumComboBox();
		reList.addAll(getList);
		return reList;
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IMissionManageService#getAllTeilNameComboBox()
	 */
	@Override
	public List getAllTeilNameComboBox() {
		List reList=new ArrayList<Map>();
		Map oneMap=new HashMap<String, Object>();
		oneMap.put("text", "显示所有");
		oneMap.put("value", "");
		reList.add(oneMap);
		List getList=mmm.getAllTeilNameComboBox();
		reList.addAll(getList);
		return reList;
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IMissionManageService#getAllCheckManComboBox()
	 */
	@Override
	public List getAllCheckManComboBox() {
		List reList=new ArrayList<Map>();
		Map oneMap=new HashMap<String, Object>();
		oneMap.put("text", "显示所有");
		oneMap.put("value", "");
		reList.add(oneMap);
		List getList=mmm.getAllCheckManComboBox();
		reList.addAll(getList);
		return reList;
	}
	public List getAllTeilNumComboBox() {
		List reList=new ArrayList<Map>();
		Map oneMap=new HashMap<String, Object>();
		oneMap.put("text", "显示所有");
		oneMap.put("value", "");
		reList.add(oneMap);
		List getList=mmm.getAllTeilNumComboBox();
		reList.addAll(getList);
		return reList;
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IMissionManageService#getProductLineByfw(cn.qdas.bi.bean.MissionManageBean)
	 */
	@Override
	public List getProductLineByfw(MissionManageBean mmb) {
		List reList=new ArrayList<Map>();
		Map oneMap=new HashMap<String, Object>();
		oneMap.put("text", "显示所有");
		oneMap.put("productLine_name", "");
		reList.add(oneMap);
		List<Map> getList=mmm.getProductLineByFw(mmb);
		for(int i=0;i<getList.size();i++) {
			Map map=getList.get(i);
			map.put("text", map.get("productLine_name"));
		}
		reList.addAll(getList);
		return reList;
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IMissionManageService#getDetailsTeilTable(cn.qdas.bi.bean.MissionManageBean)
	 */
	@Override
	public Map getDetailsTeilTable(MissionManageBean mmb) {
		List<Map> list=mmm.getDetailsTeilTable(mmb);
		Map map=list.get(0);
		return map;
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IMissionManageService#getDetailsMerkmalTable(cn.qdas.bi.bean.MissionManageBean)
	 */
	@Override
	public List getDetailsMerkmalTable(MissionManageBean mmb) {
		List list=mmm.getDetailsMerkmalTable(mmb);
		return list;
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IMissionManageService#getAllProductLineByfw(cn.qdas.bi.bean.MissionManageBean)
	 */
	@Override
	public List getAllProductLineByfw(MissionManageBean mmb) {
		List<Map> getList=mmm.getProductLineByFw(mmb);
		return getList;
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IMissionManageService#getProcedureComboBox()
	 */
	@Override
	public List getProcedureComboBox() {
		List reList=new ArrayList<Map>();
		Map oneMap=new HashMap<String, Object>();
		oneMap.put("text", "显示所有");
		oneMap.put("value", "");
		reList.add(oneMap);
		List getList=mmm.getProcedureComboBox();
		reList.addAll(getList);
		return reList;
	}

}
