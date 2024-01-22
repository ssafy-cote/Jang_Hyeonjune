/*
 * 모음사전
 * 
 * 사전에 알파벳 모음 'A', 'E', 'I', 'O', 'U'만을 사용할 수 있는
 * 길이 5이하의 모든 단어가 수록되어있다.
 * 사전의 첫 번째 단어는 "A"이고, 그 다음은 "AA"이며, 마지막 단어는
 * "UUUUU"이다.
 * 
 * 단어 하나 word가 주어 질 때, 이 단어가 사전에서 몇 번 째단어인지
 * 출력하시오.
 * 
 * 입력
 * word의 길이는 1이상 5이하
 * 대문자 'A','E','I','O','U'로만 이루어져 있다.
 * 
 * 출력
 * {word}는 몇 번째 단어
 * 
 * String[]에 모든 경우의 수를 구현 => 완전탐색
 * 
1	A
2	AA
3	AAA
4	AAAA
5	AAAAA
6	AAAAE
7	AAAAI
8	AAAAO
9	AAAAU
10	AAAE
11	AAAEA
12	AAAEE
13	AAAEI
14	AAAEO
15	AAAEU
16	AAAIA
17	AAAIE
18	AAAII
19	AAAIO
20	AAAIU


..	AAE
	AAEA
	AAEAA
 * 
 * 
 */

package programmers;

import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {

	static HashMap<String, Integer> dic;

	static String[] Gaters = {"A","E","I","O","U"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dic = new HashMap<String, Integer>();
		
		def("", 0);

		Scanner s = new Scanner(System.in);
		
		String search = s.nextLine();
		
		System.out.println(dic.get(search));
		
	}
	
	public static void def(String str, int len) {
		dic.put(str, dic.size());
		if(len==5)
			return;
		for(int i=0; i<5; i++) {
			def(str + Gaters[i], len + 1);
		}
	}

}
