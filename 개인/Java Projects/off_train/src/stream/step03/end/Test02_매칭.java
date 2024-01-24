package stream.step03.end;

import java.util.Arrays;
import java.util.List;

public class Test02_매칭 {
	public static void main(String[] args) {
		// 영화 제목 목록 생성
		List<String> movieList = Arrays.asList("서울의 봄", "명량", "7번방의 선물", "건축학개론", "국가대표");

		// allMatch 메서드를 사용하여 모든 요소가 길이 5 이상인지 검사
		boolean allMatchResult = movieList.stream().allMatch(movie -> movie.length() >= 5);
		System.out.println("모든 영화의 제목이 5글자 이상인가? " + allMatchResult);

		// anyMatch 메서드를 사용하여 어떤 요소라도 길이 6 이상인지 검사
		boolean anyMatchResult = movieList.stream().anyMatch(movie -> movie.length() >= 6); // 하나라라도 있는가? true
		System.out.println("영화의 제목중에 6글자 이상이 있는가? " + anyMatchResult);

		// noneMatch 메서드를 사용하여 모든 요소가 길이 10 이상이 아닌지 검사
		boolean noneMatchResult = movieList.stream().noneMatch(movie -> movie.length() >= 10); // 하나라도 안맞아야 true
		System.out.println("영화의 제목중에 10글자를 이상인게 없는가?: " + noneMatchResult);
	}
}