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
 * 
 */

package baekjoon;

import java.util.Scanner;

public class P1074 {

	static int[][] arr;
	static int[] dx = {0,1,0,1};
	static int[] dy = {0,0,1,1};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r = s.nextInt();
		int c = s.nextInt();
		
		arr = new int[n][n];
	}

	public static void df() {
		
	}
}
