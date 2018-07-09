package com.example.demo.models;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="timeStamp")
public class TimeStamp {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    public Timestamp timestamp;
    
    
    public static String getTimestamp() {
	     //Date object
	     Date date= new Date();
	     
	     String time = date.toString();
	     return new String(time);

	}
	public void setTimestamp(Timestamp timestamp) {
    }
	
}