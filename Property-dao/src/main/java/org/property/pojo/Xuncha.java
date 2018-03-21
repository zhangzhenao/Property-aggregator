package org.property.pojo;

import java.util.Date;

import javax.persistence.Id;

public class Xuncha {
	@Id
    private Integer id;

    private Integer gsId;

    private Date patroldate;

    private String patrolsite;

    private String patrolsituation;

    private String treatment;

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

    public Date getPatroldate() {
        return patroldate;
    }

    public void setPatroldate(Date patroldate) {
        this.patroldate = patroldate;
    }

    public String getPatrolsite() {
        return patrolsite;
    }

    public void setPatrolsite(String patrolsite) {
        this.patrolsite = patrolsite;
    }

    public String getPatrolsituation() {
        return patrolsituation;
    }

    public void setPatrolsituation(String patrolsituation) {
        this.patrolsituation = patrolsituation;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

	@Override
	public String toString() {
		return "Xuncha [id=" + id + ", gsId=" + gsId + ", patroldate=" + patroldate + ", patrolsite=" + patrolsite
				+ ", patrolsituation=" + patrolsituation + ", treatment=" + treatment + ", remark=" + remark + "]";
	}
    
}