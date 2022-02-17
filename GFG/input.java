import java.util.*;

class Geeks{
    
    // Function to take input using Scanner class
    static void IOFunction(){
        Scanner sc = new Scanner(System.in) ;
            System.out.println("Enter the number of itterations u want:");
            int t = sc.nextInt();

            while(t-- > 0){    
                // Your code here
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
}
class input {
    
    // Driver Code
    public static void main (String[] args) {
	    
	       //Creating an object of class Geeks
	       Geeks g = new Geeks();
		
		   //Calling the IOFunction() of class Geeks
		   g.IOFunction();
	}
}  // } Driver Code Ends