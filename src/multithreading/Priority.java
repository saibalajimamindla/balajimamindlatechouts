package multithreading;

class PrioEx1 implements Runnable {
	public void run() {
		System.out.println("name is : " + Thread.currentThread().getName());
		System.out.println("priority is : " + Thread.currentThread().getPriority());
	}
}

public class Priority {
	public static void main(String[] args) {
		Thread t1 = new Thread(new PrioEx1());
		Thread t2 = new Thread(new PrioEx1());
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		
		
		
	}

}
