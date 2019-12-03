package com.test.java8;

interface MethodRefereceTest{
	String printValue(String a);
}

interface MethodRefereceTest1{
	int getAge(int age);
}

public class MethodReferencesUsingLambda {

	public static String printMessage(String a) {
		return "Print the message : "+a;
	}
	public static void main(String[] args) {
		//System.out.println(MethodReferencesUsingLambda.printMessage("Vishnu"));
		
		MethodRefereceTest obj = MethodReferencesUsingLambda::printMessage;
		//System.out.println(obj.printValue("Lambda"));
		
		MethodRefereceTest obj2 = MethodReferenceTest::printName;
		//System.out.println(obj2.printValue("Great it works"));
		
		MethodReferenceTest1 obj3 = new MethodReferenceTest1();
		MethodRefereceTest1 obj4 = obj3::printAge;
		System.out.println(obj4.getAge(26));
		
	}

}

class MethodReferenceTest{
	public static String printName(String name) {
		return name;
	}
}

class MethodReferenceTest1{
	public int printAge(int age) {
		return age;
	}
}