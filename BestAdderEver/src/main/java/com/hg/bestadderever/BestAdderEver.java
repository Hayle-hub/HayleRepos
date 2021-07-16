/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hg.bestadderever;

import java.util.Scanner;

/**
 *
 * @author hayle
 */
public class BestAdderEver {
    public static void main(String[] args) {

        int num1, num2, num3, sumTotal;

    Scanner myScanner = new Scanner(System.in);

     System.out.println("Please enter the first number:"); 
    num1 = Integer.parseInt(myScanner.nextLine());
     System.out.println("Please enter the second number:"); 
    num2 = Integer.parseInt(myScanner.nextLine());
     System.out.println("Please enter the third number:"); 
    num3 = Integer.parseInt(myScanner.nextLine());
   sumTotal = num1 + num2 + num3;
    System.out.println("The total sum is " +  sumTotal);
    
    
    
    
    
               
    }
    
}
