package assesment;

import java.util.*;

public class Asses5 {

	static int round(int n) {
		if(n%10==0)
		{
			return n;
		}else{

		int a = (n / 10) * 10;

		int b = a + 10;

		return  (n - a > b - n)? b : b;
		}
	}

	public static int sumOfMultiples(int i, int j, int k) {
		if (i <= 0 | j <= 0 | k <= 0) {
			return -1;
		} else {
			int l = round(i) + round(j) + round(k);
			return l;
		}
	}

	public static void main(String[] args) {
		int i;
		int j;
		int k;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a");
		i = sc.nextInt();
		System.out.println("enter the value of b");
		j = sc.nextInt();
		System.out.println("enter the value of c");
		k = sc.nextInt();
		System.out.print("The Sum of Multiples is : ");
		System.out.println(sumOfMultiples(i, j, k));

	}
}
