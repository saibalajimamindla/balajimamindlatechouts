package multithreading;
class thread1 implements Runnable
{
	public void run()
	{
		 System.out.println(Thread.currentThread().getName());  
	}
}
public class ThreadGroupd {
	public static void main(String[] args) {
		thread1 t = new thread1();
		ThreadGroup tg = new ThreadGroup("main thread");
		
		Thread t1 = new Thread(tg, t, "one");
		Thread t2 = new Thread(tg, t, "two");
		Thread t3 = new Thread(tg, t, "three");
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println(tg.getName());
		tg.list();
		
	}

}
