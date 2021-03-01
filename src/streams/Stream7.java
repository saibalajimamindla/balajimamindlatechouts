package streams;

import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;

class Student {
	int id;
	String name;
	int age;

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
}

public class Stream7 {
	public static void main(String[] args) {
		List<Student> studentlist = new ArrayList<Student>();

		studentlist.add(new Student(11, "Jon", 22));
		studentlist.add(new Student(22, "Steve", 18));
		studentlist.add(new Student(33, "Lucy", 22));
		studentlist.add(new Student(44, "Sansa", 23));
		studentlist.add(new Student(55, "Maggie", 18));

		Double avgAge = studentlist.stream().collect(Collectors.averagingInt(s -> s.age));
		System.out.println("Average Age of Students is: " + avgAge);
	}
}