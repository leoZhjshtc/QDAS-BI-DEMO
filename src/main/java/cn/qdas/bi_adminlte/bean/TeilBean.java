package cn.qdas.bi_adminlte.bean;

import cn.qdas.core.bean.BaseBean;

public class TeilBean extends BaseBean {
    private String startTime;
    private String endTime;
    private String teilId;
    private String teilName;
    private String teilNum;
    private String teilK1003;
    private String merkmalId;
    private String wvwertnr;
    private String type;
    private String processNum;
    private String qbSerchWertCount;
    private String ifQbSerchWertCount;
    private String ifSetupTolerance;
    private String tolerance;
    private String ifSetupDecimal;
    private String decimal;

    public String getIfSetupTolerance() {
        return ifSetupTolerance;
    }

    public void setIfSetupTolerance(String ifSetupTolerance) {
        this.ifSetupTolerance = ifSetupTolerance;
    }

    public String getTolerance() {
        return tolerance;
    }

    public void setTolerance(String tolerance) {
        this.tolerance = tolerance;
    }

    public String getIfSetupDecimal() {
        return ifSetupDecimal;
    }

    public void setIfSetupDecimal(String ifSetupDecimal) {
        this.ifSetupDecimal = ifSetupDecimal;
    }

    public String getDecimal() {
        return decimal;
    }

    public void setDecimal(String decimal) {
        this.decimal = decimal;
    }

    public String getIfQbSerchWertCount() {
        return ifQbSerchWertCount;
    }

    public void setIfQbSerchWertCount(String ifQbSerchWertCount) {
        this.ifQbSerchWertCount = ifQbSerchWertCount;
    }

    public String getQbSerchWertCount() {
        return qbSerchWertCount;
    }

    public void setQbSerchWertCount(String qbSerchWertCount) {
        this.qbSerchWertCount = qbSerchWertCount;
    }

    public String getProcessNum() {
        return processNum;
    }

    public void setProcessNum(String processNum) {
        this.processNum = processNum;
    }

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

    public String getMerkmalId() {
        return merkmalId;
    }

    public void setMerkmalId(String merkmalId) {
        this.merkmalId = merkmalId;
    }

    public String getTeilId() {
        return teilId;
    }

    public void setTeilId(String teilId) {
        this.teilId = teilId;
    }

    public String getTeilName() {
        return teilName;
    }

    public void setTeilName(String teilName) {
        this.teilName = teilName;
    }

    public String getTeilNum() {
        return teilNum;
    }

    public void setTeilNum(String teilNum) {
        this.teilNum = teilNum;
    }

    public String getTeilK1003() {
        return teilK1003;
    }

    public void setTeilK1003(String teilK1003) {
        this.teilK1003 = teilK1003;
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
}
