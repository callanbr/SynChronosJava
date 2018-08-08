package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.models.Profile;
import com.example.demo.models.ProfileRepository;

@RestController
@RequestMapping("/profile")
@CrossOrigin(origins = "https://synchronos.herokuapp.com")
public class ProfileController {

	
	@Autowired
	ProfileRepository profileRepository;
	
	@GetMapping("{id}")
	public Optional<Profile> getProfile(@PathVariable Integer id) {
		return profileRepository.findById(id);
		
	}
	
	@PostMapping()
	public void createProfile(@RequestBody Profile profile) {
		profileRepository.save(profile);
	}
	
}
