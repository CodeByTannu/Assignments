package Assignments;

public class PatternPrinting 
{
    public static void main(String[] args)
    {
        // Print the first pattern
        System.out.println("Pattern 1:");
        for (int i = 1; i <= 4; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print the second pattern
        System.out.println("\nPattern 2:");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) 
            {
                System.out.print(j);
            }
            System.out.println();
        }

        // Print the third pattern
        System.out.println("\nPattern 3:");
        for (int i = 3; i >= 1; i--) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }

}
}