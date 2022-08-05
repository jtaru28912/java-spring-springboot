package com.schedule.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.schedule.entity.Schedule;

@Service
public class ScheduleServiceImplementation implements ScheduleService {
	// List Storing the Values using constructor
	List<Schedule> list = List.of(
			new Schedule(10, "Kolkata", "Jabalpur", "8:30 am every MWF", "9:00 am every MWF", 1, null),
			new Schedule(20, "Pune", "Banglore", "9:30 am every TTS", "10:00 am every TTS", 2, null),
			new Schedule(30, "Nagpur", "Delhi", "9:20 pm every MWTF", "9:40 pm every MWTF", 3, null),
			new Schedule(40, "Banglore", "Chennai", "5:30 pm every Saturday", "6:10 pm every Saturday", 4, null),
			new Schedule(50, "Jabalpur", "Mumbai", "7:30 pm every Sunday", "8:00 pm every Sunday", 5, null));

	@Override
	public Schedule getSchedule(int aCode) {
		return this.list.stream().filter(schedule -> schedule.getaCode() == (aCode)).findAny().orElse(null);
	}
}
