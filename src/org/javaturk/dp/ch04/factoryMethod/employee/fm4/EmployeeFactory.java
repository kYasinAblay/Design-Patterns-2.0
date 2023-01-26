package org.javaturk.dp.ch04.factoryMethod.employee.fm4;

import org.javaturk.dp.ch04.factoryMethod.employee.EmployeeRandomizer;
import org.javaturk.dp.ch04.factoryMethod.employee.fm1.*;

public class EmployeeFactory {

	public static Employee create(String type) {
		Employee employee = null;
		int id = EmployeeRandomizer.createId();
		String name = EmployeeRandomizer.createName();
		int year = EmployeeRandomizer.createYear();
		
		String department = EmployeeRandomizer.createDepartment();
		switch (type) {
		case "Employee":
			employee = new Employee(id, name, year, department);
			break;
			
		case "Manager":
			employee = new Manager(id, name, year, department, department);
			break;
			
		case "Director":
			employee = new Director(id, name, year, "Management", "Management", 5000);
			break;
		}
		return employee;
	}
}
