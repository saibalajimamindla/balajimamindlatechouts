package homework;

import java.util.Scanner;

public class OnlyAlphabets {
	public static void main(String[] args) {
		System.out.println("Enter the string to check");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int count = 0;
		for (int i = 0; i <= str.length()-1; i++) {
			char check = str.charAt(i);
			if (check >= 'a' & check <= 'z' || check >= 'A' & check <= 'Z') {

			} else {
				count++;
			}
			
		}
		if(count ==0)
		{
			System.out.println("Given string contains only alphabets");
		}
		else
		{
			System.out.println("Given string contains special characters or numbers ");
		}
	}
}
