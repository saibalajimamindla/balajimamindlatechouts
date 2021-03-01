package streams;

import java.util.*;

public class Streams1 {
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList();
		al.add("balaji");
		al.add("sai");
		al.add("mamindla");
		al.add("rishikumar");
		al.add("kiranaudi");
		
	long count = al.stream().filter(str->str.length()>=6).filter(str->str.length()>8).count();
	System.out.println(count);
		
	}

}
