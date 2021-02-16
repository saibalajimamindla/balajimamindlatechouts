package enumeration;

enum lev {
LOW,
MEDIUM,
HIGH
}

public class EnumSwitch {
	public static void main(String[] args) {
		lev l1 = lev.MEDIUM;
		switch(l1)
		{
		case LOW:
			System.out.println("The level is low  ");
			break;
		case MEDIUM:
			System.out.println("The level is medium  ");
			break;
		case HIGH:
			System.out.println("The level is high  ");
			break;
		}
	}

}
