package com.training;

public class Employee {
	int id;
	String department;
	Adress adress;
	Employee(int id,String department,Adress adress)
	{
		this.id=id;
		this.department=department;
		this.adress = adress;
	}
	void display()
	{
		System.out.print(id+" "+department);
		System.out.print(" "+adress.city+" "+adress.country+" "+adress.continent);
	}
	public static void main(String[]args)
	{
		Adress A1 = new Adress("hyderabad","india","asia");
		Employee E1 = new Employee(124,"software",A1);
		E1.display();
	}   

}
