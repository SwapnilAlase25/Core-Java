package college;

import java.util.Scanner;

public class Mainfunc {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter no. of Students: ");
		Student[] studs = new Student[scan.nextInt()];
		
		for (int i = 0; i < studs.length; i++) {
			studs[i] = new Student();
			System.out.println("Enter id: ");
			studs[i].setId(scan.nextInt());
			System.out.println("Enter Name: ");
			studs[i].setName(scan.nextLine() + scan.nextLine());
			
			System.out.println("Enter no. of Exams : ");
			Exam[] exam = new Exam[scan.nextInt()];
			for (int j = 0; j < exam.length; j++) {
				exam[j] = new Exam();
				System.out.println("Enter Exam name: ");
				exam[j].setExamName(scan.nextLine() + scan.nextLine());
				System.out.println("Enter exam Maximum Marks: ");
				exam[j].setMaxMarks(scan.nextFloat());
				System.out.println("Enter Obtained Marks: ");
				exam[j].setObtMarks(scan.nextFloat());
			}
	
			studs[i].setExam(exam);
			studs[i].setReport(new ReportCard());
			studs[i].calper();
		}
		
		for(int i=0;i<studs.length;i++) {
			studs[i].print();
		}
		
		scan.close();
	}

}
