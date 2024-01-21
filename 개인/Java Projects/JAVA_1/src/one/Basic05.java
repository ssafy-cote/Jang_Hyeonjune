/*
 * 기본문제 #05
 * 
 * String "1234567890"의 자리 별 숫자를 1차원 배열에 저장하고
 * 배열을 순회해서 그 합을 출력하시오
 * 
 * 입력
 * "1234567890"
 * 
 * 출력
 * 입력 문자열의 숫자값
 * 0~9까지의 합
 */


package one;

public class Basic05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String val = "1234567890";
		
		int sum = 0;
		for(int x : val.toCharArray()) {
			sum += x - '0';
		}
		
		System.out.println(sum);
	}

}
