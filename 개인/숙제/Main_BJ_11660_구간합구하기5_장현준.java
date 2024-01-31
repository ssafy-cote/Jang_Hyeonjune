package algo230131;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 
 * 
 * 백준 15650 N과 M(2)
 * 
 * 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인
 * 수열을 모두 구하는 프로그램을 작성하시오.
 * 
 * * 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
 * * 고른 수열은 오름차순이어야 한다.
 * 
 * @입력
 * 첫째 줄에 자연수 N과 M이 주어진다. (1<=N<=M<=8)
 * 
 * @출력
 * 한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력
 * 중복되는 수열은 여러 번 출력하면 안되며, 각 수열은
 * 공백으로 구분해서 출력
 * 
 * 수열은 사전 순으로 증가하는 순서로 출력해야한다.
 * 
 * @해결 방안
 * 조합을 구현하여 풀기.
 * def(int idx, int start);
 * 
 */

public class Main_BJ_11660_구간합구하기5_장현준 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N + 1][N + 1];    // 합이 저장된 배열

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i][j - 1] - arr[i - 1][j - 1] + Integer.parseInt(st.nextToken());
            }
        }
        int x1, y1, x2, y2;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());

            System.out.println(arr[x2][y2] - arr[x2][y1 - 1] - arr[x1 - 1][y2] + arr[x1 - 1][y1 - 1]);
        }
	}

}
