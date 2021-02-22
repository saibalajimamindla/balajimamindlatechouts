package innerclass;

interface age {
	int age = 22;

	void getage();
}

public class anonmusInnerClass {
	public static void main(String[] args) {
		age a1 = new age() {
			public void getage() {
				System.out.println(age);
			}
		};
		a1.getage();
	}

}
