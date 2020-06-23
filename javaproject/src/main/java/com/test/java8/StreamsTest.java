package com.test.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.Iterator;

public class StreamsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(10,20,30,40,50);
	
		/*
		for (Integer i: values) {
			System.out.println(i);
		}
		
		Iterator<Integer> itr = values.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		values.forEach(System.out::println);  //using Method Reference
		
		*/
		
		
		
		//values.stream().filter(i -> i > 20).forEach(System.out::println);
		
		//Integer k = values.stream().map(i -> i * 2).reduce(0, (i,j) -> i + j);
		//System.out.println(k);
		
		
		
	}

}
