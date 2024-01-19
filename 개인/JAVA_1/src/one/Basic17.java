/*
 * 기본 문제 #17
 * 
 * 다음 5x5의 2차원 배열을 주어질때, 각 항목의 숫자 3의 배수의 개수와
 * 합을 구하는 코드를 작성하시오
 * 
 * 입력
 * int[][] grid = {
 * {2,3,1,4,7,},{8,13,3,33,1},
 * {7,4,5,80,12},{17,9,11,5,4},
 * {4,5,91,27,7}
 * };
 * 
 * 출력
 * 3의 배수의 개수와 합을 구하시오
 * 
 * 
 */

package one;

public class Basic17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] grid = { { 2, 3, 1, 4, 7, }, { 8, 13, 3, 33, 1 }, { 7, 4, 5, 80, 12 }, { 17, 9, 11, 5, 4 },
				{ 4, 5, 91, 27, 7 } };
		
		int count = 0;
		int sum = 0;
		
		for(int[] i: grid) {
			for(int j: i) {
				if(j % 3== 0) {
					count++;
					sum+=j;
				}
			}
		}
		System.out.printf("개수 : %d, 합 : %d", count, sum);
	}

}
