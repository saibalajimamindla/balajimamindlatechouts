package homework;

import java.util.Scanner;

public class convDeciToString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the decimal value ");
		float f =(float)sc.nextFloat();
		String str = Float.toString(f);
		System.out.println(" Decimal is converted string ");
		System.out.println(str);
		
		
	}

}
