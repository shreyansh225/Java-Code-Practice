package aCode;

public class Loops {

	public static void main(String[] args) {
		
		// For, while, do-while
		 
		// for(;;) {}       infinite loop
		System.out.println("For LOOP \n");
		for(int i = 0; i < 10 ; i++)
		{
			System.out.println("Shreyansh "+ i);
		}
		
		System.out.println("\nWhile LOOP \n");
		int a = 21;
		
//		while(true)       //   infinite loop
//		{ System.out.println(a); }
		
		while(a<=30) {
			
			a++;
			if(a == 25) continue;
			
			System.out.println(a);
		}
		
		System.out.println("\nDo While LOOP \n"); // will run at least once even if the condition is not satisfied
		do {
			System.out.println(a);
			a++;
		}while(a<=40);
		
	}

}
