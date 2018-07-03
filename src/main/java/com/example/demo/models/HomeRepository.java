package com.example.demo.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin(origins="http://localhost:4200")
public interface HomeRepository extends JpaRepository<Home, Integer> {

}
