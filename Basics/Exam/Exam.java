package Exam;

public class Exam {

	private String examName;
	private int totalMarks;
	private int duration;
	
	Exam(){
		examName="Java";
		totalMarks=87;
		duration=3;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	void print() {
		System.out.println("Exam Name " + examName);
		System.out.println("total marks " + totalMarks);
		System.out.println("duration " + duration + " Months");
		
	}
}
