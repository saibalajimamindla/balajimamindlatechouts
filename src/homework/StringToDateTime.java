package homework;
import java.time.LocalDateTime;

public class StringToDateTime {
	public static void main(String[] args) {
		System.out.print(" conversion of string to datetime: ");
		LocalDateTime now = LocalDateTime.now();
		String string = String.valueOf(now);
		LocalDateTime date = LocalDateTime.parse(string);
		System.out.println(date);

	}

}
