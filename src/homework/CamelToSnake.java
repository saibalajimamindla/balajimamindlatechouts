package homework;

import java.util.Scanner;

class CamelToSnake {

	public static String camelCaseToSnake(String str) {

		String result = "";
		char c = str.charAt(0);
		result = result + Character.toLowerCase(c);

		for (int i = 1; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (Character.isUpperCase(ch)) {
				result = result + '_';
				result = result + Character.toLowerCase(ch);
			}

			else {
				result = result + ch;
			}
		}

		return result;
	}

	public static void main(String args[]) {

		String str;
		System.out.print("enter the CamelCase string that is to be converted to snake_case ");
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		System.out.print(camelCaseToSnake(str));
	}
}
