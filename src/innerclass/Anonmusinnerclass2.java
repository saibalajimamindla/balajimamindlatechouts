package innerclass;

public class Anonmusinnerclass2 {
	public static void main(String[] args) {
		Runnable r1 = new Runnable()
				{
			public void run()
			{
				System.out.println("run invoked");
			}
				};
				Thread t1 = new Thread(r1);
				t1.start();
	}

}
