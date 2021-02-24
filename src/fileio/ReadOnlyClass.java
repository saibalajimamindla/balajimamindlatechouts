package fileio;

import java.io.File;
import java.io.IOException;

public class ReadOnlyClass {
	public static void main(String[] args) throws IOException {
		 File f = new File("read.txt");
				 f.createNewFile();
				 
				 f.setReadOnly();
				 System.out.println(f.canWrite());
	}

}
