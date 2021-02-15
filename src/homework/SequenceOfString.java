package homework;

public class SequenceOfString {
	
	public static void main(String[] args) {
		
		String str = "MYHOMEISJEWEL";
		StringBuilder sb = new StringBuilder();
		sb=sb.append(str.subSequence(8, 13));
		sb=sb.append(str.subSequence(6, 8));
		sb=sb.append(str.subSequence(0, 2));
		sb=sb.append(str.subSequence(2, 6));
		System.out.println(sb);
		
	}

}
