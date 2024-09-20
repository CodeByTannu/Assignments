package Assignments;

public class Book
{
    private String title;
    private String author;
    private double price;

    // Constructor with title only
    public Book(String title) 
    {
        this.title = title;
        this.author = "bcd";
        this.price = 80.0;
    }

    // Constructor with title and author
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
        this.price = 90.0;
    }

    // Constructor with all attributes
    public Book(String title, String author, double price) 
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) 
    {
        // Create objects using different constructors
        Book book1 = new Book("Java Programming");
        System.out.println("Book 1 :");
        book1.displayDetails();
        System.out.println();

        Book book2 = new Book("Java Programming", "abc");
        System.out.println("Book 2 :");
        book2.displayDetails();
        System.out.println();

        Book book3 = new Book("Java Programming", "xyz", 49.99);
        System.out.println("Book 3 :");
        book3.displayDetails();
    }
}