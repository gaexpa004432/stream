package intermediate;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MappingExample {

	public static void main(String[] args) {
		int intAry[] = {1,2,3,4,5};
		double doubleAry[] = {1.1,2.3,3.5,4.2,6.6};
		
		IntStream intStream =Arrays.stream(intAry);
		DoubleStream doubleStream =Arrays.stream(doubleAry);
		
		doubleStream = intStream.asDoubleStream();// 더블스트림으로 형변환
		doubleStream.forEach(e-> System.out.println(e));
		
		intStream = Arrays.stream(intAry);
		intStream.asLongStream().forEach(e-> System.out.println(e));
		
		intStream = Arrays.stream(intAry);
		Stream<Integer> iStream = intStream.boxed();
		iStream.forEach(s-> System.out.println(s));
		
	}

}
