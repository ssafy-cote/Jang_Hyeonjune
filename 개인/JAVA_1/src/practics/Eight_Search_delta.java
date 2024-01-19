package practics;

import java.util.Scanner;

public class Eight_Search_delta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] deltaX = new int[] { 1, -1, 0, 0, 1, -1, 1, -1 }; // 우 좌 하 상 
		int[] deltaY = new int[] { 0, 0, 1, -1, 1, 1, -1, -1 };// 우 좌 하 상

		Scanner s = new Scanner(System.in);

		int R = s.nextInt();
		int C = s.nextInt();

		char[][] arr = new char[R][C];
		int[][] arr2 = new int[R][C];

		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				arr[i][j] = s.next().charAt(0);
			}
		}
//		System.out.println(Arrays.deepToString(arr));
		int sum = 0;
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				for (int d = 0; d < 8; d++) {
					// x 확인
					if (arr[i][j] == 'X') {
						// 범위 확인
						if (deltaX[d] + j >= 0 && deltaX[d] + j < C && deltaY[d] + i >= 0 && deltaY[d] + i < R) {
							// 탐색 범위 X 제외
							if (arr[deltaY[d] + i][deltaX[d] + j] != 'X') {
								// 이미 탐색한 범위면 제외
								if (arr2[deltaY[d] + i][deltaX[d] + j] == 0) {
									sum += arr[deltaY[d] + i][deltaX[d] + j] - '0';
									arr2[deltaY[d] + i][deltaX[d] + j]++;
								}
							}
						}
					}
				}
			}
		}
		System.out.println(sum);
	}

}
