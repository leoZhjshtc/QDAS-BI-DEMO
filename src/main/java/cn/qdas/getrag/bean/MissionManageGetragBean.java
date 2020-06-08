package cn.qdas.getrag.bean;

public class MissionManageGetragBean {
    private String startTime;
    private String endTime;
    private String teilId;
    private String teilNum;
    private String teilName;
    private String teilK1003;
    private String wvwertnr;

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

    public String getTeilK1003() {
        return teilK1003;
    }

    public void setTeilK1003(String teilK1003) {
        this.teilK1003 = teilK1003;
    }

    public String getTeilId() {
        return teilId;
    }

    public void setTeilId(String teilId) {
        this.teilId = teilId;
    }

    public String getWvwertnr() {
        return wvwertnr;
    }

    public void setWvwertnr(String wvwertnr) {
        this.wvwertnr = wvwertnr;
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
