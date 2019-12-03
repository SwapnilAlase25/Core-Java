package multithreading;

public class Thread1 implements Runnable {
	
	int no;
	
	Thread1(){
		
	}
	
	
	public Thread1(int no) {
		
		this.no = no;
	}


	public  void run() {
		int i=10;
		while(i>0) {
			System.out.println(no++);
			i--;
	}
		
		}

	

}
