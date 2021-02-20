package shopping;

import java.util.Scanner;

public class Navigation {

	public void navigating() {

		Scanner sc = new Scanner(System.in);
		int input=0;
		Admin a1 = new Admin();
		User us = new User();
		String uid = "saibalaji";
		String psd = "123456789";
		System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
		System.out.println(" Identify Your self");
		System.out.println("     1) User" + "\n" + "     2) Admin" + "\n" + "     3) Exit");
		try
		{
			input = sc.nextInt();
		}catch(Exception e) 
		{
			System.out.println("Entered value is invalid");
			navigating();
		}
		
		switch (input) {
		case 1:
			us.userIsIn();
			break;
		case 2:
			System.out.println("Please enter the credentials ");
			System.out.println("Enter the Admin name ");
			String usid = sc.next();
			System.out.println("Enter the password");
			String pass = sc.next();
			if (usid.equalsIgnoreCase(uid) & pass.equalsIgnoreCase(psd)) {
				a1.adminIn();
			} else {
				System.out.println("\n" + "invalid username or password ");
				System.out.println("Hint.....username: " + uid.substring(0, 3) + "......."
						+ uid.substring((uid.length() - 3), uid.length()) + "  password:" + psd.substring(0, 3)
						+ "............");
				System.out.println("Please try again " + "\n");
				navigating();

			}
		case 3:
			System.out.println("Thank you :)");
			System.exit(0);
			
		 default:
			 System.out.println("inavlid input ");
			 navigating();
			 
		}

	}

}
