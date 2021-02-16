package assesment;

import java.util.*;

public class Asses09_2 {
	public static void main(String[] argv) throws Exception {
		try {

			ArrayList<String> arrlist = new ArrayList<String>();

			arrlist.add("A");
			arrlist.add("B");
			arrlist.add("C");
			arrlist.add("D");

			System.out.println("ArrayList: " + arrlist);

			ListIterator<String> iterator = arrlist.listIterator(0);

			System.out.println("\nUsing ListIterator" + " from Index 0:\n");
			while (iterator.hasNext()) {
				System.out.println("Value is : " + iterator.next());
			}
			
			ListIterator<String> reviterator = arrlist.listIterator(4);

			System.out.println("\nUsing ListIterator" + " from Index 4:\n");
			while (reviterator.hasPrevious()) {
				System.out.println("Value is : " + reviterator.previous());
			}
		}

		catch (IndexOutOfBoundsException e) {
			System.out.println("Exception thrown : " + e);
		}
	}
}