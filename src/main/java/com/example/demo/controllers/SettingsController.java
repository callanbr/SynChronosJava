package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Settings;
import com.example.demo.models.SettingsRepository;

@RestController
@RequestMapping("/settings")
@CrossOrigin(origins="http://localhost:4200")
public class SettingsController {
	
	@Autowired
	SettingsRepository settingsRepository;
	
	@GetMapping
	public List<Settings> getSettings() {
		return settingsRepository.findAll();
	}
	
	@PostMapping()
	public void createSettings(@RequestBody Settings settings) {
		settingsRepository.save(settings);
		
	}
}
