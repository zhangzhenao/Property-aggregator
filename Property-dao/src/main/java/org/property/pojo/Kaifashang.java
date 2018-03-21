package org.property.pojo;

import javax.persistence.Id;

public class Kaifashang {
	@Id
    private Integer id;

    private String gsname;

    private String legal;

    private String contact;

    private Integer phone;

    private String address;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGsname() {
        return gsname;
    }

    public void setGsname(String gsname) {
        this.gsname = gsname;
    }

    public String getLegal() {
        return legal;
    }

    public void setLegal(String legal) {
        this.legal = legal;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

	@Override
	public String toString() {
		return "Kaifashang [id=" + id + ", gsname=" + gsname + ", legal=" + legal + ", contact=" + contact + ", phone="
				+ phone + ", address=" + address + ", remark=" + remark + "]";
	}
}