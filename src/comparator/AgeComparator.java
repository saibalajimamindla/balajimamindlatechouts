package comparator;

import java.util.*;

class AgeComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Student sa = (Student) o1;
		Student sb = (Student) o2;

		if (sa.age==sb.age)
			return 0;
		else if (sa.age > sb.age)
			return 1;
		else
			return -1;
	}
}
