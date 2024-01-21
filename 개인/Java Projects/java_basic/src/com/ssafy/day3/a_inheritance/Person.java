package com.ssafy.day3.a_inheritance;

public class Person {
	String name;
	
	public Person(String name) {
		// 명시적으로 this(), super()가 없으므로 super()
		super(); // 조상 즉 Object 만들고 오세요! -> 언제나 생략되어 있다.
		this.name = name;
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	@Deprecated
	void eat() {
		System.out.println("Person Eat!");
	}
	void jump() {
		System.out.println("Person Jump!");
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "사람 이름 : " + this.name;
	}
}
