package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.CalendarRepository;

@RestController
@RequestMapping("/calendar")

@CrossOrigin(origins = "http://localhost:4200")
public class CalendarController {
	
	@Autowired
	CalendarRepository calendarRepository;
	

}
