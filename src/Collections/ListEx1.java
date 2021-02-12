package Collections;

import java.util.*;

public class ListEx1 {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("sai");
		l.add("balaji");
		l.add(10);
		l.remove(2);
		l.add(0, "mamindla");
		l.set(0, "magham");
		System.out.println(l);
	}

}
