package com.test.java8;

import java.util.stream.*;

public class StreamsTest {

	public static void main(String[] args) {
		Stream.iterate(1, a->a+1).filter(a-> a%2!=0).limit(10).forEach(a->System.out.println(a));
		Stream.iterate(10, a->a+1).filter(a-> a%2==0).limit(10).forEach(System.out::println);
		
		
	}

}
