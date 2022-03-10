package aOOPS;

public class Abstraction {

	public static void main(String[] args)
	{
		// Car c = new Car();   // we cannot make an object for a class that is an abstract class made using abstract keyword
		// c.start();
	
		 Audi a = new Audi();   // Object for a child class created 
		 a.start();
	}
	
}

// After abstraction we can only make object for children classes and not for the parent abstracted class

class Audi extends Car{

	@Override
	void start() // It is must to OVERRIDE an abstract method. Meaning the implementation will be given by the class that are extended by the abstract class
	{
		System.out.println("Audi is starting");
	}
	
}

class BMW extends Car{

	@Override
	void start() {
		System.out.println("BMW is starting");
		
	}
	
}

// abstract class
abstract class Car {
	int price;
	
	// for making an abstract method u must make the class of that method as an abstract class too
	abstract void start();  // after making the start method as abstract method, we don't need to define its implementation 
//	{
//		System.out.println("Car is Starting");
//	}
	
	void breaks()  // concrete functions
	{  
		System.out.println(" CAR is stopping");
	}
	
}