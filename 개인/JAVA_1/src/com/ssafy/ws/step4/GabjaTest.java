/*
 * 2022. 60갑자 변환하기
 * 
 * 60갑자는 십간과 십이지를 순서대로 조합하여 만든 60개의 간지를 말한다.
 * 60갑자를 입력하면 1800년부터 2100년까지의 연도 중에서 해당하는 연도를 출력한다.
 * '종료'를 입력하면 프로그램을 종료한다.
 * 올바른 경우에만 출력, 아닐 시 "잘못된 입력"이라는 문구화 함께 넘어간다.
 * 
 * 1.십간 : 갑,을,병,정,무,기,경,신,임,계
 * 2.십이지 : 자,축,인,묘,진,사,오,미,신,유,술,해
 * 
 * 조선 세종26년(1444년)을 갑자년 원년으로 한다.
 * 1444년은 갑자년, 1445년은 읍축년, 1446병인년
 * 
 * 입력
 * 60갑자를 입력하세요:
 * 
 * 출력
 * 1800년~2100년까지의 입력받은 60갑자의 해당 년도 모두 출력
 * 종료 입력시 프로그램 종료
 * 잘못된 입력시 "잘못된 입력: 출력
 * 
 * hint
 * 계산법 : 해당 연도에서 -4 이후 각각 10과 12로 나누어 대응
 * 
 */

package com.ssafy.ws.step4;

import java.util.Arrays;
import java.util.Scanner;

public class GabjaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] gan = {"갑","을","병","정","무","기","경","신","임","계"};
		String[] easy = {"자","축","인","묘","진","사","오","미","신","유","술","해"};
		
		String[] gabja = new String[60];
		
		

		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("60갑자를 입력하세요: ");
			String str = s.nextLine();
			if (str.equals("종료"))
				break;
//			else if() {
//				System.out.println("잘못된 입력");
//			}
		}
	}

}
