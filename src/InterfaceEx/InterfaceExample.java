package InterfaceEx;

interface cookable{  
void cook();  
}  

class vamsi implements cookable
{  
	public void cook()
	{
		System.out.println("can cook chicken");
	}  
}  

class kiran implements cookable
{  
	public void cook()
	{
		System.out.println("can cook prawns");
	}  
}  

class kishore implements cookable
{  
	public void cook()
	{
		System.out.println("can cook mutton");
	}  
}  

class pavan implements cookable
{  
	public void cook()
	{
		System.out.println("can cook fish");
	}  
}  

public class InterfaceExample
{  
	public static void main(String args[])
	{  
		cookable c1=new vamsi();
		cookable c2 =new kiran();
		cookable c3=new kishore();
		cookable c4=new pavan();
	
		c1.cook();
		c2.cook();
		c3.cook();
		c4.cook();
	
	}
}  