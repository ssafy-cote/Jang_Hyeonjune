/*
 * 기본 문제 #10
 * 
 * int로 구성된 배열이 있을 때, 최대값, 최소값을 출력
 * 
 * 입력
 * int[] intArray = {3, 27, 13, 8, 235, 7, 22, 9, 435, 31, 54};
 * 
 * 출력
 * 최대값, 최소값
 * 
 * 
 */
package one;

public class Basic10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intMax = Integer.MIN_VALUE;
		int intMin = Integer.MAX_VALUE;
		int[] intArray = {3, 27, 13, 8, 235, 7, 22, 9, 435, 31, 54};
		
		for(int i: intArray) {
			if(intMax < i)
				intMax = i;
			if(intMin > i)
				intMin= i;
		}
		System.out.printf("Max : %d, Min : %d", intMax, intMin);
	}

}
