package com.schedule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.schedule.entity.Schedule;
import com.schedule.service.ScheduleService;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {
	@Autowired
	private ScheduleService sService;
	@Autowired
	private RestTemplate rTemplate;

	// Getting the values
	@GetMapping("/{aCode}")
	public Schedule getSchedule(@PathVariable("aCode") int aCode) {
		Schedule schedule = this.sService.getSchedule(aCode);
		List airport = this.rTemplate.getForObject("http://airport/airport/schedule/" + schedule.getaCode(),
				List.class);
		schedule.setAirport(airport);
		return schedule;
	}
}
