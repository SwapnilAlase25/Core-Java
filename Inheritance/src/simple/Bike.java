package simple;

public class Bike extends Vehicle {
	
	
	int no_of_gears;
	
	public Bike() {
		
	}

	public Bike(String name, String color, float speed,int no_of_gears) {
		super(name, color, speed);
		this.no_of_gears = no_of_gears;
	}
	
	public void print() {
		super.print();
		System.out.println("No of Gears = " + no_of_gears);
		System.out.println();
	}
	

}
