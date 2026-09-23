/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.CAAF299.PrototypeAPI;

import jakarta.validation.Valid; // Validation trigger 

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value; //Data injector for fetching config file values.


//GET, POST, PUT and DELETE annotations.
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;


import org.springframework.web.bind.annotation.RequestMapping; //path router


import org.springframework.http.HttpStatus; //sets status code
import org.springframework.http.ResponseEntity; //http response representation

import java.util.concurrent.ThreadLocalRandom; //random number generator

import java.util.Map; 
import java.util.HashMap;
import java.util.Collection;

import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.PathVariable;

@RestController //class will recieve requests
@RequestMapping("/api/users") //binds the methods in the class to this route
public class ItemManager{

private Map<Integer, UserProfile> database = new HashMap<>(); 
    

@Value("${api.message}") //grabs value from "application.properties" and assigns it to "message" 
private String message;



@GetMapping("/home")

public String getMessage(){

return message;
}



@PostMapping

public ResponseEntity<UserProfile> createUser( @Valid @RequestBody UserProfile user){
//@Valid activates all "limiters" from the "UserProfile" DTO
//@RequestBody binds http body to "user" 
    
Integer id =  ThreadLocalRandom.current().nextInt(1000, 10000);

user.setId(id);

user.setAdult(user.getAge() >= 18);

database.put(user.getId(), user);
 

return new ResponseEntity<>(user, HttpStatus.CREATED);
}

@GetMapping("/{id}")

public ResponseEntity<UserProfile> getUser(@PathVariable int Id){


    if(!database.containsKey(Id)){
        
        return ResponseEntity.notFound().build();
    
    }
    
    return ResponseEntity.ok(database.get(Id));
    
}

@PutMapping("/{id}")

public ResponseEntity<UserProfile> updateUser(@PathVariable int Id, @Valid @RequestBody UserProfile updateUser){

    
    if(!database.containsKey(Id)){
    
    
        return ResponseEntity.notFound().build();
    }
    
    
    updateUser.setId(Id);
    database.put(updateUser.getId(), updateUser);
    
    
    return ResponseEntity.ok(updateUser);

}


@DeleteMapping("{id}")

public ResponseEntity<UserProfile> deletedUser(@PathVariable int Id){


    if(!database.containsKey(Id)){
        
    return ResponseEntity.notFound().build();
    }
    
    
    database.remove(Id);
    
    return ResponseEntity.noContent().build();
}


@GetMapping

public ResponseEntity<Collection<UserProfile>> getAllUsers(){

    
    return ResponseEntity.ok(database.values());
}

}