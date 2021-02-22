package stringjoiner;
import java.util.*;

public class Example1 {
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner("[",":","]");
		
		sj.add("Rahul");  
		sj.add("Raju");  
		sj.add("Peter");  
		sj.add("Raheem");  
		System.out.println(sj);
	}

}
