package aCode;


//There can only be one public class per java file.
//Name of the Public class should be same as the 
//java file or else we get a COMPILE TIME error.

public class FirstJavaClass {

	public static void main(String[] args) {
		
		// Primitive data types - int, float, long, double, boolean
		
		System.out.println("Shreyansh first Java code ");
		// int = 4 bytes = 2^32, float, char, String, long = 8 bytes= 2x(10^18), double, boolean
		// 1 byte = 8 bits.  So, 4 byte = 32 bits.
		// So, int can store 2^32 size of number
		// alphaNumeric charecters, (_), ($) only allowed to name a variable and no variable name can start with a number 
		// can't use pre-defined keywords like (public, static, voin, main....) as variable name
		
		int marks = 18;
		float avgMarks = 19.345f;
		char grade = 'a';
		String name = "Shreyansh";
		boolean isValid = false;
		long bigNumber = 9852355245256356l;
		
		System.out.println(avgMarks);
	}

}

