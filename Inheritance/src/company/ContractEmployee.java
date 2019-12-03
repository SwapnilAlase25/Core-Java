package company;

public class ContractEmployee extends Employee {
	
	float noHrs;
	float perHr;
	
	public ContractEmployee() {
		
	}

	public ContractEmployee(int id, String name,float noHrs, float perHr) {
		super(id,name);
		this.noHrs = noHrs;
		this.perHr = perHr;
	}
	
	void calsal() {
		
		sal=noHrs * perHr;
	}
	

}
