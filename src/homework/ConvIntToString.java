package homework;

import java.util.Scanner;

public class ConvIntToString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Integer value ");
		Integer f =sc.nextInt();
		String str = Integer.toString(f);
		System.out.println(" Integer is converted string ");
		System.out.println(str);
		
	}


}
