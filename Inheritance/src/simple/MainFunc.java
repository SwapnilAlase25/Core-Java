package simple;

public class MainFunc {

	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.name = "City";
		c.color = "Black";
		c.speed = 20;
		c.gearType = "Auto";
		c.accelerate();
		c.print();
		
		Car d = new Car("Baleno","White",50,"Manual");
		d.accelerate();
		d.print();
		
		Vehicle v = new Car("i20","White",90,"Auto");
		v.print();
		
		Bike b = new Bike("Apache","Grey",120,5);
		b.print();
		
	}
}
