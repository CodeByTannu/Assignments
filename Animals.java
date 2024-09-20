package Assignments;

//Superclass Animal
class Animal
{
   // Method in the superclass
   void makeSound()
   {
       System.out.println("The animal makes a sound.");
   }

public void makeSounds()
{
	// TODO Auto-generated method stub
	
}
}
//Subclass Cat
class Cat extends Animal
{
   // Overriding the makeSound method
	@Override
 public void makeSound()
 {
	  System.out.println("The cow meows ");
   }
}
//Subclass Dog
class Dog extends Animal
{
   // Overriding the makeSound method
	@Override
	 public void makeSound() 
	{
		System.out.println("The dog barks");
    }
}


//Main class
public class Animals {
	public static void main(String[] args)
    {
		Animal An =new Animal();
        // Create instances of Dog and Cat
		Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Call the makeSound method
        An.makeSound();
        myCat.makeSound(); // This will call the overridden method in Cat class
        myDog.makeSound(); // This will call the overridden method in Dog class
        

}
}
