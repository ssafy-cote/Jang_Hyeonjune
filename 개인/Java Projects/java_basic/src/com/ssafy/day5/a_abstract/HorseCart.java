package com.ssafy.day5.a_abstract;

public class HorseCart extends Vehicle{

	@Override
	public void addFuel() {
		// TODO Auto-generated method stub
		System.out.printf("차종: %s: 연료 주입: %s%n", this.getClass().getSimpleName(), "건초");
	}

}
