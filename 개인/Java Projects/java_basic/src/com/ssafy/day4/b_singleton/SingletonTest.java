package com.ssafy.day4.b_singleton;

import java.lang.*;

class SingletonClass extends Object {
	// TODO:SingletonClass에 Singleton Design Pattern을 적용하시오.
	private SingletonClass() {//public을 private로
		super();
	}
	
	private static SingletonClass instance = new SingletonClass();
	
	public static SingletonClass getInstance() {
		
		return instance;
	}

	// END
	public void sayHello() {
		System.out.println("Hello");
	}

}

public class SingletonTest {
	public static void main(String[] args) {
		// TODO:SingletonClass를 사용해보세요.
		// 싱글톤 디자인 패턴으로 인한 접근제어됨
//		SingletonClass sc = new SingletonClass();
//		sc.sayHello();
//		
//		SingletonClass sc2 = new SingletonClass();
//		sc.sayHello();
		
		SingletonClass sc = SingletonClass.getInstance();
		sc.sayHello();
		
		SingletonClass sc2 = SingletonClass.getInstance();
		sc2.sayHello();

		// END
	}
}
