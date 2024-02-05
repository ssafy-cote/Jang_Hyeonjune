package stack;

public class SsafyStackTest {

	public static void main(String[] args) {

		IStack<String> stack = new SsafyStack<>();
		System.out.println(stack.isEmpty() + "//" + stack.size());
		stack.push("갓병찬");
		stack.push("자바의신 전은수");
		stack.push("김동근");
		stack.push("닥터홍");
		stack.push("The Java 조용준");
		stack.push("축신 정상훈");
		stack.push("그녀는 예뻤다 이은진");
		System.out.println(stack.isEmpty() + "//" + stack.size());
		
		stack.push("김재웅김계희");
		stack.push("양유진");
		
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty() + "//" + stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty() + "//" + stack.size());
		System.out.println("========================================");
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

}
