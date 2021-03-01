package streams;

import java.util.stream.*;
import java.util.*;

public class Stream3 {
	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList();
		al1.add("balaji");
		al1.add("sai");
		al1.add("mamindla");
		al1.add("rishikumar");
		al1.add("kiranaudi");
		ArrayList<String> al2 = new ArrayList();
		al2.add("balaji");
		al2.add("sai");
		al2.add("mamindla");
		al2.add("rishikumar");
		al2.add("kiranaudi");
		Stream output = Stream.concat(al1.stream(), al2.stream());
		output.forEach(System.out::println);
	}

}
