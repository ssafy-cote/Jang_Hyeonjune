/* 
 * 기본 문제 #13
 * 
 * 1~20의 배열이 주어질 떄
 * 사용되지 않은 숫자를 출력
 * 
 * 입력
 * int[] intArray{1,3,4,7,8,10,12,15,16,17,18};
 * 
 * 출력
 * 사용되지 않은 숫자 출력
 * 
 * 
 */

package one;

public class Basic13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {1,3,4,7,8,10,12,15,16,17,18};
		int[] used = new int[21];
		
		for(int i: intArray) {
			used[i]++;
		}
		
		for(int i=1; i<21; i++) {
			if(used[i] == 0)
				System.out.print(i + " ");
		}
	}

}
