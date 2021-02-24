package fileio;

import java.io.*;
import java.text.*;

public class LastModTime {
	public static void main(String[] args) {

		File f = new File("phone1.txt");
		long time = f.lastModified();
		DateFormat sdf = new SimpleDateFormat("MMMM dd, yyyy hh:mm a"); 
		System.out.println(sdf.format(time));
	}

}
