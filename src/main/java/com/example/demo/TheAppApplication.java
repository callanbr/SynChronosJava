package com.example.demo;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.models.Photos;

@SpringBootApplication
public class TheAppApplication implements CommandLineRunner {
	
	@Resource
	Photos photos;

	public static void main(String[] args) {
		SpringApplication.run(TheAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		photos.deleteAll();
		photos.init();
	}
}
