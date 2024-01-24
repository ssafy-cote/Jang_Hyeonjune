/* 
 * 백준 1912 연속합
 * 
 * n개의 정수로 이루어진 임의의 수열이 주어진다. 우리는 이 중 연속된 몇 개의 수를
 * 선택해서 구할 수 있는 합 중 가장 큰 합을 구하려고 한다. 단, 수는 한 개 이상
 * 선택해야한다.
 * 
 * 예를들어 10,-4,3,1,5,6,-35,12,21,-1 이라는 수열이 주어졌다고 하자.
 * 여기서 정답은 12+21인 33이 정답이 된다.
 * 
 * 입력
 * 첫째 줄에 n ( 1<= n <=100,000)
 * 둘째 줄에 n개의 정수로 이루어진 수열(-1000 <= 정수 <= 1000)
 * 
 * 깊이탐색..?
 * 0번째로 연속합의 최대치를 구하고,, 1번째로 연속합의 최대치가 이미 포함된 느낌으로
 * arr2 배열에 답을 넣고 가장 큰 값을 출력
 * @arr2 말고 i번째에 그냥 큰 값넣기, 어차피 뒤는 안돌아 보니깐
 * 
 * 
 */

package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1912 {

	public static int[] arr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = s.nextInt();

		int Max = Integer.MIN_VALUE;
		int tmp;
		for(int i=0; i<n; i++) {
//			System.out.println("외부 i : " + i);
			tmp = def(i, arr[i]);
			arr[i] = tmp;
			if (Max < tmp) Max = tmp;
		}
//		System.out.println(Arrays.toString(arr));
		System.out.println(Max);
	}
	
	private static int def(int i, int sum) {
		// 마지막에 도달하면 끝
		// 마지막 값을 반환
//		System.out.println("i : " + i + ", sum : " + sum);
		if(i+1 == arr.length) {
			return arr[i];
		} 
		
		int tmp = def(i+1, sum+arr[i+1]);
		if (tmp < sum) {
			return sum;
		} else {
			return tmp;
		}
		
	};
}
