package homework;

import java.util.Scanner;

public class StringAppend {

	public static void main(String[] args) {
		String[] str = new String[10];
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		System.out.println("Enter the 10 strings that are to be appended");

		try {
			for (int i = 0; i <10; i++) {
				str[i] = sc.next();

			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("please enter specified no of strings only");
		}

		for (int i = 0; i < str.length; i++) {
			sb = sb.append(str[i]);
		}

		System.out.println(" 10 Strings are appended ");
		System.out.println(sb.toString());
	}

}
