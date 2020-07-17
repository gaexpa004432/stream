package terminal;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

import intermediate.Employee;

public class AggregateExample3 {

	public static void main(String[] args) {
		
		//System.out.println(Employee.persons().stream().map(e-> e.getIncome()).reduce((t,u)->t+u));

		double d =Employee.persons().stream().reduce(0.0,new BiFunction<Double,Employee,Double>(){

			@Override
			public Double apply(Double t, Employee u) { //초깃값과 캑체값 연산 
				//System.out.println(t);
				return t+u.getIncome(); // t값에 더한값누적 
			}},new BinaryOperator<Double>() {

				@Override
				public Double apply(Double t, Double u) { 
						System.out.println(t);
						System.out.println(u);
						
					return (t*2);
				}});
		System.out.println(d);
	}
}
