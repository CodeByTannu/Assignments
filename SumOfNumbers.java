package Assignments;

import java.util.Scanner;

public class SumOfNumbers
{
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();

        // Initialize a variable to store the sum
        int sum = 0;

        // Use a for loop to calculate the sum of the first n natural numbers
        for (int i = 1; i <= n; i++)
        
        {
            sum += i;
        }

        // Print the result
        System.out.println("The sum of the first " + n + " natural numbers is " + sum);

        // Close the Scanner object
        scanner.close();
    }
}