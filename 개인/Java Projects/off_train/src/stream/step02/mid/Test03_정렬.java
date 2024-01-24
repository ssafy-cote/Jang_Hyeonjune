package stream.step02.mid;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test03_정렬 {
    public static void main(String[] args) {
    	// 문자열 리스트 생성
        List<String> movieList = Arrays.asList("서울의 봄", "명량", "7번방의 선물", "건축학개론", "국가대표");

        // Java 스트림을 사용하여 요소를 오름차순으로 정렬하고 출력
        System.out.println("이름순으로 정렬");
        movieList.stream()
                 .sorted() // String이 Comparable이 되어 있기 때문에 가능.
                 .forEach(v -> System.out.print(v));

        System.out.println();
        
        // 길이를 기준으로 문자열을 내림차순으로 정렬하여 출력
        System.out.println("길이를 기준으로 정렬");
        movieList.stream()
                 .sorted((a, b) -> b.length() - a.length()) // 커스텀하게 정렬 할 수 있다.
                 .forEach(System.out::println);

    }
}
