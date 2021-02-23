import java.io.*;

public class ReaderExample {
	public static void main(String[] args) throws IOException {
		File f = new File("abc.txt");
		FileWriter fw = new FileWriter(f);
		fw.write("sai balaji ");
		fw.write(" mamindla");
		fw.flush();
		fw.close();
		FileReader fr = new FileReader(f);
		int i = fr.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i=fr.read();
		}
		fr.close();
	}
}
