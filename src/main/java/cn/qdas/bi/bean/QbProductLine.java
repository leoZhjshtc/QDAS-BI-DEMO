package cn.qdas.bi.bean;

import java.util.List;

public class QbProductLine {
	private String productLineId;
	private String productLineName;
	private List<QbTeil> qbTeilList;
	private String alarmLevel;
	private String buttonId;
	public String getProductLineId() {
		return productLineId;
	}
	public void setProductLineId(String productLineId) {
		this.productLineId = productLineId;
	}
	public String getProductLineName() {
		return productLineName;
	}
	public void setProductLineName(String productLineName) {
		this.productLineName = productLineName;
	}
	public List<QbTeil> getQbTeilList() {
		return qbTeilList;
	}
	public void setQbTeilList(List<QbTeil> qbTeilList) {
		this.qbTeilList = qbTeilList;
	}
	
	public String getAlarmLevel() {
		return alarmLevel;
	}
	public void setAlarmLevel(String alarmLevel) {
		this.alarmLevel = alarmLevel;
	}
	
	public String getButtonId() {
		return buttonId;
	}
	public void setButtonId(String buttonId) {
		this.buttonId = buttonId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productLineId == null) ? 0 : productLineId.hashCode());
		result = prime * result + ((productLineName == null) ? 0 : productLineName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QbProductLine other = (QbProductLine) obj;
		if (productLineId == null) {
			if (other.productLineId != null)
				return false;
		} else if (!productLineId.equals(other.productLineId))
			return false;
		if (productLineName == null) {
			if (other.productLineName != null)
				return false;
		} else if (!productLineName.equals(other.productLineName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "QbProductLine [productLineId=" + productLineId + ", productLineName=" + productLineName + "]";
	}
	
}
