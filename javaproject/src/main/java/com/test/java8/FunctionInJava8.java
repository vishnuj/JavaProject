package com.test.java8;

import java.util.function.Function;

public class FunctionInJava8 {

	String upperCaseWithoutJava8(String text) {
		return text.toUpperCase();
	}
	
	public static void main(String[] args) {
		
		Function<String, String> upperCase = a -> a.toUpperCase();
		System.out.println("Using java 8 " + upperCase.apply("Vishnu"));
		
		FunctionInJava8 funRef = new FunctionInJava8();
		System.out.println("Without Java 8 " + funRef.upperCaseWithoutJava8("Nakul"));

	}

}
