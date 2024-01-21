package practics.H0119;



class Child10 extends Parent10{
	//오버라이드 안됨. static 때문에 동적바인딩을 못하기 때문.
	static void method() {
		System.out.println("child method");
	}
}

class Parent10{
	
	static void method() {
		System.out.println("parent method");
	}
}

public class Test10 {
	public static void main(String[] args) {
		Parent10.method();
		
		Parent10 p = new Parent10();
		p.method();
		
		Parent10 p2 = new Child10();
		p2.method();
		
		Child10 c = new Child10();
		c.method();
	}
}