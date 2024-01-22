package com.ssafy.day4.c_polymorphism;

import com.ssafy.day3.a_inheritance.Person;
import com.ssafy.day3.a_inheritance.SpiderMan;

public class InstanceOfTest {
	private void unsafeCasting() {
		Object obj = 1;
		if (obj instanceof String) {
			String s = (String) obj; // Integer -> String
			System.out.println(s.length());
		} else {
			System.out.println("문자열 아닌데?");
		}
	}

	private void safeCasting() {
	    Object obj = 1;
	    if (obj instanceof String) {
	        String s = (String) obj; // Integer -> String
	        System.out.println(s.length());
	    } else if (obj instanceof Integer) {
	        String s = String.valueOf(obj); // Integer -> String
	        System.out.println(s.length());
	    } else {
	        System.out.println("문자열 아닌데?");
	    }
	}

	public static void main(String[] args) {
		InstanceOfTest instance = new InstanceOfTest();
		instance.unsafeCasting();
		instance.safeCasting();
	}

}
