/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hg.scannerexercise;
import java.util.Scanner;

/**
 *
 * @author hayle
 */
public class PassingTheTuringTest {
     public static void main(String[] args) {

         String yourName;
         int myfavoritNumber = 19;
         int yourfavoritNumber;
         String favoritFirut, color;
       int totalSum;
        Scanner inputReader = new Scanner(System.in);
        
          System.out.println("Hello there! ");
          System.out.println("What's your name: ");
          yourName = inputReader.nextLine();
            System.out.println("Hi," + yourName + "! I'm Hayle");
            System.out.println("what is your favortite color?");
            color = inputReader.nextLine();
            System.out.println("Huh," + color + "Mine's Green");
            System.out.println(" I really like green cabbage. It is my favorite fruit, too what's YOUR favorite fruit," + yourName + "?");
            favoritFirut = inputReader.nextLine();
              System.out.println("Really?" + favoritFirut );
               System.out.println(" Speaking of favorites, what's your favorite number?");
                yourfavoritNumber = Integer.parseInt(inputReader.nextLine());
                System.out.println( yourfavoritNumber + "is  a cool number.Mine's 19 ");
                  System.out.println( yourfavoritNumber + "is  a cool number.Mine's " + myfavoritNumber);
                totalSum = yourfavoritNumber * myfavoritNumber;
                
                System.out.println( "Did you know" + yourfavoritNumber + "*" + myfavoritNumber + "is " + totalSum + "That's a cool number too!");
                
                  System.out.println(" Well, thanks for talking to me " + yourName + "!");
              

            
            
            
            
            
            
            
          
        

     }
}
