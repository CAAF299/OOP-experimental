package com.example.demo;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;



public class UserObject{

    
    
    private Integer id;
    
    
    @NotBlank(message = "Please provide a name.")
    @Size(min = 4, max = 50, message = "Name must be at least 4 characters long.")
    private String name;
    
    

    @Max(value = 40, message = "User can't be more than 40 year's old.")
    @Positive(message = "Please provide a valid age.")
    private int age;


    boolean isAdult;
    
    
    public UserObject(){}
    
    
    
    public Integer getId(){
    
    return id;
        
    }
    
    public String getName(){
    
    return name;
        
    }
    
    public int getAge(){
    
    return age;
        
        
    }
    
    
    public boolean isAdult(){
    
    return isAdult;
    }
    
    
    public void setId(Integer id ){
    
    this.id = id;
        
    }
    
    
    public void setName(String name){
    
    this.name = name;
    
    }
    
    public void setAge(int age){
    
    this.age = age;
    
    }
    
    public void setAdult(boolean isAdult){
    
    this.isAdult = isAdult;
    
    }
    
}


