package homework;

public class DiffBetwenStringBuffAndBUild {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Java");
		for (int i = 0; i < 10000; i++) {
			sb.append("Techouts");
		}
		System.out.println("Time taken by StringBuffer is : " + (System.currentTimeMillis() - startTime) + "ms");
		startTime = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("Java");
		for (int i = 0; i < 10000; i++) {
			sb2.append("Techouts");
		}
		System.out.println("Time taken by StringBuilder  : " + (System.currentTimeMillis() - startTime) + "ms");
	} 
}