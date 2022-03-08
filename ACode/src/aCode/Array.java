package aCode;

public class Array {

	public static void main(String[] args) {
		
		int marks[] = new int[5];
		marks[0] = 23;
		marks[1] = 30;
		marks[2] = 12;
		marks[3] = 20;
		marks[4] = 35;
		
	//	int marks[] = {23, 12, 56, 34, 99, 45, 69};
		
		for(int i = 0; i < marks.length ; i++) {
			System.out.println(marks[i]);
		}
		
		int a[][] = new int[2][3];
		int b[][] = {{1,2},{3,7}} ;
	
		System.out.println("\n"+b[1][1]);

	}

}
