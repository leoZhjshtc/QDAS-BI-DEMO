package cn.qdas.bi.bean;

import cn.qdas.core.bean.BaseBean;

public class QualityBoard extends BaseBean{
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
