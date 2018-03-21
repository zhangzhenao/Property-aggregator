package org.property.pojo;

import java.util.Date;

import javax.persistence.Id;

public class Zhiqin {
	@Id
    private Integer id;

    private Integer gsId;

    private Date onthedate;

    private String peopleonduty;

    private Integer dutytype;

    private String dutysite;

    private String dutyrecord;

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

    public Date getOnthedate() {
        return onthedate;
    }

    public void setOnthedate(Date onthedate) {
        this.onthedate = onthedate;
    }

    public String getPeopleonduty() {
        return peopleonduty;
    }

    public void setPeopleonduty(String peopleonduty) {
        this.peopleonduty = peopleonduty;
    }

    public Integer getDutytype() {
        return dutytype;
    }

    public void setDutytype(Integer dutytype) {
        this.dutytype = dutytype;
    }

    public String getDutysite() {
        return dutysite;
    }

    public void setDutysite(String dutysite) {
        this.dutysite = dutysite;
    }

    public String getDutyrecord() {
        return dutyrecord;
    }

    public void setDutyrecord(String dutyrecord) {
        this.dutyrecord = dutyrecord;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

	@Override
	public String toString() {
		return "Zhiqin [id=" + id + ", gsId=" + gsId + ", onthedate=" + onthedate + ", peopleonduty=" + peopleonduty
				+ ", dutytype=" + dutytype + ", dutysite=" + dutysite + ", dutyrecord=" + dutyrecord + ", remark="
				+ remark + "]";
	}
    
}