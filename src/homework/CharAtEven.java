package homework;

import java.util.Scanner;

public class CharAtEven {

	public static void main(String[] args) {
		System.out.println("Enter the string to be printed ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String last ="";
		for (int i = 1; i <= str.length() - 1; i=i+2) {
			last=last+str.charAt(i);
		}
		
		System.out.println("characters at even places are "+last);
	}
}
