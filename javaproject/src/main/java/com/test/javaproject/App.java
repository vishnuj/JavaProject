package com.test.javaproject;

import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	
	void patter0sAnd1s() {
		/* Program to print below
		   1
		   0 1
		   1 0 1
		   0 1 0 1
		   1 0 1 0 1
		 */
		int i;
		int j;
		int k = 0;
		for(i=1; i<=10; i++) {			
			for(j=1; j<=i; j++) {
				//System.out.println(i + " "+j);
				/*
				  if((i + j) % 2 == 0) {
					System.out.print("1 ");	
				} else {
					System.out.print("0 ");
				}
				 */
				  System.out.print(i +" ");
			}
			System.out.println("");
		}
	}
	
	void printFibonociSeries() {
		int i = 1;
		int b = 0;
		int c;
		int limit = 100;
		for(int j=0; i<=limit;j++) {			
			c = b + i;
			b = i;
			i = c;			
			System.out.println(c + " ");	
		}
		
	}
	
	/*
	   void checkIfPalindromeOrNot(String number){
	 
		String initial = number;
		String other;		
	}
	*/
	public static void printReverseOfList(List<String> temp) {
		System.out.println("Initial :: "+temp);
		if(temp == null || temp.size() < 1) {
			return;
		}		
		String value = temp.remove(0);	
		System.out.println("Value :: "+value);
		printReverseOfList(temp);		
		temp.add(value);
		System.out.println("After Recursion :: "+temp);
	}
	
	/*
	 Program to print below
	 1 * * * * *
	 1 2 * * * * 
	 1 2 3 * * *
	 1 2 3 4 * *
	 1 2 3 4 5 6
	 */
	public static void printShape() {
		int i=0; int j=0; int size = 7;
		for (i=1; i<size; i++) {
			for (j=1; j<=i; j++) {							
				
					System.out.print(j + " ");
				
			}
			for (j = i+1; j<size;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
	}
	
	/*
	 Program to print below 
	 1 2 3 4 5 6
	 1 2 3 4 5 *
	 1 2 3 4 * * 
	 1 2 3 * * *
	 1 2 * * * *
	 1 * * * * *
	 */
	public static void printShapeReverse() {		
		for (int i=7; i>=1; i--) {
			for (int j=1; j<i; j++) {
				System.out.print(j + " ");
			}
			for (int k=7; k>i;k--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
	}
	
	/*
	 Program to print below
	 @ @ @ @ @ @
	 @       @
	 @     @
	 @   @
	 @ @
	 @
	 */
	public static void printTriangularSymbol() {		
		for (int k=1; k<=5;k++) {
			System.out.print("@ ");
		}
		System.out.println("");
		for (int i=6; i>=1; i--) {
			for (int j=1; j<=i; j++) {
				if (j==1 || i==j)
					System.out.print("@ ");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
		
	}
	
	/*
	 Program to print below
     1  10 11  20
     2  9  12  19
     3  8      18
     4  7
     5  6
     6  5
     7  4
     8  3
     9  2
     10 1  20  11
	 */
	public static void printNumbers() {
		for (int i=1, j=10, k=11, l=20; i<=10 & j>=1 & k<=20 & l>=11;i++,j--,k++,l--) {
			System.out.println(i+ " "+j+" "+k+" "+l);			
		}
	}
	
	/*
	 Program to get input from user and print the square based on width and height
	 
	 if height = 5 and width = 5
	 A A A A A
	 A A A A A
	 A A A A A
	 A A A A A
	 A A A A A
	 */
	public static void printSquare(){
		Scanner in = new Scanner(System.in);
		System.out.print("Rows : ");
		int rows = in.nextInt();
		System.out.print("Columns : ");
		int columns = in.nextInt();
		for (int i = 1; i<=rows; i++) {
			for (int j = 1; j<=columns; j++) {
				System.out.print("A ");				
			}
			System.out.println(" ");
			
		}
	}
	
	/*
	 Program to find largest and smallest of two numbers
	 
	  
	 */
	public static void findLargestAndSmallest() {
		int i = 1;
		int number;
		System.out.println("Number "+i+": ");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		int smallNumber = number;
		int largeNumber = number;
		
		while (i <= 10) {
			System.out.println("Number "+i+": ");
			number = sc.nextInt();
			if(number > largeNumber) {
				largeNumber = number;
			} else if (number < smallNumber){
				smallNumber = number;
			}
			i++;
		}
		
		System.out.println("Large Number : "+largeNumber+" Small Number: "+smallNumber);
	}
	
	/*
	 		       
	 		      @@
	 		     @@@@
	 		    @@@@@@
	 		   @@@@@@@@
	 		  @@@@@@@@@@
	 		 @@@@@@@@@@@@
	 		@@@@@@@@@@@@@@
	 */
	public static void printPyramid() {
		for (int i=8; i>=1; i--) {			
			for (int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for (int k=8; k>=i; k--) {
				System.out.print("@");
			}
			for (int k=8; k>=i; k--) {
				System.out.print("@");
			}
			System.out.println(" ");
		}
			
	}
	
	/*
	 count the number of digits
	 
	 */
	public static void printNumberOfDigits() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = sc.nextInt();
		int remainder = number / 10;
		System.out.println("Remainder :: "+remainder);
		int result = 1;
		while (remainder != 0) {
			remainder = remainder / 10;
			result++;
		}
		System.out.println("Result : "+result);
	}
	
	/*
	 Count the number of prime numbers within the provided number and print the largest prime number
	 */
	public static void printNoOfPrimeNumbers() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = input.nextInt();
		boolean isPrime = false;
		int count = 0;
		int large = 0;
		for (int i=1; i < number; i++) {
			isPrime = true;
			for (int j=2; j<i; j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime && i != 2) {
				count++;
				large = i;
				System.out.print(i + " ");
				isPrime = false;
			}
		}
		System.out.println("\nCount of prime numbers : "+count+" \nLargest Prime Number: "+large);
	}
	
	/*
	 Array copy example
	 Array 1 = 1 2 3 4 5 6 7 8 9 10
	 Array 2 = 11 12 13 14 15 16 17 18 19 20
	 Array 3 = 1 11 2 12 3 13 4 14 5 15 etc.,
	 */
	
	public static void arrayCopy() {
		int[] a1 = new int[10];
		int[] a2 = {11,12,13,14,15,16,17,18,19,20};
		int[] a3 = new int[20];
		int index = 0;
		for (int i=1,j=0; i<=10; i++,j++) {
			a1[j]=i;
		}
		for (int i=0; i<10; i++) {
			a3[index++] = a1[i];
			a3[index++] = a2[i];
		}
		
		for(int a:a3) {
			System.out.println(a);
		}
	}
	
	/*
	 Print largest and smallest of an array
	 */
	private static void printLargestAndSmallestOfArray() {
		int[] a1 = new int[20];		
		
		int secondSmall = 0; int secondLarge=0;
		for(int i=0; i<20; i++) {
			a1[i] = (int) (Math.random() * (100 - 10));
		}
		int small = a1[0]; int large=a1[0];
		for (int a:a1) {
			System.out.print(a+" ");
		}
		for (int j=1; j<a1.length; j++) {
			if(a1[j] < small) {
				secondSmall = small;
				small = a1[j];
			}
			if (a1[j] > large) {
				secondLarge = large;
				large = a1[j];
			}
		}
		System.out.println("\nSmall : "+small+" Large : "+large);
		System.out.println("SecondSmall : "+secondSmall+" SecondLarge : "+secondLarge);	
	}
	
    public static void main( String[] args )
    {    	
    	//obj.patter0sAnd1s();
    	//obj.printFibonociSeries();
    	//obj.checkIfPalindromeOrNot("");
    	//List<String> tempList = new ArrayList<>(Arrays.asList("one","two","three","four","five"));
    	//printReverseOfList(tempList);
    	//System.out.println(tempList);
    	//printShape();
    	//printShapeReverse();
    	//printTriangularSymbol();
    	//printNumbers();
    	//printSquare();
    	//findLargestAndSmallest();
    	//printPyramid();
    	//printNumberOfDigits();
    	//printNoOfPrimeNumbers();
    	//arrayCopy();
    	printLargestAndSmallestOfArray();
    }


}
