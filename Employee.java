package contructors;

class Data
{
	int id;
	String name;
	String department;
	double experiance;
	Data(int i,String j,String k,double l)
	{
	  this.id = i;
	  this.name = j;
	  this.department =k;
	  this.experiance= l;
	}
	
	 void display()
	{
		System.out.println(id+" "+name+" "+department+" "+experiance);
	}
}

public class Employee
{
	int id;
	String name;
	String department;
	double experiance;
	
	Employee()
	{
		id=10;
		name="sai";
		department = "c#";
		experiance = 2.5;
	}
	public static void main(String []args)
	{
		
		
		Data d1 = new Data(122,"saibalaji","java",1.2);
		Employee e1 = new Employee();
		System.out.println(e1.id+" "+e1.name+" "+e1.department+" "+e1.experiance);
		d1.display();
	}
}