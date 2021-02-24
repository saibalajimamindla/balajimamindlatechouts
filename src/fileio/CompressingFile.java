package fileio;

import java.io.FileInputStream; 
import java.io.FileOutputStream; 
import java.io.IOException; 
import java.util.zip.GZIPOutputStream; 
  
public class CompressingFile 
{ 
    static void compress() 
    { 
        byte[] buffer = new byte[1024]; 
        try
        { 
            GZIPOutputStream os =  
                    new GZIPOutputStream(new FileOutputStream("C:\\Users\\d1\\Documents\\balaji\\training\\compress.gz")); 
                      
            FileInputStream in = 
                    new FileInputStream("C:\\Users\\d1\\Documents\\balaji\\training\\compress.java"); 
              
            int totalSize; 
            while((totalSize = in.read(buffer)) > 0 ) 
            { 
                os.write(buffer, 0, totalSize); 
            } 
              
            in.close(); 
            os.finish(); 
            os.close(); 
              
            System.out.println("File Successfully compressed"); 
        } 
        catch (IOException e) 
        { 
            e.printStackTrace(); 
        } 
          
    } 
      
    public static void main (String[] args) 
    { 
        compress(); 
          
    } 
} 
