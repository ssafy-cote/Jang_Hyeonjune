/*
 * 기본 문제 #11
 * 
 * 배열이 주어졌을 때, 평균(1)을 구하고, 평균과 차의 절대값이 가장 큰 값(2)과
 * 가장 작은값(3)을 출력
 * 
 * (1)은 실수로 소수점 셋째자리에서 반올림
 * (2),(3)의 값이 여러개 일 경우 아무 값이나 출력
 * 
 * 입력
 * int[] intArray = {3, 27, 13, 8, 235, 7, 22, 9, 435, 31, 54};
 * 
 * 출력
 * (1) 평균
 * (2) 평균과 차의 절대값이 가장 큰 값
 * (3) 평균과 차의 절대값이 가장 작은 값
 * 
 * 
 */

package one;

public class Basic11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {3, 27, 13, 8, 235, 7, 22, 9, 435, 31, 54};
		double Max = Double.MIN_VALUE;
		double Min = Double.MAX_VALUE;
		
		int sum = 0;
		for(int i: intArray) {
			sum += i;
		}
		
		double avg = 1.0 * sum / intArray.length;
		int Max_idx=0;
		int Min_idx=0;
		
		for(int i=0; i<intArray.length;i++) {
			double diff = Math.abs(avg - intArray[i]);
			if (diff > Max) {
				Max = diff;
				Max_idx = i;
			}
			if(diff < Min) {
				Min = diff;
				Min_idx = i;
			}
		}
		
		System.out.printf("(1)평균 : %.2f, (2)평균차 큰 값 %d, (3)평균차 작은 값 %d", avg, intArray[Max_idx], intArray[Min_idx]);		

	}

}
