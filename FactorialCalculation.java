package Assignments;

import java.util.Scanner;

public class FactorialCalculation
{
    public static void main(String[] args) 
    {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize a variable to store the factorial
        int factorial = 1;

        // Use a while loop to calculate the factorial
        int i = 1;
        while (i <= number)
        {
            factorial *= i;
            i++;
        }

        // Print the result
        System.out.println("The factorial of " + number + " is " + factorial);

        // Close the Scanner object
        scanner.close();
    }
}
