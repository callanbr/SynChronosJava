package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Calendar;
import com.example.demo.models.CalendarRepository;
import com.example.demo.models.Chat;
import com.example.demo.models.Profile;
import com.example.demo.models.ProfileRepository;

@RestController
@RequestMapping("/calendar")

@CrossOrigin(origins = "https://synchronos.herokuapp.com")
public class CalendarController {
	
	@Autowired
	CalendarRepository calendarRepository;
	@Autowired
	ProfileRepository profileRepository;
	
	@GetMapping("/{id}")
	public List<Calendar> getCalendar(@PathVariable Integer id){
		return calendarRepository.findByProfileId(id);
	}
	
	@PostMapping()
	public Calendar createCalendar( @RequestBody Calendar calendar) {
		// should not have to do this but SQLITE is weird
		Optional<Profile> p = profileRepository.findById(calendar.getProfile().getId());
		if (p.isPresent()) {
			calendar.setProfile(p.get());
			calendarRepository.save(calendar);
		}
		return calendar;
	}
	
	@DeleteMapping("/{id}")
	public void deleteCalendar(@PathVariable Integer id){
	 calendarRepository.deleteById(id);
	}

}
