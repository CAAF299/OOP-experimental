/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.CAAF299.PrototypeAPI;

/**
 *
 * @author carol
 */

//Validations 
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class UserProfile {
  
    
    private Integer id;

    
    @NotNull(message = "Please provide an age.")
    @Positive(message = "Age can't be negative.")
    @Min(value = 18, message = "Age can't be less than 18")
    @Max(value = 40, message = "Age can't be more than 40")
    private Integer age;
    
    
    @NotBlank(message = "Name field cannot be empty.")
    @Size(min = 4, max = 45, message = "Name must be at least 4 characters long.")
    private String username;
    
    @NotBlank(message = "Please provide a job.")
    private String job;
    
    
    private boolean isAdult;
    
   public UserProfile(){
   
     
   }
   

   
   public Integer getId(){
   
   return id;
       
   }
   
   public Integer getAge(){
  
   
       return age;
   }
   
   
   
   public String getUserame(){
   
   return username;
   }
   
   
   public String getJob(){
   
     return job;
             
   } 
   
   
   public boolean getAdult(){
   
   
   return isAdult;
   
   }
   

   public void setAge(Integer age){

   this.age = age;
   }
   
   public void setUsername(String username){
   
       this.username = username;
   }
   
   
   public void setId(Integer id ){
   
   this.id = id;
   
   }
   
   public void setJob(String job ){
   
   this.job = job;
       
   }
   
   public void setAdult(boolean isAdult){
   
   this.isAdult = isAdult;
   }
   
}
