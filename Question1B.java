import java.util.Scanner;//Import the Scanner

public class Question1B {

	public static void main(String[] args) {
		// -----------------------------------------------------------------------------------------------
		// Assignment 2 Question #1 Version 2
		// Written by: Hai Ha Nguyen 40052116
		// For COMP 248 Section P – Fall 2017
		// -----------------------------------------------------------------------------------------------
				
		System.out.println('\n'+
		"----------------------------------------------------------------------------------------------"
		+'\n'
		+"		Welcome to \"What day are we?\" Program Version 2!"
		+'\n'
		+"----------------------------------------------------------------------------------------------"
		+'\n');
				
		//------------------------------------------------------------------------------------------------
		//This program will determine the day according to the
		//input of the user and also tell if it's a weekday or the weekend. 
		//------------------------------------------------------------------------------------------------
				
		
		//Let's declare our scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Let's declare our variables
		String day = "";	//String variable day 
		int num = 0; 	//an integer variable num for the number written
		
		//Let's ask the user to input a day of the week using a number from 1 to 7
		System.out.print("Please enter the day of the week as a number (1-7): ");
		
		
		num = keyboard.nextInt(); //Read the input and assign it to num
		
		// Use the switch method to determine what value to assign to day
		switch (num)
		{
			case 1:
				day = "Monday";
		
			case 2: 
				day = "Tuesday";
				
			case 3: 
				day = "Wednesday";
				
			case 4:
				day = "Thursday";
				
			case 5: 
				day = "Friday";
				
				// Let's print the output for the weekdays
				System.out.println("It's "+ day +"! It's a weekday!");
				break;
				
			case 6:
				day = "Saturday";
				
			case 7: 
				day = "Sunday";
				
				//Let's print the output for the weekend
				System.out.println("It's "+ day + "! It's the weekend!");
				break;
				
			//Let's create a default for input that are not valid
			default :
				System.out.println("That's not a valid day!");
			}
		
		
		//Let's close the scanner
		keyboard.close();
		
		
		//End of the program!
		
		
		
	}

}
