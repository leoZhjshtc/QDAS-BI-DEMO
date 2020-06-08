package cn.qdas.getrag.service.impl;

import cn.qdas.getrag.bean.QualityAnalyseGetragBean;
import cn.qdas.getrag.dao.QualityAnalyseGetragMapper;
import cn.qdas.getrag.service.IQualityAnalyseGetragService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service("qualityAnalyseGetragService")
public class QualityAnalyseGetragServiceImpl implements IQualityAnalyseGetragService {
    @Resource
    QualityAnalyseGetragMapper qualityAnalyseGetragMapper;
    @Override
    public void delTeilTableDataService() {
        qualityAnalyseGetragMapper.delTeilTableDataMapper();
    }

    @Override
    public void delMerkmalTableDataService() {
        qualityAnalyseGetragMapper.delMerkmalTableDataMapper();
    }

    @Override
    public List getTeilAndMerkmalDataService() {
        return qualityAnalyseGetragMapper.getTeilAndMerkmalDataMapper();
    }

    @Override
    public void synchronizedLocalTeilService(List list) {
        qualityAnalyseGetragMapper.synchronizedLocalTeilMapper(list);
    }

    @Override
    public void synchronizedLocalMerkmalService(List list) {
        qualityAnalyseGetragMapper.synchronizedLocalMerkmalMapper(list);
    }

    @Override
    public List getTeilDataService() {
        return qualityAnalyseGetragMapper.getTeilDataMapper();
    }


    /*
        new
     */
    @Override
    public List getTeilRecent24HoursDataService() {
        QualityAnalyseGetragBean qualityAnalyseGetragBean=new QualityAnalyseGetragBean();
        qualityAnalyseGetragBean.setStartTime(getRecent24Time());
        return qualityAnalyseGetragMapper.getTeilRecent24HoursDataMapper(qualityAnalyseGetragBean);
    }

    @Override
    public List getProcedureRecent24HoursDataService(QualityAnalyseGetragBean qualityAnalyseGetragBean) {
        qualityAnalyseGetragBean.setStartTime(getRecent24Time());
        return qualityAnalyseGetragMapper.getProcedureRecent24HoursDataMapper(qualityAnalyseGetragBean);
    }

    @Override
    public List getMerkmalRecent24HoursDataService(QualityAnalyseGetragBean qualityAnalyseGetragBean) {
        qualityAnalyseGetragBean.setStartTime(getRecent24Time());
        return qualityAnalyseGetragMapper.getMerkmalRecent24HoursDataMapper(qualityAnalyseGetragBean);
    }

    @Override
    public List getLocalEveryDayDataService(QualityAnalyseGetragBean qualityAnalyseGetragBean) {
        return qualityAnalyseGetragMapper.getLocalEveryDayDataMapper(qualityAnalyseGetragBean);
    }

    @Override
    public void synchronizedLocalDataService(List list) {
        qualityAnalyseGetragMapper.synchronizedLocalDataMapper(list);
    }

    @Override
    public List getYearComboboxDataMapper() {
        return qualityAnalyseGetragMapper.getYearComboboxDataMapper();
    }

    @Override
    public List getTeilMonthReportDataService(QualityAnalyseGetragBean qualityAnalyseGetragBean) {
        return qualityAnalyseGetragMapper.getTeilMonthReportDataMapper(qualityAnalyseGetragBean);
    }

    @Override
    public List getProcedureMonthReportDataService(QualityAnalyseGetragBean qualityAnalyseGetragBean) {
        return qualityAnalyseGetragMapper.getProcedureMonthReportDataMapper(qualityAnalyseGetragBean);
    }

    @Override
    public List getTeilYearReportDataService(QualityAnalyseGetragBean qualityAnalyseGetragBean) {
        return qualityAnalyseGetragMapper.getTeilYearReportDataMapper(qualityAnalyseGetragBean);
    }

    @Override
    public List getProcedureYearReportDataService(QualityAnalyseGetragBean qualityAnalyseGetragBean) {
        return qualityAnalyseGetragMapper.getProcedureYearReportDataMapper(qualityAnalyseGetragBean);
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
