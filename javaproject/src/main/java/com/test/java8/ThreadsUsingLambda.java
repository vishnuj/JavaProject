package com.test.java8;

public class ThreadsUsingLambda {

	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				for (int i=0; i<=10; i++) {
		//			System.out.println(i);
				}
				
			}
		};
		
		System.out.println("Starting Runnable");
		r1.run();
		
		Thread t1 = new Thread(r1);
		System.out.println("Starting Thread");
		t1.start();
		
		Thread t2 = new Thread(t1);
		System.out.println("Starting Thread again t1");
		t2.start();

		Thread t3 = new Thread(r1);
		System.out.println("Starting Thread again r1");
		t3.start();
		
		Runnable r2 = () -> {
			for (int j=0; j<=5; j++) {
				System.out.println(j);
			}
		};

		r2.run();
	}

}
