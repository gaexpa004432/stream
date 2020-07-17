package intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class DistinctExample {
	public static void main(String[] args) {
		IntStream is =IntStream.of(1,2,2,2,2,2,3,3,6);
		OptionalInt max;
		max = is.distinct().peek(System.out::println).max();
		System.out.println(max);
		
		List<Student> list = Arrays.asList(new Student("back",15),new Student("back",15),new Student("back",66));
		list.stream().distinct().forEach(System.out::println);
		list.get(0).hashCode();
	}
}
