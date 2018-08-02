package com.example.demo.controllers;

//import java.sql.Timestamp;
//import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import java.sql.Timestamp;
//import java.util.Date;

import com.example.demo.models.Chat;
import com.example.demo.models.ChatRepository;
import com.example.demo.models.Profile;

@RestController
@RequestMapping("/chat")
@CrossOrigin(origins="http://localhost:4200")
public class ChatController {
	
	@Autowired
	ChatRepository chatRepository;
	
	@GetMapping()
	public List<Chat> getChat(){
		return chatRepository.findAll();
	}


	@PostMapping()
	public void createChat(@RequestBody Chat chat) {
		chat.getTimestamp();
		chatRepository.save(chat);
		
	}
	
//	@PostMapping("/multiple")
//	public void createChat(@RequestBody List<Chat> chat) {
//		chatRepository.saveAll(chat);
//	}
//	
//	@DeleteMapping("/{id}")
//	public void deleteChat(@PathVariable("id") int id)	{
//		Chat chatDelete = chatRepository.findById(id).orElse(null);
//		chatRepository.delete(chatDelete);
//	}

	

}

