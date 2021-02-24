package methodreference;
interface sad
{
void saddy();	
}

public class InstanceReference {
	
	void sadding()
	{
		System.out.println("The boy is sad");
	}
public static void main(String[] args) {
	
	sad s = new InstanceReference()::sadding;
	
	s.saddy();
	
}
}
