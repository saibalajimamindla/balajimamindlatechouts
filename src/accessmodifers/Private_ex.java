package accessmodifers;

class A
{  
	private int data=40;  
		public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	} 
}
public class Private_ex
{
	public static void main(String[]args)
	{
		A a1= new A();
		System.out.println(a1.getData());
	}
}

