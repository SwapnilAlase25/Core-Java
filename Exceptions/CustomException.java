package bank;

public class CustomException extends Exception{

	int flag;
	

	CustomException(){
		
	}
public CustomException(int flag) {
		
		this.flag = flag;
	}
	
	public void printException() {
		if(flag==1)
		System.out.println("negative amt");
		else if(flag==2)
			System.out.println("insufficient bal");
		else if(flag==3)
			System.out.println("amt > 15000, not allowed");
	}
	
	public void printStackTrace() {
		System.out.println("Printing the stack trace");
		super.printStackTrace();
	}
}
