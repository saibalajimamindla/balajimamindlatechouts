package lambdaexpressions;

import java.util.Collections;
import java.util.*;

public class Ex4 {
public static void main(String[] args) {
	ArrayList<String> al = new ArrayList();
	al.add("balaji");
	al.add("sai");
	al.add("mamindla");
	
	Collections.sort(al, (n,m)->
	{
		return n.compareTo(m); 
	}
	);
	al.forEach((n)-> 
	{
		System.out.println(n);
	}
			);
}
}
