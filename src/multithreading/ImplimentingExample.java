package multithreading;
 
 class threadim implements Runnable
 {
	 public void run()
	 {
		 System.out.println("Thread is running");
	 }
 }

public class ImplimentingExample {
	public static void main(String[] args) {
		Thread t1 = new Thread(new threadim());
		t1.start();
	}

}
