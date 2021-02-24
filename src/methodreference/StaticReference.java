package methodreference;


interface sa
{
	void say();
}

public class StaticReference {
	
	static void saysomething()
	{
		System.out.println("Static method refernce is working");
	}
	public static void main(String[] args) {
		
		sa s = StaticReference :: saysomething;
		
		s.say();
	
		
	}

}
