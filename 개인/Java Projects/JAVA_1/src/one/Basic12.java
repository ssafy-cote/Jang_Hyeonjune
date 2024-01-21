/*
 * 기본 문제 #12
 * 
 * 자연수가 담긴 배열이 주어질 때, 각 숫자가 몇 번 사용되었는지 출력
 * 사용 안된 숫자는 0으로 출력
 * 
 * 입력
 * int[] intArrary = {3, 7, 2, 5, 7, 7, 9, 2, 8, 1, 1, 5, 3};
 * 
 * 출력
 * 숫자별 사용 횟수
 * 
 */

package one;

import java.util.Arrays;

public class Basic12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArrary = {3, 7, 2, 5, 7, 7, 9, 2, 8, 1, 1, 5, 3};
		int[] used = new int[10];
		
		for(int i: intArrary) {
			used[i]++;
		}
		
		System.out.println(Arrays.toString(used));
	}

}
