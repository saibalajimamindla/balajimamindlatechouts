package shopping;

import java.util.Scanner;

public class Navigation {
	public static StringBuffer uid = new StringBuffer("admin");
	public static StringBuffer psd = new StringBuffer("password");

	public void updatePassword(String id, String ps) {
		uid.replace(0, uid.length(), id);
		psd.replace(0, psd.length(), ps);
	}

	public void navigating() {

		Scanner sc = new Scanner(System.in);
		int input = 0;
		Admin a1 = new Admin();
		User us = new User();

		System.out.println(
				"//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
		System.out.println(" Identify Your self");
		System.out.println("     1) User" + "\n" + "     2) Admin" + "\n" + "     3) Exit");
		try {
			input = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Entered value is invalid");
			navigating();
		}

		switch (input) {
		case 1:
			us.userIsIn();
			break;
		case 2:
			for (int i = 0; i < 3; i++) {
				if (i > 0) {
					System.out.println("\n" + (3 - i) + " attempts left" + "\n");
				}
				System.out.println("Please enter the credentials ");
				System.out.println("Enter the Admin name ");
				String usid = sc.next();
				System.out.println("Enter the password");
				String pass = sc.next();
				String a = (String) uid.subSequence(0, uid.length());
				String b = (String) psd.subSequence(0, psd.length());
				if (a.equalsIgnoreCase(usid) & b.equalsIgnoreCase(pass)) {
					i = 4;
					a1.adminIn();
				} else {
					if(i<2)
					{
					System.out.println("\n" + "invalid username or password ");
					System.out.println("Hint.....username: " + uid.substring(0, 1) + "......."
							+ uid.substring((uid.length() - 1), uid.length()) + "  password:" + psd.substring(0, 2)
							+ "............");
					System.out.println("Please try again " + "\n");
					}
					// navigating();

				}
			}
			System.out.println("invalid credentials exiting application");
			System.exit(0);
		case 3:
			System.out.println("Thank you :)");
			System.exit(0);

		default:
			System.out.println("inavlid input ");
			navigating();

		}

	}

}
