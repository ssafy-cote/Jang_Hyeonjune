package programmers;

import java.util.Scanner;

/*
 * 프로그래머스 42860 조이스틱
 * 
 * 조이스틱으로 알파벳 이름을 완성하세요. 맨 처음엔 A로만 이루어져 있습니다.
 * 만약 완성해야 하는 이름이 세 자면 AAA, 네 자면 AAAA
 * 
 * 조이스틱을 각 방향으로 움직이면 아래와 같다.
 * 
 * 위키) 다음 알파벳
 * 아래키) 이전 알파벳(A에서 아래쪽이면 Z)
 * 왼쪽키) 커서를 왼쪽으로 이동(첫 번째에서 왼쪽은 마지막)
 * 오른쪽키) 커서를 오른쪽으로 이동(마지막에서 오른쪽은 처음)
 * 
 * JAZ를 만드는 것은
- 첫 번째 위치에서 조이스틱을 위로 9번 조작하여 J를 완성합니다.
- 조이스틱을 왼쪽으로 1번 조작하여 커서를 마지막 문자 위치로 이동시킵니다.
- 마지막 위치에서 조이스틱을 아래로 1번 조작하여 Z를 완성합니다.
따라서 11번 이동시켜 "JAZ"를 만들 수 있고, 이때가 최소 이동입니다.
 * 
 * 만들고자 하는 이름 name이 매개변수로 주어질 때, 이름에 대해
 * 조이스틱 조작 횟수의 최솟값을 return하시오.
 * 
 * @제한사항
 * name은 알파벳 대문자로만 이루어져 있다.
 * name의 길이는 1이상 20이하이다.
 * 
 * @입력
 * name
 * 
 * @출력
 * 만들고자 하는 name을 만들때 조이스틱 횟수
 * 
 * @해결방안
 * 
 * 
 */

public class Joystick {
	
	static int middleAlpa = "Z".charAt(0) - "A".charAt(0);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner s = new Scanner(System.in);
		 
		 String name = s.nextLine();
		 System.out.println(name);
		 
		 System.out.println(middleAlpa);
	}

	public static void Up() {
		
	}
	
	public static void Down() {
		
	}
	
	public static void Left() {
		
	}
	
	public static void Right() {
		
	}
}
