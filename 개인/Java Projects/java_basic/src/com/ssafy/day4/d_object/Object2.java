package com.ssafy.day4.d_object;

public class Object2 {
	int data;

	public Object2(int data) {
		this.data = data;
	}

	public static void main(String[] args) {
		Object2 obj1 = new Object2(10);
		Object2 obj2 = new Object2(10);

		System.out.println(obj1.equals(obj2)); // 실행 결과
	}

	public boolean equals(Object obj) {
		return ((Object2) obj).data == this.data;
	}
}