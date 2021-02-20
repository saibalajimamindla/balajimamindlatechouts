package shopping;


import java.util.Scanner;

public class Admin {

	protected void adminIn() {

		Scanner sc = new Scanner(System.in);

		int itemID;
		String itemName;
		double itemPrice;
		int itemQuantity;
		int ch;
		int choice;

		Inventry inv = new Inventry();
		Navigation n = new Navigation();

		while (true) {
			System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
			System.out.println("\n"+"Menu:");
			System.out.println("1) Add item into inventry" + "\n" + "2) update Quantity/prize from shop" + "\n"
					+ "3) Remove item from shop" + "\n" + "4) inventry view " + "\n" + "5) Exit " + "\n");
			ch = sc.nextInt();

			switch (ch) {
			case 5:
				System.out.println("\n" + "Getting you back to home screen");
				n.navigating();

			case 1:
				System.out.println("Enter item ID: ");
				itemID = sc.nextInt();

				System.out.println("Enter item name: ");
				itemName = sc.next();

				System.out.println("Enter item price: ");
				itemPrice = sc.nextDouble();

				System.out.println("Enter quantity: ");
				itemQuantity = sc.nextInt();

				inv.invAdd(itemID, itemName, itemPrice, itemQuantity);

				break;

			case 2:
				System.out.println("Enter the itemid");
				int upid = sc.nextInt();
				System.out.println("Enter the qunatity to be updated(Enterd quantity will be added to the existing quantity )");
				int upqa = sc.nextInt();
				System.out.println("Enter the price to be updated");
				int upprz = sc.nextInt();
				inv.update(upid, upprz, upqa);
				break;

			case 3:
				System.out.println("Enter Id of the item that you would like to remove: ");
				choice = sc.nextInt();
				inv.invRemove(choice);
				break;
			case 4:
				inv.inventryView();
				break;
				
			 default:
				 System.out.println("Invalid input");
				 adminIn();
			}

		}

	}
}
