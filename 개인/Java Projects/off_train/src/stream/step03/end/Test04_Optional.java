package stream.step03.end;

import java.util.Arrays;
import java.util.Optional;

public class Test04_Optional {
	public static void main(String[] args) {
		String[] data = { };
//		data = new String[] {"싸피", "11기", "대전"};
		
		
//		// max(Comparator)
//		Optional<String> maxData = Arrays.stream(data).max((a, b) -> a.compareTo(b));
//		// String max = Arrays.stream(data).max((a, b) -> a.compareTo(b)); => 요런 함수가 작동되는데 Null이 들어오면? 망한다.
//		// Optional은 이런 경우에도 처리를 해주기때문에 안전하다.
		
		
		// 메서드 참조
		Optional<String> maxData = Arrays.stream(data).max(String::compareTo);
//		System.out.println(maxData.get());  // 데이터가 없을 경우 에러발생
		
		
		// orElse(T) : 값이 널일 경우 T를 받는다.
		System.out.println("orElse : " + maxData.orElse("최대값을 구할 수 없어요.")); 
		
		// orElseGet(Supplier) : 값이 널일 경우 Supplier의 결과값을 받는다.
		System.out.println("orElseGet : " + maxData.orElseGet(()->"최대값을 구할 수 없어요.")); 
		
		// 값이 있을 경우 동작
		// ifPresent(Consumer)
		maxData.ifPresent(val -> { System.out.println("ifPresent : 최대값은 " + val); });
		
		Arrays.stream(data)
		.max((a,b)-> a.compareTo(b))
		.ifPresent((str)->System.out.println(str));
	}
}
