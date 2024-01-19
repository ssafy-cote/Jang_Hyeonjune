package com.ssafy.day5.b_interface;

public class IronMan implements Heroable{

	@Override
	public void chageShape() {
		// TODO Auto-generated method stub
		System.out.println("변신");
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("땅");
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		System.out.println("짜잔");
	}

}
