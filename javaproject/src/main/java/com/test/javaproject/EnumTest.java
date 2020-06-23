package com.test.javaproject;

public class EnumTest {
	
	public enum person{
		person1("Vishnu",30,'M'),
		person2("Ravi",28,'F'),
		person3("Paaru",25,'F');
		
		private final String name;
		private final int age;
		private final char sex;
		
		person(String name, int age, char sex){
			this.name = name;
			this.age = age;
			this.sex = sex;
		}
		
		public String getName() {
			return this.name;
		}
		
		public int getAge() {
			return this.age;
		}
		
		public char getsex() {
			return this.sex;
		}
	}

	public static void main(String[] args) {
		//System.out.println(person.person1.getName());
		
		for(person p: person.values()) {
			System.out.println("Name : "+p.getName()+" Age : "+p.getAge()+" sex : "+p.getsex());
		}
	}

}
