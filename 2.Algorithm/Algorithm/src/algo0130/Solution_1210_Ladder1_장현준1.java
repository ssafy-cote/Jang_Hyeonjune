/*
 * SWEA 1210 사다리문제
 * 
 * 100 X 100 배열이 주어졌을 때,
 * 도착지점(2)로 가는 출발 지점을 반환
 * 
 * 제약사항
 * 한 막대에서 출발한 가로선이 다른 막대를 가로질러서 연속하여 이어지는
 * 경우는 없다.
 * 
 * 입력
 * 첫 줄은테스트 케이스 번호가 주어지고
 * 둘째 줄부터 100 * 100 값이 주어진다.
 * 
 * 출력
 * #부호와 함게 테스트 케이스의 번호를 출력하고,
 * 공백 문자 후 도착하게 되는 출발점의 x좌표를 출력한다.
 * 
 */

package algo0130;

import java.util.Scanner;

public class Solution_1210_Ladder1_장현준1 {

	static int[] dx = { -1, 1 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		for (int t = 1; t <= 10; t++) {
			int test_case = s.nextInt();
			int[][] map = new int[100][100];
//		int[][] map = new int[10][10];
			int tmp;
			int endX = 0, endY = 0;

			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map.length; j++) {
					tmp = s.nextInt();
					map[i][j] = tmp;
					if (tmp == 2) {
						endX = j;
						endY = i;
					}
				}
			}

//		System.out.printf("Strat X : %d, Y : %d\n",endX,endY);

			while (endY != 0) {
				endY--;
				for (int i = 0; i < 2; i++) {
					if (endX + dx[i] >= 100 || endX + dx[i] < 0) // 확인할 때 범위를 벗어 나는지 확인
						continue;
					if (map[endY][endX + dx[i]] == 1) { // 양쪽을 확인한다.
						while (endX + dx[i] < 100 && endX + dx[i] >= 0) { // 범위 안에서만
							if (map[endY][endX + dx[i]] == 0) { // 범위를 벗어 나면
								break;
							}
							endX += dx[i];
						}
						break;
					}
				}
//			System.out.printf("X : %d, Y : %d\n",endX,endY);
			}
			System.out.printf("#%d %d\n", test_case, endX);
		}
	}

}
