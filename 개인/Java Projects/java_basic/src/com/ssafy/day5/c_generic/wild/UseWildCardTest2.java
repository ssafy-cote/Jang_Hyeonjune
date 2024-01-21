package com.ssafy.day5.c_generic.wild;

import com.ssafy.day5.c_generic.box.GenericBox;

public class UseWildCardTest2 {

	public void useWildCardTypeMethod() {
		GenericBox<Double> dBox = new GenericBox<>();
		dBox.setSome(3.14);
		printInfo(dBox);

		GenericBox<Integer> iBox = new GenericBox<>();
		iBox.setSome(3);
		printInfo(iBox);

	}

	// TODO:GenericBox<Double>과 GenericBox<Integer>의 내용을 확인하는 메서드를 작성해보자.
//	public void printInfo(GenericBox<? extends Number> wild) {
	public void printInfo(GenericBox<? super Number> wild) {
		// T타입의 값을 꺼내서 사용하는 경우
		// extends Number로 인해 최소한 Number 객체를 사용할 수 있다는것을 명시되어 Number의 메소드들을 사용할 수 있다.
		System.out.println("정수: " + wild.getSome().intValue() + ", 실수: " + wild.getSome().doubleValue());
		
		/*
		 * <? extends Number>로 인해 받을수 있는것
		 * GenericBox<Number>
		 * GenericBox<Integer>
		 * GenericBox<Double>
		 * => 값을 꺼내서 사용할 경우 사용
		 */
		
		/*
		 * <? super Number>
		 * GenericBox<Number>
		 * GenericBox<Object>
		 * Object가 오기 때문에, intValue()같은 메소드들을 사용할 수없다.(Object에는 없으니깐)
		 * => 값을 넣어주기 위해서 사용
		 */
		
		// T타입의 멤버를 세팅하는 경우
		// Integer가 들어올지, Double이 들어올지 모른다. 보장이 안되기 때문에 실행이 안됨
		// extends를 사용한것은 그 값을 갖고올수는 있지만, setting은 안됨
		// super는 가능하다.
		wild.setSome(10.3); 
//		wild.setSome(new Object()); 
		
		
		
	}
	
	// END

	public static void main(String[] args) {
		UseWildCardTest2 test = new UseWildCardTest2();
		test.useWildCardTypeMethod();
	}
}
