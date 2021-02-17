package multithreading;

 class threadEx extends Thread   // creating thread
{
	public void run()   //overriding run method
	{
		System.out.println("thread is running");
	}
}
public class ExtendingEXample
{
	public static void main(String[] args) {
		threadEx t1 = new threadEx();   // creating an object
		t1.start();   // invoking start method
	}
	}