/*
 * 백준 1074 Z
 * 
 * 한수는 크기가 2^N * 2^N인 2차원 배열을 Z모양으로 탐색하려고 한다. 예를 들어, 2x2
 * 배열을 왼쪽 위칸, 오른쪽 위칸, 왼쪽 아래칸, 오른쪽 아래칸 순서대로 방문하면
 * Z모양이다.
 * 
 * N이 주어졌을 때, r행 c열을 몇 번째로 방문하는지 출력하는 프로그램을 작성하시오.
 * 
 * 
 * 입력
 * 첫째 줄에 정수 N, r, c가 주어진다.
 * 1<= N <= 15
 * 0<= r, c <2^N
 * 
 * 
 * 출력
 * r행 c열을 몇 번째로 방문했는지 출력한다.
 * 
 * 
 * 원래는 배열을 구현해서 문제를 풀었으나, 메모리, 시간초과가 발생
 * 4분할 방식을 도입!
 * 
 * 분할을 하였으면, x와 y좌표도 같이 이동해야한다.
 * 지금 내가 하는 방식은 큰 수에서 작은 쪽으로니깐,,
 * 기존 좌표가 x,y라면
 * 1사분면 x / 2, y / 2이고
 * 2사분면 x, y / 2
 * 3사분면 x / 2, y
 * 4사분면 그대로
 * 
 * 차라리 
 * 
 */

package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1074 {
	static int[] dx = { -1, 0, -1, 0 };
	static int[] dy = { -1, -1, 0, 0 };
	static int count;
	static int r, c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		r = s.nextInt();
		c = s.nextInt();

		n = (int) Math.pow(2, n);
//		System.out.println(n);

//		arr = new int[n][n];
		df(n, n, n*n);
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<n; j++) {
//				System.out.print(arr[i][j] + "\t");
//			}
//			System.out.println();
//		}
//		System.out.println(arr[r][c]);
	}

	public static void df(int x, int y, int n) {
		if (y - 1 == r && x - 1 == c) {
			System.out.println(n - 1);
			return;
		} else {
			if (y - 1 >= r && x - 1 >= c) {
				// 오른쪽 아래(본인)
				df(x / 4, y / 4, n / 4 * 4);
			} else if (y - 1 >= r && x - 1 < c) {
				// 왼쪽 아래
				df((x - n / 2) / 4, y / 4, n / 4 * 3);
			} else if (y - 1 < r && x - 1 >= c) {
				// 오른쪽 위
				df(x / 4, (y - n / 2) / 4, n / 4 * 2);
			} else if (y - 1 < r && x - 1 < c) {
				// 왼쪽위
				df((x - n / 2) / 4, (y - n / 2) / 4, n / 4 * 1);
			}
		}
	}
}
