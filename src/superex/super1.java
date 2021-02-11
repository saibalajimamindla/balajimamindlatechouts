package superex;

class Person
{
	int id;
	String name;
	String department;
	Person(int id,String name,String department)
	{
		this.id=id;
		this.name=name;
		this.department=department;
	}
}

class Salary extends Person
{
	double sal;
	Salary(int id,String name,String department,double salary)
	{
		super(id,name,department);
		this.sal=salary;
		
	}
}

class Employee extends Salary
{
	String language;
	Employee(int id, String name, String department, double salary,String language) 
	{
		super(id, name, department, salary);
		this.language=language;
		
	}
	void display()
	{
		System.out.println(id+" "+ name+" "+ department +" "+sal+" "+language);
	}
	
}

public class super1
{
	public static void main(String[]args)
	{
		Employee e1 = new Employee(1,"sai","java",25000.0,"english");
		Employee e2 = new Employee(2,"poorna","java",25000.0,"telugu");
		Employee e3 = new Employee(3,"vishnu","java",25000.0,"tamil");
		e1.display();
		e2.display();
		e3.display();
	}

}
