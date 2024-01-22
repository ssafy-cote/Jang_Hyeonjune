package com.ssafy.day2.d_init;

//public class InitializerTest {
//    int iv;
//    static {
//        System.out.println("static initializer");
//        cv = 100;
//      }
//    static int cv;
//
//
//
//    {
//      System.out.println("instance initializer");
//      iv = 100;
//    }
//
//    public InitializerTest() {
//      System.out.printf("생성자- iv: %d, cv: %d%n", iv, cv);
//      this.iv = 300;
//    }
//
//    public static void main(String args[]) {
////      InitializerTest it = new InitializerTest();
////      System.out.printf("1 - cv: %d, iv: %d%n", cv, it.iv);
////      InitializerTest it2 = new InitializerTest();
////      System.out.printf("2 - cv: %d, iv: %d%n", cv, it2.iv);
////    	InitializerTest it;
////    	it = new InitializerTest();
////    	System.out.printf("1 - cv: %d, iv: %d%n", cv, it.iv);
////    	InitializerTest it2 = new InitializerTest();
////    	System.out.printf("2 - cv: %d, iv: %d%n", cv, it2.iv);
//
//    	System.out.println(cv);
//    }
//  }
public class InitializerTest {
	int iv;
	static int cv;

	// 1번
	static {
		System.out.println("static initializer");
		cv = 100;
	}

	// 2번
	{
		System.out.println("instance initializer");
		iv = 100;
	}

	// 3번
	public InitializerTest() {
		System.out.printf("생성자- iv: %d, cv: %d\n", iv, cv);
		this.iv = 300;
	}

	public static void main(String[] args) {
		InitializerTest it = new InitializerTest();
		System.out.printf("1- iv: %d, cv: %d\n", it.iv, it.cv);
		InitializerTest it2 = new InitializerTest();
		System.out.printf("2- iv: %d, cv: %d\n", it2.iv, it2.cv);
	}
}
