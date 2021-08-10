/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hg.milestone2.Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author hayle
 */
public class ListExamples {
    public static void main(String[] args){
    
     //Adding and removing  ArryList of String Object
/* List<String> stringList =  new ArrayList<>();
    System.out.println("List size:" + stringList.size());
    stringList.add("The first string.");
   System.out.println("List size" + stringList.size());
   stringList.add("The Second string.");
   System.out.println("List size" + stringList.size());
   stringList.remove(1);
   System.out.println("List size" + stringList.size());
    stringList.remove(0);
    System.out.println("List size" + stringList.size());
     stringList.remove(0);
     System.out.println("List size" + stringList.size()); */
   


//Create an Arraylist of String objects
List <String> stringList = new ArrayList<>();
//Adding String objects to our list
stringList.add("My First String");
//Adding another String objects to our list
stringList.add("My Second String");
//Adding another String objects to our list
stringList.add("My Third String");
//Adding another String objects to our list
stringList.add("My Fourth String");
    //ask the list how big it is 
    System.out.println("List size" + stringList.size());
    for(String currentString : stringList){
        System.out.println(currentString);
    }
    Iterator<String> iterator =stringList.iterator();
    while(iterator.hasNext()){
    String currentString = iterator.next();
        System.out.println(currentString);
    
    }
    }
    
}
