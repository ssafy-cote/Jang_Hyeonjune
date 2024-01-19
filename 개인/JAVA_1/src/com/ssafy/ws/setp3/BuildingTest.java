package com.ssafy.ws.setp3;

import java.util.Scanner;

/* 
 * @@@@문제가 이해가 안가거나, 뭔가 이상하다 테스트케이스로 확인해보기
 * 
 * 
 * 3-3빌딩 문제
 * 
 * N인 정사각형의 형태
 * 가로, 세로 길이가 1인 구획
 * 빌딩 B, 공원 조성단지 G
 * 인접한 구획에 공원 조성단지 G가 있다면 2층 높이로 세울 수 있고
 * 인전합 구획에 공원조성 단지 G가 없다면 현 위치의 가로 위치에 있는 빌딩구획 B와
 * 세로 위치의 빌딩 구획 B의 수를 더한 크기 만큼 빌딩을 세울 수 있다.
 * 
 * 가장 높이 세울수 있는 빌딩은 몇층?
 * 
 * 1. G의 인접 모든 B는 전부 2
 * 2. G가 없이 비어있는 곳은 주변 B만큼의 크기의 숫자만큼
 * 3. 세로위치와 가로위치라면.. 한줄을 말하는건가?
 * 
 * 입력 
 * 테스트 케이스 T
 * 배열의 크기 N
 * 각 배열의 N * N만큼의 B와 G 입력
 * 
 * 출력
 * #T 가장 높은 빌딩 높이
 */
public class BuildingTest {

	public static void main(String[] args) throws Exception{
		int[] deltaX = { -1, 1, 0, 0, 1, -1, 1, -1 };
		int[] deltaY = { 0, 0, -1, 1, -1, 1, 1, -1 };

		Scanner s = new Scanner(System.in);

		int T = s.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int N = s.nextInt();
			char[][] area = new char[N][N];
			int[][] arr = new int[N][N];
			
			// 위치 입력
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					area[i][j] = s.next().charAt(0);			
				}
			}

			// 공원 근처 B의 크기 2
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (area[i][j] == 'G') {
						for (int d = 0; d < 8; d++) {
							if ((deltaX[d] + j >= 0 && deltaX[d] + j < N)
									&& (deltaY[d] + i >= 0 && deltaY[d] + i < N)) {
//							area[deltaY[d]+i][deltaX[d]+j] = 2;
								arr[deltaY[d] + i][deltaX[d] + j] = 2;
							}
						}
					}
				}
			}
//			for (int i = 0; i < N; i++) {
//				for (int j = 0; j < N; j++) {
//					System.out.print(area[i][j] + " ");
//				}
//				System.out.println();
//			}

			// 이미 지정된 곳을 제외한 나머지 빌딩
			// 새로줄 가로줄 본인을 포함 카운팅
			int Max = Integer.MIN_VALUE;

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					// 이미 층수가 결정된 곳은 제외
					if (arr[i][j] != 0)
						continue;
					int sum = 0;
					// 좌
					int x = j;
					while (x > 0) {
						x--;
						if (area[i][x] == 'B')
							sum++;
//						if (area[i][x] == 'G')
//							break;
					}
					// 우
					x = j;
					while (x < N - 1) {
						x++;
						if (area[i][x] == 'B')
							sum++;
//						if (area[i][x] == 'G')
//							break;
					}
					// 상
					int y = i;
					while (y > 0) {
						y--;
						if (area[y][j] == 'B')
							sum++;
//						if (area[y][j] == 'G')
//							break;
					}
					// 하
					y = i;
					while (y < N - 1) {
						y++;
						if (area[y][j] == 'B')
							sum++;
//						if (area[y][j] == 'G')
//							break;
					}
					// 현재 위치 포함하기
					sum++;
					if (sum > Max)
						Max = sum;
//					area[i][j] = sum;
					arr[i][j] = sum;
				}
			}
//			for (int i = 0; i < N; i++) {
//				for (int j = 0; j < N; j++) {
//					System.out.print(arr[i][j] + " ");
//				}
//				System.out.println();
//			}
			System.out.printf("#%d %d\n", test_case, Max);
		}
	}
}
