package com.ssafy.day3.c_modifier.access.p1;

// TODO: Parent를 상속받고 Parent의 member들에 접근해보세요.
 public class SamePackageChildClass extends Parent{

	 
	 public void useMember() {
		 this.publicVar = 10;
		 this.protectVar = 10;
		 this.defaultVar = 10;
//		 this.privVar = 10; // private라서 에러
	 }
    // END
}
