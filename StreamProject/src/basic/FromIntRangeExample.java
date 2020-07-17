package basic;

import java.util.Random;
import java.util.stream.IntStream;

public class FromIntRangeExample {
	public static void main(String[] args) {
		IntStream stream = IntStream.range(11, 20); //스트림에 범위값 저장
		IntStream stream1 = IntStream.rangeClosed(11, 20); //끝번호 포함
	//	stream.filter(e -> e% 2==1).forEach(s -> System.out.println(s));
		
		Random random = new Random();
		IntStream stream2 = random.ints(10,11,100); // 11부터 100까지의 숫자 10개를 넣음
		stream2.filter(e ->  50 < e && 60 > e ).forEach(e -> System.out.println(e));
	}
}
