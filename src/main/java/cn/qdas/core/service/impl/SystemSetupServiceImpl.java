/**
 * 
 */
package cn.qdas.core.service.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.qdas.core.bean.SystemSetupBean;
import cn.qdas.core.dao.SystemSetupMapper;
import cn.qdas.core.service.ISystemSetupService;

/**
 * @author leo.Zhou 周钧
 * 2019年7月25日
 */
@Service
public class SystemSetupServiceImpl implements ISystemSetupService {
	@Resource
	SystemSetupMapper ssm;
	/* (non-Javadoc)
	 * @see cn.qdas.core.service.ISystemSetupService#addNewProductLine(cn.qdas.core.bean.SystemSetupBean)
	 */
	@Override
	public Map addNewProductLine(SystemSetupBean ssb) {
		Map remap=new HashMap<String, Object>();
		try {
			ssm.addNewProductLine(ssb);
			remap.put("message",0);
		} catch (Exception e) {
			remap.put("message",1);
			e.printStackTrace();
		}
		return remap;
	}
	/* (non-Javadoc)
	 * @see cn.qdas.core.service.ISystemSetupService#getProdectLineByFactory(cn.qdas.core.bean.SystemSetupBean)
	 */
	@Override
	public List getProdectLineByFactory(SystemSetupBean ssb) {
		List list=ssm.getProdectLineByFactory(ssb);
		return list;
	}
	/* (non-Javadoc)
	 * @see cn.qdas.core.service.ISystemSetupService#delProductLine(cn.qdas.core.bean.SystemSetupBean)
	 */
	@Override
	public void delProductLine(SystemSetupBean ssb) {
		ssm.delProductLine(ssb);
	}
	/* (non-Javadoc)
	 * @see cn.qdas.core.service.ISystemSetupService#addNewFactory(java.lang.String, java.lang.String)
	 */
	@Override
	public void addNewFactory(String factoryName, String factoryIcon) {
		ssm.addNewFactory(factoryName, factoryIcon);
		
	}
	/* (non-Javadoc)
	 * @see cn.qdas.core.service.ISystemSetupService#getFactoryData()
	 */
	@Override
	public List getFactoryData() {
		List list = ssm.getFactoryData();
		return list;
	}
	/* (non-Javadoc)
	 * @see cn.qdas.core.service.ISystemSetupService#getMenuData()
	 */
	@Override
	public List getMenuData(String path) {
		//List<Map> flist = ssm.getFactoryData();
		Map oneMap=new HashMap<String, Object>();
		List oneList=new ArrayList<Map>();
		Map fsMap=new HashMap<String, Object>();
		fsMap.put("text", "工厂设置");
		fsMap.put("url", path+"system/initFactorySetup");
		Map workshopMap=new HashMap<String, Object>();
		workshopMap.put("text", "车间设置");
		workshopMap.put("url", path+"system/initWorkShopPage");
		oneList.add(0, fsMap);
		oneList.add(1, workshopMap);
		/*for(int i=0;i<flist.size();i++) {
			Map map=flist.get(i);
			map.put("text",map.get("factory_name"));
			map.put("url", path+"system/initProductLineSetup?factoryName="+map.get("factory_name")+"&factoryDrawing="+map.get("factory_drawing"));
			oneList.add(map);
		}*/
		oneMap.put("text", "产线设置");
		oneMap.put("iconCls", "icon-shezhi");
		oneMap.put("state", "open");
		oneMap.put("children", oneList);
		List list=new ArrayList<Map>();
		list.add(oneMap);
		
		
		List twoList=new ArrayList<Map>();
		Map qmMap=new HashMap<String, Object>();
		qmMap.put("text", "质量监控设置");
		qmMap.put("url", path+"system/initQaSetUp");
		twoList.add(qmMap);
		Map qaMap= new HashMap<String, Object>();
		qaMap.put("text", "手动更新");
		qaMap.put("url", path+"system/initQaSetUp");
		twoList.add(qaMap);
		Map twoMap=new HashMap<String, Object>();
		twoMap.put("text", "应用设置");
		twoMap.put("iconCls", "icon-shezhi");
		twoMap.put("state", "close");
		twoMap.put("children", twoList);
		
		list.add(twoMap);
		return list;
	}
	/* (non-Javadoc)
	 * @see cn.qdas.core.service.ISystemSetupService#delFactory(cn.qdas.core.bean.SystemSetupBean)
	 */
	@Override
	public Map delFactory(SystemSetupBean ssb,String path) {
		Map map=ssm.selectWorkShopByFactory(ssb);
		Map remap=new HashMap<String , Object>();
		if(Integer.parseInt(map.get("workShopCount").toString())>0) {
			remap.put("message", "工厂下有车间信息，请先删除车间信息");
			return remap;
		}
		ssm.delFactory(ssb);
		File file=new File(path+"/"+ssb.getFactoryIconStr());
		if(file.exists()) {
			file.delete();
		}
		remap.put("message", "操作成功！！");
		return remap;
	}
	/* (non-Javadoc)
	 * @see cn.qdas.core.service.ISystemSetupService#getProductLineCombobox()
	 */
	@Override
	public List getProductLineCombobox() {
		List list=ssm.getProductLineCombobox();
		return list;
	}
	/* (non-Javadoc)
	 * @see cn.qdas.core.service.ISystemSetupService#addNewWorkShop(cn.qdas.core.bean.SystemSetupBean, java.lang.String)
	 */
	@Override
	public void addNewWorkShop(SystemSetupBean ssb, String filename) {
		ssb.setWorkShopDrawingStr(filename);
		ssm.addWorkShop(ssb);
	}
	/* (non-Javadoc)
	 * @see cn.qdas.core.service.ISystemSetupService#getWorkShop()
	 */
	@Override
	public List getWorkShop() {
		List list=ssm.getWorkShop();
		return list;
	}
	/* (non-Javadoc)
	 * @see cn.qdas.core.service.ISystemSetupService#delWorkShop(cn.qdas.core.bean.SystemSetupBean)
	 */
	@Override
	public void delWorkShop(SystemSetupBean ssb,String path) throws Exception {
			ssm.delProductLineByWorkShop(ssb);
			ssm.delWorkShop(ssb);
			File file=new File(path+"/"+ssb.getWorkShopDrawingStr());
			if(file.exists()) {
				file.delete();
			}
	}
	/* (non-Javadoc)
	 * @see cn.qdas.bi.service.IQualityBoardService#getFactoryAndWorShop()
	 */
	@Override
	public List getFactoryAndWorShop() {
		List list=ssm.getFactoryAndWorkShop();
		return list;
	}

	@Override
	public List getAllCheckTypeService() {
		List<Map> list=ssm.getAllCheckTypeMapper();
		Map map=new HashMap();
		map.put("BEZ","空");
		map.put("KATKEY","kong");
		list.add(map);
		return list;
	}

}
