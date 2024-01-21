package com.ssafy.day5.b_interface.staticdefault;

import java.util.Arrays;

interface Aircon {
    void makeCool();

    // TODO: 2. 건조기능을 추가해보자.
//    void dry(); // override를 해야하기 때문에 에러가 발생한다.
    default void dry() {
    	System.out.println("사실상 건조는 필수지!!");
    }
    // END

    // TODO: 3.Aircon이 동작 방식에 대해 설명해보자.
    static void desc() {
    	System.out.println("에어컨이란 시원하게 하는 것");
    }
    // END

}

class NoWind implements Aircon {

	@Override
	public void makeCool() {
		// TODO Auto-generated method stub
		System.out.println("바람을 직접 쐬지 않아도 좋아!!");
	}
	
	@Override
	public void dry() {
		// TODO Auto-generated method stub
		System.out.println("종료하면 자동 건조!!!");
	}
	
}


class OldisButGoodies1 implements Aircon {
    @Override
    public void makeCool() {
        System.out.println("전체 냉각해줘");
    }
}

class OldisButGoodies2 implements Aircon {
    @Override
    public void makeCool() {
        System.out.println("집중 냉각해줘");
    }
}

// TODO: 1. 무풍 에어컨을 구현해보자.

// END

public class StaticDefaultMethod {
    public static void main(String[] args) {
        Aircon[] aircons = { new OldisButGoodies1(), new OldisButGoodies2() };
        for (Aircon aircon : aircons) {
            aircon.makeCool();
        }
    }
}
