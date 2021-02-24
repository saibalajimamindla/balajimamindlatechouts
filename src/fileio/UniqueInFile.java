package fileio;

import java.io.*;

public class UniqueInFile {
	public static void main(String[] args) throws IOException {
		File f = new File("phone3.txt");
		PrintWriter pr = new PrintWriter(f);
		BufferedReader br = new BufferedReader(new FileReader("phone1.txt"));
		String s = br.readLine();
		while (s != null) {
			boolean avail = false;
			BufferedReader br1 = new BufferedReader(new FileReader("phone2.txt"));
			String Target = br1.readLine();
			while (Target != null) {
				if (s.equals(Target)) {
					avail = true;
					break;
				}
				Target = br1.readLine();
			}
			if (avail != true) {
				pr.println(s);
				System.out.println(s);
			}
			s = br.readLine();
			br1.close();
		}
		br.close();
		pr.close();

	}

}
