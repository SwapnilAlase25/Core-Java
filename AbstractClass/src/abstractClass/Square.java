package abstractClass;

public class Square extends Shape {

	float side;
	
	Square(){
		
	}

	public Square(String name,float side) {
		super(name);
		this.side = side;
	}
	
	void findArea() {
		area =side * side;
	}
	
	void printShape() {
		System.out.println("Side = " + side);
		super.printShape();
	}
	
	
}
