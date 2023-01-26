package org.javaturk.dp.ch04.factoryMethod.employee.fm4;

import java.util.List;

import org.javaturk.dp.ch04.factoryMethod.employee.fm1.Employee;
import org.javaturk.dp.ch04.factoryMethod.employee.fm1.PayrollOffice;

public class Test {

	public static void main(String[] args) {
		HR hr = new HR();
		PayrollOffice po = new PayrollOffice();
		
		// Add more employees
		hr.addNewEmployee(EmployeeFactory.create("Employee"));
		hr.addNewEmployee(EmployeeFactory.create("Employee"));
		hr.addNewEmployee(EmployeeFactory.create("Employee"));
		hr.addNewEmployee(EmployeeFactory.create("Manager"));
		hr.addNewEmployee(EmployeeFactory.create("Manager"));
		hr.addNewEmployee(EmployeeFactory.create("Director"));
		
		hr.listEmployees();

		System.out.println();
		
		// Now pay time!
		List<Employee> employees = hr.getEmployees();

		for (Employee employee : employees)
			po.paySalary(employee);
	}
}
