package org.property.pojo;

import javax.persistence.Id;

public class Shigu {
	@Id
    private Integer id;

    private Integer gsId;

    private String accidentcause;

    private String accidentsite;

    private String cause;

    private String relatedpersonnel;

    private String result;

    private String damage;

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

    public String getAccidentcause() {
        return accidentcause;
    }

    public void setAccidentcause(String accidentcause) {
        this.accidentcause = accidentcause;
    }

    public String getAccidentsite() {
        return accidentsite;
    }

    public void setAccidentsite(String accidentsite) {
        this.accidentsite = accidentsite;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getRelatedpersonnel() {
        return relatedpersonnel;
    }

    public void setRelatedpersonnel(String relatedpersonnel) {
        this.relatedpersonnel = relatedpersonnel;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

	@Override
	public String toString() {
		return "Shigu [id=" + id + ", gsId=" + gsId + ", accidentcause=" + accidentcause + ", accidentsite="
				+ accidentsite + ", cause=" + cause + ", relatedpersonnel=" + relatedpersonnel + ", result=" + result
				+ ", damage=" + damage + ", remark=" + remark + "]";
	}
    
}