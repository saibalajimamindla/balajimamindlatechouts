package AbstractEx;

abstract class Bike{  
	   Bike(){System.out.println("bike is created");}  
	   abstract void run();  
	   void changeGear(){System.out.println("gear changed");}  
	 }  

	 class Honda extends Bike{  
	 void run(){System.out.println("running safely..");}  
	 }  
	
	 class Hero extends Bike{  
		 void run(){System.out.println("damaged..");}  
		 }  
	 class AbstractExample{  
	 public static void main(String args[]){  
	  Bike obj = new Honda();
	  Bike obj1 = new Hero();
	  obj.run();  
	  obj.changeGear(); 
	  obj1.run();  
	   
	 }  
	}  
