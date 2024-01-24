package stream.step01.create;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Test01_Arrays {

	/*
	 * Stream - 객체관리
	 * IntStream - int
	 * LongStream - long
	 * DoubleStream - double
	 */
	public static void main(String[] args) {
		// Arrays.stream(배열)
		Stream<String> stream = Arrays.stream(new String[] {"A", "B", "C"});
		
		// 한번 연산을 끝내면 다시는 못 쓴다.
//		stream.forEach(System.out::println);
		stream.forEach( (a)->{
			System.out.println(a);
		});
		
		
		//Stream<Integer>도 가능하지만,
		//Boxing, Unboxing 오버헤드가 심하다.
		//premitted 타입을 다루는 IntStream이 더 효율적이다.
		IntStream intStream = Arrays.stream(new int[] {1, 2, 3});
		intStream.forEach(System.out::println);
		
		LongStream longStream = Arrays.stream(new long[] {1, 2, 3});
		longStream.forEach(System.out::println);
		
		DoubleStream doubleStream = Arrays.stream(new double[] {1, 2, 3});
		doubleStream.forEach(System.out::println);
	}
}
