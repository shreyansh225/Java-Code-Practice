package aCode;

public class OperatorEg {

	public static void main(String[] args) {
		
		// Arithmetic Operations +, -, /, *, %
		int firstNumber = 1001;
		int secondNumber = 204;
		int Div1 = firstNumber / secondNumber;
		double Div2 = (double)firstNumber / (double)secondNumber; // returns quotient
		int mod1 = firstNumber % secondNumber;  // returns remainder
	    double mod2 = (double)firstNumber % (double)secondNumber;
	    
		System.out.println("Div1 in int = "+Div1);
		System.out.println("Div2 in double = "+Div2);
		System.out.println("Mod1 in int = "+mod1);
		System.out.println("Mod2 in Double = "+mod2);
		
		// Increment operation ++, --
		int a = 12, b = 20;
		System.out.println("\na = "+ a +" , b = "+b);
		
		a++;                     // (= a + 1) increments by 1
		System.out.println("a   = "+ a);
		System.out.println("b++ = "+ b++); // will display the incremented value only in the next interation
		System.out.println("b   = "+ b);
		System.out.println("++a = "+ ++a); // will display the incremented value here itself
		
		
		// Logical Operators   &&, ||, !
		
		
	}
}
