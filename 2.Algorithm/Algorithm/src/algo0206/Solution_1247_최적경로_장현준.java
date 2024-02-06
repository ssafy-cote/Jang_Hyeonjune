package algo0206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 
 * SWEA 1247 최적경로
 * 
 * 김대리는 회사에서 출발하여 냉장고 배달을 위해 N명의 고객을 방문하고
 * 자신의 집에 돌아가려한다.
 * 회사와 집의 위치, 그리고 각 고객의 위치는 이차원 정수 좌표(x,y)로
 * 주어지고 (0<=x<=100, 0<=y<=100)
 * 
 * 두위치 x1,y1 / x2,y2의 사이의 거리는 |x1-x1| + |y1-y2|으로 계산된다.
 * 회사에서 출발하여 N명의 고객을 모두 방문하고 집으로 돌아오는 경로 중 가장
 * 짧은 것을 찾으려 한다.
 * 
 * 회사와 집의 좌표가 주어지고, 2명에서 10명 사이의 고객 좌표가 주어질 때,
 * 회사에서 출발해서 이들을 모두 방문하고 집에 돌아가는 경로중 총 이동거리가
 * 가장 짧은 경로를 찾는 프로그램을 작성하라.
 * 
 * 이동거리만 밝히면 된다.
 * 
 * 완탐으로 찾아도 좋다.
 * 
 * @제약사항
 * 고객의 수 N은 2<=N<=10이다.
 * 회사의 좌표, 집의 좌표를 포함한 모든 N+2개의 좌표는 서로 다른 위치에 있으며 좌표의 값은 0이상 100 이하의 정수로 이루어진다.
 *
 * @입력
 * 가장 첫줄은 전체 테스트케이스의 수이다.
 * 두 줄에 테스트 케이스 하나씩이 차례로 주어진다.
 * 
 * 각 테스트케이스의 첫째 줄에는 고객의 수 N이 주어진다.
 * 둘째줄에는 회사의 좌표, 집의 좌표, N명의 고객의 좌표가 차례로 나열된다.
 * 좌표는 (x,y)쌍으로 구성되는데 입력에서는 x와 y가 공백으로 구분되어 제공된다.
 * 
 * @출력
 * 총 10줄에 10개의 테스트 케이스 각각에 대한 답을 출력
 * "#t"로 시작하고 공백을 하나 둔 다음 최단 경로의 이동거리를 기록한다.
 * 
 * @해결방안
 * N+2개의 배열을 만든 후 완탐 => 순열
 * 
 * 
 */

public class Solution_1247_최적경로_장현준 {

	static int[] range;
	static boolean[] isSelected;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());

		for(int t=1; t<=T; t++) {
			
		}
		
	}
}
