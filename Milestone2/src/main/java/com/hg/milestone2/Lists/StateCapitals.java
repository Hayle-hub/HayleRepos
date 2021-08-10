/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hg.milestone2.Lists;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author hayle
 */
public class StateCapitals {
    
    public static void main (String[] args){
        // create a map that maps a State to its Capital
    Map<String, String> states = new java.util.HashMap<>();
    // add the first  state
   // states.put("Alaska ","Montgomery");
   states.put("Albama", "Montgomery");
       // add the next  state
    states.put("Alaska ", "Juneau");
     // add the another  state
    states.put("Arizona", "Phoenix");
     // add the another  state
    states.put("Arkansas", "Little Rock");
      //Getting Keys and Listing Mapped Values in a Map
      Set<String> keys = states.keySet();
      System.out.println("STATES");
      System.out.println("======");
      for (String currentKey : keys){
      String currentState = states.get(currentKey);
    System.out.println( currentKey );
    
      }
    System.out.println("CAPITALS:");
      System.out.println("======");
     //Getting All Values in a Map
     Collection <String>capitalValue = states.values();
     for(String currentCapital :capitalValue){
         System.out.println(currentCapital);
           
     }
    
     System.out.println("STATE/CAPITALS PAIRS:");
     System.out.println("=======================");
       
          for(String currentKey : keys) {
          String currentCapital =states.get(currentKey);
              System.out.println( currentKey + currentCapital);
          
          }
        
     
 
     }
      
      
           
 
    
    }
    

