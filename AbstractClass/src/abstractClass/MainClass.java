package abstractClass;

public class MainClass {

	public static void main(String[] args) {
		
		Shape c = new Circle("Circle",5f);
		c.findArea();
		c.printShape();
		
		Shape s = new Square("Square",4f);
		s.findArea();
		s.printShape();
	}

}
