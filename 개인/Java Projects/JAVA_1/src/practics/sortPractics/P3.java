package practics.sortPractics;

import java.util.Arrays;
import java.util.Comparator;

public class P3 {
	public static void main(String[] args) {
		// String 배열을 오름차순으로 정렬한 뒤, 출력해보세요.
		String[] strs = {"ㄹ", "ㅇ","ㄷ","ㄴ","ㅎ","ㄲ"};
		
//		Arrays.sort(strs, new Comparator<String>().reversed());
		Arrays.sort(strs, (o1, o2)-> {
			return o2.compareTo(o1);
		});
		
		System.out.println(Arrays.toString(strs));
	}
}
