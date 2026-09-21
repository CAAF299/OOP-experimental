/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.CAAF299.PrototypeAPI;

/**
 *
 * @author carol
 */
public class UserProfile {
  
    
    private int id;
    private int age;
    private String name;
    private String job;
    private boolean isAdult;
    
   public UserProfile(){
   
     
   }
   
   
   
   
   
   public int getId(){
   
   return id;
       
   }
   
   public int getAge(){
  
   
       return age;
   }
   
   
   
   public String getName(){
   
   return name;
   }
   
   
   public String getJob(){
   
     return job;
             
   } 
   

   public void setAge(int age){
 
       
   this.age = age;
 
   if(age < 18){
   
   isAdult = false;
       
   }
   
   }
   
   public boolean getAdult(){
   
   
   return isAdult;
   
   }
   
   public void setName(String name){
   
       this.name = name;
   }
   
   
   public void setId(int id ){
   
   this.id = id;
   
   }
   
   public void setJob(String job ){
   
   this.job = job;
       
   }
   
}
