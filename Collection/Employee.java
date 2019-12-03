package collection;


public class Employee {
	
	int id;
	String name;
	float sal;
	
	Employee(){
	id=1;
	name="Abhishek";
	sal=15000;
	}

	public Employee(int id, String name, float sal) {
	
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	void print() {
		
	

		System.out.println("id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + sal);
		System.out.println();
	}
	
	
	
	
	
	

}
