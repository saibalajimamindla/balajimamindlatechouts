package assesment;

import java.util.Scanner;

public class Asses6 {

	public static int getMaxNumber(int i, int j, int k) {
		if (i <= 0 | j <= 0 | k <= 0) {
			return -1;
		} else {
			int max1 = Math.max(i, j);
			int max2 = Math.max(j, k);
			int maxnum = Math.max(max1, max2);
			return maxnum;
		}
	}
public static void main(String[] args) {
	int i;
	int j;
	int k;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the value of first number");
	i = sc.nextInt();
	System.out.println("enter the value of second number");
	j = sc.nextInt();
	System.out.println("enter the value of third number");
	k = sc.nextInt();
	System.out.print("Max of the given numbers is : ");
	System.out.println(getMaxNumber(i,j,k));
}
}
