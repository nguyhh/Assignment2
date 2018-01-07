import java.util.Scanner;
import java.text.NumberFormat;

public class Question3 {

	public static void main(String[] args) {

		// -----------------------------------------------------------------------------------------------
		// Assignment 2 Question #3
		// Written by: Hai Ha Nguyen 40052116
		// For COMP 248 Section P – Fall 2017
		// -----------------------------------------------------------------------------------------------
				
		System.out.println('\n'+
		"----------------------------------------------------------------------------------------------"
		+'\n'
		+"		Welcome to FoodieDelivery Subscription Calculator!"
		+'\n'
		+"----------------------------------------------------------------------------------------------"
		+'\n');
				
		//-----------------------------------------------------------------------------------------------
		//This program will determine what kind of subscription is the best depending how many
		//times you order per month. It will also tell you the price you would pay for each 
		// kind of subscription and how much you would save by changing your subscription plan.
		//------------------------------------------------------------------------------------------------
						
		
		//Let's declare our scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Let's declare and initialize our variables
		
		int numb = 0 ; 
		double payPerDelivery = 3 ;
		double occassionalFoodie = 15 ;
		double montrealFoodie = 30 ;
		double price = 0.0 ;
		
		//Let's declare our currency format
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		//Let's ask the user to input de num of order per month 
		System.out.print("Please enter the number of times a month you use food delivery services: ");
		
		//Read the input and store it into the variable numb
		numb = keyboard.nextInt();
				
		//Calculate the price if the person is paying per delivery and store it into variable payPerDelivery
		payPerDelivery = numb*3;
		
		//Let's print the total if using Pay Per Delivery
		System.out.println('\n'+ "The cost of Pay per delivery would be : " + fmt.format(payPerDelivery) + "/month");
				
		
		if (payPerDelivery < occassionalFoodie)	// If payPerDelivery is cheaper than occassionalFoodie
		{
			System.out.println('\n'+ "**We recommend getting the Pay per delivery.**"); // Print out recommandation if payPerDelivery is cheaper
		}
		
		
		
		if (payPerDelivery >= occassionalFoodie ) // If payPerDelivery is equal or more expensive than occassionalFoodie
		{
			// If number of orders per month is equal or less than 6 
			if (numb <= 6) 
			{	
				price = occassionalFoodie; // The occassionalFoodie subscription has 6 free orders per month
			
				//Let's print out the message with the recommandation when payPerDelievery is more expensive than occassionalFoodie 
				//and there's 6 orders or less per month
				
				System.out.println("Based on your food ordering, the cost of the OccasionalFoodie "
						+ "subscription would be: " + '\n' + fmt.format(price) + "/month");
				
				System.out.println('\n' + "You would save "+ fmt.format(payPerDelivery - price) + " from PayPerDelivery.");
				
				System.out.println('\n'+ "**We recommend getting the OccasionalFoodie subscription.**");
			}
			
			//If number of orders per month is more than 6
			if (numb > 6)
			{
				price = (occassionalFoodie + 2*(numb - 6)); // Let's calculate how much it would cost
				
				//If the price is now less expensive than the montrealFoodie subscription
				if (price < montrealFoodie)
				{
					//Let's print out the message with recommandations
					System.out.println("Based on your food ordering, the cost of the OccasionalFoodie "
							+ "subscription would be: " + '\n' + fmt.format(price) + "/month");
					
					System.out.println('\n' + "You would save "+ fmt.format(payPerDelivery - price) + " from PayPerDelivery.");
					
					System.out.println('\n'+ "**We recommend getting the OccasionalFoodie subscription.**");
				}
				
				//If the price is equal or more expensive with the occassionalFoodie plan than the montrealFoodie subscription
				if (price >= montrealFoodie)
				{
					occassionalFoodie = 15 + (numb-6)*2; // Let's calculate how much the occassionalFoodie subscription would be
					montrealFoodie= price = 30 +(numb - 12)*1.5;// Let's calculate the price with the montrealFoodie subscription
	
					// If there's more than 12 orders per month and the occassionalFoodie is cheaper 
					if (numb > 12 && occassionalFoodie< montrealFoodie) 
						{
							price = occassionalFoodie; //the price would be the cheaper option
							
							//Let's print out the message with recommandations
							System.out.println("Based on your food ordering, the cost of the OccasionalFoodie "
									+ "subscription would be: " + '\n' + fmt.format(price) + "/month");
							
							System.out.println('\n' + "You would save "+ fmt.format(payPerDelivery - price) + " from PayPerDelivery.");
							
							System.out.println('\n'+ "**We recommend getting the OccasionalFoodie subscription.**");
						}
					
					// If there's more than 12 orders per month and the montrealFoodie is cheaper 
					if (numb>12 && occassionalFoodie >= montrealFoodie)
						{	
							price = montrealFoodie; // the price would be the cheaper option
						
							//Let's print out the message with recommandations
							System.out.println("The cost of pay OccasionalFoodie woud be: "+ fmt.format(occassionalFoodie) +"/month");
							
							System.out.println("Based on your food deliveries, the cost of the MontrealFoodie"
									+ " subscription would be:" + '\n' + fmt.format(price) + "/month");
							
							System.out.println('\n' + "You would save "+ fmt.format(occassionalFoodie - price) +" from the OccasionalFoodie subscription"
									+ " and " + fmt.format(payPerDelivery - price) + " from PayPerDelivery.");
							
							System.out.println("**We recommend getting the MontrealFoodie subscription.**");
						}
					}
				}
					
					
			}
		//Let's print out the end message
		System.out.println('\n'+ "Thank you for using FoodieDelivery Subscription Calculator. "
				+ "Good Eats :-)!");
		
		
		
		
		//Let's close the scanner
		keyboard.close();
		
		
		//End of the program!
		
		}
			
		
		
	}
		

