
package com.github.CAAF299.ListTest1;

/**
 *
 * @author carol
 */
public class InvalidEnumException extends Exception{

    private final int error;
    private String message;
    
    public InvalidEnumException(){}
        
    
    public InvalidEnumException(String message, int error){
    
    super(message);
    
    this.error = error;
    
    
    }
    
    public int getError(){
    
    return error;
    }
    
    
    
}
