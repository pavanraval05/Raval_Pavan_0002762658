package HealthCare;

import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**

 *
 * @author pavan
 */
public class Patient  {
    public String username;
   public String password;
   public String name;
   public String gender;
  
   public String city;
   public String community;
   public int patientID;

    public Patient(int patientID, String username, String password, String name, String gender, String city, String community) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.city = city;
        this.community = community;
        this.patientID = patientID;
    }
   
    }
    
 