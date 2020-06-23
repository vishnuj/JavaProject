package com.test.javaproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {
	String name;
	int age;
	int salary;
	
	public ComparatorExample(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "ComparatorExample [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		ComparatorExample one = new ComparatorExample("Vishnu", 30, 1000);
		ComparatorExample two = new ComparatorExample("Tamil", 29, 2000);
		ComparatorExample three = new ComparatorExample("Paru", 28, 3000);
		
		List<ComparatorExample> list1 = new ArrayList<ComparatorExample>();
		list1.add(one);
		list1.add(two);
		list1.add(three);
		
		Collections.sort(list1, (c1, c2) -> ((Integer)c2.age).compareTo((Integer)c1.age));
		list1.forEach((a) -> System.out.println(a));
	}

}
