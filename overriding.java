package polymorphy;

class family
{
  double height()
  {
	  return 0;
  }
}
  
class son extends family
{
  double height()
  {
  	 return 5.9;
  }
  
}

class daughter extends family
{
  double height()
  {
  	 return 5.2;
  }
  
}

class mother extends family
{
  double height()
  {
  	 return 5.5;
  }
  
}

class father extends family
{
  double height()
  {
  	 return 6.0;
  }
  
}

public class overriding
{
	public static void main(String []args)
	{
		son s = new son();
		daughter d = new daughter();
		father f = new father();
		mother m = new mother();
		
		System.out.println(s.height());
		System.out.println(d.height());
		System.out.println(f.height());
		System.out.println(m.height());
	}
}


