
package com.github.CAAF299.ListTest1;


/*import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import java.util.Map;*/
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import com.github.CAAF299.ListTest1.classes.EntryObject;
import com.github.CAAF299.ListTest1.StateEnum;
import com.github.CAAF299.ListTest1.ProductEnum;
/**
 *  TODO: Learn lists and arrays...
 * @author carol
 */

public class Main {

    public static void main(String[] args) {
        
        StateEnum state = StateEnum.START;
        ProductEnum createProduct = ProductEnum.NAME;
        Scanner sc = new Scanner(System.in);
        
        
        String pName;
        String pBrand;
        double pPrice;
        int pId;
        
        int attempts = 0;
        int exit = 0;
        
        String enter;
        
        
       
        START:
        
        while(exit< attempts){
       
            System.out.println("What do you want to do ? (Type : PUT, GET, SORT, )");
            enter = sc.next();
            
            try {
                
                state.valueOf(enter);
            }
            
            switch(state){
            
            
            case PUT :
                
                while(attempts < 0 ){
                switch(createProduct){
                    
                        
                        
                    case NAME :
                        
                    System.out.println("Enter the name of the product:");
                    pName = sc.next();        
                                
                   break; 
                    
                    case BRAND: 
                   
                    System.out.println("Enter the brand of the product");    
                    pBrand = sc.next();
                    
                    break;
                    
                    
                    case PRICE:
                        
                    System.out.println("Enter the price of the product");    
                    pPrice = sc.nextDouble();
                        
                     break;
                     
                     
                    default:
                        
                        System.out.println("Action not specified ! Try again.");
                        
                        attempts ++;
                        continue START; 
                        
                
                }
                
                }
                  System.out.println("Going back to menu...");
                
                break;
                
            
            case GET : 
                
                
                
                
                break;
            
            
            case SORT : break;
                
            case DELETE : break;
            
        
        }
        
        }
        
        
        /**List<EntryObject> products = new ArrayList<>();
        
        
        
        
        /*products.add(new EntryObject("Mouse M12", "Xiaomi", 55.00, 101));
        products.add(new EntryObject("Keyboard M15", "Dell", 23.00, 102));
        */
        /*
        products.sort(Comparator.comparing(EntryObject::getPrice));
        products.sort(Comparator.comparing(EntryObject::getProductName));
        products.sort(Comparator.comparing(EntryObject::getPrice).reversed());
*/
 // "for every object of this type in this collection"       
 //            type     object  in  collection
        
        }
        
        }
        
            
           
          
      
    

