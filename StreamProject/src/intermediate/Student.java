package intermediate;

public class Student implements Comparable<Student>{

	private String name;
	private int score;
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
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

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	@Override
	public int hashCode() {
		System.out.println(this.name.hashCode());
		System.out.println(this.score);
		return this.name.hashCode() + this.score;
		
	}
	@Override
	public boolean equals(Object obj) {
		Student std = (Student) obj ;
		boolean stdBool = this.name.contentEquals(std.name);
		boolean scorebool = this.score == std.score;
				return stdBool && scorebool;
	}

	@Override
	public int compareTo(Student o) {
		
		//return this.name.compareTo(o.getName());
		return this.score -  o.getScore();
	}

	
}
