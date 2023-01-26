package org.javaturk.dp.ch04.factoryMethod.employee.fm3;

import org.javaturk.dp.ch04.factoryMethod.employee.EmployeeRandomizer;

public class ManagerFactoryImpl implements ManagerFactory{

	@Override
	public Manager create(String name, String workingDepartment) {
		Manager manager = new Manager(EmployeeRandomizer.createId(), name,
				EmployeeRandomizer.createYear(), workingDepartment, workingDepartment);
		return manager;
	}

}
