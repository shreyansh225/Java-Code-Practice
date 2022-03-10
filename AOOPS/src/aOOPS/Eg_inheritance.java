package aOOPS;

import encapsulation.Encapsulation_eg;

public class Eg_inheritance {

	public static void main(String[] args) {
		
//		// p1 is the object of class Employee
//		Employee p1 = new Employee();    // using the new keyword we can create new objects
//		p1.age = 23 ;
//		p1.name = "Shreyansh";
//		p1.address = "KOL";
//		
//		Employee p3 = new Employee();    // Here, Employee is a Default constructor that gets called to create a new object 
//		p2.age = 45;
//		p2.name ="Rahul";
//		p1.address = "BLR";
//		
		Employee p2 = new Employee(33,"Monu");     // the properties in the parameter will get initialized while constructing and the default constructor will get called
		
//		System.out.println(p1.age + " " + p1.name);
//		System.out.println(p2.age + " " + p2.name);
//		p1.eat();
//		p2.walk();
//		p2.walk(5);
//		
//		System.out.println("Displaying count "+ Employee.count);    // can't access count here without making count as static in the Employee class
		
		Developer d1 = new Developer(24,"Mark");
		d1.walk();
		
		Encapsulation_eg obj = new Encapsulation_eg();
		obj.doWork();      // if we remove the public modifier from the doWork method in the main class of Encapsulation.java then we wont be able to access doWork method in Eg_inheritance.java 
		
	}
}


class Developer extends Employee {

	public Developer(int age, String name) {
		super(age, name);             // super keyword is used to call the constructors and properties of the parent class

	}
					
								// Since we have a walk method in Employee class(Parent)
	void walk() {                //  And since we have the walk method here too then Thats how this is Runtime Polymorphism
		System.out.println("Developer " + name + " is walking");
	}
	
}


//Employee is a Parent class
class Employee {         // using this Employee class we can create different Employees with different names and age
	String name;       
	int age;           // properties
	String address;
	
	// static is used to make properties of a class; meaning we dont have to make an object for count to access it in main
	static int count;    // By making it static; now count is the property of the class and not of the object
	
//	public Employee() {
//		count++;
//		System.out.println("creating an Object");   //when we wrote Employee p1 = new Employee() and also for object p2 then the default constructor Employee() was called
//	}
	
	public Employee(int age , String name)       // Parameterized constructor
	{
		//this();           // used to call default constructor of same name of same class
		this.name = name;
		this.age = age;
	};
	
//	public Employee(int newAge, String newName, String address)       // Parameterized constructor
//	{
//		this();           // used to call default constructor of same name of same class
//		name = newName;
//		age = newAge;          // here this. helps the program to access the variable names which are of this class only
//		this.address = address;
//	};
	
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(name + " is eating");
	}
	
	void walk(int steps) {
		System.out.println(name + " walked " + steps + " steps.");   // Compile time polymorphism
	}
	
	void doWork() {
		System.out.println("Employee is Working");
	}
	
}
