package homework;

import java.util.*;

public class RverseOfString {
	public static void main(String[] args) {
		System.out.println("Enter the string to be reversed ");
		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		String output = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i);
		}
		System.out.print("Reversed string is : ");
		System.out.println(output);

	}
}