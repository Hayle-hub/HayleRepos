/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritanceInterface;

import java.util.Scanner;

/**
 *
 * @author hayle
 */
public class SimpleCalculator {
   
   private int number1=0;
   private int number2=0; 
   private int choice = 0;
   private double result = 0;
   private String input = null; 
   Scanner inputReader = new Scanner(System.in);

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }
    

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }
    public String getInput() {
        return input;
    }
      public void setInput(String input) {
        this.input = input;
       
    }
  
      public  int GetUserChoice()

	{
		do
		{
			try {
				System.out.println("Make a selection");
				System.out.println("1: Addition");
				System.out.println("2: Subtraction");
				System.out.println("3: Multiplication");
                                System.out.println("4: Devision");
				System.out.print("Your selection:");
				input = inputReader.next();  //prompt response
				choice = Integer.parseInt(input); // convert it to an integer 
				System.out.println();
			}
			catch(NumberFormatException e)
			{
				System.out.println(input + " is not a number. Please input a number between 1 and 3");
				continue;
			}
			if (choice<0||choice>5)
			{
				System.out.println("Not a valid selection.");
				choice=0;
			}

		}
		while(choice==0);
		return choice;
                

		}
      public void getUserInput(){
        
     System.out.println("Enter first integer");
     number1=inputReader.nextInt();
     System.out.println("Enter second integer");
     number2=inputReader.nextInt();
     
    if (choice == 1){
       result = number1+number2;
      System.out.println("The sum is %" + result);
    }
     if (choice == 2){
       result = number1-number2;
      System.out.println("The sub is %" + result);
    }
      if (choice == 3){
        result = number1*number2;
      System.out.println("The mul is %" + result);
    }
       if (choice == 4){
         result = number1/number2;
      System.out.println("The div is %" + result);
    }
       else {
        System.out.println("Thanks You!");
                
                System.exit(0);
       }
         }
    
 
       
      
      
}


