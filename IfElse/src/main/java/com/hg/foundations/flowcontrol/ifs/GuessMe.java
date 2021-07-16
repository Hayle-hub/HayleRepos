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
public class GuessMe {
      public static void main(String[] args) {
        int myChoice =11;
        int pickNumber = 0;
             Scanner inputReader = new Scanner(System.in);

            System.out.println("Please Pick a number  which is your choice !");
          Integer.parseInt(inputReader.nextLine());
          
        //Double.parseDouble(inputReader.nextLine());

        if(pickNumber == myChoice ){
            System.out.println("Wow, nice guess! That was it");
        }

        if(pickNumber < myChoice){
            System.out.println("nice try - too low! I chose #");
        }
         if(pickNumber > myChoice){
            System.out.println("Too bad, way too high. I chose ");
        }
      }
}
