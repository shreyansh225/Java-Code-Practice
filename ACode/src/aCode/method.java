package aCode;

public class method {
	//Here, Static means that to use this main method; u dont have to create an object for the class
	//Here, public means that this is a method that can be accessed even outside the class
	// if the method was private then the method would not be accessible outide the class
	// Here, void means that this method doesn't have to return any value
	// Here, String[] means that this method is taking a string array input; meaning that everything inside this method will be read by the compiler
	// Here, main helps the compiler to identify that the execution has to be started from here
	// Here, args is the variable name for the String DataType, So u can write any thing in place of args it wont matter
	public static void main(String[] kuchbhi) {
		
		// static methods can only use static variables or call static variables,
		// Non-static variables can be accessed by the objects
	
		System.out.println(avg( 3 , 6 ));    // cannot access the static inputs here directly without using the static keyword in prefix of the method that is being called
		System.out.println(avg( 10 , 16 ));  
	}
	
	// method
	// returnType functionName (arguments) {}
	static int avg(int num1, int num2)     // if we remove static from here then the above method call in main; then the method call wont work
	{
		int sum = num1+num2;
		return sum/2;
	}

}
