package org.property.pojo;

import javax.persistence.Id;

public class Fangjian {
	@Id
    private Integer id;

    private Integer gongsiId;

    private Integer dandongId;

    private Integer loucengId;

    private String anaccountarea;

    private String housetype;

    private String orientation;

    private Integer finish;

    private Integer floorsnuber;

    private String floorage;

    private String usablearea;

    private String atticarea;

    private String storagearea;

    private String function;

    private String remarks;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGongsiId() {
        return gongsiId;
    }

    public void setGongsiId(Integer gongsiId) {
        this.gongsiId = gongsiId;
    }

    public Integer getDandongId() {
        return dandongId;
    }

    public void setDandongId(Integer dandongId) {
        this.dandongId = dandongId;
    }

    public Integer getLoucengId() {
        return loucengId;
    }

    public void setLoucengId(Integer loucengId) {
        this.loucengId = loucengId;
    }

    public String getAnaccountarea() {
        return anaccountarea;
    }

    public void setAnaccountarea(String anaccountarea) {
        this.anaccountarea = anaccountarea;
    }

    public String getHousetype() {
        return housetype;
    }

    public void setHousetype(String housetype) {
        this.housetype = housetype;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public Integer getFinish() {
        return finish;
    }

    public void setFinish(Integer finish) {
        this.finish = finish;
    }

    public Integer getFloorsnuber() {
        return floorsnuber;
    }

    public void setFloorsnuber(Integer floorsnuber) {
        this.floorsnuber = floorsnuber;
    }

    public String getFloorage() {
        return floorage;
    }

    public void setFloorage(String floorage) {
        this.floorage = floorage;
    }

    public String getUsablearea() {
        return usablearea;
    }

    public void setUsablearea(String usablearea) {
        this.usablearea = usablearea;
    }

    public String getAtticarea() {
        return atticarea;
    }

    public void setAtticarea(String atticarea) {
        this.atticarea = atticarea;
    }

    public String getStoragearea() {
        return storagearea;
    }

    public void setStoragearea(String storagearea) {
        this.storagearea = storagearea;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

	@Override
	public String toString() {
		return "Fangjian [id=" + id + ", gongsiId=" + gongsiId + ", dandongId=" + dandongId + ", loucengId=" + loucengId
				+ ", anaccountarea=" + anaccountarea + ", housetype=" + housetype + ", orientation=" + orientation
				+ ", finish=" + finish + ", floorsnuber=" + floorsnuber + ", floorage=" + floorage + ", usablearea="
				+ usablearea + ", atticarea=" + atticarea + ", storagearea=" + storagearea + ", function=" + function
				+ ", remarks=" + remarks + ", status=" + status + "]";
	}
}