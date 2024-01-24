package stream.step01.create;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test03_Collection {
	public static void main(String[] args) {
		// Collection.stream()
		List<String> list1 = Arrays.asList("A", "B", "C");
		Stream<String> stream1 = list1.stream();
		stream1.forEach(System.out::println);
		
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		Stream<Integer> stream2 = list2.stream();
		stream2.forEach(System.out::println);
	}
}
