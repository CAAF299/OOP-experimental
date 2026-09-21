/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.CAAF299.PrototypeAPI;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;





@RestController
public class ItemManager{

    @GetMapping("api/home")

    public String greet(){
    
    
    return "Hello, world";
    }
    
    
}