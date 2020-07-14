package com.pilot.healthkeeper;

import java.util.Date;

public class HealthkeeperChanged  extends AbstractEvent  {
	
	private Long id;
	private String hffcYn;
	private Date updtDt;
	
	public HealthkeeperChanged()
	{
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHffcYn() {
		return hffcYn;
	}

	public void setHffcYn(String hffcYn) {
		this.hffcYn = hffcYn;
	}

	public Date getUpdtDt() {
		return updtDt;
	}

	public void setUpdtDt(Date updtDt) {
		this.updtDt = updtDt;
	}
	
	

}
