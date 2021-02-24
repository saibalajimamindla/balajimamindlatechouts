package fileio;

import java.io.File; 
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths; 
  
public class HiddenorNot 
{ 
  public static void main(String[] args) 
         throws IOException, SecurityException 
  { 
    File file = new File("phone1.txt"); 
  
    if (file.isHidden()) 
      System.out.println("The specified file is hidden"); 
    else
      System.out.println("The specified file is not hidden"); 
    
    Path path = Paths.get("phone1.txt");
    Files.setAttribute(path, "dos:hidden", true, LinkOption.NOFOLLOW_LINKS);
    if (file.isHidden()) 
        System.out.println("The specified file is hidden"); 
      else
        System.out.println("The specified file is not hidden");
  } 
} 
