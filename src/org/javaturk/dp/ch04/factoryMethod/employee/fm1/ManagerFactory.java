package org.javaturk.dp.ch04.factoryMethod.employee.fm1;

import org.javaturk.dp.ch04.factoryMethod.employee.EmployeeRandomizer;

public class ManagerFactory implements Factory {

	@Override
	public Manager create() {
		String department = EmployeeRandomizer.createDepartment();
		Manager manager = new Manager(EmployeeRandomizer.createId(), EmployeeRandomizer.createName(),
				EmployeeRandomizer.createYear(), department, department);
		return manager;
	}
}
