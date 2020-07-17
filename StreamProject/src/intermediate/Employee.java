package intermediate;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class Employee {
	public static enum Gender{
		male, female;
		
	}
	private long id;
	private String name;
	private Gender gender;
	private LocalDate dateOfBirth;
	private double income;
	public Employee(long id, String name, intermediate.Employee.Gender gender, LocalDate dateOfBirth, double income) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.income = income;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public boolean isMale() {
		return this.gender == Gender.male;
	}
	public boolean isFemale() {
		return this.gender == Gender.female;
	}
	@Override
	public String toString() {
		String str = String.format("%s %s %s %s %.2f",id,name,gender,dateOfBirth,income);
		System.out.println(str);
		return str;
	}
	public static List<Employee> persons(){
		Employee el = new Employee(1,"hone1",Gender.male, LocalDate.of(1991, Month.JANUARY, 13),2346.0);
		Employee e2 = new Employee(2,"hone2",Gender.male, LocalDate.of(2991, Month.FEBRUARY, 23),2353.0);
		Employee e3 = new Employee(3,"hone3",Gender.female, LocalDate.of(3991, Month.NOVEMBER, 21),4343.0);
		Employee e4 = new Employee(4,"hone4",Gender.male, LocalDate.of(4991, Month.DECEMBER, 22),2333.0);
		Employee e5 = new Employee(5,"hone5",Gender.female, LocalDate.of(5991, Month.JANUARY, 11),2243.0);
		Employee e6 = new Employee(6,"hone6",Gender.male, LocalDate.of(6991, Month.JANUARY, 12),2313.0);
		return Arrays.asList(el,e2,e3,e4,e5,e6);
		 
	}
}
