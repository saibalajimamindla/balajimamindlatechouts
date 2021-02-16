package assesment;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Asses09_1 {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("Welcome");
		list.add("to");
		list.add("our");
		list.add("website");
		System.out.println("The list is given as : " + list);
		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		itr.remove();
		System.out.println("After the remove() method is called : " + list);
	}
}
