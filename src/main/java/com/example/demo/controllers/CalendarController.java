package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Calendar;
import com.example.demo.models.CalendarRepository;

@RestController
@RequestMapping("/calendar")

@CrossOrigin(origins = "http://localhost:4200")
public class CalendarController {
	
	@Autowired
	CalendarRepository calendarRepository;
	

	@GetMapping()
	public List<Calendar> getCalendar(){
		return calendarRepository.findAll();
	}

	@PostMapping()
	public void createCalendar(@RequestBody Calendar calendar) {
		calendarRepository.save(calendar);
	}

}
