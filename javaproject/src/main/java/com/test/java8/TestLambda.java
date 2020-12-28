package com.test.java8;

import java.util.ArrayList;
import java.util.List;

public class TestLambda {

	public static void main(String[] args) {
		String input = "2020-05-01";
		String[] dateArray = input.split("-");
		String date = dateArray[1] + "/" + dateArray[2] + "/" + dateArray[0];
		System.out.println(date);

	}

	void testFunction(){
		Greeting lambdaGreeting = () -> System.out.println ("Hello using lambda");
		lambdaGreeting.greeting();

		Greeting annonymousGreeting = new Greeting() {
			public void greeting() {
				System.out.println ("Anonymous greeting");
			}
		};

		annonymousGreeting.greeting();

		AdditionInterface getAddition = (int a, int b) -> a + b;
		System.out.println(getAddition.add(10, 20));

		AdditionInterface1 sayString = new AdditionInterface1() {

			@Override
			public String say(String a) {
				// TODO Auto-generated method stub
				return a;
			}
		};

		System.out.println(sayString.say("Whatever you want"));

		AdditionInterface1 sayStringWithLambda = a -> "Hello "+a;
		System.out.println(sayStringWithLambda.say("say using lambda"));

		String test = "1234567";
		System.out.println(test.replace(""," "));
	}



}
