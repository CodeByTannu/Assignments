package Assignments;

public class Rectangle 
{
    private double length;
    private double width;

    // Constructor to initialize the rectangle's dimensions
    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area
    public double calculateArea() 
    {
        return length * width;
    }

    // Method to calculate the perimeter
    public double calculatePerimeter()
    {
        return 2 * (length + width);
    }

    // Method to display the rectangle's details
    public void displayDetails() 
    {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area of Rectangle: " + calculateArea());
        System.out.println("Perimeter of Rectangle: " + calculatePerimeter());
    }

    public static void main(String[] args) 
    {
        // Create objects
        Rectangle rectangle1 = new Rectangle(5.0, 3.0);
        Rectangle rectangle2 = new Rectangle(8.0, 4.0);

        // Display rectangle details
        System.out.println("Rectangle 1:");
        rectangle1.displayDetails();
        System.out.println();

        System.out.println("Rectangle 2 :");
        rectangle2.displayDetails();
    }
}
