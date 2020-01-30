package com.test.javaproject;

import java.util.ArrayList;
import java.util.List;

public class CollectionsExamples {

	public static void main(String[] args) {
		Address address1 = new Address("301 SW Anchor", "Bentonville", "AR", 72713);
		Address address2 = new Address("1103 Abbles Dr", "Omaha", "NE", 68154);
		Address address3 = new Address("1224 Franklin Plz", "Kansas", "MO", 56748);
		PersonDetails person1 = new PersonDetails("Vishnu", 29, address1);
		PersonDetails person2 = new PersonDetails("Parkavi", 25, address2);
		PersonDetails person3 = new PersonDetails("Siva", 32, address3);
		
		
		List<Object> persons = new ArrayList<Object>();
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		
		for(Object a: persons) {
			System.out.println(a);
		}
		
	}

}
