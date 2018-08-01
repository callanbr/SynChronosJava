package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="settings")
public class Settings {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	public String name;
	public Integer userId;
	private Boolean isLightMode;
	private int fontSize;
	
	
	public int getFontSize() {
		return fontSize;
	}
	public void setFontSize(int fontSize) {
		this.fontSize = fontSize;
	}
	public Boolean getIsLightMode() {
		return isLightMode;
	}
	public void setIsLightMode(Boolean isLightMode) {
		this.isLightMode = isLightMode;
	}
    public String getName() {
        return name = Profile.name;
    }
//    public Integer getUserId() {
//        return userId = Profile.id;
//    }
}
