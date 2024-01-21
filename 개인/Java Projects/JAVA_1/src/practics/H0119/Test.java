package practics.H0119;

class GrandParent{
	void method() {
		System.out.println("GrandParent Method");
	}
}
class Parent extends GrandParent{
}
class Child extends Parent1{
	public void method() {
		System.out.println("Child Method");
	}
}

public class Test {
	public static void main(String[] args) {
		Parent1 p = new Parent1();
		p.method();
	}
}