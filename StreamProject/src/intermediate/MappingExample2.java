package intermediate;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MappingExample2 {

	public static void main(String[] args) {
		List<Employee> employees = Employee.persons();
		employees.stream().map(e-> e.getName()).forEach(e-> System.out.println(e));
		employees.stream().map(new Function<Employee,String>(){

			@Override
			public String apply(Employee t) {
				return t.getName();
			}
			
		}).flatMap(new Function<String,Stream<Character>>(){

			@Override
			public Stream<Character> apply(String t) {
				
				return IntStream.range(0, t.length()).mapToObj(new IntFunction<Character>() {

					@Override
					public Character apply(int value) {
						
						return t.charAt(value);
					}});
			}}).forEach(s -> System.out.println(s));
		employees =Employee.persons();
	employees.stream().map(t-> t.getName())
	.flatMap(t -> IntStream.range(0,t.length()).mapToObj(value -> t.charAt(value)))
	.forEach(s -> System.out.println(s));
	}
}
