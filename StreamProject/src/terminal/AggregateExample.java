package terminal;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class AggregateExample {

	public static void main(String[] args) {
		int[] intAry = {1,2,3,4,5};
		IntStream iStream = Arrays.stream(intAry);
		OptionalDouble od = iStream.filter(n -> n>5).average();
		double result;
		
		od.ifPresent(e -> System.out.println(e)); //결과가 있으면 출력
		
		result = od.orElse(0.0); //값이 없을경우 0.0이라고 지정
		System.out.println(result);
		
		if(od.isPresent()) //조건문 값이 있다면 실행 없다면 문자출력
		result = od.getAsDouble();
		else
			System.out.println("no value");
		}

}
