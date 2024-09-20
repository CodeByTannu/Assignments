package Assignments;

import java.util.Scanner;

public class PrimeNumberChecker
{
    public static void main(String[] args)
    {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize a flag to indicate if the number is prime
        boolean isPrime = true;

        // Check if the number is less than 2
        if (number < 2) 
        {
            isPrime = false;
        } else {
            // Use a for loop to check if the number is divisible by any number up to its square root
            for (int i = 2; i * i <= number; i++)
            {
                if (number % i == 0) 
                {
                    isPrime = false;
                    break;
                }
            }
        }

        // Print the result
        if (isPrime) 
        {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Close the Scanner object
        scanner.close();
    }
}
