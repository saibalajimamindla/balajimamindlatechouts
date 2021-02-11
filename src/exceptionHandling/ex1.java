 package exceptionHandling;

public class ex1{  
	  
    public static void main(String[] args) {  
        try  
        {  
        int i=21;
        int j=0;
        int k=i/j;
        }
          
        catch(ArrayIndexOutOfBoundsException e)  
        {  
            System.out.println("Enterd index is not avilable");  
        } 
        
        catch(ArithmeticException f)  
        {  
            throw new ArithmeticException(" division by zero"); 
        } 
        
        finally
        {
        System.out.println("finally blockis executed");  
   
        } 
        
        }
      
}  
