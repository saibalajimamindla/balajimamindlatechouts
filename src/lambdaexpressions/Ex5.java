package lambdaexpressions;

import java.util.*;

public class Ex5 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("balaji");
		hs.add("maindla");
		
		hs.forEach((n)->
		{
		System.out.println(n);	
		}
		);
	}

}
