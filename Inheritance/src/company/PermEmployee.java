package company;

public class PermEmployee extends Employee {

	float bsal;
	float hra;
	float da;
	
	PermEmployee(){
		
	}

	public PermEmployee(int id, String name, float bsal) {
		super(id,name);
		this.bsal = bsal;
		
	}
	
	void calsal() {
		
		hra=.18f*bsal;
		da=.2f*bsal;
		sal= bsal +  hra + da;
		
	}
	
}
