package Collections;

import java.util.*;

public class IteratorEx1 {
	public static void main(String[] args) {
		HashSet <String> s1= new HashSet();
		s1.add("sai");
		s1.add("balaji");
		s1.add("vijay");
		s1.add("vishnu");
		
		Iterator itr = s1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		itr.remove();
		System.out.println(s1);
	}

}
