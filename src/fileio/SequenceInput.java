package fileio;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.SequenceInputStream;

public class SequenceInput {
public static void main(String[] args) throws IOException {
	File f1 = new File("test1.txt");
	f1.createNewFile();
	File f2 = new File("test2.txt");
	f2.createNewFile();
	File f3 = new File("test3.txt");
	f3.createNewFile();
	BufferedOutputStream bf = new BufferedOutputStream(new FileOutputStream(f3)); 
	SequenceInputStream sq = new SequenceInputStream(new FileInputStream(f1), (new FileInputStream(f2)));
	
	int i = sq.read();
			while (i!=-1)
			{
				bf.write(i);
				 i = sq.read();
			}
			bf.close();
			sq.close();
	

}
}
