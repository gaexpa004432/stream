package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OracleExam {
	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();
		
		Connection conn = null; 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("Jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();

		}
		String sql = "select first_name,last_name,salary from employees";

		PreparedStatement pstmt;
			try {
				pstmt = conn.prepareStatement(sql);
				ResultSet r = pstmt.executeQuery();
				while(r.next()) {
					Employee emp1 = new Employee(r.getString("first_name"),r.getString("last_name"),r.getInt("salary"));
					emp.add(emp1);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			emp.stream().filter(e -> e.getThree() >1000 ).forEach(s -> System.out.println(s.getOne()+s.getTwo()+s.getThree()));
	
}
}
class Employee{
	private String one,two;
	private int three;
	public Employee(String one, String two, int three) {
		super();
		this.one = one;
		this.two = two;
		this.three = three;
	}
	public Employee() {
	}
	public String getOne() {
		return one;
	}
	public void setOne(String one) {
		this.one = one;
	}
	public String getTwo() {
		return two;
	}
	public void setTwo(String two) {
		this.two = two;
	}
	public int getThree() {
		return three;
	}
	public void setThree(int three) {
		this.three = three;
	}
	
}
