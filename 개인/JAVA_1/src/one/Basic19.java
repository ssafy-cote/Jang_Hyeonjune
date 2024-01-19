/*
 * 4X4의 2차원 배열이 주어질 때,
 * X로 표시된 항목의 좌우 숫자의 합을 구하는 코드를 작성하시오.
 * 
 * 입력
 * int[][] arr = {
 * {2,3,1,4},
 * {1,X,3,2},
 * {3,4,X,X},
 * {X,4,1,5}
 * };
 * 
 * 출력
 * X의 좌우 숫자 합
 * 
 */

package one;

public class Basic19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[][] arr = {
				 {2,3,1,4},
				 {1,'X',3,2},
				 {3,4,'X','X'},
				 {'X',4,1,5}
				 };
		 
		 for(int[] i: arr) {
			 for(int j: i) {
				 if(j=='X') {
					 //왼쪽
//					 if(j-1>0 && j-1 != 'X')
//						 sum += 
				 }
			 }
		 }
	}

}
