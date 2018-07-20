package com.example.demo.models;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin(origins="http://localhost:4200")
public interface ProfileRepository extends JpaRepository<Profile, Integer>{
	
		Optional<Profile> findFirstByEmail(String email);
		
}
