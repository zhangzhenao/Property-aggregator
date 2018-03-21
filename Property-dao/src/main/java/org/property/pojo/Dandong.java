package org.property.pojo;

import java.util.Date;

import javax.persistence.Id;

public class Dandong {
	@Id
    private Integer id;

    private Integer fangchanId;

    private Integer singlenumber;

    private Integer unitsnumber;

    private Integer structuretype;

    private Integer br;

    private Integer damagedlevel;

    private String constructionarea;

    private String usearea;

    private String constructionpermit;

    private String licence;

    private Date completiondate;

    private Date cappingdate;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFangchanId() {
        return fangchanId;
    }

    public void setFangchanId(Integer fangchanId) {
        this.fangchanId = fangchanId;
    }

    public Integer getSinglenumber() {
        return singlenumber;
    }

    public void setSinglenumber(Integer singlenumber) {
        this.singlenumber = singlenumber;
    }

    public Integer getUnitsnumber() {
        return unitsnumber;
    }

    public void setUnitsnumber(Integer unitsnumber) {
        this.unitsnumber = unitsnumber;
    }

    public Integer getStructuretype() {
        return structuretype;
    }

    public void setStructuretype(Integer structuretype) {
        this.structuretype = structuretype;
    }

    public Integer getBr() {
        return br;
    }

    public void setBr(Integer br) {
        this.br = br;
    }

    public Integer getDamagedlevel() {
        return damagedlevel;
    }

    public void setDamagedlevel(Integer damagedlevel) {
        this.damagedlevel = damagedlevel;
    }

    public String getConstructionarea() {
        return constructionarea;
    }

    public void setConstructionarea(String constructionarea) {
        this.constructionarea = constructionarea;
    }

    public String getUsearea() {
        return usearea;
    }

    public void setUsearea(String usearea) {
        this.usearea = usearea;
    }

    public String getConstructionpermit() {
        return constructionpermit;
    }

    public void setConstructionpermit(String constructionpermit) {
        this.constructionpermit = constructionpermit;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public Date getCompletiondate() {
        return completiondate;
    }

    public void setCompletiondate(Date completiondate) {
        this.completiondate = completiondate;
    }

    public Date getCappingdate() {
        return cappingdate;
    }

    public void setCappingdate(Date cappingdate) {
        this.cappingdate = cappingdate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

	@Override
	public String toString() {
		return "Dandong [id=" + id + ", fangchanId=" + fangchanId + ", singlenumber=" + singlenumber + ", unitsnumber="
				+ unitsnumber + ", structuretype=" + structuretype + ", br=" + br + ", damagedlevel=" + damagedlevel
				+ ", constructionarea=" + constructionarea + ", usearea=" + usearea + ", constructionpermit="
				+ constructionpermit + ", licence=" + licence + ", completiondate=" + completiondate + ", cappingdate="
				+ cappingdate + ", remark=" + remark + "]";
	}
}