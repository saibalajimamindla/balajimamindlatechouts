package multithreading;

class bags extends Thread
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("is ademon thread");
		}else{
			System.out.println("It is a normal thread");
		}
		}
	}


public class DemonThread {
	public static void main(String[] args) {
		bags t1 = new bags();
		bags t2 = new bags();
		bags t3 = new bags();
		
		
		t1.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
