package com.airport.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.airport.entity.Airport;

@Service
public class AirportServiceImpl implements AirportService {
	// List for storing the values
	List<Airport> list = List.of(new Airport(1, "Netaji Subhash Chandra Bose International Airport", "Kolkata", 10),
			new Airport(2, "Pune Airport", "Pune", 20),
			new Airport(3, "Bharat Ratna Babasaheb Dr. B.R. Ambedkar International Airport", " Nagpur", 30),
			new Airport(4, "Bangalore International Airport Limited", "Bangalore", 40),
			new Airport(5, "Jabalpur Airport", " Jabalpur", 50));

	@Override
	public List<Airport> getAirportOfSchedule(int aCode) {
		return list.stream().filter(airport -> airport.getaCode() == aCode).collect(Collectors.toList());

	}

}
