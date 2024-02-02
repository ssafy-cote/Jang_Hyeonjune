import java.util.ArrayDeque;
import java.util.Queue;

public class QueueAPITest {

	public static void main(String[] args) {

		Queue queue = new ArrayDeque<>();
		System.out.println(queue.isEmpty() + "//" + queue.size());
		queue.offer("갓병찬");
		queue.offer("자바의신 전은수");
		queue.offer("김동근");
		queue.offer("닥터홍");
		queue.offer("The Java 조용준");
		queue.offer("축신 정상훈");
		queue.offer("그녀는 예뻤다 이은진");
		System.out.println(queue.isEmpty() + "//" + queue.size());

		queue.offer("김재웅김계희");
		queue.offer("양유진");

		System.out.println(queue.peek());
		System.out.println(queue.isEmpty() + "//" + queue.size());
		System.out.println(queue.poll());
		System.out.println(queue.isEmpty() + "//" + queue.size());
		System.out.println("========================================");
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}

}
