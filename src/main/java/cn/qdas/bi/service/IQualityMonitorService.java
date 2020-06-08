/**
 * 
 */
package cn.qdas.bi.service;

import java.util.List;
import java.util.Map;

import cn.qdas.bi.bean.QualityMonitorBean;
import cn.qdas.core.db.DataSource;

/**
 * @author leo.Zhou 周钧
 * 2019年9月26日
 */
public interface IQualityMonitorService {
	List getProductLineAlarmData(QualityMonitorBean qmb, List<Map> list);
	@DataSource("sqliteDataSource")
	Map getWorkShopByFactory(QualityMonitorBean qmb);
	@DataSource("sqliteDataSource")
	List getProductLineByFactory(QualityMonitorBean qmb);
	List getProcessAlarmData(QualityMonitorBean qmb);
	List getMachineAlarmData(QualityMonitorBean qmb);
	List getTeilAlarmData(QualityMonitorBean qmb);
	List getTeilTop3Value(QualityMonitorBean qmb);
	List getMerkmalData(QualityMonitorBean qmb);
	Map getRecentlyTeilMap(QualityMonitorBean qmb);
	List getLastAlarmDataByPl(QualityMonitorBean qmb);
}
