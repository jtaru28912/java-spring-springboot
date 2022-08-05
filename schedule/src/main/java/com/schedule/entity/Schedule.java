package com.schedule.entity;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
	private int aCode;
	private String sourceAirport;
	private String destinationAirport;
	private String arrivalTime;
	private String departureTime;
	// from airport
	private int aId;
	// default constructor
	List<Airport> airport = new ArrayList<>();

	public Schedule() {
		super();
	}

	// parameterized constructor
	public Schedule(int aCode, String sourceAirport, String destinationAirport, String arrivalTime,
			String departureTime, int aId, List<Airport> airport) {
		super();
		this.aCode = aCode;
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.aId = aId;
		this.airport = airport;
	}

	// getters and setters
	public int getaCode() {
		return aCode;
	}

	public void setaCode(int aCode) {
		this.aCode = aCode;
	}

	public String getSourceAirport() {
		return sourceAirport;
	}

	public void setSourceAirport(String sourceAirport) {
		this.sourceAirport = sourceAirport;
	}

	public String getDestinationAirport() {
		return destinationAirport;
	}

	public void setDestinationAirport(String destinationAirport) {
		this.destinationAirport = destinationAirport;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public List<Airport> getAirport() {
		return airport;
	}

	public void setAirport(List<Airport> airport) {
		this.airport = airport;
	}
}
