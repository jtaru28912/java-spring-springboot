package com.airport.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airport.entity.Airport;
import com.airport.service.AirportService;

@RestController
@RequestMapping("/airport")
public class AirportController {
	// Dependency Injection
	@Autowired
	private AirportService aService;

	// getting the data
	@RequestMapping("/schedule/{aCode}")
	public List<Airport> getAirport(@PathVariable("aCode") int aCode) {
		return this.aService.getAirportOfSchedule(aCode);
	}

}
