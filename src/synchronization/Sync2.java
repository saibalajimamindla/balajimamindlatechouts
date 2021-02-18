package synchronization;

class tables {
synchronized	void printtables(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
		}
	}
}

class thread01 extends Thread {
	tables t;

	thread01(tables t) {
		this.t = t;
	}

	public void run() {
		t.printtables(100);

	}
}

class thread02 extends Thread {
	tables t;

	thread02(tables t) {
		this.t = t;
	}

	public void run() {
		t.printtables(200);

	}
}

public class Sync2 {
	public static void main(String[] args) {
	tables t = new tables();
	thread01 t1 = new thread01(t);
	thread02 t2 = new thread02(t);
	
	t1.start();
	t2.start();
	}

}
