package college;

public class Student {
	
	private int id;
	private String name;
	private Exam[] exam;
	private ReportCard report;
	
	

	Student()
	{
		
	}

	public Student(int id, String name) {
	
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Exam[] getExam() {
		return exam;
	}

	public void setExam(Exam[] exam) {
		this.exam = exam;
	}
	
	public ReportCard getReport() {
		return report;
	}

	public void setReport(ReportCard report) {
		this.report = report;
	}
	
	void print() {
		System.out.println();
		System.out.println("Student id = " + id);
		System.out.println("Student Name = " + name);
		for (Exam exam2 : exam) {
			exam2.printExam();
		}
		report.printReport();
	}
	
	void calper() {
		float tm = 0.00f;
		float gt = 0.00f;
		
		for (Exam exam2 : exam) {
			tm += exam2.getMaxMarks();
			gt += exam2.getObtMarks();
		}
		report.setPer( gt / tm * 100.0f);
		report.calgrade();
		
	}

	
	
	

}
