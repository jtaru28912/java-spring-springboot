package com.airport.service;

import java.util.List;

import com.airport.entity.Airport;

public interface AirportService {
	// Method for getting the values
	public List<Airport> getAirportOfSchedule(int aCode);

}
