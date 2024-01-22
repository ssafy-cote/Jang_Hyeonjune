/*
 * 백준 2605 줄 세우기
 * 
 * 학생들이 한 줄로 줄을 선 수, 첫 번째 학생부터 차례로 번호를 뽑는다.
 * 첫 번째로 줄을 선 학생은 무조건 0번 번호를 받아 제일 앞에 줄에 선다.
 * 두 번재로 줄을 선 학생은 0번 또는 1번 둘 중 하나의 번호를 뽑는다.
 * 0번을 뽑으면 그 자리에 그대로, 1번을 뽑으면 바로 앞의 학생 앞으로 가서
 * 줄을 선다. 세 번째로 줄을 선 학생은, 0, 1또는 2중 하나의 번호를
 * 뽑는다. 그리고 뽑은 번호 만큼 앞자리로 가서 줄을 선다.
 * ...
 * 
 * 학생들이 처음에 줄을 선 순서대로 1번부터 번호를 매길 때,
 * 
 * 입력
 * 첫째 줄에 학생의 수(100 이하)
 * 둘째 줄에 학생들이 뽑은 번호가 주어진다
 * 
 * 출력
 * 최종 줄 순서
 * 
 * for문 2개 이용
 */

package baekjoon;

import java.util.Scanner;

public class P2605 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		// 학생수
		int n = s.nextInt();
		// 학생 뽑은 번호 배열
		int[] arr = new int[n];
		
		// 학생의 이동될
		int[] arr2 = new int[n];
		// 학생 배열
		int[] st = new int[n];
		
		int tmp;
		for(int i=0; i<n; i++) {
			tmp = s.nextInt();
			arr[i] = tmp;
			arr2[i] = i+1;
		}
		
		for(int i=0; i<n; i++) {
			tmp = arr[i];
			for(int j=0; j<tmp; j++) {
				
			}
		}
		
	}

}
