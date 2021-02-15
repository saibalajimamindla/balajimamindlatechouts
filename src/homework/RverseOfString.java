package homework;

import java.util.*;

public class RverseOfString {
	public static void main(String[] args) {
		System.out.println("Enter the string to be reversed ");
		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		String output ="";

		char[] out = input.toCharArray();

		for (int i = out.length - 1; i >= 0; i--)
		{
			output += out[i];
		}
		System.out.print("Reversed string is : ");
			System.out.println(output);

	}
}