package multithreading;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a no. ");
		int no=scan.nextInt();
		
		Thread1 t1 = new Thread1(no);
		Thread2 t2 = new Thread2(no);
		
		
		new Thread(t1).start();
		new Thread(t2).start();
		
		scan.close();

		
		
		
	}
	

}
