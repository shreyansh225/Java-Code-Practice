package aCode;
import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		
		// sc is the object of Scanner class
		Scanner sc =  new Scanner(System.in);  // Scanner class helps u take input from user and is contained in the java.util package	

        System.out.println("Enter int, float, long, byte(-128 to 127), string");
        int a = sc.nextInt();
        float b = sc.nextFloat();
        long c = sc.nextLong();
        Byte d = sc.nextByte();
        sc.nextLine();
        String s = sc.nextLine();
        System.out.println("\nThe Output is as follows");
        System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+s+"\n");
	}

}
