/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hg.person;

/**
 *
 * @author hayle
 */
public class App {
    public static void main(String[] arg){
        int count = 19;
       /* Person person =new Person();
       person.setAge(35);
       person.setName("Hayle");
        System.out.println("Count = " + count);
        System.out.println("Age=" + person.getAge());
             System.out.println("Name=" + person.getName());  */
       changeMyValue(count);
       System.out.println("Count = " + count);
       Person myPerson = new Person();
       myPerson.setAge(24);
       myPerson.setName("Hayle");
       System.out.println("Age= " + myPerson.getName());
       System.out.println("Name= " + myPerson.getName());
       changeMyName(myPerson);
        System.out.println("Age= " + myPerson.getAge());
       System.out.println("Name= " + myPerson.getName());
    }
    public static void changeMyValue(int value){
    
    value =21;
    
    }
    public static void changeMyName(Person person){
    person.setName("Steve");
    
    }
    
    
}
