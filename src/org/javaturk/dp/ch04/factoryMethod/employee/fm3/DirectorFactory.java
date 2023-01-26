package org.javaturk.dp.ch04.factoryMethod.employee.fm3;

import org.javaturk.dp.ch04.factoryMethod.employee.EmployeeRandomizer;

public interface DirectorFactory{

	public Director create(String name, String workingDepartment, int bonus);

}
