package bank;

public class Account  {

	float bal;

	Account() {

	}

	public Account(float bal) {
		this.bal = bal;
	}

	void deposit(float amt) throws CustomException {

		if(amt<=0) {
			throw new CustomException(1);
		}
		else {
		bal = bal + amt;
		}
	}

	void withdraw(int amt) throws CustomException {

		if (amt <= 0) {
			throw new CustomException(1);
		} else {

			if (amt > bal) {
				throw new CustomException(2);
			}

			else if (amt > 15000) {
				throw new CustomException(3);
			} else {
				bal = bal - amt;
			}
		}

	}

	void print() {

		System.out.println("Balance is " + bal);
	}

}
