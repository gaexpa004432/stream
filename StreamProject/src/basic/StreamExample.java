package basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamExample {

	private static int sum1;

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		Stream<Integer> stream = numbers.stream();
		Function<Integer,Integer> function = new Function<Integer,Integer>(){
			@Override
			public Integer apply(Integer t) {
				return t*t;
			}};
			
		Predicate<Integer> predicate = new Predicate<Integer>() { //스트림사용시 값의 조건문 참거짓 판단가능
			@Override
			public boolean test(Integer t) {
				return t%2==1;
			}};
			
			numbers.stream().filter(predicate).map(function).forEach((a) -> { 
		//stream(). 스트림 건수만큼 반복 ,filter(predicate) 조건,.map(function)연산,forEach 건수마다 특정작업  람다식 가능 
				sum1 += a;
				System.out.println(sum1); 
			
			
		});
		int sum = 0;
		for (int n : numbers) {
			if (n % 2 == 1) {
				int square = n * n;
				sum += square;
			}
		}
//		System.out.println(sum);

	}

}
