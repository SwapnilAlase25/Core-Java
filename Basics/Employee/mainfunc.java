package employee;

import java.util.Scanner;

public class mainfunc {

	public static void main(String[] args) {
		
		Employee e1= new Employee();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter ID");
		e1.setId(scan.nextInt());
		
		System.out.println("Enter Name");
		scan.nextLine();
		e1.setName(scan.nextLine());
		
		System.out.println("Enter Salary");
		e1.setSalary(scan.nextFloat());
		
		e1.print();
		
		scan.close();
	}
}
