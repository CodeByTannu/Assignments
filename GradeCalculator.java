package Assignments;

import java.util.Scanner;

public class GradeCalculator
{
    public static void main(String[] args) 
    {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a score
        System.out.print("Enter a score (0-100): ");
        int score = scanner.nextInt();

        // Check the score and assign a grade
        if (score >= 90)
        {
            System.out.println("Grade: A");
        } else if (score >= 80) 
        {
            System.out.println("Grade: B");
        } else if (score >= 70)
        {
            System.out.println("Grade: C");
        } else if (score >= 60) 
        {
            System.out.println("Grade: D");
        } else
        {
            System.out.println("Grade: F");
        }

        // Close the Scanner object
        scanner.close();
    }
}