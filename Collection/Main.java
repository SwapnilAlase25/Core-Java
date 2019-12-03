package collection;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Employee> list= new ArrayList<>();
		
		while(true) {
			
			System.out.println("1.Insert Employee");
			System.out.println("2.Update Employee");
			System.out.println("3.Display Employee");
			System.out.println("4.Delete Employee");
			System.out.println("0.exit");
			System.out.println("enter a choice");
			
			switch(scan.nextInt()) {
			
			case 1:
				System.out.println("Enter id,name,sal");
				Employee e1 = new Employee(scan.nextInt(),scan.nextLine() + scan.nextLine(),scan.nextFloat());
				list.add(e1);
				break;
				
			case 2:
				System.out.println("Enter id whoose data to be changed");
				int upid=scan.nextInt();
				for(Employee e4:list) {
						if(upid==e4.id) {
							System.out.println("Enter new id,name,sal");
							e4.id=scan.nextInt();
							e4.name=scan.nextLine() + scan.nextLine();
							e4.sal=scan.nextFloat();
							
						}
					}
				break;
				
			case 3:
				int i=1;
				for(Employee e5:list) {
					System.out.println();
					System.out.println("Sr no " + i++);
					e5.print();
					}
				break;
			case 4:
				System.out.println("Enter sr.no to be deleted");
				int did=scan.nextInt();
				list.remove(did-1);
				break;
			case 0:
				System.exit(0);
				break;
				
			default:
				System.out.println("Enter correct choice");
				break;
			}
		
			
			
			
		}

		
		

	}
	

}
