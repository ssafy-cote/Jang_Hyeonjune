package com.ssafy.day2.c_constructor;

public class Test_Person {
	String name;
	int age;
	boolean isHungry;
	
	public Test_Person(String name, int age, boolean isHungry) {
		this.name = name;
		this.age = age;
		this.isHungry = isHungry;
	}
	
	public Test_Person(String name, int age) {
		this(name, age, true);
	}
	
	public Test_Person(String name) {
		this(name, 0);
	}
	
	public Test_Person() {
		this("아무개");
	}
	
	public static void main(String[] args) {
		Test_Person ts = new Test_Person("장현준", 30, false);
		System.out.println(ts.name + " " + ts.age + " " + ts.isHungry);
	}
}
