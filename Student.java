package Assignments;

public class Student
{
    private String name;
    private int age;
    private double grade;

    // Constructor to initialize the student's details
    public Student(String name, int age, double grade) 
    {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Method to display the student's details
    public void displayDetails() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) 
    {
        // Create multiple objects
        Student student1 = new Student("Tannu", 20, 85.5);
        Student student2 = new Student("annu", 22, 90.0);
        Student student3 = new Student("nanu", 21, 78.0);

        // Display their details
        System.out.println("Student 1 :");
        student1.displayDetails();
        System.out.println();

        System.out.println("Student 2 :");
        student2.displayDetails();
        System.out.println();

        System.out.println("Student 3 :");
        student3.displayDetails();
    }
}