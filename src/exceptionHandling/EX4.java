package exceptionHandling;

import java.io.IOException;  
class EX4{  
  void m()throws IOException{  
    throw new IOException("device error");  
  }  
  void n()throws IOException{  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){System.out.println("exception handled");}  
  }  
  public static void main(String args[]){  
	  EX4 obj=new EX4();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}  