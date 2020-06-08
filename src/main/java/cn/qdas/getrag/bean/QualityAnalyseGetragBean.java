package cn.qdas.getrag.bean;

public class QualityAnalyseGetragBean {
    private String teilId;
    private String teilNum;
    private String teilName;
    private String teilDescription;
    private String procedure;
    private String startTime;
    private String endTime;

    public String getTeilName() {
        return teilName;
    }

    public void setTeilName(String teilName) {
        this.teilName = teilName;
    }

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

    public String getTeilDescription() {
        return teilDescription;
    }

    public void setTeilDescription(String teilDescription) {
        this.teilDescription = teilDescription;
    }

    public String getProcedure() {
        return procedure;
    }

    public void setProcedure(String procedure) {
        this.procedure = procedure;
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
