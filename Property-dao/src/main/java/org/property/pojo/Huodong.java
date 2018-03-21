package org.property.pojo;

import java.util.Date;

public class Huodong {
    private Integer id;

    private Integer gsId;

    private String activitycontent;

    private String compere;

    private String participant;

    private Date activitydate;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGsId() {
        return gsId;
    }

    public void setGsId(Integer gsId) {
        this.gsId = gsId;
    }

    public String getActivitycontent() {
        return activitycontent;
    }

    public void setActivitycontent(String activitycontent) {
        this.activitycontent = activitycontent;
    }

    public String getCompere() {
        return compere;
    }

    public void setCompere(String compere) {
        this.compere = compere;
    }

    public String getParticipant() {
        return participant;
    }

    public void setParticipant(String participant) {
        this.participant = participant;
    }

    public Date getActivitydate() {
        return activitydate;
    }

    public void setActivitydate(Date activitydate) {
        this.activitydate = activitydate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}