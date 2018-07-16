package com.example.demo.models;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.example.demo.models.Profile;

@Entity
@Table (name="chat")
public class Chat  {
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
 
    private Integer id;
   public String username;
   private String message;
   public Timestamp timestamp;
   
   
   public String getTimestamp() {
         //Date object
         Date date= new Date();
        
         String time = date.toString();
         return new String(time);
        
//            //getTime() returns current time in milliseconds
//         long time = date.getTime();
//            //Passed the milliseconds to constructor of TimeStamp class 
//         Timestamp ts = new Timestamp(time);
////         System.out.println("Current Time Stamp: "+ts);
////       this.timestamp = ts;
//        return timestamp = ts;
    }
    public void setTimestamp(Timestamp timestamp) {
   }
    public Integer getId() {
       return id;
   }
   public void setId(Integer id) {
       this.id = id;
   }
   public String getUsername() {
       return username = Profile.username;
   }
   public void setUsername(String username) {
       this.username = username;
   }
   public String getMessage() {
       return message;
   }
   public void setMessage(String message) {
       this.message = message;
   }

}