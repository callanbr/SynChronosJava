package com.example.demo.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Groups;
import com.example.demo.models.GroupsRepository;


@RestController
@RequestMapping("/groups")
@CrossOrigin(origins="http://localhost:4200")
public class GroupsController {
	@Autowired
	GroupsRepository groupsRepository;
	
	@GetMapping
	public List<Groups> getGroups() {
		return groupsRepository.findAll();
		
	}
	
	@PostMapping()
	public void createGroup(@RequestBody Groups groups) {
		groupsRepository.save(groups);
	}}

