/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hg.foundations.flowcontrol.fors;

/**
 *
 * @author hayle
 */
import java.util.Scanner;
public class ForTimes {
    public static void main(String[] args) {
        int timeTable =0;
        int multiRecite;
 
        Scanner inputReader = new Scanner(System.in);
      

         System.out.println("Which times table shall I recite");
         timeTable = Integer.parseInt(inputReader.nextLine());
        for (int i = 1; i <= 15; i++) {
            // System.out.print(i + ", ");
          multiRecite = timeTable * i;
               
            System.out.println(timeTable + "*" + i + "is" + multiRecite );
       
        }

      
    
}}
