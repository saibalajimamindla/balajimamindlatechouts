package multithreading;

class phone1 implements Runnable {
	public void run() {
		System.out.println("phone 1 is ringing ");
		 System.out.println(Thread.currentThread().getName()); 
	}
}

class phone2 implements Runnable {
	public void run() {
		System.out.println("phone 2 is ringing ");
		 System.out.println(Thread.currentThread().getName()); 
	}
}

public class Ex4 {

	public static void main(String[] args) {
		Thread t1 =new Thread(new phone1());
		Thread t2 =new Thread(new phone2());
		
		System.out.println(t1.getId());
		System.out.println(t2.getId());
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.setName("phone1");
		t2.setName("phine2");
		System.out.println("after renaming");
//		System.out.println(t1.getName());
//		System.out.println(t2.getName());
		
		t1.start();
		try {
			t1.join(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
	}
}
