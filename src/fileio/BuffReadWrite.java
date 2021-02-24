package fileio;

import java.io.*;

public class BuffReadWrite {
	public static void main(String[] args) throws IOException {
		File f = new File("file3.txt");
		PrintWriter pw = new PrintWriter(f);
		BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
		String s = br.readLine();
		while (s != null) {
			pw.println(s);
			s = br.readLine();
		}
		br = new BufferedReader(new FileReader("file2.txt"));
		s = br.readLine();
		while (s != null) {
			pw.println(s);
			s = br.readLine();
		}
		br.close();
		pw.close();
	}

}
