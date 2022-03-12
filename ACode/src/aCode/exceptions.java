package aCode;

public class exceptions {

	public static void main(String[] args) {

		int a[] = new int[3];
		
		try {
			System.out.println(2/0);	
		}
		catch(ArrayIndexOutOfBoundsException e)     // will only work for catching the arrayIndex error but not the divide by 0 error 
		{       
			System.out.println("Error aaya tha");
			System.out.println(e.getLocalizedMessage());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Error aaya tha");
			System.out.println(e.getLocalizedMessage());
		 }
		
		
		System.out.println("\n beech ki line \n");
	    
		
		
		try {
			System.out.println(2/0);
			System.out.println(a[4]);	
		}
		catch(Exception e)  // Therefore we use just the word Exception to catch any error
		{       
			System.out.println("Error niche aaya tha");
			System.out.println(e.getLocalizedMessage());
		}
		
		System.out.println("niiche ki line");
	}

}
