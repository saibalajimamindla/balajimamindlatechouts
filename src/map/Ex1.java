package map;

import java.util.*;

public class Ex1 {
	public static void main(String[] args) {
		Map<Integer, String> mp1 = new HashMap<Integer, String>();
		mp1.put(1, "balaji");
		mp1.put(2, "ajay");
		mp1.put(3, "vishnu");
		mp1.put(4, "sreekanth");
		mp1.put(5, "sai");
		mp1.putIfAbsent(6, "vijay");
		mp1.put(5, "vinodh");
		Map<Integer, String> mp2 = new HashMap<Integer, String>();
		mp2.put(7, "kiran");
		mp2.put(8, "samra");
		mp2.put(9, "pitta");
		mp2.put(10, "rishi");
		mp1.putAll(mp2);
		System.out.println(mp1);

	}

}
