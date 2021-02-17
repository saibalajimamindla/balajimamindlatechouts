package multithreading;

class Printer01 extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("printer 1 is running");
			try {
				Printer01.sleep(100);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}

class Printer02 extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("printer 2 is running");
			try {
				Printer02.sleep(100);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}

class Printer03 extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("printer 3 is running");
			try {
				Printer03.sleep(100);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}

public class Ex2 {
	public static void main(String[] args) {
		Printer01 p1 = new Printer01();
		Printer02 p2 = new Printer02();
		Printer03 p3 = new Printer03();
		p2.setPriority(4);
		p1.start();
		//p1.setPriority(1);
		try {
			p1.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	//	p2.yield();
	if(p2.getPriority()<5){
		p2.suspend();
	}else
	{
		p2.start();
		try {
			p2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
		
		
		p3.start();
		//p2.setPriority(10);
		
		p2.resume();
		
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		System.out.println(p3.getName());
	}

}
