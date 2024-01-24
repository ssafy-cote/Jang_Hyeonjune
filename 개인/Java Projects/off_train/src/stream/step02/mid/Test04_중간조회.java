package stream.step02.mid;

import java.util.Arrays;
import java.util.List;

public class Test04_중간조회 {
    public static void main(String[] args) {
        // 문자열 목록 생성
    	List<String> movieList = Arrays.asList("서울의 봄", "명량", "7번방의 선물", "건축학개론", "국가대표");

        // 중간 처리 과정에서 요소의 상태 확인
        movieList.stream()
                 .peek(movie -> System.out.println("데이터 확인 : " + movie)) // 그러면 peek은? 중간에 값을 확인하기 용이다. 연산에는 아무런 연관도 없다.
                 .forEach(movie -> System.out.println(movie)); // forEach가 실행되어야 stream은 실행된다!
    }
}
