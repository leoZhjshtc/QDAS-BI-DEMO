/**
 * 
 */
package cn.qdas.bi.bean;

import java.util.List;

/**
 * @author leo.Zhou 周钧
 * 2019年11月5日
 */
public class MmChartTeilBean {
private String TETEIL;
private String TEPREINRBEZ;
private String TEPREINRNR;
private String TEPRGRUNDBEZ;
private String TETEILNR;
private String TEKOSTST;
private String TEAUFTRAGGBBEZ;
private String WVWERTNR;
private String startTime;
private String endTime;
private String TE_1341;
private String TEKURZBEZEICH;
private String alarmLevel;
private String WV0063Id;
private String WV0063;
private List wvList;
private int alarmRed=0;
private int alarmYellow=0;
private String PRVORNAME;
private String chartColor;

	public String getChartColor() {
		return chartColor;
	}

	public void setChartColor(String chartColor) {
		this.chartColor = chartColor;
	}

	public String getWV0063Id() {
	return WV0063Id;
}
public void setWV0063Id(String wV0063Id) {
	WV0063Id = wV0063Id;
}
public String getWV0063() {
	return WV0063;
}
public void setWV0063(String wV0063) {
	WV0063 = wV0063;
}
public String getPRVORNAME() {
	return PRVORNAME;
}
public void setPRVORNAME(String pRVORNAME) {
	PRVORNAME = pRVORNAME;
}
public String getTEPREINRNR() {
	return TEPREINRNR;
}
public void setTEPREINRNR(String tEPREINRNR) {
	TEPREINRNR = tEPREINRNR;
}
public int getAlarmRed() {
	return alarmRed;
}
public void setAlarmRed(int alarmRed) {
	this.alarmRed = alarmRed;
}
public int getAlarmYellow() {
	return alarmYellow;
}
public void setAlarmYellow(int alarmYellow) {
	this.alarmYellow = alarmYellow;
}
public List getWvList() {
	return wvList;
}
public void setWvList(List wvList) {
	this.wvList = wvList;
}
public String getTETEIL() {
	return TETEIL;
}
public void setTETEIL(String tETEIL) {
	TETEIL = tETEIL;
}
public String getTEPREINRBEZ() {
	return TEPREINRBEZ;
}
public void setTEPREINRBEZ(String tEPREINRBEZ) {
	TEPREINRBEZ = tEPREINRBEZ;
}
public String getTEPRGRUNDBEZ() {
	return TEPRGRUNDBEZ;
}
public void setTEPRGRUNDBEZ(String tEPRGRUNDBEZ) {
	TEPRGRUNDBEZ = tEPRGRUNDBEZ;
}
public String getTETEILNR() {
	return TETEILNR;
}
public void setTETEILNR(String tETEILNR) {
	TETEILNR = tETEILNR;
}
public String getTEKOSTST() {
	return TEKOSTST;
}
public void setTEKOSTST(String tEKOSTST) {
	TEKOSTST = tEKOSTST;
}
public String getTEAUFTRAGGBBEZ() {
	return TEAUFTRAGGBBEZ;
}
public void setTEAUFTRAGGBBEZ(String tEAUFTRAGGBBEZ) {
	TEAUFTRAGGBBEZ = tEAUFTRAGGBBEZ;
}
public String getWVWERTNR() {
	return WVWERTNR;
}
public void setWVWERTNR(String wVWERTNR) {
	WVWERTNR = wVWERTNR;
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
public String getTE_1341() {
	return TE_1341;
}
public void setTE_1341(String tE_1341) {
	TE_1341 = tE_1341;
}
public String getTEKURZBEZEICH() {
	return TEKURZBEZEICH;
}
public void setTEKURZBEZEICH(String tEKURZBEZEICH) {
	TEKURZBEZEICH = tEKURZBEZEICH;
}
public String getAlarmLevel() {
	return alarmLevel;
}
public void setAlarmLevel(String alarmLevel) {
	this.alarmLevel = alarmLevel;
}


}
