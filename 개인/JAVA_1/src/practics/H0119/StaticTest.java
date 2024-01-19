package practics.H0119;

public class StaticTest {

	String name = "A";

	{
		name = "B";
		System.out.println("초기화 블록 실행");
	}

	static {
		System.out.println("스태틱 블록 실행");
	}

	public static void main(String[] args) {
		StaticTest t1 = new StaticTest();
		System.out.println(t1.name);
		StaticTest t2 = new StaticTest();

		StaticTest t3 = new StaticTest();
	}
}
/*

스태틱블록 실행
초기화 블록 실행
B
초기화 블록 실행
초기화 블록 실행
*/