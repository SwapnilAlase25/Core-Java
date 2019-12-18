package exception_handling;

public class Account extends Exception{

	private int bal;

	public Account() {
		bal = 0;
	}

	public Account(int bal) {

		bal = bal;
	}

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}

	public void deposit(int amount) {
		bal = bal + amount;
		
}

	public void withdraw(int amount)throws Exception{
		if(amount>bal)
		{
			throw new Exception ("Insufficient bal");
		}
		if(amount>15000)
		{
			throw new Exception ("Daily Limit is 15000 only");
		}
		bal = bal - amount;

	}

	public void showbal() {
		System.out.println("Balance in account " + bal);
	}
}
