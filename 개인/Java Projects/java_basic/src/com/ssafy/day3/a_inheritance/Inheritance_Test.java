package com.ssafy.day3.a_inheritance;

class tParents {
	String name;
	int age;
	
	static {
		System.out.println("parents class initializer");
	}
	{
		System.out.println("parents initializer");
	}
	public tParents() {
		System.out.println("parents constructor");
	}
}

class tChild extends tParents {
	static {
		System.out.println("child class initializer");
	}
	{
		System.out.println("child initializer");
	}
	public tChild() {
		System.out.println("parents constructor");
	}
}

public class Inheritance_Test {

	public static void main(String[] args) {
		System.out.println("자식 클래스 선언 전");
		tChild test = new tChild();
		System.out.println("자식 클래스 선언 후");
	}
}
