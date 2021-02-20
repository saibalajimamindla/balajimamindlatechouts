package shopping;

import java.util.ArrayList;

public class Cart extends Inventry {

	private int itemsincart = 0;
	private static ArrayList<Item> cart = new ArrayList();
	Inventry i = new Inventry();
	Item it = new Item();

	public void cartAdd(int ItemId, int itemQuantity) {
		int count = 0;
		for (Item i1 : invent) {
			if (ItemId == i1.getID()) {
				int id = i1.getID();
				if (i1.getQuantity() > itemQuantity) {
					String name = i1.getName();
					double price = i1.getPrice();
					int quant = itemQuantity;
					cart.add(new Item(id, name, price, quant));
					itemsincart++;
					count++;
					System.out.println("Item " + ItemId + " added to cart");
					long a = i1.getQuantity() - itemQuantity;
					i1.setQuantity(a);

				}
			}
		}
		if (count <= 0) {
			System.out.println("Entered quantity is not found ");
			count = 0;
		}
		count = 0;
	}

	public void cartView() {
		System.out.println("there are " + itemsincart + " items in the cart");
		System.out.println("productid          Name          price          Quantity   ");
		for (Item v2 : cart) {
			System.out.println(v2.getID() + "                   " + v2.getName() + "           " + v2.getPrice()
					+ "                    " + v2.getQuantity());
		}
		cartprice();
	}

	public void cartRemove(int ItemId) {
		int count = 0;
		for (Item i1 : cart) {
			if (ItemId == i1.getID()) {
				for (Item i2 : invent) {
					if (ItemId == i2.getID()) {
						i2.setQuantity(i1.getQuantity());
					}
				}
				cart.remove(i1);
				count++;
				System.out.println("item is remove from the cart");
				break;
			}
		}
		if (count <= 0) {
			System.out.println("Entered item not removed ");
			count = 0;
		}
		count = 0;

	}

	public void cartprice() {
		double price = 0;
		for (Item i1 : cart) {
			price += (i1.getPrice() * i1.getQuantity());
		}
		System.out.println("the price of your cart is " + price);
		price = 0;
	}

	public void clearcart() {
		cart.removeAll(cart);
	}

	public void cartbill() {
		double price = 0;
		for (Item i1 : cart) {
			price += (i1.getPrice() * i1.getQuantity());
		}
		System.out.println("Your bill is " + price);
		price = 0;
	}

}
