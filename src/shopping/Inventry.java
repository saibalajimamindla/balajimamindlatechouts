package shopping;

import java.util.ArrayList;
import java.util.Iterator;

public class Inventry {

	private int invitemCount;
	private double carttotalprice;
	private int itemsincart;
	private static ArrayList<Item> invent = new ArrayList<Item>();
	private static ArrayList<Item> cart = new ArrayList<Item>();

	public Inventry() {
		invitemCount = 0;
		carttotalprice = 0;
		itemsincart = 0;
	}

	public void invAdd(int itemID, String itemName, double itemPrice, int itemQuantity) {
		invent.add(new Item(itemID, itemName, itemPrice, itemQuantity));
		invitemCount += 1;
		System.out.println("Item " + itemName + " added to inventry" + "\n");

	}
	
	
	

	public void cartAdd(int ItemId, int itemQuantity) {

		for (Item c1 : invent) {
			long itemQuat = itemQuantity;
			if (ItemId == c1.getID()) {
				if (c1.getQuantity() > itemQuantity) {
					int quat = c1.getQuantity();
					c1.setQuantity(itemQuat);
					cart.add(c1);
					itemsincart += 1;
					System.out.println("Item " + ItemId + " added to cart");
				} else {
					System.out.println("Entered quantity is not avilable");
				}
			}
		}
	}

	public void invRemove(int itemid) {
		int count = 0;
		for (Item r1 : invent) {
			if (itemid == r1.getID()) {
				count++;
				invent.remove(r1);
				System.out.println("Item is removed ");
				break;

			}
		}
		if (count == 0) {
			System.out.println("Item not found");
		}

	}

	// public void cartRemove(int ItemId, int itemQuantity) {
	// int count=0;
	// for (Item c2 : invent) {
	// if (ItemId == c2.getID()) {
	// count++;
	// cart.remove(c2);
	// c2.setQuantity(c2.getQuantity() + itemQuantity);
	// }
	// }
	// if(count==0)
	// {
	// System.out.println("\n" + "Item " + ItemId + " wasn't found.");
	// }
	// }

	public void cartRemove(int ItemId) {
		int count = 0;
		int quantii = 0;
		for (Item c2 : cart) {
			if (ItemId == c2.getID()) {
				for (Item c3 : invent) {
					if (ItemId == c3.getID()) {
						quantii = c3.getQuantity();
						c3.setQuantity(c2.getQuantity());
						break;
					}
				}
				count++;
				cart.remove(c2);
				System.out.println("Item is removed ");

				if (count != 0) {
					break;
				}
			}
		}
		if (count == 0) {
			System.out.println("\n" + "Item " + ItemId + " wasn't found.");
		}
	}

	public void update(int upid, double uppz, int upqa) {
		int count = 0;
		for (Item u1 : invent) {
			if (upid == u1.getID()) {
				count++;
				u1.setPrice(uppz);
				u1.setQuantity(upqa);
				System.out.println(u1.getID() + "updated to Price : " + uppz + " Quantity :" + upqa);

			}
		}
		if (count == 0) {
			System.out.println("Item not found");
		}

	}

	public void bill() {
		System.out.println("Your bill is " + carttotalprice);
	}

	public void inventryView() {
		System.out.println("Number of items in inventry are " + invitemCount);
		System.out.println("productid          Name          price          QuantityAvilable   ");
		for (Item v1 : invent) {
			System.out.println(v1.getID() + "                   " + v1.getName() + "           " + v1.getPrice()
			+ "                    " + v1.getQuantity());
		}

	}

	public void userView() {
		System.out.println("productid          Name          price          QuantityAvilable   ");
		for (Item v2 : invent) {
			System.out.println(v2.getID() + "                   " + v2.getName() + "           " + v2.getPrice()
					+ "                    " + v2.getQuantity());
		}
	}

	public void cartView() {
		System.out.println("there are " + itemsincart + " items in the cart");
		System.out.println("productid          Name          price          Quantity   ");
		for (Item v2 : cart) {
			System.out.println(v2.getID() + "                   " + v2.getName() + "           " + v2.getPrice()
					+ "                    " + v2.getQuantity());
		}
		
	}
}
