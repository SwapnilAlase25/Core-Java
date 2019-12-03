package company;

import java.util.Scanner;

public class MainFunc {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Permanent employee");
		System.out.println("Enter id, Name, Basic Sal");
		PermEmployee pe = new PermEmployee(scan.nextInt(),scan.nextLine()+scan.nextLine(),scan.nextFloat());
		pe.calsal();
		pe.print();
		System.out.println("-------------------------");
		System.out.println("Contract employee");
		System.out.println("Enter id, Name, no. of hrs, hour rate");
		ContractEmployee ce = new ContractEmployee(scan.nextInt(),scan.nextLine()+scan.nextLine(),scan.nextFloat(),scan.nextFloat());
		ce.calsal();
		ce.print();
		
		scan.close();

	}

}
