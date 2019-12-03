package college;

public class Exam {
	
	private String examName;
	private float maxMarks;
	private float obtMarks;
	
	Exam(){
		
	}

	public Exam(String examName, float maxMarks, float obtMarks) {
	
		this.examName = examName;
		this.maxMarks = maxMarks;
		this.obtMarks = obtMarks;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public float getMaxMarks() {
		return maxMarks;
	}

	public void setMaxMarks(float maxMarks) {
		this.maxMarks = maxMarks;
	}

	public float getObtMarks() {
		return obtMarks;
	}

	public void setObtMarks(float obtMarks) {
		this.obtMarks = obtMarks;
	}
	
	
	void printExam() {
		
		System.out.println("Exam name = " + examName);
		System.out.println("Exam max Marks = " + maxMarks);
		System.out.println("Exam obt Marks = " + obtMarks);
	}
	

}
