package algo230131;

import java.util.Scanner;

public class Solution_1954_달팽이숫자_장현준 {

	static int n;
	static int[][] arr;

	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int T = s.nextInt();

		for (int i = 1; i <= T; i++) {
			n = s.nextInt();
			arr = new int[n][n];

			int cnt = 1;
			int d = 0;
			int x = 0;
			int y = 0;
			while (n * n > cnt) {
				if (cnt % (n-1) == 0) {
					d++;
				}
				
				arr[y][x] = cnt;
				
				cnt++;
				x += dx[d];
				y += dy[d];
				
			}
		}
		
		for (int i = 0; i < n; i++) {
			for(int j=0; j<n ; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

	// 좀더 고민해 보기
//	public static void df(int x, int y, int cnt) {
//		if(n == cnt) {
//			arr[y][x] = cnt;
//			return;
//		} else {
//			arr[x][y] = cnt;
//		}
//	}
}
