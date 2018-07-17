package com.example.demo.models;
	import io.jsonwebtoken.Jwts;
	import io.jsonwebtoken.SignatureAlgorithm;
	import io.jsonwebtoken.impl.crypto.MacProvider;
	import java.security.Key;

	public class Token {
	// We need a signing key, so we'll create one just for this example. Usually
	// the key would be read from your application configuration instead.
	Key key = MacProvider.generateKey();

	String compactJws = Jwts.builder()
	  .setSubject("email")
	  .signWith(SignatureAlgorithm.HS512, key)
	  .compact();
	
}
