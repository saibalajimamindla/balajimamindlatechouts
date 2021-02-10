package polymorphy;

class Addition
{
	static long add(long i,long j)
	{
		return i+j;
	}
	
	static char add(char i,char j)
	{
		return (char) (i+j);
	}
	
	static String add(String i,String j)
	{
		return i+j;
	}
	
	static double add(double i,double j)
	{
		return i+j;
	}
}
	
 class Subraction
{
	static long sub(long i,long j)
	{
		return i-j;
	}
	
	static double sub(double i,double j)
	{
		return i-j;
	}
}

public class overloading 
{
	public static void main(String[]args)
	{
		System.out.println(Addition.add(4,2));
		System.out.println(Subraction.sub(1.2,0.5));
	}

}
