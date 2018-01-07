
import java.util.Scanner;//Let's import the Scanner

public class Question2 {

	public static void main(String[] args) {
		// -----------------------------------------------------------------------------------------------
		// Assignment 2 Question #2
		// Written by: Hai Ha Nguyen 40052116
		// For COMP 248 Section P – Fall 2017
		// -----------------------------------------------------------------------------------------------
				
		System.out.println('\n'+
		"----------------------------------------------------------------------------------------------"
		+'\n'
		+"		Welcome to SpeedyFines Calculator!"
		+'\n'
		+"----------------------------------------------------------------------------------------------"
		+'\n');
				
		//------------------------------------------------------------------------------------------------
		//This program will
		// 
		//------------------------------------------------------------------------------------------------
				
		
		//Let's declare our scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Let's declare our variables
		int speed; 
		final int limitSpeed = 100;
		int penalty = 0;
		
		
		System.out.print("How fast was the driver going? ");
		speed = keyboard.nextInt();
		
		if (speed < limitSpeed)
		{
			System.out.println("The driver was not speeding.");
		}
		
		else
		{
			if ((speed - limitSpeed) < 10)
			{ 
				System.out.println("The fine is $65!");
			}
			else if ((speed - limitSpeed) >= 10 && (speed - limitSpeed) <= 20)
			{
				penalty = 2;
				System.out.println("The fine is $120 and the driver gets " + penalty + " demerit points!" );
				
			}
			else if ((speed - limitSpeed) >= 20 && (speed - limitSpeed) <= 39)
			{ 
				penalty = 5;
				System.out.println("The fine is $240 and " + penalty + " demerit points!");
				
			}
			
			else if ((speed - limitSpeed) >=40 && (speed- limitSpeed) <= 59)
			{
				penalty = 7;
				System.out.println("The fine is $360 and the driver gets " + penalty + " demerit points!");
				
			}
			else if (speed >= 160)
			{
				penalty = 12;
				
				System.out.println("The driver loses his license on the spot and is "
						+ "given a fine of $520!");
			}
		
		}
		
		if (speed>=100 && speed<160)
		{
			System.out.print("How many demerit points did the driver have prior to being stopped? ");
		
			int pointBefore = keyboard.nextInt();
		
			int pointAfter = pointBefore + penalty;
		
			if (pointAfter <12 )
			{
				System.out.println("The drive now has "+ pointAfter + " demerit points.");
			}
			else if (pointAfter >= 12)
			{
				System.out.println("The drive now has "+ pointAfter + " demerit points and loses his license.");
	
			}
			
		}
	
		//Let's close the keyboard
		keyboard.close();
		
		
		//End of the program

	}

	private static void If(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
