package com.test.java8;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LambdaUsingCollections {

	public static void main(String[] args) {
		
		List<String> tempList = new LinkedList<String>();
		tempList.add("Vishnu");
		tempList.add("Tamil");
		tempList.add("Kannan");
		tempList.add("Kumar");
		tempList.forEach(n -> System.out.println(n));
		System.out.println(" ");
		Iterator<String> itr = tempList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(" ");
		for(String a: tempList) {
			System.out.println(a);
		}
		
		Collections.sort(tempList);
		System.out.println(" ");
		tempList.forEach(n -> System.out.println(n));
		
		Collections.sort(tempList, Comparator.reverseOrder());
		System.out.println(" ");
		tempList.forEach(n -> System.out.println(n));
		
	}

}
