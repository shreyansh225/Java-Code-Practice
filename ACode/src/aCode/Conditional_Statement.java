package aCode;
import java.util.Scanner;
public class Conditional_Statement {

	public static void main(String[] args) {
		// if else if Statements
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the grade");
		char grade = sc.next().charAt(0);
		if (grade == 'A'){
			System.out.println("Very Good");
		} 
		else if(grade == 'B'){
			System.out.println("Good");
		} 
		else if(grade == 'C'){
			System.out.println("Average");
		} 
		else if(grade == 'F'){
			System.out.println("Fail");
		} else {
			System.out.println("wrong input");
		}
		
		// Switch Case Statements
		System.out.println("Enter the grade to see switch case output:");
		grade = sc.next().charAt(0);
		
		switch(grade)
		{
		case 'A': System.out.println("Very Good");
					break;
		case 'B': System.out.println("Good");
					break;
		case 'C': System.out.println("Average");
					break;
		case 'F': System.out.println("Fail");
					break;
		default : System.out.println("Wrong Input");
					
		}
		
	}

}
