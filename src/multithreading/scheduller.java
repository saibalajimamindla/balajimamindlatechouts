package multithreading;

class A extends Thread
{ 
int i=0;
public void run()
{
System.out.println("Thread A started"); 
while(i<4)
{
System.out.println("\t value of i in Thread A:"+i); 
i++;                 
}                       
System.out.println("ThreadA finished");         
} 
} 
class B extends Thread
{
public void run()
{int i=0;
System.out.println("ThreadB started"); 
while(i<4)
{
System.out.println("\t value of i in Thread B:"+i);    
i++;
}
System.out.println("ThreadB finished");
} 
}  
class C extends Thread
{
public void run()
{
int i=0; 
System.out.println("ThreadC started");
while(i<4)
{
System.out.println("\t value of i in Thread C"+i);
i++;
} 
System.out.println("ThreadC finished");
}
}
public class scheduller { 
public static void main(String[] args) {             
System.out.println("Main Thread started");              
A a=new A();
B b=new B();
C c=new C(); 

Thread th=Thread.currentThread();
System.out.println(th.getName());
th.setPriority(Thread.MAX_PRIORITY);

a.setPriority(8);
b.setPriority(9);
c.setPriority(10); 
a.start();

b.start();

c.start();
}
} 