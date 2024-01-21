package com.ssafy.day2.a_person;

public class Person {
	// 객체의 속성, 데이터
	String name;
	int age;
	boolean isHungry;
	
	// 객체의 기능, 동작
	public void eat() {
		isHungry = false;
	}
	
	public void work() {
		isHungry = true;
	}
	
	
	
	public void printInfo() {
		System.out.println("name: " + name + ", age: " + age + ", isHungry: " + isHungry);
	}
	// 파라미터 이름만 같은 경우
//	int add1(int a, int b){return a + b;}
//	int add1(int x, int y){return x + y;}
	//error

	//리턴 타입이 다른 경우
//	int add1(int a, int b){return a + b;}
//	long add1(int a, int b){return a + b;}
	//error

	//이름은 같고 파라미터의 타입이 다른 경우
	long add1(long a, int b){return a + b;}
	long add1(int a, long b){return a + b;}
	//정상 작동
}
