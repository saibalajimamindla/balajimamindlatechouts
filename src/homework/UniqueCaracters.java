package homework;

import java.util.*;
import java.util.Scanner;

public class UniqueCaracters {
	public static void main(String[] args) {

		String str;
		System.out.println("enter the string ");
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		char[] input = str.toCharArray();
		ArrayList first = new ArrayList();
		ArrayList second = new ArrayList();

		for (int i = 0; i <= str.length() - 1; i++) {
			
			if(first.contains(input[i]))
			{
				second.add(input[i]);
			}
			else
			{
				first.add(input[i]);
			}
			

		}
		
		System.out.println(second);
		System.out.println(first);
		
	first.removeAll(second);
		
		System.out.println(first);
		
	}

}
