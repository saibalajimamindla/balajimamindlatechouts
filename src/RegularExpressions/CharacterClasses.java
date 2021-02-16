package RegularExpressions;

import java.util.regex.*;

public class CharacterClasses {
	public static void main(String args[]) {
		
		System.out.println(Pattern.matches("[amn]", "a"));
																
		System.out.println(Pattern.matches("[^amn]", "k"));// only a or m or n
															
		System.out.println(Pattern.matches("[a-zA-z]", "a"));// between a to z or A to Z
		
		System.out.println(Pattern.matches("[a-zA-z]", "A"));// between a to z or A to Z
		
		System.out.println(Pattern.matches("[a-d[m-p]]", "a"));// between a to d or m to p
		
		System.out.println(Pattern.matches("[a-z&&[amn]]", "n"));
		
		System.out.println(Pattern.matches("[a-z&&[^amn]]", "n"));
		
		System.out.println(Pattern.matches("[a-z&&[^mnop]]", "n"));
	}
}
