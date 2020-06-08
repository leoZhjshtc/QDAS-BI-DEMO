/**
 * 
 */
package cn.qdas.bi.bean;

/**
 * @author leo.Zhou 周钧
 * 2019年11月5日
 */
public class MmChartWvBean {
private String WVWERT;
private String MEMERKART;
private String MEUGW;
private String MEOGW;
private String MENORMISTUN;
private String MENORMISTOB;
private String startTime;
private String endTime;
private String WVDATZEIT;

public String getWVDATZEIT() {
	return WVDATZEIT;
}
public void setWVDATZEIT(String wVDATZEIT) {
	WVDATZEIT = wVDATZEIT;
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
public String getWVWERT() {
	return WVWERT;
}
public void setWVWERT(String wVWERT) {
	WVWERT = wVWERT;
}
public String getMEMERKART() {
	return MEMERKART;
}
public void setMEMERKART(String mEMERKART) {
	MEMERKART = mEMERKART;
}
public String getMEUGW() {
	return MEUGW;
}
public void setMEUGW(String mEUGW) {
	MEUGW = mEUGW;
}
public String getMEOGW() {
	return MEOGW;
}
public void setMEOGW(String mEOGW) {
	MEOGW = mEOGW;
}
public String getMENORMISTUN() {
	return MENORMISTUN;
}
public void setMENORMISTUN(String mENORMISTUN) {
	MENORMISTUN = mENORMISTUN;
}
public String getMENORMISTOB() {
	return MENORMISTOB;
}
public void setMENORMISTOB(String mENORMISTOB) {
	MENORMISTOB = mENORMISTOB;
}

}
