package map;

import java.util.*;

class Book {
	int id, quantity;
	String name, author, publisher;

	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class Ex2 {
	public static void main(String[] args) {
		Map<Integer, Book> mp1 = new HashMap();

		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);

		mp1.put(1, b1);
		mp1.put(2, b2);
		mp1.put(3, b3);

		for (Map.Entry<Integer, Book> entry : mp1.entrySet()) {
			int key = entry.getKey();
			Book value = entry.getValue();
			System.out.println(key);
			System.out.println(
					value.id + " " + value.name + " " + value.author + " " + value.publisher + " " + value.quantity);
		}

	}

}
