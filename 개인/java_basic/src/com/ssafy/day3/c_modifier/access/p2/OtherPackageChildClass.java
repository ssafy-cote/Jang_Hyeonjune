package com.ssafy.day3.c_modifier.access.p2;

import com.ssafy.day3.c_modifier.access.p1.Parent;

// TODO: Parent를 상속받고 Parent의 member들에 접근해보세요.
 public class OtherPackageChildClass extends Parent{

	 public void useMember() {
		 this.publicVar = 10;
		 this.protectVar = 10; // 상속 받아서 가능
//		 this.defaultVar = 10; // 같은 패키지
//		 this.privVar = 10; // private라서 에러
	 }
	 
	 public void method() {
		 Parent p1 = new Parent(); // 외부에서 받아온 거지 상속 받은것이 아니다.
		 
		 p1.publicVar = 10;
//		 p1.protectVar = 10; // 같은 패키지이거나 자식 클래스
//		 p1.defaultVar = 10; // 같은 패기지
//		 p1.privVar = 10; // private라서 에러
	 }
	 
    // END
}
