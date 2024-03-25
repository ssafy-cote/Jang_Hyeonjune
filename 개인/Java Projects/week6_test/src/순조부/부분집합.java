package 순조부;

/* 
 * 부분집합이란?
 * 
 * 해당 집합의 원소들로 이루어진 모든 집합, 공집합도 가능
 * 부분집합의 개수 = 2^N
 * 
 * 원소 5개의 부분집합 개수 = 2^3 = 8개
 * 
 */

public class 부분집합 {

	static int[] picked;
	static boolean[] isSelected;
	static int N = 3;
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3};
		picked = new int[N];
		isSelected = new boolean[N];
		
		System.out.println("#부분집합#");
		System.out.println("재귀");
		Subset(arr, 0);
		System.out.println();
		
		System.out.println("반복문");
		for (int i = 1; i >= 0; i--) {
			picked[0] = i;
			for (int j = 1; j >= 0; j--) {
				picked[1] = j;
				for (int k = 1; k >= 0; k--) {
					picked[2] = k;
					for (int m = 0; m < picked.length; m++) {
						System.out.print(picked[m]==1?arr[m] + " ": "X ");
					}
					System.out.println();
				}
			}
		}
	}

	public static void Subset(int[] arr, int idx) {
		if(idx == N) {
			for (int i = 0; i < N; i++) {
				System.out.print(isSelected[i]?arr[i] + " ":"X ");
			}
			System.out.println();
			return;
		}
		isSelected[idx] = true;
		Subset(arr, idx+1);
		isSelected[idx] = false;
		Subset(arr, idx+1);
	}
}
