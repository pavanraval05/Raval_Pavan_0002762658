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
public class Patient extends Person {
    
    public Patient(String name, int ID, String Gender, String Position) {
        super(name, ID, Gender, Position);
    }
    
  private LocalDate DOB;
  private String PatientEmail;
  private int Mobile;
  
    
  
}
