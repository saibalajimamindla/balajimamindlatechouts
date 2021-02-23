package fileio;

import java.util.*;
import java.io.*;

public class FileHandling {
	public static void main(String[] args) throws IOException {
		int i=0;
		StringBuffer sb = new StringBuffer("C:\\Users\\d1\\Desktop\\");
		StringBuffer sb1 = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the file to be created ");
		String name = sc.next();
		sb.append(name);
		sb1.append(name);
		sb.append(".txt");
		sb1.append(".txt");
		String file = sb1.toString();
		String fi = sb.toString();
		// ctreating a file
		File f = new File(fi);
		try {
			boolean b = f.createNewFile();
			if (b) {
				System.out.println("file created");
				System.out.println("Executable: " + f.canExecute());
				System.out.println("Readable: " + f.canRead());
				System.out.println("Writable: " + f.canWrite());

				while (i<10) {
					System.out.println("\n"+"press " + "\n" + " 1) to write " + "\n" + "2)to read " + "\n" + "3)to delete "
							+ "\n" + "4)to exit ");
					int in = sc.nextInt();
					switch (in) {
					case 1:
						try {
							Writer wr = new FileWriter(fi);
							System.out.println("enter the data to be written in the file");
							String wri = sc.next();
							wr.write(wri);
							wr.close();
							System.out.println("Done");
							System.out.println("data written in t the file" + file);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
						break;
					case 2:
						 try {  
					            Reader reader = new FileReader(fi);  
					            int data = reader.read();  
					            while (data != -1) {  
					                System.out.print((char) data);  
					                data = reader.read();  
					            }  
					            reader.close();  
					        } catch (Exception ex) {  
					            System.out.println(ex.getMessage());  
					        }  

						break;
					case 3:
						f.delete();
						System.out.println("file deleted");
						System.exit(0);
						break;
					case 4:
						System.exit(0);
						break;

					}

				}

			} else {
				System.out.println("File not created");
			}

		} catch (

		IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			// f.delete();
		}

	}
}