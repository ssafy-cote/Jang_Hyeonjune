package algo0130;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Soultion_1208_Flatten_장현준_unsorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		for(int t=1; t<=10; t++) {
			int dump = s.nextInt();
			int[] arr = new int[100];
			
			for (int i = 0; i < 100; i++) {
				arr[i] = s.nextInt();
			}
			
			int max;
			int max_idx=0;
			int min;
			int min_idx=0;
			for (int i = 0; i < dump; i++) {
				max = -1;
				min = 101;
				for (int j = 0; j < arr.length; j++) {
					if(arr[j] > max) {
						max = arr[j];
						max_idx = j;
					}
					if(arr[j] < min) {
						min = arr[j];
						min_idx = j;
					}
				}
				arr[max_idx]-=1;
				arr[min_idx]+=1;
			}

			max = -1;
			min = 101;
			for (int j = 0; j < arr.length; j++) {
				if(arr[j] > max) {
					max = arr[j];
					max_idx = j;
				}
				if(arr[j] < min) {
					min = arr[j];
					min_idx = j;
				}
			}
			
			System.out.printf("#%d %d\n", t, arr[max_idx] - arr[min_idx]);
		}
	}

}
