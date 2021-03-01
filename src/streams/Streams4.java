package streams;
import java.util.*;
import java.util.stream.Stream;

public class Streams4 {
	public static void main(String[] args) {
		
		List<String> l1 = Arrays.asList("mamindla","balaji","sai","rishikumar","kiranaudi");
		
		Stream<String> allname = l1.stream();
		
	Stream<String> longnames =	allname.filter(str->str.length()>6);
	longnames.forEach(System.out::println);
		
	}

}
