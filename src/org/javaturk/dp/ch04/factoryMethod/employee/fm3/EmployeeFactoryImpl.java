package org.javaturk.dp.ch04.factoryMethod.employee.fm3;

import org.javaturk.dp.ch04.factoryMethod.employee.EmployeeRandomizer;

public class EmployeeFactoryImpl implements EmployeeFactory{

	@Override
	public Employee create(String name) {
		Employee employee = new Employee(EmployeeRandomizer.createId(), name,
				EmployeeRandomizer.createYear(), EmployeeRandomizer.createDepartment());
		return employee;
	}
}
