package shopping;

public class Item {

	private int id;
	private String name;
	private double price;
	private int quantity;

	public Item(int itemID, String itemName, double itemPrice, int itemQuantity) {
		id = itemID;
		name = itemName;
		price = itemPrice;

		quantity = itemQuantity;

	}
	public Item()
	{
		
	}
	

	public int getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double setPrice(double upprz) {
		this.price = upprz;
		return price;
	}

	public int setQuantity(int upqa) {
		this.quantity = quantity + upqa;
		return quantity;
	
	}
	
	public int setQuantity(long upqa) {
		this.quantity = (int)upqa;
		return quantity;
	
	}

}
