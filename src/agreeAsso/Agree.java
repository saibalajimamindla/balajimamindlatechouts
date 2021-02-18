package agreeAsso;

class Adress {
	String area, city, state;

	Adress(String area, String city, String state) {
		this.area=area;
		this.city=city;
		this.state=state;

	}
}


class person {
	
	int id;
	String name;
	Adress a;
	
	person(int id,String name,Adress a)
	{
		this.id=id;
		this.name=name;
		this.a=a;
	}
	
	public void display()
	{
		System.out.println(id+name+a.area+a.city+a.state);
	}
	
}

class Agree
{
	public static void main(String[] args) {
	
		Adress a1= new Adress("gachibowli", "hyd", "tel");
		person p1 = new person(101, "balaji", a1);
		
		p1.display();
	}
}
