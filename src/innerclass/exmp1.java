package innerclass;

class outer {
	int i = 10;
	static int j = 20;
	private static int k = 30;

	static class inner {
		public void display() {
			System.out.println(j + " " + k);
		}
	}
}

public class exmp1 {
	public static void main(String[] args) {

		outer.inner q = new outer.inner();
		q.display();
	}

}
