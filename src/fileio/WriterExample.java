package fileio;

import java.io.*;  
public class WriterExample {  
    public static void main(String[] args) {  
        try {  
            Writer w = new FileWriter("C:\\Users\\d1\\Desktop\\datas.txt");  
            String content = "I love my country";  
           
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
}  
