package homework;

public class SequenceOfString {
	
	public static void main(String[] args) {
		
		String string1 = "MYHOMEISJEWEL";
		StringBuilder sb = new StringBuilder();
		sb=sb.append(string1.subSequence(8, 13));
		sb=sb.append(string1.subSequence(6, 8));
		sb=sb.append(string1.subSequence(0, 2));
		sb=sb.append(string1.subSequence(2, 6));
		System.out.println(sb+"\n");
		
		
		String string2 = "MyEmployerIsTechouts";
		StringBuilder sb1 = new StringBuilder();
		sb1=sb1.append(string2.subSequence(12,20));
		sb1=sb1.append(string2.subSequence(10,12));
		sb1=sb1.append(string2.subSequence(0,2));
		sb1=sb1.append(string2.subSequence(2,10));
		System.out.println(sb1+"\n");
		
	}

}
