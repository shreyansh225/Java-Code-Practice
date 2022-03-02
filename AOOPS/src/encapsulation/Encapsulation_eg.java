package encapsulation;

public class Encapsulation_eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

		// refer to Eg_inheritance file too
	public void doWork() {                          // if we remove the public modifier from the doWork method in the main class of Encapsulation.java then we wont be able to access doWork method in Eg_inheritance.java 
		System.out.println("Working Working");		// without public access modifier, this method can only be accessible in its own package encapsulation and children/sub packages
	
	}
	
	private void takeBreak() {                 // private makes method only accessible to the class in which it is present in; and not even to the package
		System.out.println("Taking break from work ");
	}
	
	protected void project() {                // protected makes method only accessible to the child classes from any package
		System.out.println("Project created");
	}
}
