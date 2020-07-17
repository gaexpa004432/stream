package terminal;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;

import intermediate.Student;

public class AggregateExample2 {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("Hong",88),new Student("Hong1",66),new Student("Hong2",67));
		int sum;
		sum = students.stream().mapToInt(s-> s.getScore()).sum();
		System.out.println(sum);
		
		sum = students.stream().mapToInt(s-> s.getScore()).reduce(new IntBinaryOperator() {

			@Override
			public int applyAsInt(int left, int right) {
				System.out.println(left+" "+right);
				return left+right;
			}}).getAsInt();
		System.out.println(sum);
	}
}
