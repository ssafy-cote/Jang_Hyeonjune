package stream.step03.end;

import java.util.Arrays;
import java.util.List;

public class Test01_루핑 {
	
	static class Ssafy {
		private int id;
		private String name;
		private int age;

		public Ssafy(int id, String name, int age) {
			this.id = id;
			this.name = name;
			this.age = age;
		}

		public void displayInfo() {
			System.out.println("Student 아이디: " + id + ", 이름: " + name + ", 나이: " + age);
		}
	}
	
	public static void main(String[] args) {
		// Ssafy 객체를 담은 리스트 생성
		List<Ssafy> ssafyList = Arrays.asList(
				new Ssafy(1, "홍싸피", 23), 
				new Ssafy(2, "김싸피", 25),
				new Ssafy(3, "서싸피", 22)
		);

		// 스트림의 forEach 메서드를 사용하여 각 객체의 정보를 출력
		ssafyList.stream().forEach(ssafy -> ssafy.displayInfo());
		// 메서드 참조 
		ssafyList.stream().forEach(Ssafy::displayInfo);
	}
}
