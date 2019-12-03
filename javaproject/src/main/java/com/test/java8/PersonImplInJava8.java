package com.test.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class PersonImplInJava8 {
	
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
		
		Collections.sort(persons, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()) );

		
		
		printConditionally(persons, p -> p.getLastName().startsWith("J"));
		
		printConditionally(persons, p -> p.getFirstName().startsWith("S"));
		
		printConditionally(persons, p -> true);
		
				
	}
	

}

