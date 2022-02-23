package aOOPS;

public class Polymorphism {      //there can only be one public class in a java program

	public static void main(String[] args) {    
//		
//		// p1 is the object of class Person
		Person p1 = new Person();    // using the new keyword we can create new objects
		p1.age = 23 ;
		p1.name = "Shreyansh";
		
		Person p2 = new Person();
		p2.age = 45;
		p2.name ="Rahul";
		
//		System.out.println(p1.age + " " + p1.name);
//		System.out.println(p2.age + " " + p2.name);
		
		p1.eat();
		p2.walk();
		p2.walk(2);
	
	}
}

// Person is a method
//class Person {         // using this person class we can create different persons with different names and age
//	String name;
//	int age;
//	
//	void walk() {
//		System.out.println(name + " is walking");
//	}
//	
//	void eat() {
//		System.out.println(name + " is eating");
//	}
//	
//	void walk(int steps) {
//		System.out.println(name + " walked " + steps + " steps.");
//	}
//}