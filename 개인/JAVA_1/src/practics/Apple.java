package practics;

import java.util.Scanner;

public class Apple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] deltaX = { -1, 1, 0, 0};
		int[] deltaY = { 0, 0, -1, 1};
		
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		
		int[][] arr = new int[N][N];
		
		
		for(int i=0; i<N;i++) {
			for(int j=0; j<N; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		
		int Max = Integer.MIN_VALUE;
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				int sum = arr[i][j];
				for (int d = 0; d < 4; d++) {
					if ((deltaX[d] + j >= 0 && deltaX[d] + j < N)
							&& (deltaY[d] + i >= 0 && deltaY[d] + i < N)) {
						sum += arr[deltaY[d] + i][deltaX[d] + j];
					}
				}
				if(sum > Max)
					Max = sum;
			}
		}
		System.out.println(Max);
	}

}
