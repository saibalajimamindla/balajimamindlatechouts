package accessmodifers;

import staticprac.*;

public class ProtectedEx extends Ref {
	public static void main(String []args)
	{
		ProtectedEx r1 = new ProtectedEx();
	System.out.println(r1.id);
	System.out.println(r1.name);
	r1.display();
	}

}