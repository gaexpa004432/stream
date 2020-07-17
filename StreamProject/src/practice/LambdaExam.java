package practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import intermediate.Student;


public class LambdaExam {
	static List<Student> list = Arrays.asList(
			new Student("dd",80,50),
			new Student("ss",70,80)
	);
	public static double avgtotal() {
		list.stream().flatMapToInt(e-> IntStream.of(e.englishScore+e.mathScore))
		.forEach(e-> System.out.println((double)e/2));
		System.out.println(list.stream().flatMapToInt(e-> IntStream.of(e.englishScore))
		.sum());
		System.out.println(
				list.stream().flatMapToInt(e-> IntStream.of(e.englishScore)).average());
//		list.stream().flatMap(new Function<Student,Stream<Integer>>(){
//
//			@Override
//			public Stream<Integer> apply(Student t) {
//				return Stream.of(t.getEnglishScore());
//			}})
//				.sum(); /intstream 타입이여야함

//			@Override
//			public IntStream apply(Student t) {
//				int a =0;
//				a = t.englishScore + t.mathScore;
//				return IntStream.of(a);
//			}}
		
		return 0.0;
	}
	public static double avg(ToIntFunction<Student> function) {
		int a =0 ,sum =0;
		for(Student std : list ) {
			
		sum +=	function.applyAsInt(std);
		}
		double avg = (double) sum/ list.size();
		
		return avg;
	}
	public static void main(String[] args) {
//		double englishAvg = avg(s-> s.getEnglishScore());
//		System.out.println(englishAvg);
//		double mathAvg = avg(s-> s.getMathScore());
//		System.out.println(mathAvg);
		avgtotal();
		
	}
	public static class Student {
		private String name;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		private int englishScore;
		private int mathScore;
		public Student(String name, int englishScore, int mathScore) {
			this.name = name;
			this.englishScore = englishScore;
			this.mathScore = mathScore;
		}
		public int getEnglishScore() {
			return englishScore;
		}
		public void setEnglishScore(int englishScore) {
			this.englishScore = englishScore;
		}
		public int getMathScore() {
			return mathScore;
		}
		public void setMathScore(int mathScore) {
			this.mathScore = mathScore;
		}
	}
	
}
