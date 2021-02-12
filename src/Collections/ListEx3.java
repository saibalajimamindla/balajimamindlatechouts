package Collections;

import java.util.*;

public class ListEx3 {
	public static void main(String[] args) {
		List<String> l = new ArrayList(); 
		
		l.add("sai");
		l.add("balaji");
		l.add("vamsi");
		l.add("kiran");
		l.add("vishnu");
		
		System.out.println("Printing from iterator ");
		Iterator<String> itr1 = l.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
			System.out.println();
		}
		
		System.out.println("Printing from listiterator----->");
		
		ListIterator<String> itr2 = l.listIterator();
		
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
			System.out.println();
		}
		
System.out.println("Printing from listiterator <-------");
		
		while(itr2.hasPrevious())
		{
			System.out.println(itr2.previous());
			System.out.println();
		}
		
	}

}
