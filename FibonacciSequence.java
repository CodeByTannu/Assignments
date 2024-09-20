package Assignments;

import java.util.Scanner;

public class FibonacciSequence
{
    public static void main(String[] args)
    {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Initialize variables to store the Fibonacci sequence
        int a = 0;
        int b = 1;

        // Print the first two numbers in the sequence
        System.out.print("Fibonacci sequence up to " + n + ": ");
        System.out.print(a + " " + b);

        // Use a for loop to generate the Fibonacci sequence
        for (int i = 2; i <= n; i++)
        {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }

        // Close the Scanner object
        scanner.close();
    }
}