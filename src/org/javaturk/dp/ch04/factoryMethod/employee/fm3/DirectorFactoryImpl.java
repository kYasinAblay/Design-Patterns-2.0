package org.javaturk.dp.ch04.factoryMethod.employee.fm3;

import org.javaturk.dp.ch04.factoryMethod.employee.EmployeeRandomizer;

public class DirectorFactoryImpl implements DirectorFactory{

	@Override
	public Director create(String name, String workingDepartment, int bonus) {
		Director director = new Director(EmployeeRandomizer.createId(), name,
				EmployeeRandomizer.createYear(), workingDepartment, workingDepartment, bonus);
		return director;
	}
}
