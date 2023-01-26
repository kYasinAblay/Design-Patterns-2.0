package org.javaturk.dp.ch04.factoryMethod.employee.fm5;

import org.javaturk.dp.ch04.factoryMethod.employee.EmployeeRandomizer;
import org.javaturk.dp.ch04.factoryMethod.employee.fm1.*;

public class EmployeeFactory {

	public static Employee createEmployee(String name) {
		Employee employee = null;
		int id = EmployeeRandomizer.createId();
		int year = EmployeeRandomizer.createYear();
		String department = EmployeeRandomizer.createDepartment();
		employee = new Employee(id, name, year, department);
		return employee;
	}

	public static Manager createManager(String name, String department) {
		Manager manager = null;
		int id = EmployeeRandomizer.createId();
		int year = EmployeeRandomizer.createYear();
		manager = new Manager(id, name, year, department, department);
		return manager;
	}

	public static Director createDirector(String name, String department, int bonus) {
		Director director = null;
		int id = EmployeeRandomizer.createId();
		int year = EmployeeRandomizer.createYear();
		director = new Director(id, name, year, "Management", "Management", 5000);
		return director;
	}
}
