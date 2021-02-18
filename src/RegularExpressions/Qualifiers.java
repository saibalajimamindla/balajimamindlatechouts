package RegularExpressions;

import java.util.regex.Pattern;

public class Qualifiers {
	public static void main(String[] args) {

		System.out.println(Pattern.matches("[amn]?", "a"));
		
		System.out.println(Pattern.matches("[amn]?", "aaa"));
		
		System.out.println(Pattern.matches("[amn]?", "aammmnn"));
		
		System.out.println(Pattern.matches("[amn]?", "aazzta"));
		
		System.out.println(Pattern.matches("[amn]?", "am"));
		
		System.out.println(Pattern.matches("[amn]+", "a"));
		
		System.out.println(Pattern.matches("[amn]+", "aaa"));
		
		System.out.println(Pattern.matches("[amn]+", "aammmnn"));
		
		System.out.println(Pattern.matches("[amn]+", "aazzta"));

	}

}
