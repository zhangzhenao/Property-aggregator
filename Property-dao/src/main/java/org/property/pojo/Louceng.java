package org.property.pojo;

import javax.persistence.Id;

public class Louceng {
	@Id
    private Integer id;

    private Integer louId;

    private Integer dandongId;

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

    public Integer getDandongId() {
        return dandongId;
    }

    public void setDandongId(Integer dandongId) {
        this.dandongId = dandongId;
    }

	@Override
	public String toString() {
		return "Louceng [id=" + id + ", louId=" + louId + ", dandongId=" + dandongId + "]";
	}
}