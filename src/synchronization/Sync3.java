package synchronization;

class Tab{  
	  
	 void printTable(int n){  
	   synchronized(this){
	     for(int i=1;i<=5;i++){  
	      System.out.println(n*i);  
	      try{  
	       Thread.sleep(400);  
	      }catch(Exception e){System.out.println(e);}  
	     }  
	   }  
	 } 
	}  
	  
	class MyThread1 extends Thread{  
		Tab t;  
	MyThread1(Tab t){  
	this.t=t;  
	}  
	public void run(){  
	t.printTable(5);  
	}  
	  
	}  
	class MyThread2 extends Thread{  
		Tab t;  
	MyThread2(Tab t){  
	this.t=t;  
	}  
	public void run(){  
	t.printTable(100);  
	}  
	}  
	  
	public class Sync3{  
	public static void main(String args[]){  
		Tab obj = new Tab(); 
	MyThread1 t1=new MyThread1(obj);  
	MyThread2 t2=new MyThread2(obj);  
	t1.start();  
	t2.start();  
	}  
	}  