/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

/**
 *
 * @author carol
 */



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;

import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Collection;


@RestController
@RequestMapping("api/users")
public class EntryController{

Map <Integer, UserObject> DB = new HashMap<>();

private static final Logger log = LoggerFactory.getLogger(EntryController.class);


    
    
@Value("${api.port}")
int port;

@GetMapping("/info")

public String Hello(){

       
    return "This is an API running on port " + port;
}

@PostMapping

public ResponseEntity<UserObject> makeUser(@Valid @RequestBody UserObject postUser, Integer id){

    id = 1;

 while(DB.containsKey(id)){   
    
++id;
 }

postUser.setId(id);



postUser.setisAdult(postUser.getAge() >= 18);

DB.put(id , postUser);

log.info("Created new user with the following ID : {}", id);
return new ResponseEntity<>(postUser, HttpStatus.CREATED);
    
}



@PutMapping("/{id}")

public ResponseEntity<UserObject> editUser(@Valid @RequestBody UserObject putUser, @PathVariable Integer id){

    
    if(!DB.containsKey(id)){
    
    
        log.warn("User not found of id {} ", id);
        return ResponseEntity.notFound().build();
    }
    
    
    putUser.setisAdult(putUser.getAge() >= 18);
    
    putUser.setId(id);
    
    
    DB.put(id, putUser);
    
    
    
    log.info("Resource succesfully modified of the id {}", id );
    return new ResponseEntity(putUser, HttpStatus.OK);

   
}

@DeleteMapping("/{id}")

public ResponseEntity<UserObject> deleteUser (@PathVariable Integer id){


    if(!DB.containsKey(id)){
    
    
        log.warn("User not found of id {}", id);
        return ResponseEntity.notFound().build();
    
    }
    
    
    DB.remove(id);
    
    log.info("Resource succesfully deleted of id {}" , id );
    return ResponseEntity.noContent().build();


}

    @GetMapping("/{id}")
    
    
    public ResponseEntity<UserObject> fetchUser(@PathVariable Integer id){
        
        if(!DB.containsKey(id)){
        
        
        log.warn("User not found of id {}", id);
            
        return ResponseEntity.notFound().build();
        }
        
        
        log.info("Succesfully retrieved user of id {}", id);
        return new ResponseEntity(DB.get(id), HttpStatus.OK);
        
    }

    
    @GetMapping
    
    public ResponseEntity<Collection<UserObject>> getAllUsers(){
   
        
        return ResponseEntity.ok(DB.values());
    }
    
    
}