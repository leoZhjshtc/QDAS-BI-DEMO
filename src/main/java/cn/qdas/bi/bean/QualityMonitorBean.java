/**
 * 
 */
package cn.qdas.bi.bean;

import cn.qdas.core.bean.BaseBean;

/**
 * @author leo.Zhou 周钧
 * 2019年9月26日
 */
public class QualityMonitorBean extends BaseBean{
	private String workShopName;
	private String factoryName;
	private String workShopDrawingStr;
	private String[] productLineNames;
	private String productLineName;
	private String startTime;
	private String endTime;
	private String machineName;
	private String teilId;
	private String merkmalId;
	private String wertevarId;
	private String processId;
	private String teilNum;
	private String teilName;
	private String operator;
	
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getTeilNum() {
		return teilNum;
	}
	public void setTeilNum(String teilNum) {
		this.teilNum = teilNum;
	}
	public String getTeilName() {
		return teilName;
	}
	public void setTeilName(String teilName) {
		this.teilName = teilName;
	}
	public String getProcessId() {
		return processId;
	}
	public void setProcessId(String processId) {
		this.processId = processId;
	}
	public String getMerkmalId() {
		return merkmalId;
	}
	public void setMerkmalId(String merkmalId) {
		this.merkmalId = merkmalId;
	}
	public String getWertevarId() {
		return wertevarId;
	}
	public void setWertevarId(String wertevarId) {
		this.wertevarId = wertevarId;
	}
	public String getWorkShopName() {
		return workShopName;
	}
	public void setWorkShopName(String workShopName) {
		this.workShopName = workShopName;
	}
	public String getFactoryName() {
		return factoryName;
	}
	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName;
	}
	public String getWorkShopDrawingStr() {
		return workShopDrawingStr;
	}
	public void setWorkShopDrawingStr(String workShopDrawingStr) {
		this.workShopDrawingStr = workShopDrawingStr;
	}
	public String[] getProductLineNames() {
		return productLineNames;
	}
	public void setProductLineNames(String[] productLineNames) {
		this.productLineNames = productLineNames;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getProductLineName() {
		return productLineName;
	}
	public void setProductLineName(String productLineName) {
		this.productLineName = productLineName;
	}
	public String getMachineName() {
		return machineName;
	}
	public void setMachineName(String machineName) {
		this.machineName = machineName;
	}
	public String getTeilId() {
		return teilId;
	}
	public void setTeilId(String teilId) {
		this.teilId = teilId;
	}
	
}
