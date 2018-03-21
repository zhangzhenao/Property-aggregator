package org.property.pojo;

import javax.persistence.Id;

public class Admin {
	
	@Id
    private Integer id;

    private String username;

    private String userpassword;

    private String salt;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

	@Override
	public String toString() {
		return "Admin [id=" + id + ", username=" + username + ", userpassword=" + userpassword + ", salt=" + salt
				+ ", status=" + status + "]";
	}
}