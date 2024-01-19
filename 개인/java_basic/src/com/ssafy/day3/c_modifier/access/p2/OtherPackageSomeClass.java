package com.ssafy.day3.c_modifier.access.p2;

import com.ssafy.day3.c_modifier.access.p1.Parent;

public class OtherPackageSomeClass {
    public void method() {
        // TODO: Parent 객체를 생성하고 이를 통해서 Parent의 멤버에 접근해보세요.

    	Parent p1 = new Parent();
    	
		 p1.publicVar = 10;
//		 p1.protectVar = 10; // 같은 패키지이거나 자식 클래스
//		 p1.defaultVar = 10; // 같은 패기지
//		 p1.privVar = 10; // private라서 에러
        // END
    }
}
