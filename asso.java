package association;

import java.io.*; 

class Company  
{ 
 private String name; 
   
 Company(String name) 
 { 
     this.name = name; 
 } 
   
 public String getcompName() 
 { 
     return this.name; 
 } 
}  
 
class Employee 
{ 
 private String name; 
   
 Employee(String name)  
 { 
     this.name = name; 
 } 
   
 public String getEmployeeName() 
 { 
     return this.name; 
 }  
} 

class asso  
{ 
 public static void main (String[] args)  
 { 
	 Company comp = new Company("Techouts"); 
     Employee emp = new Employee("Balaji"); 
       
     System.out.println(emp.getEmployeeName() +  
            " is employee of " + comp.getcompName()); 
 } 
} 