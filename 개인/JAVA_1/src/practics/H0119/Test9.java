package practics.H0119;

class A { 
	public A() {
			System.out.println("생성자 A");
	}
	public void method() {
			System.out.println("메서드 A");
	}
}

class B extends A {
	public B() {
			System.out.println("생성자 B");
	}
	public void method() {
			System.out.println("메서드 B");
	}


}

public class Test9 {
	public static void main(String[] args) {
		A a = new B();
		B b = (B) a;
		a.method();
		b.method();
}
}