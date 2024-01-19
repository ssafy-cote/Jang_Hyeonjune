/*
 * 4방탐색 기본 문제 1
 * 
 * X와 밀접한 숫자의 총합을 출력하시오.
 * 밀접한 숫자는 X로 부터 상,하,좌,우를 지칭하며, 숫자는 중복해서 더해질 수 있다.
 * 
 * 입력
 * 첫째 줄 행, 열 크기
 * 둘째 줄 부터 숫자, X정보
 * 
 * 출력
 * X의 상하좌우를 더한 모든 값
 */

package practics;

import java.util.Arrays;
import java.util.Scanner;

public class Four_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		int R = s.nextInt();
		int C = s.nextInt();

		char[][] arr = new char[R][C];

		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				arr[i][j] = s.next().charAt(0);
			}
		}
//		System.out.println(Arrays.deepToString(arr));
		int sum = 0;
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
//				System.out.printf("i %d, j %d\n", i, j);
				// X를 만나면
				if (arr[i][j] == 'X') {
					// 상
					if (i - 1 >= 0 && arr[i-1][j] != 'X' )
						sum += arr[i - 1][j] - '0';
					// 하
					if (i + 1 < R && arr[i+1][j] != 'X' )
						sum += arr[i + 1][j] - '0';
					// 좌
					if (j - 1 >= 0 && arr[i][j-1] != 'X' )
						sum += arr[i][j - 1] - '0';
					// 상
					if (j + 1 < C && arr[i][j+1] != 'X' )
						sum += arr[i][j + 1] - '0';
				}
			}
		}
		System.out.println(sum);
	}

}
