package algo0201;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 
N개 중 R개의 요소를 뽑아 나열하는 모든 경우의 수 구하기
출력 시, StringBuilder를 사용하자.

입력 예시
N R
배열 요소
====
4 3
7 8 9 10

====

출력 예시
====
7 8
7 9
7 10
8 7
8 9
8 10
9 7
9 8
9 10
10 7
10 8
10 9
====
 */
public class permutation_Q {
    static int N;    //arr의 크기(요소의 개수
    static int R;    //뽑을 개수
    
    static int[] arr;
    static int[] picked;
    static boolean[] isSelected;
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        R = sc.nextInt();
        
        arr = new int[N];
        picked = new int[R];
        isSelected = new boolean[N];
        
        for(int i=0; i<N; i++) arr[i] = sc.nextInt();
        
        
        permu(0);
        
        
        
    }

    public static void permu(int idx) {
    	if(idx == R) {
//    		System.out.println(Arrays.toString(picked));
    		StringBuilder sb = new StringBuilder();
    		for(int i: picked) {
    			sb.append(i + " ");
    		}
    		System.out.println(sb);
    		return;
    	} else {
    		for (int i = 0; i < N; i++) {
    			if(isSelected[i])
    				continue;
				picked[idx] = arr[i];
				isSelected[i] = true;
				permu(idx + 1);
				isSelected[i] = false;
			}
    	}
    }
    
}