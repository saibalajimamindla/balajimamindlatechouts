package fileio;

import java.io.FileInputStream; 
import java.io.FileOutputStream; 
import java.io.IOException; 
import java.util.zip.GZIPInputStream; 
  
class DecompressingFile 
{ 
    static void decompress() 
    { 
        byte[] buffer = new byte[1024]; 
        try
        { 
            GZIPInputStream is =  
                    new GZIPInputStream(new FileInputStream("C:\\Users\\d1\\Documents\\balaji\\training\\compress.gz")); 
                      
            FileOutputStream out = 
                    new FileOutputStream("C:\\Users\\d1\\Documents\\balaji\\training\\compress.java"); 
              
            int totalSize; 
            while((totalSize = is.read(buffer)) > 0 ) 
            { 
                out.write(buffer, 0, totalSize); 
            } 
              
            out.close(); 
            is.close(); 
              
            System.out.println("File Successfully decompressed"); 
        } 
        catch (IOException e) 
        { 
            e.printStackTrace(); 
        } 
          
    } 
      
    public static void main (String[] args) 
    { 
        decompress(); 
          
    } 
} 