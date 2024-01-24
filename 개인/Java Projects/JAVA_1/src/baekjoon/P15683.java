/* 
 * 백준 15683 감시
 * 
 * N X M의 크기의 배열이 주어질 때, 
 * 0~6까지의 값들이 주어진다.
 * 0은 바닥, 1~5 CCTV, 6은 벽이다.
 * 
 * CCTV는 보는 방향에 따라서 사무실 끝까지 볼 수 있지만,
 * 벽 너머는 볼 수 없다.
 * 1번 CCTV는 한방향
 * 2번 CCTV는 한 줄
 * 3번 CCTV는 ㄴ자 
 * 4번 CCTV는 ㅗ자
 * 5번 CCTV는 +자
 * 이다.
 * 
 * 입력
 * 첫째 줄에 세로크기 N과 가로크기 M이 주어진다. (1 <= N,M <= 8)
 * 둘째 줄부터는 사무실 각 칸의 정보가 주어진다.
 * CCTV의 최대 개수는 8개를 넘지 않는다.
 * 
 * 출력
 * 첫째 줄에 남은 바닥의 최소 크기
 * 
 * 최대한 많은 것을 커버해야한다.
 * 많은 것을 커버 할 수 있는 건 5번이다.
 * 5 -> 1 순으로 우선 순위로 주고
 * 남는 곳을 찾는 아이디어.
 * 
 */

package baekjoon;

import java.util.Scanner;

public class P15683 {

	public static int[] dx = { -1, 1, 0, 0 };	//좌, 우, 하, 상
	public static int[] dy = { 0, 0, -1, 1 };
	public static int[][] arr;
	public static int[][] arr2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int m = s.nextInt();

		arr = new int[n][m];
		arr2 = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = s.nextInt();
				if(arr[i][j] == 6)
					arr2[i][j] = 1;
			}
		}

	}

	public void def(int y, int x, int cctv) {
		//현재 상태 따로 저장
		int[][] tmp1 = arr.clone();
		int[][] tmp2 = arr.clone();
		int[][] tmp3 = arr.clone();
		int[][] tmp4 = arr.clone();
		
		//좌
		//우
		//하
		//상
	}
}
