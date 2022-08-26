package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin_details")
public class Admin {
	@Id
	@Column(name = "adminId")
	private int adminId;
	@Column(name = "adminName")
	private String adminName;
	@Column(name = "password")
	private String password;
	@Column(name = "email")
	private String email;
	
	public Admin() {}
	
	public Admin(String adminName, String password, String email) {
		this.adminName = adminName;
		this.password = password;
		this.email = email;
	}

	public Admin(int adminId, String adminName, String password, String email) {
		this.adminId = adminId;
		this.adminName = adminName;
		this.password = password;
		this.email = email;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", password=" + password + ", email=" + email
				+ "]";
	}
	
}
