package org.property.pojo;

import java.util.Date;

import javax.persistence.Id;

public class Baoan {
	@Id
    private Integer id;

    private Integer gsId;

    private Date startdate;

    private Date closeddate;

    private Integer classes;

    private String timeframe;

    private String post;

    private String watchkeeper;

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

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getCloseddate() {
        return closeddate;
    }

    public void setCloseddate(Date closeddate) {
        this.closeddate = closeddate;
    }

    public Integer getClasses() {
        return classes;
    }

    public void setClasses(Integer classes) {
        this.classes = classes;
    }

    public String getTimeframe() {
        return timeframe;
    }

    public void setTimeframe(String timeframe) {
        this.timeframe = timeframe;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getWatchkeeper() {
        return watchkeeper;
    }

    public void setWatchkeeper(String watchkeeper) {
        this.watchkeeper = watchkeeper;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

	@Override
	public String toString() {
		return "Baoan [id=" + id + ", gsId=" + gsId + ", startdate=" + startdate + ", closeddate=" + closeddate
				+ ", classes=" + classes + ", timeframe=" + timeframe + ", post=" + post + ", watchkeeper="
				+ watchkeeper + ", remark=" + remark + "]";
	}
}