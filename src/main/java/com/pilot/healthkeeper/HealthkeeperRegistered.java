package com.pilot.healthkeeper;

import java.util.Date;

public class HealthkeeperRegistered extends AbstractEvent {
	
	private Long id;
	private String empNo;
	private String name;
	private String sex;
	private String bldCode;
	private String hffcYn;
	private Date regDt;
	
	public HealthkeeperRegistered() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBldCode() {
		return bldCode;
	}

	public void setBldCode(String bldCode) {
		this.bldCode = bldCode;
	}

	public String getHffcYn() {
		return hffcYn;
	}

	public void setHffcYn(String hffcYn) {
		this.hffcYn = hffcYn;
	}

	public Date getRegDt() {
		return regDt;
	}

	public void setRegDt(Date regDt) {
		this.regDt = regDt;
	}
	
}
