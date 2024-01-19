package com.ssafy.day5.b_interface.relation;

// TODO: DigitalCamera를 충전 가능하게 설정하시오.
public class DigitalCamera extends Camera implements Chargeable{

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		System.out.println("디지털 카메라 충전");
	}
    // TODO: Chargeable을 구현하시오.
	
    // END
}
