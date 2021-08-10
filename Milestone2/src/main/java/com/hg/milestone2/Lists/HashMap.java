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
public class HashMap {
      public static void main(String[] args){
    // create a map that maps a country to its population
      Map<String, Integer> populations = new java.util.HashMap<>();
  // add the first country
populations.put("USA", 200000000);

// add the next country

populations.put("Canada", 34000000);

// add another country
populations.put("United Kingdom", 127000000);

// add another country
populations.put("Japan", 127000000);
         System.out.println("Map size is:" + populations.size());
 
      /*   
        // Getting and Replacing Entries in a Map
    Integer usaPopulation = populations.get("USA");
          System.out.println(usaPopulation);
          populations.put("USA", 313000000);
          usaPopulation = populations.get("USA");
          System.out.println(usaPopulation);
          
          //Getting Keys and Listing Mapped Values in a Map
          Set<String> keys = populations.keySet();
          for(String currentKey : keys) {
          Integer currentPopulation =populations.get(currentKey);
              System.out.println("The Populations of  "  + currentKey + "is" + currentPopulation);
          
          }
    */
  
  //Getting All Values in a Map
  Collection <Integer>populationValues = populations.values();
  for(Integer currentPopulation :populationValues){
          System.out.println(currentPopulation);
  }
   
}
}