package intermediate;

import java.util.List;

public class FilterExample {

	public static void main(String[] args) {
		List<Employee> employees = Employee.persons();
		employees.stream().filter(e-> e.getIncome() < 3000 && e.isMale()).forEach(e -> e.toString());
		
	}

}
