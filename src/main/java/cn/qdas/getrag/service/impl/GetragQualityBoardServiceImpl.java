package cn.qdas.getrag.service.impl;

import cn.qdas.getrag.bean.QualityBoardGetrag;
import cn.qdas.getrag.dao.GetragQualityBoardMapper;
import cn.qdas.getrag.service.IGetragQualityBoardService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class GetragQualityBoardServiceImpl implements IGetragQualityBoardService {
    @Resource
    GetragQualityBoardMapper getragQualityBoardMapper;
    @Override
    public List getProductLineDataService(QualityBoardGetrag qualityBoardGetrag) {
        return getragQualityBoardMapper.getProductLineDataMapper(qualityBoardGetrag);
    }

    @Override
    public List getMissionManageChartDataService(QualityBoardGetrag qualityBoardGetrag) {
        return getragQualityBoardMapper.getMissionManageChartDataMapper(qualityBoardGetrag);
    }

    @Override
    public Map getMissionManageTeilInfoService(QualityBoardGetrag qualityBoardGetrag) {
        return getragQualityBoardMapper.getMissionManageTeilInfoMapper(qualityBoardGetrag);
    }

    @Override
    public List missionManageDetailsMerkmalService(QualityBoardGetrag qualityBoardGetrag) {
        return getragQualityBoardMapper.missionManageDetailsMerkmalMapper(qualityBoardGetrag);
    }

    @Override
    public List getProcessRecent24HoursDataService(QualityBoardGetrag qualityBoardGetrag) {
        qualityBoardGetrag.setStartTime(getRecent24Time());
        return getragQualityBoardMapper.getProcessRecent24HoursDataMapper(qualityBoardGetrag);
    }

    @Override
    public List getMerkmalRecent24HoursDataService(QualityBoardGetrag qualityBoardGetrag) {
        qualityBoardGetrag.setStartTime(getRecent24Time());
        return getragQualityBoardMapper.getMerkmalRecent24HoursDataMapper(qualityBoardGetrag);
    }

    @Override
    public List getProcessMonthReportDataService(QualityBoardGetrag qualityBoardGetrag) {
        return getragQualityBoardMapper.getProcessMonthReportDataMapper(qualityBoardGetrag);
    }

    @Override
    public List getYearComboboxDataService() {
        return getragQualityBoardMapper.getYearComboboxDataMapper();
    }

    @Override
    public List getProcessYearReportDataMapper(QualityBoardGetrag qualityBoardGetrag) {
        return getragQualityBoardMapper.getProcessYearReportDataMapper(qualityBoardGetrag);
    }

    @Override
    public List getRecent125NumMapper(QualityBoardGetrag qualityBoardGetrag) {
        return getragQualityBoardMapper.getRecent125NumMapper(qualityBoardGetrag);
    }

    @Override
    public Map getQbShowFormInfoService(QualityBoardGetrag qualityBoard) {
        Page page= PageHelper.startPage(qualityBoard.getPage(),1,true);
        List<Map> list=getragQualityBoardMapper.getQbShowFormInfoMapper(qualityBoard);
        List chartList=new ArrayList();
        Map map=new HashMap<String,Object>();
        if(list.size()>0){
            qualityBoard.setTeilId(list.get(0).get("WVTEIL").toString());
            qualityBoard.setMerkmalId(list.get(0).get("WVMERKMAL").toString());
            chartList=getragQualityBoardMapper.getChartDataMapper(qualityBoard);
            map.put("rows", chartList.get(0));
        }
        map.put("chartList", chartList);
        map.put("total", page.getTotal());
        return map;
    }

    @Override
    public List getProductLineComboDataService(QualityBoardGetrag qualityBoard) {
        return getragQualityBoardMapper.getProductLineComboDataMapper(qualityBoard);
    }


    public String getRecent24Time(){
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.set(Calendar.HOUR_OF_DAY,c.get(Calendar.HOUR_OF_DAY) - 24);
        Date time= c.getTime();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String ago=sdf.format(time);
        return ago;
    }
}
