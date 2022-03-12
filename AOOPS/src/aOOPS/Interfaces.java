package aOOPS;

// Just like in class we have Extends
// Similarly in interfaces we have implements
public class Interfaces implements Bike, Robot{  // can implement more than one interface class

	public static void main(String[] args) {
		

	}

	@Override
	public void start() {
		System.out.println("Bike is starting");
	}

	@Override
	public void walk() {
		System.out.println("Robot is walking");
		
	}

}

// interfaces provide true Abstraction
interface Bike{
  
	//public abstract void start();
	void start(); // By default all the methods in an interface class are PUBLIC and ABSTRACT too
					// And since it is by default Abstract, so we don't have to define the body
					// Therefore cannot make any concrete functions in interface class
}

interface Robot {
	
	void walk();
}

