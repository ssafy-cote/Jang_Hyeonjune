package algo0130;

import java.util.Arrays;
import java.util.Scanner;

public class Recursive_Permu3 {

	static int N;	// 1~5까지의 숫자
	static int R;	// 뽑을 갯수
	
	static int[] arr;
	
	static int[] picked; // 뽑힌 상자
	static boolean[] isSelected; // 지금 픽욌던 것을 담는 상자 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		N = s.nextInt();
		R = s.nextInt();
		arr = new int[N];
		
		for (int i =0; i < N; i++) {
			arr[i] = s.nextInt();
		}
		
		picked = new int[R];
		isSelected = new boolean[N];
		
		permu(0);
	}

	/**
	 *  숫자 한 개를 뽑고 다음 자리의 숫자는 재귀함수 호출로 맡는다.
	 */
	public static void permu(int idx) {
		if(idx == R) { // 종료조건
			System.out.println(Arrays.toString(picked));
		} else { // 유도 부분
			for(int i=0; i<N; i++) {
				if(isSelected[i]) continue;
				picked[idx] = arr[i];
				isSelected[i] = true;
				
				permu(idx + 1);
				
				isSelected[i] = false;
			}
		}
	}
	
}
