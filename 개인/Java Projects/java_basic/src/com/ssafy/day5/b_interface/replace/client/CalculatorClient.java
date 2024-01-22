package com.ssafy.day5.b_interface.replace.client;

import java.util.Scanner;

import com.ssafy.day5.b_interface.replace.Calculator;
import com.ssafy.day5.b_interface.replace.CalculatorImpl;

class CalculatorClient {
//	Calculator calcLogic = new CalculatorStub();
	Calculator calcLogic = new CalculatorImpl();

	public void add() {
		System.out.println("첫 번째 정수를 입력하시오.");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println("두 번째 정수를 입력하시오.");
		int b = scanner.nextInt();
		System.out.printf("결과: %d+%d=%d%n", a, b, calcLogic.add(a, b));
		scanner.close();
	}

	public static void main(String[] args) {
		CalculatorClient cc = new CalculatorClient();
		cc.add();
	}
}
