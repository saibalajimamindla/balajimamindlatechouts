package homework;

import java.time.LocalDateTime;

public class DateTimeToString {
	public static void main(String[] args) {
		System.out.print(" conversion of datetime to string :");
		LocalDateTime now = LocalDateTime.now();

		String string = String.valueOf(now);
		System.out.println(string);

	}

}
