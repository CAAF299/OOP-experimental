
package com.example.demo;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;


@RestController
@RequestMapping("api/users")
public class EntryController{

Map <Integer, UserObject> DB = new HashMap<>();

private static final Logger log = LoggerFactory.getLogger(EntryController.class);


    
    
@Value("${server.port:8080}")
int port;

@GetMapping("/info")

public ResponseEntity<String> greet (){


    return ResponseEntity.status(HttpStatus.OK).body("Running on port " + port);

} 

@PostMapping

public ResponseEntity<UserObject> makeUser(@Valid @RequestBody UserObject postUser){

    Integer id = 1;

 while(DB.containsKey(id)){   
    
++id;
 }

postUser.setId(id);



postUser.setAdult(postUser.getAge() >= 18);

DB.put(id , postUser);

log.info("Created new user with the following ID : {}", id);
return ResponseEntity.status(HttpStatus.CREATED).body(postUser);
    
}



@PutMapping("/{id}")

public ResponseEntity<UserObject> editUser(@Valid @RequestBody UserObject putUser, @PathVariable Integer id){

    
    if(!DB.containsKey(id)){
    
    
        log.warn("User not found of id {} ", id);
        return ResponseEntity.notFound().build();
    }
    
    
    putUser.setAdult(putUser.getAge() >= 18);
    
    putUser.setId(id);
    
    
    DB.put(id, putUser);
    
    
    
    log.info("Resource succesfully modified of the id {}", id );
    return ResponseEntity.status(HttpStatus.OK).body(putUser);

   
}

@DeleteMapping("/{id}")

public ResponseEntity<?> deleteUser (@PathVariable Integer id){


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
        return ResponseEntity.ok(DB.get(id));
        
    }

    
    @GetMapping
    
    public ResponseEntity<Collection<UserObject>> getAllUsers(){
   
        
        return ResponseEntity.ok(DB.values());
    }
    
    
}