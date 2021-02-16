package enumeration;

enum level
{
	BOTTOM,
	HALF,
	FULL
}

public class EnumInClass {
	public static void main(String[] args) {
		level l1 = level.FULL;
		System.out.println(l1);
	}

}
