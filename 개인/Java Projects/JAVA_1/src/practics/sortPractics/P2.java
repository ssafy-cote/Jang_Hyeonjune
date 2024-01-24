package practics.sortPractics;

import java.util.Arrays;

public class P2 {
	public static void main(String[] args) {
		// String 배열을 오름차순으로 정렬한 뒤, 출력해보세요.
		String[] strs = {"ㄹ", "ㅇ","ㄷ","ㄴ","ㅎ","ㄲ"};
		
		Arrays.sort(strs);
		
		System.out.println(Arrays.toString(strs));
	}
}
