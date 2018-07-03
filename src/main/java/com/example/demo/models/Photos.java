package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="photos")
public class Photos {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

}
