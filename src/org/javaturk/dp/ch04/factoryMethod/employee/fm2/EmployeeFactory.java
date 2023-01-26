package org.javaturk.dp.ch04.factoryMethod.employee.fm2;

import org.javaturk.dp.ch04.factoryMethod.employee.EmployeeRandomizer;

public class EmployeeFactory implements Factory {

	@Override
	public Employee create(String name) {
		Employee employee = new Employee(EmployeeRandomizer.createId(), name,
				EmployeeRandomizer.createYear(), EmployeeRandomizer.createDepartment());
		return employee;
	}
}
