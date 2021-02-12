package Collections;

import java.util.*;

public class ListEx2 {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList();
		l1.add(10);
		l1.add(40);
		l1.add(90);
		l1.add(20);
		l1.add(50);
		l1.add(80);
		Iterator itr = l1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		Collections.sort(l1);
		
		for(Integer num:l1)
		{
			System.out.println(num);
		}
	}

}
