package cn.qdas.bi_adminlte.service.impl;

import cn.qdas.bi_adminlte.bean.TeilBean;
import cn.qdas.bi_adminlte.dao.QualityBoardAdminLteMapper;
import cn.qdas.bi_adminlte.service.IQualityBoardAdminLteService;
import cn.qdas.core.service.BaseService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class QualityBoardAdminLteServiceImpl extends BaseService implements IQualityBoardAdminLteService {

    @Resource
    QualityBoardAdminLteMapper qualityBoardAdminLteMapper;

    @Override
    public List getProductLineDataService(TeilBean teilBean) {
//        Map setupInfoMap = getSetupInfo();
        List<Map> list= qualityBoardAdminLteMapper.getProductLineDataMapper(teilBean);
        /*if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Map plMap = list.get(i);
                List<Map> wvList = (List) plMap.get("wvList");
                int nokcount = 0;
                for (int j = 0; j < wvList.size(); j++) {
                    if ("1".equals(setupInfoMap.get("ifSetupTolerance"))) {
                        Map toMap = toleranceChange(wvList.get(j).get("MEUGW") == null ? null : wvList.get(j).get("MEUGW").toString(), wvList.get(j).get("MEOGW") == null ? null : wvList.get(j).get("MEOGW").toString(), Float.parseFloat(setupInfoMap.get("tolerance").toString()));
                        wvList.get(j).put("MEUGW", toMap.get("meugw"));
                        wvList.get(j).put("MEOGW", toMap.get("meogw"));
                    }
                    if (null != wvList.get(j).get("MEMERKART") && "1".equals(wvList.get(j).get("MEMERKART").toString())) {
                        if (wvList.get(j).get("WVWERT") != null && Float.parseFloat(wvList.get(j).get("WVWERT").toString().substring(wvList.get(j).get("WVWERT").toString().indexOf(".") - 1)) > 0) {
                            nokcount += 1;
                        }
                    } else {
                        if ((wvList.get(j).get("MEUGW") != null && wvList.get(j).get("WVWERT") != null &&
                                Float.parseFloat(String.valueOf(wvList.get(j).get("WVWERT"))) < Float.parseFloat(String.valueOf(wvList.get(j).get("MEUGW")))) ||
                                (wvList.get(j).get("MEOGW") != null && wvList.get(j).get("WVWERT") != null &&
                                        Float.parseFloat(String.valueOf(wvList.get(j).get("WVWERT"))) > Float.parseFloat(String.valueOf(wvList.get(j).get("MEOGW"))))) {
                            nokcount += 1;
                        }
                    }
                }
                if (nokcount > 0) {
                    plMap.put("qualityLevel", "2");
                    int okcount = wvList.size() - nokcount;
                    float passrate = (float) okcount * 100 / wvList.size();
                    DecimalFormat decimalFormat = new DecimalFormat(".00");
                    plMap.put("passrate", decimalFormat.format(passrate));
                } else {
                    plMap.put("qualityLevel", "0");
                    plMap.put("passrate", "100%");
                }
            }
        }*/
        return list;
    }

    @Override
    public List getProcessDataService(TeilBean teilBean) {
        //Map setupInfoMap = getSetupInfo();
        List<Map> list= qualityBoardAdminLteMapper.getProcessDataMapper(teilBean);
//        if (null == teilBean.getIfQbSerchWertCount() || "0".equals(teilBean.getIfQbSerchWertCount())) {
//            list = qualityBoardAdminLteMapper.getProcessDataMapper(teilBean);
//        } else {
//            list = qualityBoardAdminLteMapper.getProcessDataMapperByCount(teilBean);
//        }
        /*if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Map plMap = list.get(i);
                List<Map> wvList = (List) plMap.get("wvList");
                int nokcount = 0;
                for (int j = 0; j < wvList.size(); j++) {
                    if ("1".equals(setupInfoMap.get("ifSetupTolerance"))) {
                        Map toMap = toleranceChange(wvList.get(j).get("MEUGW") == null ? null : wvList.get(j).get("MEUGW").toString(), wvList.get(j).get("MEOGW") == null ? null : wvList.get(j).get("MEOGW").toString(), Float.parseFloat(setupInfoMap.get("tolerance").toString()));
                        wvList.get(j).put("MEUGW", toMap.get("meugw"));
                        wvList.get(j).put("MEOGW", toMap.get("meogw"));
                    }
                    if (null != wvList.get(j).get("MEMERKART") && "1".equals(wvList.get(j).get("MEMERKART").toString())) {
                        if (wvList.get(j).get("WVWERT") != null && Float.parseFloat(wvList.get(j).get("WVWERT").toString().substring(wvList.get(j).get("WVWERT").toString().indexOf(".") - 1)) > 0) {
                            nokcount += 1;
                        }
                    } else {
                        if ((wvList.get(j).get("MEUGW") != null && wvList.get(j).get("WVWERT") != null &&
                                Float.parseFloat(String.valueOf(wvList.get(j).get("WVWERT"))) < Float.parseFloat(String.valueOf(wvList.get(j).get("MEUGW")))) ||
                                (wvList.get(j).get("MEOGW") != null && wvList.get(j).get("WVWERT") != null &&
                                        Float.parseFloat(String.valueOf(wvList.get(j).get("WVWERT"))) > Float.parseFloat(String.valueOf(wvList.get(j).get("MEOGW"))))) {
                            nokcount += 1;
                        }
                    }
                }
                if (nokcount > 0) {
                    plMap.put("qualityLevel", "2");
                    int okcount = wvList.size() - nokcount;
                    float passrate = (float) okcount * 100 / wvList.size();
                    DecimalFormat decimalFormat = new DecimalFormat(".00");
                    plMap.put("passrate", decimalFormat.format(passrate));
                } else {
                    plMap.put("qualityLevel", "0");
                    plMap.put("passrate", "100%");
                }
            }
        }*/
        return list;
    }

    @Override
    public List getMerkmalDataService(TeilBean teilBean) {
//        Map setupInfoMap = getSetupInfo();
        List<Map> list = qualityBoardAdminLteMapper.getMerkmalDataMapper(teilBean);
//        if (null == teilBean.getIfQbSerchWertCount() || "0".equals(teilBean.getIfQbSerchWertCount())) {
//            list = qualityBoardAdminLteMapper.getMerkmalDataMapper(teilBean);
//        } else {
//            list = qualityBoardAdminLteMapper.getMerkmalDataMapperByCount(teilBean);
//        }
        /*if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Map plMap = list.get(i);
                List<Map> wvList = (List) plMap.get("wvList");
                int nokcount = 0;
                for (int j = 0; j < wvList.size(); j++) {
                    if ("1".equals(setupInfoMap.get("ifSetupTolerance"))) {
                        Map toMap = toleranceChange(wvList.get(j).get("MEUGW") == null ? null : wvList.get(j).get("MEUGW").toString(), wvList.get(j).get("MEOGW") == null ? null : wvList.get(j).get("MEOGW").toString(), Float.parseFloat(setupInfoMap.get("tolerance").toString()));
                        wvList.get(j).put("MEUGW", toMap.get("meugw"));
                        wvList.get(j).put("MEOGW", toMap.get("meogw"));
                    }
                    if (null != wvList.get(j).get("MEMERKART") && "1".equals(wvList.get(j).get("MEMERKART").toString())) {
                        if (wvList.get(j).get("WVWERT") != null && Float.parseFloat(wvList.get(j).get("WVWERT").toString().substring(wvList.get(j).get("WVWERT").toString().indexOf(".") - 1)) > 0) {
                            nokcount += 1;
                        }
                    } else {
                        if ((wvList.get(j).get("MEUGW") != null && wvList.get(j).get("WVWERT") != null &&
                                Float.parseFloat(String.valueOf(wvList.get(j).get("WVWERT"))) < Float.parseFloat(String.valueOf(wvList.get(j).get("MEUGW")))) ||
                                (wvList.get(j).get("MEOGW") != null && wvList.get(j).get("WVWERT") != null &&
                                        Float.parseFloat(String.valueOf(wvList.get(j).get("WVWERT"))) > Float.parseFloat(String.valueOf(wvList.get(j).get("MEOGW"))))) {
                            nokcount += 1;
                        }
                    }
                }
                if (nokcount > 0) {
                    plMap.put("qualityLevel", "2");
                    int okcount = wvList.size() - nokcount;
                    float passrate = (float) okcount * 100 / wvList.size();
                    DecimalFormat decimalFormat = new DecimalFormat(".00");
                    plMap.put("passrate", decimalFormat.format(passrate));
                } else {
                    plMap.put("qualityLevel", "0");
                    plMap.put("passrate", "100%");
                }
            }
        }*/
        return list;
    }

    @Override
    public List getPlMissionManageChartDataService(TeilBean teilBean) {
        //Map setupInfoMap = getSetupInfo();
        List<Map> list = qualityBoardAdminLteMapper.getPlMissionManageChartDataMapper(teilBean);
        /*if ("1".equals(setupInfoMap.get("ifSetupTolerance"))) {
            for (int i = 0; i < list.size(); i++) {
                List<Map> wvnrList = (List) list.get(i).get("wvnrList");
                for (int k = 0; k < wvnrList.size(); k++) {
                    List<Map> wvList = (List) wvnrList.get(k).get("wvList");
                    for (int j = 0; j < wvList.size(); j++) {
                        Map toMap = toleranceChange(wvList.get(j).get("MEUGW") == null ? null : wvList.get(j).get("MEUGW").toString(), wvList.get(j).get("MEOGW") == null ? null : wvList.get(j).get("MEOGW").toString(), Float.parseFloat(setupInfoMap.get("tolerance").toString()));
                        wvList.get(j).put("MEUGW", toMap.get("meugw"));
                        wvList.get(j).put("MEOGW", toMap.get("meogw"));
                    }
                }
            }
        }*/
        return list;
    }

    @Override
    public List getProcessMissionManageChartDataService(TeilBean teilBean) {
      // Map setupInfoMap = getSetupInfo();
        List<Map> list = qualityBoardAdminLteMapper.getProcessMissionManageChartDataMapper(teilBean);
       /* if ("1".equals(setupInfoMap.get("ifSetupTolerance"))) {
            for (int i = 0; i < list.size(); i++) {
                List<Map> wvnrList = (List) list.get(i).get("wvnrList");
                for (int k = 0; k < wvnrList.size(); k++) {
                    List<Map> wvList = (List) wvnrList.get(k).get("wvList");
                    for (int j = 0; j < wvList.size(); j++) {
                        Map toMap = toleranceChange(wvList.get(j).get("MEUGW") == null ? null : wvList.get(j).get("MEUGW").toString(), wvList.get(j).get("MEOGW") == null ? null : wvList.get(j).get("MEOGW").toString(), Float.parseFloat(setupInfoMap.get("tolerance").toString()));
                        wvList.get(j).put("MEUGW", toMap.get("meugw"));
                        wvList.get(j).put("MEOGW", toMap.get("meogw"));
                    }
                }
            }
        }*/
        return list;
    }

    @Override
    public List getMerkmalChartDataService(TeilBean teilBean) {
        //Map setupInfoMap = getSetupInfo();
        List<Map> wvList;
        if (null == teilBean.getIfQbSerchWertCount() || "0".equals(teilBean.getIfQbSerchWertCount())) {
            wvList = qualityBoardAdminLteMapper.getMerkmalChartDataMapper(teilBean);
        } else {
            wvList = qualityBoardAdminLteMapper.getMerkmalChartDataMapperByCount(teilBean);
        }
        /*if ("1".equals(setupInfoMap.get("ifSetupTolerance"))) {
            for (int j = 0; j < wvList.size(); j++) {
                Map toMap = toleranceChange(wvList.get(j).get("MEUGW") == null ? null : wvList.get(j).get("MEUGW").toString(), wvList.get(j).get("MEOGW") == null ? null : wvList.get(j).get("MEOGW").toString(), Float.parseFloat(setupInfoMap.get("tolerance").toString()));
                wvList.get(j).put("NEWMEUGW", toMap.get("meugw"));
                wvList.get(j).put("NEWMEOGW", toMap.get("meogw"));
            }
        }
        if ("1".equals(setupInfoMap.get("ifSetupDecimal"))) {
            for (int i = 0; i < wvList.size(); i++) {
                String wert = wvList.get(i).get("WVWERT").toString();
                if (wert.indexOf(".") != -1 && wert.substring(wert.indexOf(".")).length() > Integer.parseInt(setupInfoMap.get("decimal").toString())) {
                    BigDecimal bigDecimal = new BigDecimal(wert);
                    bigDecimal = bigDecimal.setScale(Integer.parseInt(setupInfoMap.get("decimal").toString()), BigDecimal.ROUND_HALF_UP);
                    wvList.get(i).put("WVWERT", bigDecimal);
                }
            }
        }*/
        return wvList;
    }

    @Override
    public List getMerkmalChartDataByTimeService(TeilBean teilBean) {
       // Map setupInfoMap = getSetupInfo();
        List<Map> wvList = qualityBoardAdminLteMapper.getMerkmalChartDataMapper(teilBean);
        /*if ("1".equals(setupInfoMap.get("ifSetupTolerance"))) {
            for (int j = 0; j < wvList.size(); j++) {
                Map toMap = toleranceChange(wvList.get(j).get("MEUGW") == null ? null : wvList.get(j).get("MEUGW").toString(), wvList.get(j).get("MEOGW") == null ? null : wvList.get(j).get("MEOGW").toString(), Float.parseFloat(setupInfoMap.get("tolerance").toString()));
                wvList.get(j).put("NEWMEUGW", toMap.get("meugw"));
                wvList.get(j).put("NEWMEOGW", toMap.get("meogw"));
            }
        }
        if ("1".equals(setupInfoMap.get("ifSetupDecimal"))) {
            for (int i = 0; i < wvList.size(); i++) {
                String wert = wvList.get(i).get("WVWERT").toString();
                if (wert.indexOf(".") != -1 && wert.substring(wert.indexOf(".")).length() > Integer.parseInt(setupInfoMap.get("decimal").toString())) {
                    BigDecimal bigDecimal = new BigDecimal(wert);
                    bigDecimal = bigDecimal.setScale(Integer.parseInt(setupInfoMap.get("decimal").toString()), BigDecimal.ROUND_HALF_UP);
                    wvList.get(i).put("WVWERT", bigDecimal);
                }
            }
        }*/
        return wvList;
    }

    @Override
    public List getMissionManageDetailsService(TeilBean teilBean) {
        //Map setupInfoMap = getSetupInfo();
        List<Map> list = qualityBoardAdminLteMapper.getMissionManageDetailsMapper(teilBean);
        /*for (int i = 0; i < list.size(); i++) {
            list.get(i).put("qualityLevel", "0");
            if (null != list.get(i).get("MEMERKART") && "1".equals(list.get(i).get("MEMERKART").toString())) {
                if (list.get(i).get("WVWERT") != null && Float.parseFloat(list.get(i).get("WVWERT").toString().substring(list.get(i).get("WVWERT").toString().indexOf(".") - 1)) > 0) {
                    list.get(i).put("qualityLevel", "2");
                }
            } else {
                if ("1".equals(setupInfoMap.get("ifSetupDecimal"))) {
                    String wert = list.get(i).get("WVWERT").toString();
                    if (wert.indexOf(".") != -1 && wert.substring(wert.indexOf(".")).length() > Integer.parseInt(setupInfoMap.get("decimal").toString())) {
                        BigDecimal bigDecimal = new BigDecimal(wert);
                        bigDecimal = bigDecimal.setScale(Integer.parseInt(setupInfoMap.get("decimal").toString()), BigDecimal.ROUND_HALF_UP);
                        list.get(i).put("WVWERT", bigDecimal);
                    }
                }
                if ("1".equals(setupInfoMap.get("ifSetupTolerance"))) {
                    Map toMap = toleranceChange(list.get(i).get("MEUGW") == null ? null : list.get(i).get("MEUGW").toString(), list.get(i).get("MEOGW") == null ? null : list.get(i).get("MEOGW").toString(), Float.parseFloat(setupInfoMap.get("tolerance").toString()));
                    list.get(i).put("NEWMEUGW", toMap.get("meugw"));
                    list.get(i).put("NEWMEOGW", toMap.get("meogw"));
                    if ((list.get(i).get("NEWMEUGW") != null && list.get(i).get("WVWERT") != null &&
                            Float.parseFloat(String.valueOf(list.get(i).get("WVWERT"))) < Float.parseFloat(String.valueOf(list.get(i).get("NEWMEUGW")))) ||
                            (list.get(i).get("NEWMEOGW") != null && list.get(i).get("WVWERT") != null &&
                                    Float.parseFloat(String.valueOf(list.get(i).get("WVWERT"))) > Float.parseFloat(String.valueOf(list.get(i).get("NEWMEOGW"))))) {
                        list.get(i).put("qualityLevel", "2");
                    }
                } else {
                    if ((list.get(i).get("MEUGW") != null && list.get(i).get("WVWERT") != null &&
                            Float.parseFloat(String.valueOf(list.get(i).get("WVWERT"))) < Float.parseFloat(String.valueOf(list.get(i).get("MEUGW")))) ||
                            (list.get(i).get("MEOGW") != null && list.get(i).get("WVWERT") != null &&
                                    Float.parseFloat(String.valueOf(list.get(i).get("WVWERT"))) > Float.parseFloat(String.valueOf(list.get(i).get("MEOGW"))))) {
                        list.get(i).put("qualityLevel", "2");
                    }
                }
            }
        }*/
        return list;
    }

    @Override
    public List getProductLineRecent24HoursDataService(TeilBean teilBean) {
       // Map setupInfoMap = getSetupInfo();
        List<Map> list = qualityBoardAdminLteMapper.getProductLineRecent24HoursDataMapper(teilBean);
        /*if ("1".equals(setupInfoMap.get("ifSetupTolerance"))) {
            for (int i = 0; i < list.size(); i++) {
                List<Map> timeList = (List) list.get(i).get("timeList");
                for (int k = 0; k < timeList.size(); k++) {
                    List<Map> wvList = (List) timeList.get(k).get("wvList");
                    for (int j = 0; j < wvList.size(); j++) {
                        Map toMap = toleranceChange(wvList.get(j).get("MEUGW") == null ? null : wvList.get(j).get("MEUGW").toString(), wvList.get(j).get("MEOGW") == null ? null : wvList.get(j).get("MEOGW").toString(), Float.parseFloat(setupInfoMap.get("tolerance").toString()));
                        wvList.get(j).put("MEUGW", toMap.get("meugw"));
                        wvList.get(j).put("MEOGW", toMap.get("meogw"));
                    }
                }
            }
        }*/
        return list;
    }

    @Override
    public List getProductLineMonthReportDataService(TeilBean teilBean) {
        return qualityBoardAdminLteMapper.getProductLineMonthReportDataMapper(teilBean);
    }

    @Override
    public List getYearComboboxDataService() {
        return qualityBoardAdminLteMapper.getYearComboboxDataMapper();
    }

    @Override
    public List getProductLineYearReportDataService(TeilBean teilBean) {
        return qualityBoardAdminLteMapper.getProductLineYearReportDataMapper(teilBean);
    }

    @Override
    public List getProcessRecent24HoursDataService(TeilBean teilBean) {
       // Map setupInfoMap = getSetupInfo();
        List<Map> list = qualityBoardAdminLteMapper.getProcessRecent24HoursDataMapper(teilBean);
        /*if ("1".equals(setupInfoMap.get("ifSetupTolerance"))) {
            for (int i = 0; i < list.size(); i++) {
                List<Map> timeList = (List) list.get(i).get("timeList");
                for (int k = 0; k < timeList.size(); k++) {
                    List<Map> wvList = (List) timeList.get(k).get("wvList");
                    for (int j = 0; j < wvList.size(); j++) {
                        Map toMap = toleranceChange(wvList.get(j).get("MEUGW") == null ? null : wvList.get(j).get("MEUGW").toString(), wvList.get(j).get("MEOGW") == null ? null : wvList.get(j).get("MEOGW").toString(), Float.parseFloat(setupInfoMap.get("tolerance").toString()));
                        wvList.get(j).put("MEUGW", toMap.get("meugw"));
                        wvList.get(j).put("MEOGW", toMap.get("meogw"));
                    }
                }
            }
        }*/
        return list;
    }

    @Override
    public List getProcessMonthReportDataService(TeilBean teilBean) {
        return qualityBoardAdminLteMapper.getProcessMonthReportDataMapper(teilBean);
    }

    @Override
    public List getProcessYearReportDataService(TeilBean teilBean) {
        return qualityBoardAdminLteMapper.getProcessYearReportDataMapper(teilBean);
    }

    @Override
    public List getQaMerkmalDataService(TeilBean teilBean) {
      //  Map setupInfoMap = getSetupInfo();
        List<Map> list = qualityBoardAdminLteMapper.getQaMerkmalDataMapper(teilBean);
//        if (null == teilBean.getIfQbSerchWertCount() || "0".equals(teilBean.getIfQbSerchWertCount())) {
//            list = qualityBoardAdminLteMapper.getQaMerkmalDataMapper(teilBean);
//        } else {
//            list = qualityBoardAdminLteMapper.getQaMerkmalDataMapperByCount(teilBean);
//        }
        /*if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Map plMap = (Map) list.get(i);
                List<Map> wvList = (List) plMap.get("wvList");
                int nokcount = 0;
                StringBuffer barSb = new StringBuffer();
                List<String> lineList = new ArrayList();
                List<Float> boxPlotList = new ArrayList();
                if ("1".equals(setupInfoMap.get("ifSetupTolerance"))) {
                    Map toMap = toleranceChange(list.get(i).get("MEUGW") == null ? null : list.get(i).get("MEUGW").toString(), list.get(i).get("MEOGW") == null ? null : list.get(i).get("MEOGW").toString(), Float.parseFloat(setupInfoMap.get("tolerance").toString()));
                    list.get(i).put("NEWMEUGW", toMap.get("meugw"));
                    list.get(i).put("NEWMEOGW", toMap.get("meogw"));
                    for (int j = 0; j < wvList.size(); j++) {
                        if (null != list.get(i).get("MEMERKART") && "1".equals(list.get(i).get("MEMERKART").toString())) {
                            if (wvList.get(j).get("WVWERT") != null && Float.parseFloat(wvList.get(j).get("WVWERT").toString().substring(wvList.get(j).get("WVWERT").toString().indexOf(".") - 1)) > 0) {
                                nokcount += 1;
                                barSb.append(",1");
                            } else {
                                barSb.append(",0");
                            }
                        } else {
                            lineList.add(wvList.get(j).get("WVWERT").toString());
                            boxPlotList.add(Float.parseFloat(wvList.get(j).get("WVWERT").toString()));
                            if (list.get(i).get("NEWMEUGW") != null && wvList.get(j).get("WVWERT") != null && Float.parseFloat(String.valueOf(wvList.get(j).get("WVWERT"))) < Float.parseFloat(String.valueOf(list.get(i).get("NEWMEUGW")))) {
                                nokcount += 1;
                                barSb.append(",-1");
                            } else if (list.get(i).get("NEWMEOGW") != null && wvList.get(j).get("WVWERT") != null &&
                                    Float.parseFloat(String.valueOf(wvList.get(j).get("WVWERT"))) > Float.parseFloat(String.valueOf(list.get(i).get("NEWMEOGW")))) {
                                nokcount += 1;
                                barSb.append(",1");
                            } else {
                                barSb.append(",0");
                            }
                        }
                    }
                } else {
                    for (int j = 0; j < wvList.size(); j++) {
                        if (null != list.get(i).get("MEMERKART") && "1".equals(list.get(i).get("MEMERKART").toString())) {
                            if (wvList.get(j).get("WVWERT") != null && Float.parseFloat(wvList.get(j).get("WVWERT").toString().substring(wvList.get(j).get("WVWERT").toString().indexOf(".") - 1)) > 0) {
                                nokcount += 1;
                                barSb.append(",1");
                            } else {
                                barSb.append(",0");
                            }
                        } else {
                            lineList.add(wvList.get(j).get("WVWERT").toString());
                            boxPlotList.add(Float.parseFloat(wvList.get(j).get("WVWERT").toString()));
                            if (list.get(i).get("MEUGW") != null && wvList.get(j).get("WVWERT") != null && Float.parseFloat(String.valueOf(wvList.get(j).get("WVWERT"))) < Float.parseFloat(String.valueOf(list.get(i).get("MEUGW")))) {
                                nokcount += 1;
                                barSb.append(",-1");
                            } else if (list.get(i).get("MEOGW") != null && wvList.get(j).get("WVWERT") != null &&
                                    Float.parseFloat(String.valueOf(wvList.get(j).get("WVWERT"))) > Float.parseFloat(String.valueOf(list.get(i).get("MEOGW")))) {
                                nokcount += 1;
                                barSb.append(",1");
                            } else {
                                barSb.append(",0");
                            }
                        }
                    }
                }


                String barStr = barSb.toString();
                if (barStr.startsWith(",")) {
                    barStr = barStr.substring(1);
                }
                if (barStr.length() > 49) {
                    barStr = barStr.substring(barStr.length() - 25 - 24);
                }

                String boxPlotStr = "";
                //Collections.sort(boxPlotList);
                for (int k = 0; k < boxPlotList.size(); k++) {
                    if (k == 0) {
                        boxPlotStr = boxPlotList.get(k).toString();
                    } else {
                        boxPlotStr = boxPlotStr + "," + boxPlotList.get(k);
                    }
                }

                if (lineList.size() > 25) {
                    lineList = lineList.subList(lineList.size() - 25, lineList.size());
                }
                String lineStr = "";
                for (int k = 0; k < lineList.size(); k++) {
                    if (k == 0) {
                        lineStr = lineList.get(k);
                    } else {
                        lineStr = lineStr + "," + lineList.get(k);
                    }
                }

                plMap.put("barStr", barStr);
                plMap.put("lineStr", lineStr);
                plMap.put("boxPlotStr", boxPlotStr);
                if (nokcount > 0) {
                    plMap.put("qualityLevel", "2");
                    int okcount = wvList.size() - nokcount;
                    float passrate = (float) okcount * 100 / wvList.size();
                    DecimalFormat decimalFormat = new DecimalFormat("0.00");
                    plMap.put("passrate", decimalFormat.format(passrate));
                } else {
                    plMap.put("qualityLevel", "0");
                    plMap.put("passrate", "100%");
                }
            }
        }*/
        return list;
    }

    @Override
    public List getRecent125NumService(TeilBean teilBean) {
        return qualityBoardAdminLteMapper.getRecent125NumMapper(teilBean);
    }

    @Override
    public Map getQbShowFormInfoService(TeilBean teilBean) {
        //Map setupInfoMap = getSetupInfo();
        Page page = PageHelper.startPage(teilBean.getPage(), 1, true);
        List<Map> list = qualityBoardAdminLteMapper.getQbShowFormInfoMapper(teilBean);
        List<Map> chartList = new ArrayList();
        Map map = new HashMap<String, Object>();
        if (list.size() > 0) {
            teilBean.setTeilId(list.get(0).get("WVTEIL").toString());
            teilBean.setMerkmalId(list.get(0).get("WVMERKMAL").toString());
            if (null == teilBean.getIfQbSerchWertCount() || "0".equals(teilBean.getIfQbSerchWertCount())) {
                chartList = qualityBoardAdminLteMapper.getMerkmalChartDataMapper(teilBean);
            } else {
                chartList = qualityBoardAdminLteMapper.getMerkmalChartDataMapperByCount(teilBean);
            }
            /*if ("1".equals(setupInfoMap.get("ifSetupTolerance"))) {
                for (int j = 0; j < chartList.size(); j++) {
                    Map toMap = toleranceChange(chartList.get(j).get("MEUGW") == null ? null : chartList.get(j).get("MEUGW").toString(), chartList.get(j).get("MEOGW") == null ? null : chartList.get(j).get("MEOGW").toString(), Float.parseFloat(setupInfoMap.get("tolerance").toString()));
                    chartList.get(j).put("NEWMEUGW", toMap.get("meugw"));
                    chartList.get(j).put("NEWMEOGW", toMap.get("meogw"));
                }
            }*/
            map.put("rows", chartList.get(0));
        }
        map.put("chartList", chartList);
        map.put("total", page.getTotal());
        return map;
    }

    @Override
    public Map getSetupInfoMap() {
        return getSetupInfo();
    }

    @Override
    public Map initTeilMerkmalDetailsService() {
        return qualityBoardAdminLteMapper.initTeilMerkmalDetailsMapper();
    }

    @Override
    public List getKztChartDataService(TeilBean teilBean) {
        Map setupInfoMap = getSetupInfo();
        List<Map> list;
        if (null == teilBean.getIfQbSerchWertCount() || "0".equals(teilBean.getIfQbSerchWertCount())) {
            list=qualityBoardAdminLteMapper.getKztChartDataMapper(teilBean);
        } else {
            list=qualityBoardAdminLteMapper.getKztChartDataMapperByCount(teilBean);
        }
        List<Map> wvList= (List<Map>) list.get(0).get("wvList");
        if ("1".equals(setupInfoMap.get("ifSetupDecimal"))) {
            for (int i = 0; i < wvList.size(); i++) {
                String wert = wvList.get(i).get("WVWERT").toString();
                if (wert.indexOf(".") != -1 && wert.substring(wert.indexOf(".")).length() > Integer.parseInt(setupInfoMap.get("decimal").toString())) {
                    BigDecimal bigDecimal = new BigDecimal(wert);
                    bigDecimal = bigDecimal.setScale(Integer.parseInt(setupInfoMap.get("decimal").toString()), BigDecimal.ROUND_HALF_UP);
                    wvList.get(i).put("WVWERT", bigDecimal);
                }
            }
        }
        return list;
    }

    public String getRecent24Time() {
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.set(Calendar.HOUR_OF_DAY, c.get(Calendar.HOUR_OF_DAY) - 24);
        Date time = c.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String ago = sdf.format(time);
        return ago;
    }
}
