/*
 * 기본 문제 #09
 * 
 * int[] scores = {90,80,100};
 * 새롭게 사회 과목을 추가로 관리해야 할 때 적절하지 못한 코드는?
 * 
 * 
 */

package one;

public class Basic09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scores = {90,80,100};
		scores[3] = 95;							// #1
		
		scores = new int[]{90, 80, 100, 95};	// #2
		
//		scores = {90, 80, 100, 95};				// #3
		
//		scores = Arrays.copyOf(scores, 5);		// #4
		scores[3] = 95;
		
		int[] scores2 = new int[4];				// #5
		System.arraycopy(scores,  0,  scores2, 0, scores.length);
		scores2[3] = 95;
		
		
		/* 
		 * #1
		 * 배열의 범위를 벗어난 OutOfBounds 에러가 발생
		 * 
		 * #3
		 * 새로 선언을 안했기 때문에 크기ㅏ 안맞아 에러 발생
		 */
	}

}
