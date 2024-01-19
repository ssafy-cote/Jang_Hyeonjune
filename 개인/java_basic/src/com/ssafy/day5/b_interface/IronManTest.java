package com.ssafy.day5.b_interface;

public class IronManTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IronMan iman = new IronMan();
		Object obj = iman;
		
		Fightable f = iman;
		Transformable t = iman;
		Heroable h = iman;
		
		
	}
}
