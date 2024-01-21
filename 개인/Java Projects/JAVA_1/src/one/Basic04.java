/*
 * 기본 문제 #04
 * char[]을 이용해 String "SSAFY"의 각 문자를 저장하고
 * 출력하는 코드를 작성하시오
 * 
 * 입력
 * SSAFY
 * 
 * 출력
 * char[]의 각 원소
 */

package one;

public class Basic04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String org = "SSAFY";
		
		char[] cha = new char[org.length()];
		
		for(int i=0 ; i<cha.length; i++) {
			cha[i] = org.charAt(i); 
		}
		
		for(char x: cha) {
			System.out.println(x);
		}
		
		// API의 활용
		char[] chars = org.toCharArray();
		for(char x: chars) {
			System.out.println(x);
		}
	}

}
