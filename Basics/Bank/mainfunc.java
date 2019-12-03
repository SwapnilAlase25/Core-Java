package Bank;

import java.util.Scanner;

public class mainfunc {

	public static void main(String[] args) {
		int choice;
		Bank e = new Bank();
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("****** BANK ******");
			System.out.println("1.Check Balance");
			System.out.println("2.Withdraw");
			System.out.println("3.Deposit");
			System.out.println("0.Exit");
			System.out.println("Enter a choice: ");
			choice=scan.nextInt();
				switch(choice)
				{
				case 1:
					e.print();
					break;
				
				case 2:
					System.out.println("Enter amount ");
					e.withdraw(scan.nextDouble());
					break;
					
				case 3:
					System.out.println("Enter amount ");
					e.deposit(scan.nextDouble());
					break;
					
				case 0:
					System.exit(0);
					break;
					
				default:
					System.out.println("Invalid Choice, Try AGain !!!!");
					break;
				}
		}
	}
}
