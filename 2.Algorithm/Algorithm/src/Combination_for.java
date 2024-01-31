import java.util.Arrays;

/*
 * {1,2,3,4} 중 원소 3개를 포함하는 모든 조합을 생성
 * 
 * 
 */

public class Combination_for {
	static int[] numbers;

	static int N;
	static int R;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4 };

		N = 4;
		R = 3;

		// 내가 생각한 방식 => 이건 순열방식이다! 정신차려!
//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < N; j++) {
//				if(i != j) {
//					for (int k = 0; k < N; k++) {
//						if(i != k && j !=k) {
//							System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
//						}
//						
//					}
//				}
//			}
//			
//		}
//		// 강사님이 알려주신방식
//		// 앞녀석이 사용한거 이후 부터 뒤를 선택
//		for (int i = 0; i < N; i++) {
//			for (int j = i+1; j < N; j++) {
//				for (int k = j+1; k < N; k++) {
//					System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
//				}
//
//			}
//
//		}
		
		numbers = new int[N];
	}
	
	//조합
	private static void comb(int idx, int start) {
		if (idx == N) {
			System.out.println(Arrays.toString(numbers));
			return;
		}
		// 시작점부터 가능한 끝까지 선택하는 시도
		for (int i = start; i <= 6; i++) {
			numbers[idx] = i; // 선택한 수 저장
			comb(idx + 1, i + 1); // 현재 선택한 수의 다음부터 선택하도록 시작점 주기!!!
		}
	}

	// 중복조합
	private static void comb2(int idx, int start) {
		if (idx == N) {
			System.out.println(Arrays.toString(numbers));
			return;
		}
		// 시작점부터 가능한 끝까지 선택하는 시도
		for (int i = start; i <= 6; i++) {
			numbers[idx] = i; // 선택한 수 저장
			comb(idx + 1, i); // 현재 선택한 수의 다음부터 선택하도록 시작점 주기!!!
		}
	}
}
