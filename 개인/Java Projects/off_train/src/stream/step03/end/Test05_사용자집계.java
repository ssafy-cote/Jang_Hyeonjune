package stream.step03.end;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test05_사용자집계 {
	
	/*
	Sum of elements: 15
	Product of elements: 120
	Max value: 5
	 */
    public static void main(String[] args) {
        // 정수 목록 생성
//    	List<Integer> numbers = Arrays.asList();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // reduce 메서드를 사용하여 모든 요소의 합을 계산
        Optional<Integer> sum = numbers.stream().reduce((a, b) -> a + b);
        // 메서드 참조 
//        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
        System.out.println("요소들의 합 : " + sum.orElse(0));

        // reduce 메서드를 사용하여 모든 요소의 곱을 계산
        Optional<Integer> mul = numbers.stream().reduce((x, y) -> x * y);
        System.out.println("요소들의 곱: " + mul.orElse(1));

        int value = numbers.stream().reduce(1, (x, y) -> x * y);
        System.out.println("요소들의 곱: " + value);
        
        // reduce 메서드를 사용하여 최댓값 계산
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        System.out.println("최댓값 : " + max.orElse(0));
    }
}

