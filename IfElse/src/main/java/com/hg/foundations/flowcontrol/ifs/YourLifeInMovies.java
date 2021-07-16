/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hg.foundations.flowcontrol.ifs;
import java.util.Scanner;



/**
 *
 * @author hayle
 */
public class YourLifeInMovies {
     public static void main(String[] args) {
        int yearofBirth= 0;
        String firstName;
        
             Scanner inputReader = new Scanner(System.in);
 System.out.println("Hey, let's play a game!");
 System.out.println("What's your name?");
 firstName = inputReader.nextLine();
            System.out.println(" Ok," +  firstName + " when were you born?");
          Integer.parseInt(inputReader.nextLine());
          
        //Double.parseDouble(inputReader.nextLine());

        if(yearofBirth < 2005 ){
            System.out.println("Pixar's 'Up' came out over a decade ago");
        }

        if(yearofBirth < 1995){
            System.out.println(" the first Harry Potter came out over 15 years ago.");
        }
         if(yearofBirth < 1985){
            System.out.println("Space Jam came out not last decade, but the one before THAT.");
        }
          if(yearofBirth < 1975){
            System.out.println(" the original Jurassic Park release is closer to the first lunar landing than it is to today.");
        }
           if(yearofBirth < 1965){
            System.out.println("MASH TV series has been around for almost half a century!");
        }
      }



    
}
