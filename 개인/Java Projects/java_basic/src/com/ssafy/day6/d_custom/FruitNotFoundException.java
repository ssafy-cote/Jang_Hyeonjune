package com.ssafy.day6.d_custom;

// Checked Exception을 하기 위해 Exception을 상속 받음
public class FruitNotFoundException extends Exception {
	String fruitName; 	//과일 이름
	
	public void showFruitName() {
		System.out.println("과일 이름 : " + fruitName);
	}
	
	public FruitNotFoundException(String name) {
		
		super(name + "에 해당하는 과일은 없습니다."); // Exception의 생성자 호출
		fruitName = name;
		
	}
}
