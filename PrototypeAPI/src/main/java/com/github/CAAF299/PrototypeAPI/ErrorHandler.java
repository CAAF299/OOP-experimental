/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.CAAF299.PrototypeAPI;

/**
 *
 * @author carol
 */

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Map;
import java.util.HashMap;

@RestControllerAdvice
public class ErrorHandler {
   
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)

public Map<String, String> handleException(MethodArgumentNotValidException e){

    Map <String, String> errors = new HashMap<>();
    
    
    e.getBindingResult().getAllErrors().forEach((error) -> {
    
    String field = ((FieldError) error).getField();
    
    String errorMsg = error.getDefaultMessage();
    
    errors.put(field, errorMsg);
    
    });
        
    
    return errors;
    
    }

    
}
