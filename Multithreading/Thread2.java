package multithreading;

public class Thread2 implements Runnable{
	int no;
	
		Thread2(){
			
		}
		
	public Thread2(int no) {
			
			this.no = no;
		}

	public void run() {
		
		int i=1;
		while(i<=10) {
			System.out.println(no + "x" + i + "=" + no*i++);
		
		}

	}
}
