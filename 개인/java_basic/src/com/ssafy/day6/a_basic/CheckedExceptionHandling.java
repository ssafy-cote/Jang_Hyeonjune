package com.ssafy.day6.a_basic;

import java.io.FileInputStream;

public class CheckedExceptionHandling {
	public static void main(String[] args) {
		// TODO: 다음에서 발생하는 예외를 처리해보자.
		try {
			Class.forName("com.ssafy.day6.a_basic.CheckedExceptionHandling"); // 클래스의 이름을 불러오는 메소드, 무조건 try/catch를 써야한다.
			// new FileInputStream("some"); // 대처코드가 있냐 없냐가 중요. 없으면 에러 발생
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// END
		System.out.println("프로그램 정상 종료");
	}

}
