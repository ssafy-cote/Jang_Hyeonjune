package stream.step01.create;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Test02_Stream {
	
	public static void main(String[] args) {
		// [Int|Long|Double]Stream.of(배열)
		Stream<String> stream = Stream.of(new String[] {"A", "B", "C"});
		stream.forEach(v -> System.out.println(v));
		
//		IntStream intStream = IntStream.of(new int[] {1, 2, 3});
		IntStream intStream = IntStream.of(1,2,3,4); // 요렇게도 사용가능하다.
		intStream.forEach(v -> System.out.println(v));
		
		LongStream longStream = LongStream.of(new long[] {1, 2, 3});
		longStream.forEach(v -> System.out.println(v));
		
		DoubleStream doubleStream = DoubleStream.of(new double[] {1, 2, 3});
		doubleStream.forEach(v -> System.out.println(v));	
	}
}
