package shopping;

import java.util.Scanner;

public class User {
	Inventry inv = new Inventry();
	Cart c = new Cart();
	Navigation nav = new Navigation();
	Scanner sc = new Scanner(System.in);

	protected void userIsIn() {
		int ch=0;
		int id;
		int quant;
		System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
		System.out.println("\n"+"welcome to your cart ");
		System.out.println("These are the items avilable at store");
		inv.userView();
		
		while(true)
		{
			System.out.println(".......................................................................................................................................");
			System.out.println("Menu :");
			System.out.println("1) Add item into cart" + "\n" + "2) Remove item from cart" + "\n" + "3) View cart " + "\n" + "4) Checkout " + "\n");
			try{
				ch = sc.nextInt();
			}catch(Exception e)  
			{
				System.out.println("Entered value is invalid");
				userIsIn();
			}
			
			
			switch(ch)
			{
			case 1:
				System.out.println("Entering items into cart: ");
				System.out.println("Enter the id of item");
				id = sc.nextInt();
				System.out.println("Enter the Quantity of item");
				quant = sc.nextInt();
				c.cartAdd(id, quant);
				break;
			case 2:
				System.out.println("Removing items fron the cart: ");
				System.out.println("Enter the id of item");
				id = sc.nextInt();
				c.cartRemove(id);
				break;
			case 3:
				System.out.println("The items in gour cart are: ");
				c.cartView();
				break;
			case 4:
				c.cartbill();
				System.out.println("\n"+"Thanks for shopping with us");
				System.out.println("Please visit again"+"\n");
				c.clearcart();
				nav.navigating();
				
			 default:
				 System.out.println("inavlid");
				 userIsIn();
			}
		}
		

	}

}
