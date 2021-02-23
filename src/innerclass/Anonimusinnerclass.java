package innerclass;

public class Anonimusinnerclass {
	public static void main(String[] args) {
		
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("invoked");
			}
		};
		Thread t = new Thread(r);
		t.start();
		r.run();
	}

}
