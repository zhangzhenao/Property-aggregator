package org.property.pojo;

import java.util.Date;

import javax.persistence.Id;

public class Yanlian {
	@Id
    private Integer id;

    private Integer gsId;

    private Date starttime;

    private Date endtime;

    private String drillingunit;

    private Integer participantsnumber;

    private String purpose;

    private String assistanceunit;

    private String content;

    private String effect;

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

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getDrillingunit() {
        return drillingunit;
    }

    public void setDrillingunit(String drillingunit) {
        this.drillingunit = drillingunit;
    }

    public Integer getParticipantsnumber() {
        return participantsnumber;
    }

    public void setParticipantsnumber(Integer participantsnumber) {
        this.participantsnumber = participantsnumber;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getAssistanceunit() {
        return assistanceunit;
    }

    public void setAssistanceunit(String assistanceunit) {
        this.assistanceunit = assistanceunit;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

	@Override
	public String toString() {
		return "Yanlian [id=" + id + ", gsId=" + gsId + ", starttime=" + starttime + ", endtime=" + endtime
				+ ", drillingunit=" + drillingunit + ", participantsnumber=" + participantsnumber + ", purpose="
				+ purpose + ", assistanceunit=" + assistanceunit + ", content=" + content + ", effect=" + effect + "]";
	}
    
}