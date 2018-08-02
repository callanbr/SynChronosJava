package com.example.demo.models;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin(origins="http://localhost:4200")
public interface CalendarRepository extends JpaRepository <Calendar, Integer>{
	//@Query("SELECT c FROM calendar c WHERE c.calendar_profileid=?1")
	List<Calendar> findByProfileId(Integer id);
	
	
	
}
