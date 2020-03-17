package cecs277lab5;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/** Lottery Class
 * 
 * @author Brandon Tran
 *
 */

public class Lottery
{
		/** Winning numbers should be between 1 and 40
		 * 
		 * @return winningSet Return winning number
		 */
		public static Set<Integer> generateWinningNumbers()
	    {
			// Create a set of integers to store the lottery winning numbers 
	        Set<Integer> winningSet = new TreeSet<Integer>();
	        
	        // Create a random variable
	        Random RNG = new Random();
	        
	        // Store the random value into the integers
	        while(winningSet.size() < 6)
	        {
	            Integer r = RNG.nextInt(40)+1; 
	            winningSet.add(r);
	        }
	        
	        // Return the winning set of integers 
	        return winningSet;
	    }
		
		/** Read the player's lottery ticket from the console
		 * 
		 * @return inputNumbers Return the players lottery ticket numbers
		 */
		public static Set<Integer> getTicket()
		{
			// Create a set of integers to store the users 6 lottery numbers 
			Set<Integer> inputNumbers = new TreeSet<Integer>();
			
			// Ask the user for 6 lottery numbers 
			System.out.print("Type 6 lotto numbers: ");
			
			// Scanner variable
			Scanner in = new Scanner(System.in);
			
			// Store the values into the set
			while(inputNumbers.size() < 6)
	        {
	        	Integer n = in.nextInt();
	            inputNumbers.add(n);
	        }
			
			// Return the set of integers of the 6 lottery numbers they typed to the console
	        return inputNumbers;
		}

		public static void main(String args[])
		{
			// Generate a set of integers to generate the winning numbers of the lottery
			Set <Integer> win = generateWinningNumbers();
			
			// Generate a set of integers to receive the lottery ticket numbers of the users
			Set <Integer> ticket = getTicket();
			
			// Print out the lottery ticket numbers of the user
			System.out.println("Your ticket was: " + ticket);
			
			// Print out the winning numbers 
			System.out.println("Winning numbers: " +"[" + win + "]");
			
			// Create a set of integers to match the winning ticket with the users lottery numbers
			Set <Integer> match = ticket;
			
			// Remove elements from the match specified in the winning lottery numbers
			match.retainAll(win);
			
			// Create a variable prizePool
			int prizePool;
			
			// Depending on how many numbers the users get, they received x amount of money
			if(match.size() == 1)
				prizePool = 100;
			else if(match.size() == 2)
				prizePool = 200;
			else if(match.size() == 3)
				prizePool = 300;
			else if(match.size() == 4)
				prizePool = 400;
			else if(match.size() == 5)
				prizePool = 500;
			else if(match.size() == 6)
				prizePool = 600;
			else
				prizePool = 0;

			// Print out the matched lottery number numbers
			System.out.println("Matched numbers: " + match);
			
			// Print out the prizepool on what numbers they guessed what was correct
			System.out.println("Prize: $" + prizePool);
	    }
}

