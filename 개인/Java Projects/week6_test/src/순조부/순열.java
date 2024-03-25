package 순조부;

import java.util.Arrays;

/*
 *  순열이란,
 *  순서를 고려하여 중복하지 않게 뽑는것.
 *  n개의 원소 중 순서를 고려하여 r개의 요소를 뽑는다.
 *  
 *  아래 예시는 5개중 3개를 뽑는것
 *  n_P_r => 5! / (5-3)! = 20개의 경우의 수
 * 
 */

public class 순열 {

	static int[] picked;
	static boolean[] isSelected;
	static int N = 5, R = 3;

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };

		picked = new int[R];
		isSelected = new boolean[N];

		System.out.println("#순열#");
		System.out.println("재귀");
		permutation(arr, 0);
		System.out.println();
		System.out.println("반복문");
		int cnt=0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (arr[i] == arr[j])
					continue;
				for (int k = 0; k < N; k++) {
					if (arr[i] == arr[k] || arr[j] == arr[k])
						continue;
					System.out.println((++cnt)+" :\t" + arr[i] + ", " + arr[j] + ", " + arr[k]);
				}
			}
		}
	}

	public static void permutation(int[] arr, int idx) {
		if (idx == R) {
			System.out.println(Arrays.toString(picked));
			return;
		}

		for (int i = 0; i < N; i++) {
			if (isSelected[i])
				continue;
			isSelected[i] = true;
			picked[idx] = arr[i];
			permutation(arr, idx + 1);
			isSelected[i] = false;
		}
		
		
	}
}
