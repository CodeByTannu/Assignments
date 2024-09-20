package Assignments;

public class Car
{
    private String brand;
    private String model;
    private double price;

    // Default constructor
    public Car() 
    {
        this.brand = "Mercedes-Benz";
        this.model = "C-Class";
        this.price = 600000.0;
    }

    // Parameterized constructor
    public Car(String brand, String model, double price) 
    {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display car details
    public void displayDetails() 
    {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) 
    {
        // Create objects using default constructor
        Car car1 = new Car();
        System.out.println("Car 1 :");
        car1.displayDetails();
        System.out.println();

        // Create objects using parameterized constructor
        Car car2 = new Car("Toyota", "Camry", 25000.0);
        System.out.println("Car 2 :");
        car2.displayDetails();
    }
}