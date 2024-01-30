package algo0130;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Soultion_1208_Flatten_장현준_sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		for(int t=1; t<=10; t++) {
			int dump = s.nextInt();
			int[] arr = new int[100];
			
			for (int i = 0; i < 100; i++) {
				arr[i] = s.nextInt();
			}
			Arrays.sort(arr);
			
			for(int i=0; i<dump; i++) {
				arr[0] += 1;
				arr[99] -= 1;
				Arrays.sort(arr);
			}
			
			
			
			System.out.printf("#%d %d\n", t, arr[99] - arr[0]);
		}
	}

}
