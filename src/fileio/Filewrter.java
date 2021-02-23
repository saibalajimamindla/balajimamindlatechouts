package fileio;
import java.nio.file.*;
import java.io.*;

public class Filewrter {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\d1\\Desktop\\datas.txt",true);
		fw.write("sai balaji ");
		fw.write(" mamindla");
		fw.flush();
		fw.close();
	}

}
