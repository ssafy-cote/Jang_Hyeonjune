package algo0201;

import java.util.Scanner;

/*
 * SWEA 6808 규영이와인녕이의 카드게임
 * 
 * 1~18장 카드를 각각 9장씩 나눠 갖는다.
 * 아홉라운드를 진행하며 각자 카드를 냈을때, 더 숫자가 높은 사람이
 * 둘의 차이만큼 점수를 가져간다.
 * 마지막에 총점이 더 높은 사람이 승자가된다.
 * 총점이 같으면 무승부이다.
 * 
 * 규영이가 내는 카드의 순서를 고정하면, 인영이가 어떻게 카드를
 * 내는지 9!가지 순서에 따라 규영이의 승패가 정해질 것이다.
 * 
 * 이때, 규영이가 이기는 경우와 지는 경우가 총 몇 가지인지 구하는
 * 프로그램을 작성
 * 
 * @입력 
 * 첫 번째 줄에 테스트 케이스의 수 T가 주어진다.
 * 각테스트케이스의 첫 번째 줄에는 아홉개의 정수가 공백으로 구분되어 주어진다.
 * 각 정수는 1~18 같은 정수는 없다.
 * 
 * 
 * @출력
 * "#T" 한칸 띄우고 이기는 경우의수와 지는 경우의 수를 출력
 * 
 * @해결방안
 * 1. isSelected 를 활용하여 이전에 사용된 카드가 없게끔
 * 2. 조합으로 2개를 골라서 이겼는지 졌는지 확인 
 * 
 * ===============================================
 * 문제 해결 프로세스
 * 0. 인영이의 카드정보 저장
 * 1. 인영이의 9라운드 카드 순서 정하기
 * 		* 
 * 2. 규영이의 인영이의 총점 구하기
 * 3. 총점 비교 후, 승패 횟수 cnt
 * 
 *  
 * 
 */

public class Solution_6808_규영이와인영이의카드게임_장현준 {
	
	static int[] picked = new int[2];
	static int[] arr = new int[19];
	static boolean[] isSelected = new boolean[19];
	static int win,loss;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int T = s.nextInt();
		
		
		
		for(int t=1; t<=T; t++) {
			int card = s.nextInt();
			win = 0;
			loss = 0;
			for(int i=0; i<9; i++) {
				comb(i,i);
			}
		}
	}

	public static void comb(int idx, int start) {
		if(idx==2) {
			if(picked[0] > picked[1]) {
				win++;
			} else {
				loss++;
			}
			return;
		}
		
		for(int i=start; i<=18; i++) {
			if(isSelected[i]) continue;
			picked[idx] = i;
			isSelected[i] = true;
			comb(idx+1, i+1);
			isSelected[i] = false;
		}
	}
}
