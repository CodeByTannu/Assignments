package Assignments;

//Base class
class Employe {
 private String name;
 private int id;
 private double salary;

 public Employe(String name, int id, double salary) {
     this.name = name;
     this.id = id;
     this.salary = salary;
 }

 public void displayEmployeeDetails() {
     System.out.println("Employee Name: " + name);
     System.out.println("Employee ID: " + id);
     System.out.println("Employee Salary: " + salary);
 }
}

//Subclass
class Manager extends Employe {
 private double bonus;

 public Manager(String name, int id, double salary, double bonus) {
     super(name, id, salary);
     this.bonus = bonus;
 }

 public void displayManagerDetails() {
     displayEmployeeDetails();
     System.out.println("Manager Bonus: " + bonus);
 }
}

//Main class to test
public class Employee{
 public static void main(String[] args) {
     Manager manager = new Manager("Alice", 101, 75000, 5000);
     manager.displayManagerDetails();
 }
}