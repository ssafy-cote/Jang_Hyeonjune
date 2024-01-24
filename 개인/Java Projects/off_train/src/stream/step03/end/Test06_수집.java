package stream.step03.end;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test06_수집 {
	static class Ssafy {
	    private String name;
	    private int age;

	    Ssafy(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public String getName() {
	        return name;
	    }

		public int getAge() {
			return age;
		}
	}
    public static void main(String[] args) {
        // Person 객체 목록 생성
        List<Ssafy> people = Arrays.asList(
                new Ssafy("이싸피", 25),
                new Ssafy("김싸피", 30),
                new Ssafy("박싸피", 22)
        );

        {
        	long count = people.stream()
        			           .collect(Collectors.counting());
        	System.out.println("count : " + count);
        	
        	int sum = people.stream()
        			        .collect(Collectors.summingInt(Ssafy::getAge));
        	System.out.println("sum : " + sum);
        }

        // 각 Person 객체에서 이름을 추출하여 새로운 리스트를 생성
        // toList -> List으로 변환
        // toSet -> Set으로 변환
        // toMap -> Map으로 변환
        {
	        List<String> names = people.stream()
	                                   .map(Ssafy::getName)  // s -> s.getName()
	                                   .collect(Collectors.toList());
	
	        // 최종 결과 출력
	        System.out.println("List : " + names);
        }
        {
	        Set<String> names = people.stream()
				                .map(Ssafy::getName)
				                .collect(Collectors.toSet());
	        // 최종 결과 출력
	        System.out.println("Set : " + names);	        
        }
        {
        	Map<String, Integer> names = 
        			people.stream()
        			// Function<? super T,? extends K>, Function<? super T,? extends U>
        			      .collect(Collectors.toMap(person -> person.name, person -> person.age));
//        				  .collect(Collectors.toMap(
//        						  person -> person.name, 
//        						  person -> person.age,
//        						  (oldValue, newValue) -> {
//        							  System.out.println("oldValue : " + oldValue + ", newValue : " + newValue);
//        							  return newValue;
//        						  }
//        				   ));
        	// 최종 결과 출력
        	System.out.println("Map : " + names);	        
        }
        
        {
            // 문자열 리스트 생성
            List<String> movieList = Arrays.asList("서울의 봄", "써니", "명량", "7번방의 선물", "검사외전", "괴물", "두사부일체", "건축학개론", "국가대표");

            // 문자열 리스트를 스트림으로 변환 후 groupingBy를 사용하여 길이에 따라 그룹화
            Map<Integer, List<String>> movieGroup = 
            		movieList.stream()
                    		 .collect(Collectors.groupingBy(movie -> movie.length()));  // String::length 

            // 그룹화된 결과 출력
            System.out.println("길이로 그룹핑: " + movieGroup);

            // 문자열 리스트를 스트림으로 변환 후 groupingBy를 사용하여 길이에 따라 그룹화
            Map<Integer, Long> movieGroup2 = 
            					movieList.stream()
            							 .collect(
            									Collectors.groupingBy(movie -> movie.length(), Collectors.counting())
            							  );  // String::length 
            
            // 그룹화된 결과 출력
            System.out.println("길이로 그룹핑 : " + movieGroup2);
            
            Map<Boolean, List<String>> moviePartition = 
            		movieList.stream()
                    		 .collect(Collectors.partitioningBy(movie -> movie.length() >= 5));  // String::length 

            // 그룹화된 결과 출력
            System.out.println("길이로 파티션 : " + moviePartition);
            
            Map<Boolean, Long> moviePartition2 = 
            		movieList.stream()
            		.collect(Collectors.partitioningBy(movie -> movie.length() >= 5, Collectors.counting()));  // String::length 
            
            // 그룹화된 결과 출력
            System.out.println("길이로 파티션 : " + moviePartition2);
        }
    }
}
