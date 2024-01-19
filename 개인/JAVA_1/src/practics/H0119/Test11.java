package practics.H0119;

class Parent1{
	void method() {
		System.out.println("parent method");
		this.method2();
	}
	void method2() {
		System.out.println("parent method2");
	}
}

class Child1 extends Parent1{
	void method() {
		System.out.println("child method");
		super.method();
	}
	void method2() {
		System.out.println("child method2");
	}
}

public class Test11 {
	public static void main(String[] args) {
		
		Parent1 p = new Parent1();
		p.method();
		
		Parent1 p2 = new Child1();
		p2.method();
	}
}