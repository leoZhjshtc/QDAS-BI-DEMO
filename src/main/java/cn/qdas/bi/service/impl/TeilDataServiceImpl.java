package cn.qdas.bi.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import cn.qdas.bi.bean.Teil;
import cn.qdas.bi.dao.TeilDataMapper;
import cn.qdas.bi.service.ITeilDataService;
@Service
public class TeilDataServiceImpl implements ITeilDataService{
	@Resource
	TeilDataMapper teilDataMapper;
	@Override
	public Map getAllTeil(Teil teil) {
		Map map=new HashMap<String,Object>();
		//Page page = PageHelper.startPage(teil.getPage(), teil.getRows(), true);
		List list=teilDataMapper.getAllTeil(teil);
		//map.put("total",page.getTotal());
		map.put("rows", list);
		return map;
	}
	@Override
	public Map getAllMerkmal(Teil teil) {
		Map map=new HashMap<String,Object>();
		//Page page = PageHelper.startPage(teil.getPage(), teil.getRows(), true);
		List list=teilDataMapper.getAllMerkmal(teil);
		//map.put("total",page.getTotal());
		map.put("rows", list);
		return map;
	}
	@Override
	public Map getAllWertevar(Teil teil) {
		Map map=new HashMap<String,Object>();
		//Page page = PageHelper.startPage(teil.getPage(), teil.getRows(), true);
		List<Map> list=teilDataMapper.getAllWertevar(teil);
		for(int i=0;i<list.size();i++) {
			list.get(i).put("WVDATZEIT", String.valueOf(list.get(i).get("WVDATZEIT")).substring(0, 19));
		}
		//map.put("total",page.getTotal());
		map.put("rows", list);
		return map;
	}

}
