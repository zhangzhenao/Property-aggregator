package org.property.pojo;

import java.util.Date;

import javax.persistence.Id;

public class Yezhubiao {
	@Id
    private Integer id;

    private String kaleidoscope;

    private Integer ownercode;

    private String photo;

    private String name;

    private Integer gender;

    private String nationality;

    private Date birthdate;

    private String idnumber;

    private Integer mobile;

    private Integer status;

    private String password;

    private String nativeplace;

    private String workplace;

    private String education;

    private String bankaccount;

    private String openingbank;

    private String address;

    private Integer postalcode;

    private String policestation;

    private String emergencycontact;

    private String emergencyaddress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKaleidoscope() {
        return kaleidoscope;
    }

    public void setKaleidoscope(String kaleidoscope) {
        this.kaleidoscope = kaleidoscope;
    }

    public Integer getOwnercode() {
        return ownercode;
    }

    public void setOwnercode(Integer ownercode) {
        this.ownercode = ownercode;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public Integer getMobile() {
        return mobile;
    }

    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNativeplace() {
        return nativeplace;
    }

    public void setNativeplace(String nativeplace) {
        this.nativeplace = nativeplace;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount;
    }

    public String getOpeningbank() {
        return openingbank;
    }

    public void setOpeningbank(String openingbank) {
        this.openingbank = openingbank;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(Integer postalcode) {
        this.postalcode = postalcode;
    }

    public String getPolicestation() {
        return policestation;
    }

    public void setPolicestation(String policestation) {
        this.policestation = policestation;
    }

    public String getEmergencycontact() {
        return emergencycontact;
    }

    public void setEmergencycontact(String emergencycontact) {
        this.emergencycontact = emergencycontact;
    }

    public String getEmergencyaddress() {
        return emergencyaddress;
    }

    public void setEmergencyaddress(String emergencyaddress) {
        this.emergencyaddress = emergencyaddress;
    }

	@Override
	public String toString() {
		return "Yezhubiao [id=" + id + ", kaleidoscope=" + kaleidoscope + ", ownercode=" + ownercode + ", photo="
				+ photo + ", name=" + name + ", gender=" + gender + ", nationality=" + nationality + ", birthdate="
				+ birthdate + ", idnumber=" + idnumber + ", mobile=" + mobile + ", status=" + status + ", password="
				+ password + ", nativeplace=" + nativeplace + ", workplace=" + workplace + ", education=" + education
				+ ", bankaccount=" + bankaccount + ", openingbank=" + openingbank + ", address=" + address
				+ ", postalcode=" + postalcode + ", policestation=" + policestation + ", emergencycontact="
				+ emergencycontact + ", emergencyaddress=" + emergencyaddress + "]";
	}
    
}