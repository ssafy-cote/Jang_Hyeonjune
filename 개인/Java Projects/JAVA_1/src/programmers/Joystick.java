package programmers;

import java.util.Arrays;
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
 * 먼저 첫번째 0번 인덱스를 확인 후 맞는 name 만들기
 * 가장 가까운 위치의 name을 찾아가기 => 범위 확인 함수
 * 이동
 * 
 */

public class Joystick {

	static int middleAlpa = "Z".charAt(0) - "A".charAt(0);

	static char[] names;
	static String name;
	static int cur;
	static int count;
	static int S; // 단어 길이
	static boolean LR = true; // true면 left, false면 right

	// A : 65, Z : 90
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		name = s.nextLine();
		names = new char[name.length()];

		System.out.println(name);

		for (int i = 0; i < name.length(); i++) {
			names[i] = 'A';
		}

		S = name.length() - 1;

		while (!name.equals(String.valueOf(names))) {
			if (names[cur] != name.charAt(cur)) { // 현재 있는 곳이 완성되었다면 다른곳으로 이동
				// 어디가 더 가까이 빨리 A~Z으로 변환하는지
//				if (check(name.charAt(cur))) {
//					names[cur] = Up(names[cur]);
//				} else {
//					names[cur] = Down(names[cur]);
//				}
				names[cur] = Down(names[cur]);
			} else {
				int i = checkLR(name.charAt(cur)); // 몇번을 옆으로 갈지 알려준다.
				while (i > 0) {
					if (LR) {
						Left();
					} else {
						Right();
					}
					i--;
				}
			}
			System.out.println(Arrays.toString(names));
		}
		System.out.println(count);
	}

	/*
	 * 위키) 다음 알파벳(Z 다음 A) 아래키) 이전 알파벳(A에서 아래쪽이면 Z) 왼쪽키) 커서를 왼쪽으로 이동(첫 번째에서 왼쪽은 마지막)
	 * 오른쪽키) 커서를 오른쪽으로 이동(마지막에서 오른쪽은 처음)
	 */
	public static char Up(char c) {
		count++;
		if (c == 'Z')
			return 'A';
		else {
			return (char) (c + 1);
		}
	}

	public static char Down(char c) {
		count++;
		if (c == 'A')
			return 'Z';
		else {
			return (char) (c - 1);
		}
	}

	public static void Left() {
		count++;
		if (cur - 1 < 0)
			cur = S;
		else
			cur--;
	}

	public static boolean LeftCheck(int n) { // n>=1
		int tmp_cur = n % (S + 1); // S개 한바퀴를 돌면 제자리로 온다.
		if (cur - tmp_cur < 0) { // 만약 0번에서 2(n)칸 뒤로가면 24(26-n)가 되어야한다.
			return names[S - tmp_cur] == name.charAt(S - tmp_cur);
		} else {
			// 범위를 벗어나지 않는 선에서 계산된 tmp_cur 만큼 왼쪽 이동
			return names[cur - tmp_cur] == name.charAt(cur - tmp_cur);
		}
	}

	public static void Right() {
		count++;
		if (cur + 1 > S)
			cur = 0;
		else
			cur++;
	}

	public static boolean RightCheck(int n) { // n>=1
		int tmp_cur = n % (S + 1); // S개 한바퀴를 돌면 제자리로 온다.
		if (cur + tmp_cur > S) // 만약에 25번에서 2(n)칸 앞으로 가면 1(0+n-1)번으로 가야한다.
			return names[0 + tmp_cur - 1] == name.charAt(0 + tmp_cur - 1);
		else {
			// 범위를 벗어나지 않는 선에서 계산된 tmp_cur 만큼 오른쪽 이동
			return names[cur + tmp_cur] == name.charAt(cur + tmp_cur);
		}
	}

	//
	public static boolean UpCheck(int n) {
		return true;
	}

	// true면 Up, false Down
	public static boolean checkUD(char c) {
		boolean result = true;
		
//		int i=0;
//		while(true) {
//			if()
//		}
		
		return result;
	}

	// true면 Left, false Right
	public static int checkLR(char c) {
		int i = 1;
		int tmp_left = cur;
		int tmp_right = cur;
		while (true) {
			tmp_left += -1;
			tmp_right += 1;

			if (names[tmp_left] == c) {
				LR = true;
				break;
			} else if (names[tmp_right] == c) {
				LR = false;
				break;
			}

			i++;
		}
		return i;
	}
}
/*
checkLR까지 구현

*/