package com.example.demo.controllers;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;
import java.security.Key;

import com.example.demo.models.Login;
import com.example.demo.models.Profile;
import com.example.demo.models.ProfileRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/login")
public class LoginController {
	
@Autowired
 ProfileRepository profileRepository; 
	
 @PostMapping()
	@ResponseStatus(HttpStatus.OK)
	public String createLogin(@RequestBody Login login) {
		Key key = MacProvider.generateKey();
//		Optional<profile> is my type like int, string, etc. P is my Name. The rest is my location
		Optional<Profile> p = profileRepository.findFirstByEmail(login.getEmail()); 
		Profile profile= null;
		if (p.isPresent() == false) {
			profile= new Profile(); 
			profile.setEmail(login.getEmail());
			profile= profileRepository.save(profile);
			profileRepository.flush();
		} else { profile= p.get();
			
		}


		String compactJws = Jwts.builder()
		  .setSubject(profile.getId().toString())
		  .claim("email",  login.getEmail())
		  .signWith(SignatureAlgorithm.HS512, key)
		  .compact();
    return compactJws;
	}

}