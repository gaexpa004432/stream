package intermediate;

import java.util.function.Function;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class mapingExample {
	public static void main(String[] args) {
		Stream.of(1,2,3).peek(s -> System.out.println(s)).flatMap(new Function<Integer, Stream<Integer>>(){ // 인테저타입을 받아서 스트림 인테져 타입 반환

			@Override
			public Stream<Integer> apply(Integer t) {
				
				return Stream.of(t,t*2);
			}}).forEach(s -> System.out.println(s));
		
		Stream.of(1,2,3).flatMapToInt(new Function<Integer,IntStream>(){

			@Override
			public IntStream apply(Integer t) {
				
				return IntStream.of( t*2);
			}});
		
		Employee.persons().stream().flatMap(new Function<Employee,Stream<Double>>(){

			@Override
			public Stream<Double> apply(Employee t) {
				return Stream.of(t.getIncome());
			}}).forEach(e -> System.out.println(e));
	}
}
