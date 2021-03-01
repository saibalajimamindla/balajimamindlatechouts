package streams;
import java.util.*;
import java.util.stream.*;

public class Stream6 {
	public static void main(String[] args) {
		
	List l = 	Stream.iterate(1,count->count+1).map(n->n*n).limit(10).collect(Collectors.toList());
	
	l.forEach(System.out::println);
	}

}
