package encapsulation;

public class Encapsulation_eg {

	public static void main(String[] args) {
		Laptop a1 = new Laptop();
		a1.setPrice(31);
		
		System.out.println(a1.getPrice());
	}

		// refer to Eg_inheritance file too before learning this
	public void doWork() {                          // if we remove the public modifier from the doWork method in the main class of Encapsulation_eg.java then we wont be able to access doWork method in Eg_inheritance.java and MainClass.java
		System.out.println(" doWork Working");		// without public access modifier, this method can only be accessible in its own package encapsulation and children/sub packages
	
	}
	
	private void takeBreak() {                 // private makes method only accessible to the class in which it is present in; and not even to the package
		System.out.println("Taking break from work ");
	}
	
	protected void project() {                // protected makes method only accessible to the child classes from any package
		System.out.println("Project created");
	}
}


// right click + Source + Generate getters and setters
class Laptop {
	int ram;
	private int price;    // private is mostly used for validation purpose , as we would only want the admin to be able to change the price details

	public void setPrice(int price) {         // we use getters and setters for encapsulation for security reasons we use private in real time projects
		// is the user an admin chech validation
		boolean isAdmin = true;    // after making it true the setPrice will work
		
		if(!isAdmin) {
			System.out.println("You cannot set the price");
		} else {
			this.price = price;
		}
			
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}
}
