package algo0130;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_2805_농작물수확하기_장현준 {

	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	
	static boolean[][] checked;
	static int[][] arr;
	static int sum;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		for(int t=1; t<=T; t++) {
			int n = Integer.parseInt(br.readLine());
			arr = new int[n][n];

			//농작물의 가치 입력
			for(int i=0;i<n;i++) {
				String s = br.readLine();
				for(int j=0;j<n;j++) {
					arr[i][j] = s.charAt(j)-'0';	//char 숫자 => int 
				}
			}
//			System.out.println(Arrays.deepToString(arr));
			checked = new boolean[n][n];
			def(n/2,n/2, n/2);
			System.out.println(sum);
		}
	}
	
	public static void def(int x, int y, int n) {
		if(n==0) { // 종료조건
//			System.out.printf("x : %d, y : %d, value : %d\n", x, y, arr[y][x]);
			checked[y][x]= true;
			sum+= arr[y][x];
			
		} else { // 유도부분
			sum += arr[y][x];
			checked[y][x] = true;
			for(int d=0; d<4; d++) {
				if(checked[y+dy[d]][x+dx[d]])
					continue;
				def(x+dx[d], y+dy[d], n-1);
			}
		}
	}
}
