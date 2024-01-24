package stream.step01.create;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Test04_Etc {
	
	public static void main(String[] args) {
		/*
		Stream<Integer> stream = Stream.generate(new Supplier<Integer>(){
			@Override
			public Integer get() {
				return new Random().nextInt(10);
			}
		}).limit(5);
		 */
		
		//stream 변수명 때문에 {}활용
		// scope차이로 변수명이 겹쳐도 사용 가능
//		{
//			Stream<Integer> stream = Stream.generate(() -> new Random().nextInt(10)).limit(5);
//			stream.forEach(System.out::println);
//		}
//		{
//			IntStream stream = IntStream.generate(() -> new Random().nextInt(10)).limit(5);
//			stream.forEach(System.out::println);
//		}
//		{
//			Stream<String> stream = Stream.iterate("a", s -> s + 1).limit(5);
//			stream.forEach(System.out::println);
//		}
		{
			IntStream stream = IntStream.iterate(1, s -> s + 2).limit(5);
			stream.forEach(System.out::println);
		}
//		{
//			IntStream stream = IntStream.range(1, 10);
//			stream.forEach(System.out::println);
//		}
//		{
//			IntStream stream = IntStream.rangeClosed(1, 10);
//			stream.forEach(System.out::println);
//		}
	}
}
