package com.schedule.entity;

public class Airport {
	private int aId;
	private String aName;
	private String aCity;
	// from schedule
	private int aCode;

	// default constructor
	public Airport() {
		super();
	}

	// parameterized constructor
	public Airport(int aId, String aName, String aCity, int aCode) {
		super();
		this.aId = aId;
		this.aName = aName;
		this.aCity = aCity;
		this.aCode = aCode;
	}

	// getter setter
	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public String getaCity() {
		return aCity;
	}

	public void setaCity(String aCity) {
		this.aCity = aCity;
	}

	public int getaCode() {
		return aCode;
	}

	public void setaCode(int aCode) {
		this.aCode = aCode;
	}
}
