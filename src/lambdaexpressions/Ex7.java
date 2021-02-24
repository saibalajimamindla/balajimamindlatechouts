package lambdaexpressions;

public class Ex7 {
	public static void main(String[] args) {
		Runnable r=()->
		{
			System.out.println("Thread is called");
		};
		Thread t1 = new Thread(r);
		t1.start();
	}

}
