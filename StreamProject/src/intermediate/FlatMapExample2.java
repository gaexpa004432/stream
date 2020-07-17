package intermediate;

import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class FlatMapExample2 {
	public static void main(String[] args) {
//		Stream<Integer> stream = Stream.of(1,2,3,4,5);
		Stream.of(1, 2, 3, 4, 5).flatMap(e -> Stream.of(e * 2)).filter(e -> e > 3).forEach(e -> System.out.println(e));
		
		List<Employee> employees = Employee.persons();
		employees.stream().flatMapToDouble(e -> DoubleStream.of(e.getIncome())).forEach(e->System.out.println(e));
	}
}