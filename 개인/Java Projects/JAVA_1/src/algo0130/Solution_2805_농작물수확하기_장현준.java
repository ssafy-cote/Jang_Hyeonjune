package algo0130;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * SWEA 2805 농작물 수확하기
 * 
 * 메모리 : 
 * 시간 : 
 * 
 * N X N크기의 농장이 있따.
 * 이 농장에는 이상한 규칙이 있다.
 * 
 * 규칙은 다음과 같다.
 * 
 * 1. 농장의 크기는 항상 홀수이다.
 * 2. 수확은 항상 농장의 크기에 딱 맞는 정사각형
 * 마름모 형태로만 가능하다.
 * 
 * 1 X 1크기의 농장에서 자라는 농작물을 수확하여 얻을 수 있는 수익은 3이다.
 * 3 X 3크기의 농장에서 자라는 농작물을 수확하여 얻을 수 있는 수익은 16 (3 + 2 + 5 + 4 + 2)이다.
 * 5 X 5크기의 농장에서 자라는 농작물의 수확하여 얻을 수 있는 수익은 25 (3 + 2 + 1 + 1 + 2 + 5 + 1 + 1 + 3 + 3 + 2 + 1)이다.
 * 농장의 크기 N와 농작물의 가치가 주어질 때, 규칙에 따라 얻을 수 있는 수익은 얼마인지 구하여라.
 * 
 * @제약 사항
 * 농장의 크기 N은 1 이상 49 이하의 홀수이다. (1<= N <=49)
 * 농작물의 가치는 0~5이다.
 * 
 * @입력
 * 테스트케이스 개수 T
 * 각 테스트케이스에는 농장의 크기 N과
 * 그 다음줄부터 N줄부터 N * N크기의 농작물의 가치가 주어진다.
 * 
 * @출력
 * 각줄은 #t에 한 칸 띄우고 농장 규칙에 맞는 최대 수익을 출력한다.
 * 
 */

public class Solution_2805_농작물수확하기_장현준 {

	static int[][] farm;
	static int N, sum;
	static boolean[][] isSelected;
	static int[] dx = {-1, 0, 1, 0 };
	static int[] dy = {0, -1, 0, 1 };

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int T = Integer.parseInt(st.nextToken());

		for (int t = 1; t <= T; t++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			sum = 0;
			
			farm = new int[N][N];
			isSelected = new boolean[N][N];
			for (int i = 0; i < N; i++) {
//				st = new StringTokenizer(br.readLine());
				String str = br.readLine();
				for (int j = 0; j < N; j++) {
					farm[i][j] = str.charAt(j) - '0';
				}
			}

			
			df(N/2, N/2, N/2);
			
//			for (int i = 0; i < N; i++) {
//				for (int j = 0; j < N; j++) {
//					System.out.print(isSelected[i][j] + "\t");
//				}
//				System.out.println();
//			}
			System.out.printf("#%d %d\n", t, sum);
		}
	}

	public static void df(int x, int y, int n) {
		if (n == 0) {
			return;
		}
		for (int d = 0; d < 4; d++) {
			if(!isSelected[y+dy[d]][x+dx[d]])
				sum+=farm[y+dy[d]][x+dx[d]];
				isSelected[y+dy[d]][x+dx[d]] = true;
			
			df(x+dx[d],y+dy[d], n-1);
		}
	}
}
