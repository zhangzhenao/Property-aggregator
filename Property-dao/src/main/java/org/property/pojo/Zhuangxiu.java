package org.property.pojo;

import java.util.Date;

import javax.persistence.Id;

public class Zhuangxiu {
	@Id
    private Integer id;

    private Integer xiaoquId;

    private Integer louId;

    private Integer danyuanId;

    private Integer gehuId;

    private Integer status;

    private String proposer;

    private String contactway;

    private Date applydate;

    private String content;

    private Date approvaldate;

    private String identity;

    private String approvalopinion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getXiaoquId() {
        return xiaoquId;
    }

    public void setXiaoquId(Integer xiaoquId) {
        this.xiaoquId = xiaoquId;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getProposer() {
        return proposer;
    }

    public void setProposer(String proposer) {
        this.proposer = proposer;
    }

    public String getContactway() {
        return contactway;
    }

    public void setContactway(String contactway) {
        this.contactway = contactway;
    }

    public Date getApplydate() {
        return applydate;
    }

    public void setApplydate(Date applydate) {
        this.applydate = applydate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getApprovaldate() {
        return approvaldate;
    }

    public void setApprovaldate(Date approvaldate) {
        this.approvaldate = approvaldate;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getApprovalopinion() {
        return approvalopinion;
    }

    public void setApprovalopinion(String approvalopinion) {
        this.approvalopinion = approvalopinion;
    }

	@Override
	public String toString() {
		return "Zhuangxiu [id=" + id + ", xiaoquId=" + xiaoquId + ", louId=" + louId + ", danyuanId=" + danyuanId
				+ ", gehuId=" + gehuId + ", status=" + status + ", proposer=" + proposer + ", contactway=" + contactway
				+ ", applydate=" + applydate + ", content=" + content + ", approvaldate=" + approvaldate + ", identity="
				+ identity + ", approvalopinion=" + approvalopinion + "]";
	}
    
}