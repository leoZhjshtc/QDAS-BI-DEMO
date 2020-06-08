package cn.qdas.getrag.bean;

import cn.qdas.core.bean.BaseBean;

public class QualityBoardGetrag extends BaseBean{
	private String productLineName;
	private String qualityLevel;
	private String teilNum;
	private String teilId;
	private String teilName;
	private String merkmalName;
	private String merkmalNum;
	private String machineName;
	private String processNum;
	private String year;
	private String productClass;
	private String teilK1003;
	private String wvwertnr;
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getWvwertnr() {
		return wvwertnr;
	}

	public void setWvwertnr(String wvwertnr) {
		this.wvwertnr = wvwertnr;
	}

	public String getTeilK1003() {
		return teilK1003;
	}

	public void setTeilK1003(String teilK1003) {
		this.teilK1003 = teilK1003;
	}

	public String getProductClass() {
		return productClass;
	}

	public void setProductClass(String productClass) {
		this.productClass = productClass;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getProcessNum() {
		return processNum;
	}

	public void setProcessNum(String processNum) {
		this.processNum = processNum;
	}

	public String getMachineName() {
		return machineName;
	}

	public void setMachineName(String machineName) {
		this.machineName = machineName;
	}

	public String getMerkmalNum() {
		return merkmalNum;
	}

	public void setMerkmalNum(String merkmalNum) {
		this.merkmalNum = merkmalNum;
	}

	private String merkmalId;
	private String startTime;
	private String endTime;
	private String searchTimeStr;
	private String showDataCount;
	public String getProductLineName() {
		return productLineName;
	}

	public void setProductLineName(String productLineName) {
		this.productLineName = productLineName;
	}

	public String getTeilNum() {
		return teilNum;
	}

	public void setTeilNum(String teilNum) {
		this.teilNum = teilNum;
	}

	public String getTeilId() {
		return teilId;
	}

	public void setTeilId(String teilId) {
		this.teilId = teilId;
	}

	public String getMerkmalName() {
		return merkmalName;
	}

	public void setMerkmalName(String merkmalName) {
		this.merkmalName = merkmalName;
	}

	public String getMerkmalId() {
		return merkmalId;
	}

	public void setMerkmalId(String merkmalId) {
		this.merkmalId = merkmalId;
	}

	public String getTeilName() {
		return teilName;
	}

	public void setTeilName(String teilName) {
		this.teilName = teilName;
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

	public String getQualityLevel() {
		return qualityLevel;
	}

	public void setQualityLevel(String qualityLevel) {
		this.qualityLevel = qualityLevel;
	}

	public String getSearchTimeStr() {
		return searchTimeStr;
	}

	public void setSearchTimeStr(String searchTimeStr) {
		this.searchTimeStr = searchTimeStr;
	}

	public String getShowDataCount() {
		return showDataCount;
	}

	public void setShowDataCount(String showDataCount) {
		this.showDataCount = showDataCount;
	}
	
	
}
