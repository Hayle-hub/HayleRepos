
/*
 *  The purpose of this program is to allow a user to play a game of rock, paper, scissors
 * by entering in a number between 1 and 3, where 1 means picking paper, 2, means picking Scissors
 * and  3 picking Rock. The program  display a message if user enter round out of the range,
 * saying it's a draw or that the user entered in an invalid number. Furthermore,the program keep track of how many rounds are ties, user wins, or computer wins. 
 * Lastly, the program should display a message saying if the user want to play again  and which player Wi n 
 * 
 */

import java.util.Scanner;
import java.util.Random;
/* @author Haylegebrel Gashaw
 * RockPaperScissors
 * 22/07/2021
 * v1.0. 
 */
public class RockPaperScissors {
    // Variable initialization and declaration 	
	static int rounds = 0;
	static String input = null; 
        static String playAgain = null;
	static int choice = 0;
	static Scanner inputReader = new Scanner(System.in);
	static Random rand = new Random();
	static int playerRounds = 0;
	static int compRounds = 0;
	static int tieRounds = 0;
        

	public static void main(String[] args) {


	
                
		GetRounds();
              
             //  FinalResults();

	}

	public static int GetPlayerChoice()

	{
		do
		{
			try {
				System.out.println("Make a selection");
				System.out.println("1: rock");
				System.out.println("2: paper");
				System.out.println("3: scissors");
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
			if (choice<0||choice>4)
			{
				System.out.println("Not a valid selection.");
				choice=0;
			}

		}
		while(choice==0);
		return choice;
                

		}

	public static void GetResult(int playerChoice)
	{
		String player = null;
		String comp = null;
		int compChoice = rand.nextInt(3)+1; //computer generate random number shifted by one 
                
		switch(compChoice)
		{
			case 1:
			{
				comp = "rock";
				break;
			}
			case 2:
			{
				comp = "paper";
				break;
			}
			case 3:
			{
				comp = "scissors";
				break;
			}
		}


		switch(playerChoice)
		{
			case 1:
			{
				player = "rock";
				break;
			}

			case 2:
			{
				player = "paper";
				break;
			}

			case 3: 
			{
				player = "scissors";
				break;
			}

		}

		OutputResult(playerChoice,compChoice,player,comp);
	}

	public static void OutputResult(int playerChoice, int compChoice, String player, String comp)
	{
		System.out.println("Player chose " + player + ". Computer chose " + comp + ".");
		if (playerChoice == compChoice)  //tie cases 
		{
			tieRounds++;

                        System.out.println("Tie game");
		}

                else if ((playerChoice==1 && compChoice==3)||(playerChoice== 3 && compChoice==2)|| (playerChoice==2 && compChoice==1) )
		{
	
				PlayerRound();
		
                }
		
			else
			{
				CompRound();
			}
		

	}
        public static void GetRounds()
	{
		do {
			try {
                            //Get the user's choice through user input
			System.out.print("Please enter number of rounds (1-10):");
			input = inputReader.nextLine();
			rounds = Integer.parseInt(input);
			System.out.println();
			}
                        //Check if the user's choice is valid
			catch(NumberFormatException e)
			{
				System.out.println(input + " is not a number. Please input a number");
				
			}
			if (rounds<0)
			{
				System.out.println("You can't have negative rounds. Input a number between 1 and 10.");
				rounds=0;
			
			}
			else if (rounds>10)
			{
				System.out.println("Too many rounds. Enter a number between 1 and 10.");
				rounds=0;
			
			}
			else if (rounds==0)
			{
				System.out.println("Zero rounds? That's called not playing. Ok, exiting.");
                                
				System.exit(rounds);
			}
		}
		while(rounds==0);

		for (int i=0;i<rounds;i++)
		{
			GetResult(GetPlayerChoice());
		}
               FinalResults();
        }
                
	

	public static void PlayerRound()
	{
		playerRounds++;
		System.out.println("Player wins.");
		System.out.println();
	}

	public static void CompRound()
	{
		compRounds++;
		System.out.println("Comp wins.");
		System.out.println();
	}
       

	public static void FinalResults()
	{
		System.out.println("Total Rounds: " + rounds);
		System.out.println("Player wins: " + playerRounds);
		System.out.println("Computer wins:" + compRounds);
                
                System.out.println(" Would you like to play again? 'Y' or 'N'? ");
                playAgain = inputReader.nextLine();  
                inputReader.nextLine();
                if (playAgain.equalsIgnoreCase("N"))
            {
           
                 System.out.println("Thanks For Playing!");
                
                System.exit(0);
               
            }
            else 
            {
                 GetRounds();
                
            }
            
            
            }
            
        }
    

