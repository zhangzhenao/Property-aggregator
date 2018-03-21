package org.property.pojo;

import java.util.Date;

import javax.persistence.Id;

public class Yanfang {
	@Id
    private Integer id;

    private Integer louId;

    private Integer danyuanId;

    private Integer gehuId;

    private Integer yanfangId;

    private Date acceptancedate;

    private Date determinedate;

    private Integer qualified;

    private Integer finish;

    private Integer personnelId;

    private String owneropinion;

    private String keeperopinion;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLouId() {
        return louId;
    }

    public void setLouId(Integer louId) {
        this.louId = louId;
    }

    public Integer getDanyuanId() {
        return danyuanId;
    }

    public void setDanyuanId(Integer danyuanId) {
        this.danyuanId = danyuanId;
    }

    public Integer getGehuId() {
        return gehuId;
    }

    public void setGehuId(Integer gehuId) {
        this.gehuId = gehuId;
    }

    public Integer getYanfangId() {
        return yanfangId;
    }

    public void setYanfangId(Integer yanfangId) {
        this.yanfangId = yanfangId;
    }

    public Date getAcceptancedate() {
        return acceptancedate;
    }

    public void setAcceptancedate(Date acceptancedate) {
        this.acceptancedate = acceptancedate;
    }

    public Date getDeterminedate() {
        return determinedate;
    }

    public void setDeterminedate(Date determinedate) {
        this.determinedate = determinedate;
    }

    public Integer getQualified() {
        return qualified;
    }

    public void setQualified(Integer qualified) {
        this.qualified = qualified;
    }

    public Integer getFinish() {
        return finish;
    }

    public void setFinish(Integer finish) {
        this.finish = finish;
    }

    public Integer getPersonnelId() {
        return personnelId;
    }

    public void setPersonnelId(Integer personnelId) {
        this.personnelId = personnelId;
    }

    public String getOwneropinion() {
        return owneropinion;
    }

    public void setOwneropinion(String owneropinion) {
        this.owneropinion = owneropinion;
    }

    public String getKeeperopinion() {
        return keeperopinion;
    }

    public void setKeeperopinion(String keeperopinion) {
        this.keeperopinion = keeperopinion;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

	@Override
	public String toString() {
		return "Yanfang [id=" + id + ", louId=" + louId + ", danyuanId=" + danyuanId + ", gehuId=" + gehuId
				+ ", yanfangId=" + yanfangId + ", acceptancedate=" + acceptancedate + ", determinedate=" + determinedate
				+ ", qualified=" + qualified + ", finish=" + finish + ", personnelId=" + personnelId + ", owneropinion="
				+ owneropinion + ", keeperopinion=" + keeperopinion + ", remark=" + remark + "]";
	}
    
}