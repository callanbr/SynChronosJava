package com.example.demo.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="calendar")
public class Calendar {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String start;
    private String end;
    private String title;
    private String color;
    @ManyToOne
    @JoinColumn(name="profileid")
    private Profile profile;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getStart() {
        return start;
    }
    public void setStart(String start) {
        this.start = start;
    }
    public String getEnd() {
        return end;
    }
    public void setEnd(String end) {
        this.end = end;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
 
  public Profile getProfile() {
	  return profile;
  }
  public void setProfile(Profile profile) {
	  this.profile = profile;
  }
  
}
