package fileio;

import java.io.*;
public class CreatingFile {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\d1\\Desktop\\data.txt");
		try
		{
		 file.createNewFile();
//		if(result)
//		{
//			System.out.println("File is created");
//		}else
//		{
//			System.out.println("File already exists");
//		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
