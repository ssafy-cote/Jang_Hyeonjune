/*
 * 기본 문제 #07
 * 
 * 학생들의 이름을 배열에 순차적으로 저장하고,
 * for-each로 출력하는 코드를 작성하시오
 * 
 * 입력
 * {홍길동, 임꺽정, 장길산, 이몽룡}
 * 
 * 출력
 * 홍길동
 * 임꺽정
 * 장길산
 * 이몽룡
 * 
 */

package one;

public class Basic07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] input = {"홍길동", "임꺽정", "장길산", "이몽룡"};
		
		for(String c: input) {
			System.out.println(c);
		}
	}

}
