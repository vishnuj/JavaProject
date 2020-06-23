package com.test.javaproject;

public class ArrayExercise {

	public static void main(String[] args) {
		String[] names = {"Vishnu","Ram","Shiv","Kotis"};
		
		int i;
		int j = names.length - 1;
		String temp;
		for(i =0; i <= (names.length -1) / 2 ; i++) {
			
			temp = names[i];
			names[i] = names[j];
			names[j] = temp;
			j--;
		}
		
		for (String name: names) {
			System.out.println(name);
		}
	}

}
