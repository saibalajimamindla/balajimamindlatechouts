package com.shopping;

import java.util.ArrayList;
import java.util.Iterator;

public class Inventry {

	private int invitemCount;
	private double cartTotalPrice;
	static ArrayList<Item> inventry = new ArrayList();

	public Inventry() {
		invitemCount = 0;
		cartTotalPrice = 0;
	}

	public void invAdd(int itemID, String itemName, double itemPrice, int itemQuantity)  {
		inventry.add(new Item(itemID, itemName, itemPrice, itemQuantity));
		invitemCount += 1;
		System.out.println("Item " + itemName + " added to inventry" + "\n");

	}

	public void invRemove(int productIdToRemove) {
		int count = 0;
		for (Item item : inventry) {
			if (productIdToRemove == item.getID()) {
				count++;
				inventry.remove(item);
				System.out.println("Item is removed ");
				break;

			}
		}
		if (count == 0) {
			System.out.println("Item not found");
		}

	}

	public void update(int updatedID, double updatedPrice, int updatedQuantity) {
		int count = 0;
		for (Item item : inventry) {
			if (updatedID == item.getID()) {
				count++;
				item.setPrice(updatedPrice);
				item.setQuantity(updatedQuantity);
				System.out
						.println(item.getID() + "updated to Price : " + updatedPrice + " Quantity :" + updatedQuantity);

			}
		}
		if (count == 0) {
			System.out.println("Item not found");
		}

	}

	public void inventryView() {
		System.out.println("Number of items in inventry are " + invitemCount);
		System.out.println("productid          Name          price          QuantityAvilable   ");
		for (Item item : inventry) {
			System.out.println(item.getID() + "                   " + item.getName() + "           " + item.getPrice()
					+ "                    " + item.getQuantity());
		}

	}

	public void userView() {
		System.out.println("productid          Name          price          QuantityAvilable   ");
		for (Item item : inventry) {
			System.out.println(item.getID() + "                   " + item.getName() + "           " + item.getPrice()
					+ "                    " + item.getQuantity());
		}
	}

}
