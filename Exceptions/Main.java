package bank;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Account  acc1 = new Account();
		Scanner scan = new Scanner(System.in);
		
		
		try {
			System.out.println("Enter deposit money: ");
			acc1.deposit(scan.nextInt());
			acc1.print();
		} catch (CustomException e1) {
			
			e1.printException();
			//e1.printStackTrace();
		}
		
		
		

		while(true) {
		try {
					System.out.println("Enter withdraW MONEY: ");
					acc1.withdraw(scan.nextInt());
					acc1.print();
			
			
		} catch (CustomException e2) {
			
			e2.printException();
			//e2.printStackTrace();
		}
		}
	}

}
