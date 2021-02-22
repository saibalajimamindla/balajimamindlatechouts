package wrapperclasses;
class Techouts
{
	String  name;
	int id;
	public Techouts(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public String toString()
	{
		return String.format(name+" "+id);
	}
}
public class OvridToString {
	public static void main(String[] args) {
		Techouts t1 = new Techouts("balaji",1554);
		System.out.println(t1);
	}

}
