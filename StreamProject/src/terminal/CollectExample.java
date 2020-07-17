package terminal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class CollectExample {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Abby", "Charlie", "Collet");
		List<String> filterList = strList.stream().filter(e -> e.startsWith("C")).collect(Collectors.toList());// 새로운
																												// 리스트
																												// 생성
		System.out.println(filterList);

		List<Student> students = Arrays.asList(new Student("Hong", 34, Student.Sex.MALE),
				new Student("Hang", 24, Student.Sex.FEMALE), 
				new Student("Park", 33, Student.Sex.MALE),
				new Student("Collet", 44, Student.Sex.FEMALE));
		List<Student> maleStudent = students.stream().filter(e -> e.getSex() == Student.Sex.MALE)
				.collect(Collectors.toList());
		long cnt = maleStudent.stream().count();
		System.out.println(cnt);

		HashSet<Student> femaleSet = 
				students.stream().filter(e -> e.getSex() == Student.Sex.FEMALE)
				.collect(Collectors.toCollection(new Supplier<HashSet<Student>>() {

					@Override
					public HashSet get() {
						return new HashSet<Student>();
					}}));
		int result = femaleSet.stream().map(new Function<Student,Integer>(){

			@Override
			public Integer apply(Student t) {
				
				return t.getScore();
			}}).reduce(0,(e,a) -> e+a);
		System.out.println("여성 점수합 : " + result);
	}

}
