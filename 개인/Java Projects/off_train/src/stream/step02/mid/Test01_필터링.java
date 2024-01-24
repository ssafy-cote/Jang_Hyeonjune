package stream.step02.mid;

import java.util.Arrays;
import java.util.List;

public class Test01_필터링 {

    public static void main(String[] args) {
    	// 정수 목록 생성
    	List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        // Java 스트림을 사용하여 중복되지 않은 요소를 가져와 출력
		System.out.println("중복되지 않은 요소만 출력");
        numbers.stream()
               .distinct() // 만약, 데이터가 객체라면 : hashCode + equals (중복여부 판단)
               .forEach(v -> System.out.print(v + " "));
	        
    	System.out.println();
    	
        // Java 스트림을 사용하여 조건에 맞는 요소를 필터링하고 출력
		System.out.println("짝수만 출력");
        numbers.stream()
               .filter(num -> num % 2 == 0)
               .distinct()// 스트림 체이닝 기법으로 중간에 중복제거를 하고 싶으면 바로 할 수 있다.
               .forEach(v -> System.out.print(v + " "));
        
        //같이 실행 시켜도 안바뀐다.
    }
}