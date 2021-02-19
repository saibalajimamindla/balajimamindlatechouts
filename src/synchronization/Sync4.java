package synchronization;

class tabling{  
	  
	 synchronized static void printTable(int n){  
	   for(int i=1;i<=10;i++){  
	     System.out.println(n*i);  
	     try{  
	       Thread.sleep(400);  
	     }catch(Exception e){}  
	   }  
	 }  
	}  
	  
	class tab1 extends Thread{  
	public void run(){  
		tabling.printTable(1);  
	}  
	}  
	  
	class tab2 extends Thread{  
	public void run(){  
		tabling.printTable(10);  
	}  
	}  
	  
	class tab3 extends Thread{  
	public void run(){  
		tabling.printTable(100);  
	}  
	}  
	  
	  
	  
	  
	class tab4 extends Thread{  
	public void run(){  
		tabling.printTable(1000);  
	}  
	}  
	  
	public class Sync4{  
	public static void main(String t[]){  
	tab1 t1=new tab1();  
	tab2 t2=new tab2();  
	tab3 t3=new tab3();  
	tab4 t4=new tab4();  
	t1.start();  
	t2.start();  
	t3.start();  
	t4.start();  
	}  
	}  
