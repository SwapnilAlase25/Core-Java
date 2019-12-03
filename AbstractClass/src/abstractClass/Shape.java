package abstractClass;

public abstract class Shape {
	
	String name;
	float area;
	
	Shape(){
		
	}
	
	Shape(String name){
		this.name=name;
	}
	
	void printShape() {
		System.out.println("Name=" + name);
		System.out.println("Area=" + area);
	}
	
	abstract void findArea();

}
