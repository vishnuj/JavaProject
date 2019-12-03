package com.test.java8;

public class TestLambda {

	public static void main(String[] args) {
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
		
	}

}
