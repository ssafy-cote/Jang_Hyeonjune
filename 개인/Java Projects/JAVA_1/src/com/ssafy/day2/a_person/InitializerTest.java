package com.ssafy.day2.a_person;

public class InitializerTest {
	int iv;
	static int cv;

	// 1번 클래스 초기화 블록
	static {
		System.out.println("static initializer");
		cv = 100;
	}
	
	// 2번 인스턴스 초기화 블록
	{
		System.out.println("instance initializer");
		iv = 100;
	}

	// 3번
	public InitializerTest() {
		System.out.printf("생성자- iv: %d, cv: %d\n", iv, cv);
		this.iv = 300;
	}

	public static void main(String[] args[]) {
		InitializerTest it = new InitializerTest();
		System.out.printf("1- iv: %d, cv: %d\n", cv, it.iv);
		InitializerTest it2 = new InitializerTest();
		System.out.printf("2- iv: %d, cv: %d\n", cv, it2.iv);
	}
}