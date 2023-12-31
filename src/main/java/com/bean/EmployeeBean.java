package com.bean;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

public class EmployeeBean {

	private int eId;
	private String eName;
	// @Email
	private String eEmail;
	// @Pattern(regexp = "[6-9] {1}[0-9] {9}")
	private int eAge;
	private int dId;
	private String dName;

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteEmail() {
		return eEmail;
	}

	public void seteEmail(String eEmail) {
		this.eEmail = eEmail;
	}

	public int geteAge() {
		return eAge;
	}

	public void seteAge(int eAge) {
		this.eAge = eAge;
	}

}
