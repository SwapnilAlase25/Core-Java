package Exam;

import java.util.Scanner;

public class Mainfunc {
	
	public static void main(String[] args) {
	
		Exam e = new Exam();
		e.print();
		
		Exam f = new Exam();
		Scanner scan = new Scanner(System.in);
		
	    System.out.println("Enter name of exam");
	    f.setExamName(scan.nextLine());
	    
	    System.out.println("Enter total marks");
	    f.setTotalMarks(scan.nextInt());
	    
	    System.out.println("Enter duration");
	    f.setDuration(scan.nextInt());
	    
	    f.print();
	    
	    scan.close();
		
	}

}
