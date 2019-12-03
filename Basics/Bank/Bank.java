package Bank;

public class Bank {

	private double amt;
	private double bal;
	
	void deposit(double amt) {
		bal=bal+amt;
	}
	
	void withdraw(double amt) {
		if(amt<bal) {
		bal=bal-amt;
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
	
	void print() {
		System.out.println();
		System.out.println("Balance is " + bal);
	}
	
}
