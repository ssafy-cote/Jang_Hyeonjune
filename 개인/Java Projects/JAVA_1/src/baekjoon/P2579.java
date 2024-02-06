package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

/* 
 * 백준 2579 계단
 * 
 * 계단은 한번에 한단계씩 또는 두계단씩 올라갈 수 있다.
 * 연속된 세 개의 계단을 모두 밟아서는 안된다. 단, 시작점은 계단에 포함되지 않는다.
 * 마지막 도각계단은 반드시 밟아야한다.
 * 각 계단에 점수가 있을 때 이 게임에서 얻을 수 있는 총 점수의 최댓값을 구하는 프로그램을 작성하시오.
 * 
 * @입력
 * 입력의 첫째 줄에 계단의 개수가 주어진다.
 * 둘째 줄부터 한 줄에 하나씩 제일 아래에 놓인 계단부터 순서대로
 * 각 계단에 쓰여 있는 점수가 주어진다.
 * 계단의 개수는 300이하의 자연수이고, 계단에 쓰여있는 점수는
 * 10000이하의 자연수이다.
 * 
 * @출력
 * 첫째 줄에 계단 오르기 게임에서 얻을 수 있는 총 점수의 최댓값을 출력한다.
 * 
 * @해결방안
 * 완탐..?하기에는 최대 300개의 계단이기 때문에 경우의수가 터진다..
 * 
 * 
 */

public class P2579 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N+1];
		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
	}

}
