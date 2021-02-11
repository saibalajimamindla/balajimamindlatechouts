package exceptionHandling;


class Ex2{  
	  void m(){  
	  int i = 51/0;
	  }  
	  void n(){ 
		 m();  
	  }
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handled in p");}  
	  }  
	  public static void main(String args[]){  
		  Ex2 obj=new Ex2();  
	   obj.p();  
	   System.out.println("normal flow...");  
	  }  
	}  
