/**
 * 
 */
package cn.qdas.bi.dao;

import java.util.List;
import java.util.Map;

import cn.qdas.bi.bean.QualityMonitorBean;

/**
 * @author leo.Zhou 周钧
 * 2019年9月26日
 */
public interface QualityMonitorMapper {
	List getProductLineByFactory(QualityMonitorBean qmb);
	List getProductLineAlarmData(QualityMonitorBean qmb);
	List getProcessAlarmData(QualityMonitorBean qmb);
	List getMachineAlarmData(QualityMonitorBean qmb);
	List getTeilAlarmData(QualityMonitorBean qmb);
	List getTeilTop3Value(QualityMonitorBean qmb);
	List getMerkmalData(QualityMonitorBean qmb);
	List<Map> getRecentlyTeilMap(QualityMonitorBean qmb);
	List getLastAlarmDataByPl(QualityMonitorBean qmb);
	List getWorkShopByFactory(QualityMonitorBean qmb);
	Map getWorkShopCountByFactory(QualityMonitorBean qmb);
}
