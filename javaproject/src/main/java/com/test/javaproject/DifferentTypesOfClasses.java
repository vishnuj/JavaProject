package com.test.javaproject;

public class DifferentTypesOfClasses {
	
	int count ;
	String name;
	
	public DifferentTypesOfClasses(int count, String name) {
		this.count = count;
		this.name = name;
	}
	
	void printVars() {
		System.out.println("Count : "+count+" Name : "+name);
	}
	
	class InnerClass{
		int age;
		String var;
		
		InnerClass(int age, String var){
			this.age = age;
			this.var = var;
		}
		
		void printVars() {
			System.out.println("Inner Class Values -- Age : "+age+" Var : "+var);
		}
	}
	
	static class InnerStaticClass{
		void printStaticClassMethod() {
			System.out.println("Static class method is called !!!");
		}
	}

	public static void main(String[] args) {
		DifferentTypesOfClasses obj = new DifferentTypesOfClasses(10, "Vishnu");
		obj.printVars();
		
		DifferentTypesOfClasses.InnerClass innerClassObj = obj.new InnerClass(20, "RandomName");
		innerClassObj.printVars();
		
		DifferentTypesOfClasses.InnerStaticClass obj2 = new DifferentTypesOfClasses.InnerStaticClass();
		obj2.printStaticClassMethod();
		
		DifferentTypesOfClasses obj3 = new DifferentTypesOfClasses(1, "test") {
			void printVars() {
				System.out.println("Anonyomous Inner Class - Count : "+count+" Name : "+name);
			}
		};
		
		obj3.printVars();
		
		DifferentTypesOfClassesInterface obj4 = (count, name) -> System.out.println("Lambda Inner Class - Count : "+count+" Name : "+name);
		obj4.printVars(10, "Interface using lambda");
	}

	
}

interface DifferentTypesOfClassesInterface{
	void printVars(int count, String name);
}

