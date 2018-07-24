package com.example.demo.controllers;
import java.util.List;

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

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/login")
public class LoginController {
	

	@PostMapping()
	@ResponseStatus(HttpStatus.OK)
	public String createLogin(@RequestBody Login login) {
		Key key = MacProvider.generateKey();
		
//	come back

		String compactJws = Jwts.builder()
		  .setSubject("12345")
		  .claim("name",  login.getName())
		  .signWith(SignatureAlgorithm.HS512, key)
		  .compact();
    return compactJws;
	}

}