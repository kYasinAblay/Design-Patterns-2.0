package org.javaturk.dp.ch04.factoryMethod.employee.fm2;

import org.javaturk.dp.ch04.factoryMethod.employee.EmployeeRandomizer;

public class DirectorFactory implements Factory {

	@Override
	public Director create(String name) {
		Director director = new Director(EmployeeRandomizer.createId(), name,
				EmployeeRandomizer.createYear(), "Management", "Management", 5000);
		return director;
	}

}
