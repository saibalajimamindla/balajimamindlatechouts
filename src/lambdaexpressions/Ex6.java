package lambdaexpressions;

import java.util.HashMap;

public class Ex6 {
	public static void main(String[] args) {
		HashMap hs = new HashMap();
		hs.put(1, "balaji");
		hs.put(2,"mamindla");
		
		hs.forEach((n,k)->{
			System.out.print(n+" ");
			System.out.print(k+"\n");
		}
		);
	}

}