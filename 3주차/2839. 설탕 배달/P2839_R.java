/*
 * 백준 2839 설탕 배달
 * 
 * 사탕가게에서 정확하게 N킬로그램을 배달해야한다.
 * 봉지는 3킬로그램, 5킬로그램이 있고
 * 
 * 최소한으로 배달을 할려면 어떻게 해야할까?
 * 예륻르어 18클래이면 3을 6번 배달해도 되지만,
 * 5킬로 3개와 3킬로 1개를 배달하면 더 적은 개수로 배달 가능하다.
 * 
 * 입력
 * 설탕 N킬로그그램
 * 
 * 출력
 * 3킬로그램과 5킬로그램의 갯수
 * 만약 N킬로그램을 만들 수 없다면 -1 출력
 * 
 * 예외경우
 * 11이면
 * 5 -> 5 -> X가 아닌
 * 5 -> 3 -> 3
 * 
 */

package baekjoon;

import java.util.Scanner;

public class P2839_R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int count = func(n, 0, 0);
		System.out.println(count);
	}

	public static int func(int n, int n_1, int count) {
		if (n == 0) { // 종료 파트
			return count;
		} else if (n < 0) {
			return -1;
		} else { // 유도 파트
			if (n % 5 == 0)
				count = func(n - 5, n, count + 1);

			else
				count = func(n - 3, n, count + 1);
//			if (n == n_1 || n < 0) {
//				return -1;
//			}

			return count;
		}
	}
}
