package 순조부;

import java.util.Arrays;
import java.util.Iterator;

/*
 *  조합이란,
 *  순서 상관 없이, 중복이 없는 조합을 뜻한다.
 *  n개에서 r개의 요소를 중복 없이 뽑는 것.
 *  
 *  5개 중 3개의 조합을 뽑는 것.
 *  
 *  n_C_r = (n!) / r! * (n - r)! = 5! / 3! * 2! = 10
 * 
 */

public class 조합 {

	static int[] picked;
	static boolean[] isSelected;
	static int N = 5, R = 3;

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		picked = new int[R];
		isSelected = new boolean[N];

		System.out.println("#조합#");
		System.out.println("재귀");
		combination(arr, 0, 0);
		System.out.println();

		System.out.println("반복문");
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				if (arr[i] == arr[j])
					continue;
				for (int k = j + 1; k < N; k++) {
					if (arr[i] == arr[k] || arr[j] == arr[k])
						continue;
					System.out.println(++cnt + " :\t" + arr[i] + ", " + arr[j] + ", " + arr[k]);
				}
			}
		}

	}

	public static void combination(int[] arr, int idx, int start) {
		if (idx == R) {
			System.out.println(Arrays.toString(picked));
			return;
		}
		for (int i = start; i < N; i++) {
			if (isSelected[i])
				continue;
			isSelected[i] = true;
			picked[idx] = arr[i];
			combination(arr, idx + 1, i + 1);
			isSelected[i] = false;
		}
	}
}
