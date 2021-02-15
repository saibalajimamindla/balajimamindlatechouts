package homework;

import java.util.Scanner;

public class ConvDoubleToString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Double value ");
		Double f =sc.nextDouble();
		String str = Double.toString(f);
		System.out.println(" Double is converted string ");
		System.out.println(str);
		
		
	}

}
