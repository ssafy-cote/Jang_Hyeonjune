package stream.step03.end;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Test03_집계 {
    public static void main(String[] args) {
        // 정수 목록 생성
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        numbers = new ArrayList<>();
        
        // count 메서드를 사용하여 요소의 개수 계산
        long count = numbers.stream().count();
        System.out.println("데이터 개수 : " + count);

        // sum 메서드를 사용하여 요소의 합 계산
        int sum = numbers.stream()
//        					.sum() // stream()에는  sum()는 없다! 그렇기 때문에 Int타입으로 바꾼 후 사용해야한다.
//        		         .mapToInt(Integer::intValue)  // IntStream 생성
        			     .mapToInt(a-> a.intValue())  // IntStream 생성
        		         .sum();
        System.out.println("데이터의 합 : " + sum);
        
        // max 메서드를 사용하여 최댓값 계산
        OptionalInt max = numbers.stream()
        						 .mapToInt(Integer::intValue)
        						 .max();
        System.out.println("최댓값 : " + max.getAsInt());

        // min 메서드를 사용하여 최솟값 계산
        OptionalInt min = numbers.stream()
				 	             .mapToInt(Integer::intValue)
				 	             .min();
        System.out.println("최솟값 : " + min.getAsInt());

        // average 메서드를 사용하여 평균값 계산
        OptionalDouble average = numbers.stream()
        								.mapToDouble(Integer::doubleValue)
        								.average();
        System.out.println("평균값 : " + average.getAsDouble());        
        
        // findFirst 메서드를 사용하여 첫 번째 요소를 찾기 :apple
        Optional<Integer> first = numbers.stream().findFirst();
        System.out.println("처음 요소 : " + first.get());
    }
}
