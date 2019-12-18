package exception_handling;

public class MainMethod {

	public static void main(String[] args) {
	
		Account a= new Account();
		a.showbal();
		try {
			a.withdraw(200);    
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		a.setBal(40000);
		a.showbal();
		try {
			a.withdraw(30000);
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	finally {
		System.out.println("Aukkat main rahne ka");
	}
	

	}

}
