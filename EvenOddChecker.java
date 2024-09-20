package Assignments;

import java.util.Scanner;

public class EvenOddChecker
{
	public static void main(String[] args) 
	{
		// create a Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);
		
		// prompt the user to enter a number
		System.out.println("Enter a Number :"); 
		
		 // Read the integer input from the user
		int num = sc.nextInt();

		// Check if the number is even or odd
		if (num % 2 == 0) 
		{ 
			 // If the number is divisible by 2(reminder is 0),it is even number

			System.out.println(num + " is an Even Number");
		} else
		{
	       // If the number is not divisible by 2(reminder is not 0),it is even number
			System.out.println(num + " is an Odd Number"); 
		}

        // Close the Scanner object
        sc.close();

	}

}
