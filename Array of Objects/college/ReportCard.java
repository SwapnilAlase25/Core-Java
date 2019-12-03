package college;

public class ReportCard {
	
	private String grade;
	private float per;
	
	ReportCard(){
		
	}

	public ReportCard(String grade, float per) {
		
		this.grade = grade;
		this.per = per;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}

	void printReport() {
		System.out.println("Percentage is " + per + "%");
		System.out.println("Grade is " + grade);
	}
	
	void calgrade() {
		
	if(per<40) {
			grade = "Fail";
	}
	else if(per>=40 && per<60) {
		grade = "2nd Class";
	}
	else if(per>=60 && per<75) {
		grade = "1st Class";
	}
	else if(per>=75 && per<=100) {
		grade = "Distinction";
	}
	else {
		grade = "Invalid Grade";
	}
	}
	
}
