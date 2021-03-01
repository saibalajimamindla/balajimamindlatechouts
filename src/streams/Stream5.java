package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
public class Stream5 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("mamindla","balaji","sai","rishikumar","kiranaudi");
   List<String> longnames = names.stream().filter(name->name.length()>=6).collect(Collectors.toList());
	longnames.forEach(System.out::println);
	}

}
