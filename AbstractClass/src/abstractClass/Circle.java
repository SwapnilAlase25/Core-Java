package abstractClass;

public class Circle extends Shape{
	float radius;
	
	Circle(){
		
	}
	
	Circle(String name,float radius){
		super(name);
		this.radius=radius;
	}
	
	void findArea() {
		area = 3.14f *radius * radius;
	}
	
	void printShape() {
		System.out.println("Radius = "+ radius);
		super.printShape();
	}

}
