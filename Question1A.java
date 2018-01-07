import java.util.Scanner;//Import the scanner

public class Question1 {

	public static void main(String[] args) {
		// -----------------------------------------------------------------------------------------------
		// Assignment 2 Question #1 Version 1
		// Written by: Hai Ha Nguyen 40052116
		// For COMP 248 Section P – Fall 2017
		// -----------------------------------------------------------------------------------------------
				
		System.out.println('\n'+
		"----------------------------------------------------------------------------------------------"
		+'\n'
		+"		Welcome to \"What day are we?\" Program Version 1!"
		+'\n'
		+"----------------------------------------------------------------------------------------------"
		+'\n');
				
		//------------------------------------------------------------------------------------------------
		//This program will determine the day according to the
		//input of the user and also tell if it's a weekday or the weekend. 
		//------------------------------------------------------------------------------------------------
				
		
		//Let's declare our scanner
		Scanner keyboard = new Scanner(System.in);
		
		
		//Let's ask the user to input a day of the week using a number from 1 to 7
		System.out.print("Please enter the day of the week as a number (1-7): ");
		
		
		
		//Let's read the input and store it in the variable day as an integer
		int day = keyboard.nextInt();
		
		
		//Let's create the printout according to the input
		if (day >= 1 && day<=7)
		{
			if (day == 1)
				System.out.println("It's Monday! It's a weekday!");
			
			if (day == 2)
				System.out.println("It's Tuesday! It's a weekday!");
			
			if (day == 3)
				System.out.println("It's Wednesday! It's a weekday!");
			
			if (day == 4)
				System.out.println("It's Thursday! It's a weekday!");
			
			if (day == 5)
				System.out.println("It's Friday! It's a weekday!");
			
			if (day == 6)
				System.out.println("It's Saturday! It's the weekend!");
			
			if (day == 7)
				System.out.println("It's Sunday! It's the weekend!");
			}
		else 
			System.out.print("That's not a valid day!"); //Output for invalid number entered
		
		
		//Let's close the scanner
		keyboard.close();
		
		
		//End of the program!
		
		
		
	}

}
