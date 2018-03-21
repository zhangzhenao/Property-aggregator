package org.property.pojo;

import javax.persistence.Id;

public class Fangchan {
	@Id
    private Integer id;

    private Integer subsidiaryId;

    private String communityname;

    private String floorarea;

    private String coveredarea;

    private String greenarea;

    private String roadarea;

    private String residentiallocation;

    private Integer buildingnumber;

    private String principal;

    private String contatway;

    private Integer developersId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSubsidiaryId() {
        return subsidiaryId;
    }

    public void setSubsidiaryId(Integer subsidiaryId) {
        this.subsidiaryId = subsidiaryId;
    }

    public String getCommunityname() {
        return communityname;
    }

    public void setCommunityname(String communityname) {
        this.communityname = communityname;
    }

    public String getFloorarea() {
        return floorarea;
    }

    public void setFloorarea(String floorarea) {
        this.floorarea = floorarea;
    }

    public String getCoveredarea() {
        return coveredarea;
    }

    public void setCoveredarea(String coveredarea) {
        this.coveredarea = coveredarea;
    }

    public String getGreenarea() {
        return greenarea;
    }

    public void setGreenarea(String greenarea) {
        this.greenarea = greenarea;
    }

    public String getRoadarea() {
        return roadarea;
    }

    public void setRoadarea(String roadarea) {
        this.roadarea = roadarea;
    }

    public String getResidentiallocation() {
        return residentiallocation;
    }

    public void setResidentiallocation(String residentiallocation) {
        this.residentiallocation = residentiallocation;
    }

    public Integer getBuildingnumber() {
        return buildingnumber;
    }

    public void setBuildingnumber(Integer buildingnumber) {
        this.buildingnumber = buildingnumber;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getContatway() {
        return contatway;
    }

    public void setContatway(String contatway) {
        this.contatway = contatway;
    }

    public Integer getDevelopersId() {
        return developersId;
    }

    public void setDevelopersId(Integer developersId) {
        this.developersId = developersId;
    }

	@Override
	public String toString() {
		return "Fangchan [id=" + id + ", subsidiaryId=" + subsidiaryId + ", communityname=" + communityname
				+ ", floorarea=" + floorarea + ", coveredarea=" + coveredarea + ", greenarea=" + greenarea
				+ ", roadarea=" + roadarea + ", residentiallocation=" + residentiallocation + ", buildingnumber="
				+ buildingnumber + ", principal=" + principal + ", contatway=" + contatway + ", developersId="
				+ developersId + "]";
	}
}