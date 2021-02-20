package shopping;

import java.util.ArrayList;
import java.util.Iterator;

public class Inventry {

	private int invitemCount;
	private double carttotalprice;
	static ArrayList<Item> invent = new ArrayList();

	public Inventry() {
		invitemCount = 0;
		carttotalprice = 0;
	}

	public void invAdd(int itemID, String itemName, double itemPrice, int itemQuantity) {
		invent.add(new Item(itemID, itemName, itemPrice, itemQuantity));
		invitemCount += 1;
		System.out.println("Item " + itemName + " added to inventry" + "\n");

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

}
