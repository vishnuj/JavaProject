package com.test.javaproject;

public class Greeter {

	void greeting(Greeting greeting) {
		greeting.greeting();
	}
	
	public static void main(String[] args) {
		Greeter greet = new Greeter();
		GreetingImpl impl = new GreetingImpl();
		GreetingImpl2 impl2 = new GreetingImpl2();
		impl.greeting();
		greet.greeting(impl);
		greet.greeting(impl2);
		
		Greeting lambdaGreeting = () -> System.out.println ("Hello using lambda");
		lambdaGreeting.greeting();
		

	}

}
