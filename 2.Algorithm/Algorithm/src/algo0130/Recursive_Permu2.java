package algo0130;

import java.util.Arrays;
import java.util.Scanner;

public class Recursive_Permu2 {

	static int N;	// 1~5까지의 숫자
	static int R;	// 뽑을 갯수
	
	static int[] picked;	// 뽑은 요소 정보
	static boolean[] isSelected; // 사용 여부
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		N = s.nextInt();
		R = s.nextInt();
		
		picked = new int[R];
		
		isSelected = new boolean[N+1]; // 1~N
		permu(0);
	}

	/**
	 *  숫자 한 개를 뽑고 다음 자리의 숫자는 재귀함수 호출로 맡는다.
	 */
	private static void permu(int idx) {
		if(idx==R) {
			System.out.println(Arrays.toString(picked));
			return;
		}
		
		for(int i=1; i<=N; i++) {
			if(isSelected[i]) continue;
			
			picked[idx] = i;
			isSelected[i] = true; // 사용여부 체크
			
			permu(idx+1); 	// 다음 요소 뽑기는 재귀에 맡기기
			
			isSelected[i] = false;
		}
	}
}
