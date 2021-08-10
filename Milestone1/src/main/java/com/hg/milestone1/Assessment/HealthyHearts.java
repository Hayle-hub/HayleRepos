/*
 *  The purpose of this program to calculate healthy heart rate  
 */
package com.hg.healthyhearts;
import java.util.Scanner;
/* @author Haylegebrel Gashaw
 * HealthyHearts
 * 22/07/2021
 * v1.0. 
 */
public class HealthyHearts {

 

    public static void main (String[] args){
   
        Scanner inputReader = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = inputReader.nextInt();
        int maxHeart = 220 - age;
        int zoneMin = maxHeart/2;
        double zoneMax = maxHeart*0.85;
        
        System.out.println("Your maximum heart rate should be " + maxHeart + " beats per minute");
        System.out.println("Your target HR Zone is " + zoneMin + " - " + zoneMax + " beats per minute");
    }

}
