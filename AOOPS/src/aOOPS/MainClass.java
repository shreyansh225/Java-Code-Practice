package aOOPS;

import encapsulation.Encapsulation_eg;


public class MainClass {      //there can only be one public class in a java program

	public static void main(String[] args) {    
		
		// p1 is the object of class Person
		Person p1 = new Person();    // using the new keyword we can create new objects
		p1.age = 23 ;
		p1.name = "Shreyansh";
		p1.address = "KOL";
		
		Person p2 = new Person();    // Here, Person is a Default constructor that gets called to create a new object 
		p2.age = 45;
		p2.name ="Rahul";
		p1.address = "BLR";
		
		Person p3 = new Person(33,"Monu");     // the properties in the parameter will get initialized while constructing and the default constructor will get called
		
		System.out.println(p1.age + " " + p1.name);
		System.out.println(p2.age + " " + p2.name);
		System.out.println(p3.age + " " + p3.name);
	
		p1.eat();
		p2.walk();
		p2.walk(5);
		
		System.out.println("Displaying count "+ Person.count);    // can't access count here without making count as static in the Person class
	
		Encapsulation_eg ob = new Encapsulation_eg();
		ob.doWork();
	}
}

//Person is a class
class Person {         // using this Person class we can create different Persons with different names and age
	String name;       // if we make it protected then it can only be accessed by its child classes....This is also called Data hiding
	int age;           // properties
	String address;
	
	// static is used to make properties of a class; meaning we dont have to make an object for count to access it in main
	static int count;    // By making it static; now count is the property of the class and not of the object
	
	public Person() {
		count++;
		System.out.println("creating an Object");   //when we wrote Person p1 = new Person() and also for object p2 then the default constructor Person() was called
	}
	
	public Person(int newAge, String newName)       // Parameterized constructor
	{
		this();           // used to call default constructor of same name of same class
		name = newName;
		age = newAge;
	};
	
	public Person(int age, String name, String address)       // Parameterized constructor
	{
		this();           // used to call default constructor of same name of same class
		this.name = name;
		this.age = age;          // here this. helps the program to access the variable names which are of this class only
		this.address = address;
	};
	
	
	void walk() {
		System.out.println(name + " is walking");                   //
	}															    //   This is an example of
																	//     Compile Time Polymorphism
	void walk(int steps) {											//
		System.out.println(name + " walked " + steps + " steps.");	//
	}
	
	void eat() {
		System.out.println(name + " is eating");
	}
	
}
