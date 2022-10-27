/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HealthCare;

/**
 *
 * @author pavan
 */
public class Doctor {
    
   public String username;
   public String password;
   public String name;
   public String gender;
   public String department;
   public String city;
   public String community;
   public int doctorID;
   public boolean verify(String username,String password){
       if(this.username.equals(username) && this.password.equals(password) )return true;
       return false;
       
   }
    public Doctor(int doctorID, String username, String password, String name, String gender, String department, String city, String community) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.city = city;
        this.community = community;
        this.doctorID = doctorID;
    }
   
    
}
