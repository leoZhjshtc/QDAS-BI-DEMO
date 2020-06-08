/**
 * 
 */
package cn.qdas.bi.bean;

import cn.qdas.core.bean.BaseBean;

/**
 * @author leo.Zhou 周钧
 * 2019年9月10日
 */
public class MissionManageBean extends BaseBean{
	private String startTime;
	private String endTime;
	private String productClass;
	private String productLine;
	private String checkType;
	private String checkPlanNum;
	private String teilName;
	private String teilNum;
	private String teilId;
	private String wvwertnr;
	private String checkMan;
	private String factoryName;
	private String workShopName;
	private String workShopDrawingStr;
	private String procedure;
	private String wv0063;
	private String wv0063Id;
	private String tekurzbezeich;
	
	
	public String getTekurzbezeich() {
		return tekurzbezeich;
	}
	public void setTekurzbezeich(String tekurzbezeich) {
		this.tekurzbezeich = tekurzbezeich;
	}
	public String getWv0063Id() {
		return wv0063Id;
	}
	public void setWv0063Id(String wv0063Id) {
		this.wv0063Id = wv0063Id;
	}
	public String getWv0063() {
		return wv0063;
	}
	public void setWv0063(String wv0063) {
		this.wv0063 = wv0063;
	}
	public String getTeilId() {
		return teilId;
	}
	public void setTeilId(String teilId) {
		this.teilId = teilId;
	}
	public String getProcedure() {
		return procedure;
	}
	public void setProcedure(String procedure) {
		this.procedure = procedure;
	}
	public String getMeasureTime() {
		return measureTime;
	}
	public void setMeasureTime(String measureTime) {
		this.measureTime = measureTime;
	}
	private String measureTime;
	private String[] productLines;
	public String[] getProductLines() {
		return productLines;
	}
	public void setProductLines(String[] productLines) {
		this.productLines = productLines;
	}
	public String getFactoryName() {
		return factoryName;
	}
	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName;
	}
	public String getWorkShopName() {
		return workShopName;
	}
	public void setWorkShopName(String workShopName) {
		this.workShopName = workShopName;
	}
	public String getWorkShopDrawingStr() {
		return workShopDrawingStr;
	}
	public void setWorkShopDrawingStr(String workShopDrawingStr) {
		this.workShopDrawingStr = workShopDrawingStr;
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
	public String getProductClass() {
		return productClass;
	}
	public void setProductClass(String productClass) {
		this.productClass = productClass;
	}
	public String getProductLine() {
		return productLine;
	}
	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}
	public String getCheckType() {
		return checkType;
	}
	public void setCheckType(String checkType) {
		this.checkType = checkType;
	}
	public String getCheckPlanNum() {
		return checkPlanNum;
	}
	public void setCheckPlanNum(String checkPlanNum) {
		this.checkPlanNum = checkPlanNum;
	}
	public String getTeilName() {
		return teilName;
	}
	public void setTeilName(String teilName) {
		this.teilName = teilName;
	}
	public String getCheckMan() {
		return checkMan;
	}
	public void setCheckMan(String checkMan) {
		this.checkMan = checkMan;
	}
	public String getTeilNum() {
		return teilNum;
	}
	public void setTeilNum(String teilNum) {
		this.teilNum = teilNum;
	}
	public String getWvwertnr() {
		return wvwertnr;
	}
	public void setWvwertnr(String wvwertnr) {
		this.wvwertnr = wvwertnr;
	}
	
}
