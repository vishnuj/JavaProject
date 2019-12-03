package com.test.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class PersonImplInJava7 {
	
	public static void printAll(List<Person> persons) {
		for(Person p: persons) {
			System.out.println(p);
		}
	}
	
	public static void printAllLastnameWithJ(List<Person> persons) {
		for(Person p: persons) {
			if(p.getLastName().startsWith("J") || p.getLastName().startsWith("j")) {
				System.out.println(p);
			}
			
		}
	}
	
	public static void printConditionally(List<Person> persons, Condition condition) {
		for (Person p: persons) {
			if(condition.test(p)) {
				System.out.println(p);
			}
		}
	}

	public static void main(String[] args) {
		Person person = new Person("Vishnu", "Jaganathan",30);
		//System.out.println(person.toString());
		
		List<Person> persons = Arrays.asList(
				new Person("Vishnu", "Jaganathan",30),
				new Person("Ram", "Kumar",20),
				new Person("Siva", "Kanagarajan",32),
				new Person("Karthik", "Ragunath",23),
				new Person("Kannan", "jaganathan",33)
				);
		
		Collections.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
			
		});
		
		//printAll(persons);
		//printAllLastnameWithJ(persons);
		
		printConditionally(persons,new Condition() {

			@Override
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return p.getFirstName().startsWith("K");
			}
			
		});
		
		printConditionally(persons,new Condition() {

			@Override
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return p.getLastName().startsWith("J");
			}
			
		});
		
	}
	

}

interface Condition{
	boolean test(Person p);
}

