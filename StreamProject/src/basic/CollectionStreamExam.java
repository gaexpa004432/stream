package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;
class Student {
	private String name;
	private int score;
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}
public class CollectionStreamExam {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("hong",35),new Student("hasd",36),new Student("2asg",60));
		Stream<Student> stream = students.stream(); //students.stream() 반복자
		stream.filter(t-> t.getScore() >50).forEach(new Consumer<Student>() {

			@Override
			public void accept(Student t) {
				System.out.println(t.getName()+t.getScore());
			}});
		
	}

}
