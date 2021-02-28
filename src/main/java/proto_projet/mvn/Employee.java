package proto_projet.mvn;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Employee {
	String name, gender, function;
	int salary, birthYear;

	public Employee(String name, String gender, int birthYear, int salary, String function) {
		this.name = name;
		this.gender = gender;
		this.birthYear = birthYear;
		this.salary = salary;
		this.function = function;
	}


}
