package org.javaturk.dp.ch04.factoryMethod.employee.fm2;

import org.javaturk.dp.ch04.factoryMethod.employee.EmployeeRandomizer;

public class ManagerFactory implements Factory {

	@Override
	public Manager create(String name) {
		String department = EmployeeRandomizer.createDepartment();
		Manager manager = new Manager(EmployeeRandomizer.createId(), name,
				EmployeeRandomizer.createYear(), department, department);
		return manager;
	}
}
