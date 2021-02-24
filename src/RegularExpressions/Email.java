package RegularExpressions;
import java.util.regex.*;
public class Email {
	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("[a-zA-Z]+[a-zA-z0-9]*{0,}+[@]{1}+[a-zA-Z]{0,}+[.]{1}+[cCoOmM]{3}+","saibalaji@gmail.com"));
		
	}

}
