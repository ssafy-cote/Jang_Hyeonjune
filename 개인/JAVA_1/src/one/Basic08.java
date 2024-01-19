/* 
 * 기본 문제 #8
 * 
 * 기본 문제 #7 코드에 이어서 "임꺽정"과 "장길산"의 순서를 바꾸고,
 * 다시 for-each로 이름을 출력하는 코드를 작성하시오
 * 
 * 입력
 * {홍길동, 임꺽정, 장길산, 이몽룡}
 * 
 * 출력
 * 홍길동, 장길산, 임꺽정, 이몽룡
 */

package one;

public class Basic08 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] input = {"홍길동", "임꺽정", "장길산", "이몽룡"};
		
		String tmp = "";
		tmp = input[1];
		input[1] = input[2];
		input[2] = tmp;
		
		for(String s: input) {
			System.out.println(s);
		}
	}
}
