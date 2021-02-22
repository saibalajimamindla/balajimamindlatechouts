package multithreading;

class Printer1 implements Runnable
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("printer 1 is running");
		}
	}
}

public class Ex1 {
	public static void main(String[] args) {
		System.out.println("printers started ");
		Printer1 p1 = new Printer1();
		
		Thread t1 = new Thread(p1);
		t1.start();
		
		for(int i=0;i<=10;i++)
		{
			System.out.println("printer 2 is running");
		}
		
		
		System.out.println("printers stopped");
		
	}

}
