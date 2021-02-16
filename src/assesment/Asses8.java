package assesment;

import java.util.Iterator;
import java.util.TreeSet;

public class Asses8 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add("CAPTAINAMERICA");
		ts.add("captainamerica");
		ts.add("Ironman");
		ts.add("ironman");
		ts.add("iRonman");
		Iterator itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
