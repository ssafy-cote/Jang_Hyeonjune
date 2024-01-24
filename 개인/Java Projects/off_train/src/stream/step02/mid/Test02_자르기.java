package stream.step02.mid;

import java.util.Arrays;
import java.util.List;

public class Test02_자르기 {
    public static void main(String[] args) {
        // 정수 목록 생성
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Java 스트림을 사용하여 조건에 맞는 요소를 필터링하고 출력
    	System.out.println("5개를 스킵하고 처리하기");
        numbers.stream()
               .skip(5) // 짝수만 필터링
               .forEach(v -> System.out.print(v + " "));

        System.out.println();
        
    	System.out.println("처음 3개의 요소만 출력");
        // Java 스트림을 사용하여 처음 3개의 요소만 출력
        numbers.stream()
               .limit(3)
               .forEach(v -> System.out.print(v + " "));
    }
}