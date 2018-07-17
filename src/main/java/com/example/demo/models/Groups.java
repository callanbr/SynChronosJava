package com.example.demo.models;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.example.demo.models.Profile;

@Entity
@Table (name="groups")

public class Groups {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String groupname;
   
    public static String name = Profile.name;
    ArrayList<String> group = new ArrayList<String>();
//    {
//    group.add(Profile.username);
//    for (String user : group)
//        System.out.println(group.size());
//    };
        
    
//    public String username getusername() {
//        
//    }
//    
    public void addUser(String username) {
    	this.group.add(username);
    }
    public String getGroupname() {
        return groupname;
    }
    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

}