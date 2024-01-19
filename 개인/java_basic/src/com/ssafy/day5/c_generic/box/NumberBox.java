package com.ssafy.day5.c_generic.box;

//public class NumberBox<T> { // Number의 메소드를 사용 못하기 때문에 doubleValue() 메소드에서 에러가 남
//인터페이스를 참조할땐 &, 클래스끼리는 ,
public class NumberBox<T extends Number & Box, Integer> {
	public void addSomes(T...ts) {
		double sum = 0;
		for(T t: ts) {
			sum += t.doubleValue();
		}
		System.out.println("총 합은 : " + sum);
	}
	
	private T some;

	public T getSome() {
		return some;
	}

	public void setSome(T some) {
		this.some = some;
	}
}
