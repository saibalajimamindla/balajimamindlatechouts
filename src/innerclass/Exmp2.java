package innerclass;

class outer1 {
	int i = 0;
	static int j = 0;
	private int k = 0;

	class inner1 {
		void display()
		{
			System.out.println(i+j+k);
		}
	}
}

public class Exmp2 {
	public static void main(String[] args) {
		outer1 o = new outer1();
		outer1.inner1 i = o.new inner1();
	//	inner1 i1 = new inner1();
		i.display();
	}

}
