package innerclass;

public class Anonmusinnerclass1 {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
public void run()
{
System.out.println("run invoked");	
}
		};
		t1.start();
	}

}
