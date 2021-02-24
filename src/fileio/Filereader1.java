package fileio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filereader1 {
	public static void main(String[] args) throws IOException {
		File f = new File("abc.txt");
		FileWriter fw = new FileWriter(f);
		fw.write("sai balaji ");
		fw.write(" mamindla");
		fw.flush();
		fw.close();
		FileReader fr = new FileReader(f);
		char [] ch = new char[(int)f.length()];
		fr.read(ch);
		for(char ch1 : ch)
		{
			System.out.print(ch1);
		}
		fr.close();
	}
}
      