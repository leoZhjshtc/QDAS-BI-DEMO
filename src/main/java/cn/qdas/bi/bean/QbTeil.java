package cn.qdas.bi.bean;

import java.util.List;

public class QbTeil {
	private String teilId;
	private String teilNum;
	private String teilName;
	private List<QbAlarmValues> qbAlarmValuesList;
	public String getTeilId() {
		return teilId;
	}
	public void setTeilId(String teilId) {
		this.teilId = teilId;
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
	public List<QbAlarmValues> getQbAlarmValuesList() {
		return qbAlarmValuesList;
	}
	public void setQbAlarmValuesList(List<QbAlarmValues> qbAlarmValuesList) {
		this.qbAlarmValuesList = qbAlarmValuesList;
	}
	
}
