package com.ssafy.day4.c_polymorphism;

class Person {
	
}

class SpiderMan extends Person {
	public void fireweb() {
		System.out.println("슈슉!");
	}
}

public class Test_instatnceof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person person = new Person();
//		SpiderMan sman = (SpiderMan) person;
//		sman.fireweb();
		Person person = new Person();
		if (person instanceof SpiderMan) {
			SpiderMan sman = (SpiderMan) person;
		}
	}

}
