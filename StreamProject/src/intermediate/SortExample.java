package intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortExample {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("hong",60),new Student("hong2",40),new Student("hong3",50));
		//students.stream().flatMapToInt(e->IntStream.of(e.getScore())).sorted().forEach(s-> System.out.println(s));
//		students.stream().sorted().forEach(s-> System.out.println(s));
		
		List<Person> presons  = Arrays.asList(new Person("hong",15),new Person("hong2",25),new Person("hong3",5));
		presons.stream().sorted(new Comparator<Person>(){

			@Override
			public int compare(Person o1, Person o2) {
				o1.name.compareTo(o2.name);
				return o1.age - o2.age; 
			}}).forEach(s-> System.out.println(s));
	}

}
