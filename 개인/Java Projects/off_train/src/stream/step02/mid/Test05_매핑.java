package stream.step02.mid;

import java.util.Arrays;
import java.util.List;

public class Test05_매핑 {
    public static void main(String[] args) {
        // 정수 목록 생성
    	List<String> movieList = Arrays.asList("서울의 봄", "명량", "7번방의 선물", "건축학개론", "국가대표");

//        // 영화 제목의 길이를 반환
//    	System.out.println("영화제목의 길이 출력하기");
//    	movieList.stream()
//                 .map(movie -> movie.length())
//                 .forEach(System.out::println);
//
//    	//위와 아래는 결과의 타입이 다르다.
//    	// mapToInt를 이용한 영화 제목의 길이를 반환
//    	movieList.stream()
//	    		 .mapToInt(movie -> movie.length())
//	    		 .forEach(System.out::println);
    	
    	
    	
//    	System.out.println("영화제목을 단어 단위로 추출하기");
//    	movieList.stream()
//			     .map(movie -> movie.split(" ")) //["서울의","봄"],["명량"],["7번방의","선물"] ..
//			     .forEach(array -> {
//			     	for (String word : array) {
//			    		System.out.println(word);
//			    	}
//			     });
			    	
    	
//    	System.out.println("영화제목을 단어 단위로 추출하기");
//    	movieList.stream()
//    	          .flatMap(movie -> Arrays.stream(movie.split(" "))) //["서울의","봄","명량",...] // 1차원배열로 자연스럽게 쓸수 있다.
//    	          .forEach((a)->System.out.println(a)); // 문자열로 받는다.
    	 
    	
    	// IntStream or LongStream 의 요소를 double로 변경해서 DoubleStream을 만든다.
    	int[] numbers = {1, 2, 3, 4, 5};
        Arrays.stream(numbers)
        	  .asDoubleStream()
              .forEach(System.out :: println);
        
        /*
        // IntStream 의 요소를 long로 변경해서 LongStream을 만든다.
        Arrays.stream(numbers)
        	  .asLongStream()	// LongStream 반환
              .forEach(System.out :: println);
        */
    }
}
