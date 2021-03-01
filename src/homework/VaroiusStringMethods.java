package homework;

public class VaroiusStringMethods {
	public static void main(String args[]) {
		System.out.println("\n" + "array to string" + "\n");

		char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
		String helloString = new String(helloArray);
		System.out.println(helloString);

		System.out.println("\n" + "String length" + "\n");

		String palindrome = "Dot saw I was Tod";
		int len = palindrome.length();
		System.out.println("String Length is : " + len);

		System.out.println("\n" + " concatinating strings" + "\n");

		String string1 = "saw I was ";
		System.out.println("Dot " + string1 + "Tod");

		System.out.println("\n" + "String format writing" + "\n");

		String fs;
		fs = String.format("The value of the float variable is " + "%f, while the value of the integer "
				+ "variable is %d, and the string " + "is %s", 10.0, 23, "Techouts");
		System.out.println(fs);

		System.out.println("\n" + "String comparision" + "\n");
		
		String first = "balaji techouts";
		String second = "balaji techouts";
		String third = "techouts balaji";

		boolean result1 = first.equals(second);
		System.out.println("Strings first and second are equal: " + result1);

		boolean result2 = first.equals(third);
		System.out.println("Strings first and third are equal: " + result2);
		
		
		System.out.println("\n" + "String is empty or not" + "\n");
		String name=""; 
		String name1="balaji"; 
		System.out.println(name.isEmpty());     
		System.out.println(name1.isEmpty());    
		
		System.out.println("\n" + "trim in string" + "\n");
		String hello="  hello   ";  
		System.out.println(hello+"how are you");        // without trim()  
		System.out.println(hello.trim()+"how are you"); // with trim() 
	}

}
