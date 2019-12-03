package employee;

import java.util.Scanner;

public class Mainfunc {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no. of employees: ");
		Employee[] employees = new Employee[scan.nextInt()];
		
		for (int i = 0; i < employees.length; i++) {
			employees[i]= new Employee();
			
			System.out.println("Enter Id: ");
			employees[i].setId(scan.nextInt());
			
			System.out.println("Enter Name: ");
			employees[i].setName(scan.nextLine() + scan.nextLine());
			
			System.out.println("Enter Salary: ");
			employees[i].setSalary(scan.nextFloat());
			
		}
		
		for (Employee employee : employees) {
			employee.print();
		}
		scan.close();
	}

}
