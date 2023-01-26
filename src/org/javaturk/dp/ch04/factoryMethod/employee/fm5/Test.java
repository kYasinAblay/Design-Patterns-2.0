package org.javaturk.dp.ch04.factoryMethod.employee.fm5;

import java.util.List;

import org.javaturk.dp.ch04.factoryMethod.employee.fm1.Employee;
import org.javaturk.dp.ch04.factoryMethod.employee.fm1.PayrollOffice;

public class Test {

	public static void main(String[] args) {
		HR hr = new HR();
		PayrollOffice po = new PayrollOffice();
		
		// Add more employees
		hr.addNewEmployee(EmployeeFactory.createEmployee("Ali"));
		hr.addNewEmployee(EmployeeFactory.createEmployee("Zeynep"));
		hr.addNewEmployee(EmployeeFactory.createEmployee("Turgut"));
		hr.addNewEmployee(EmployeeFactory.createManager("Selim", "Sales"));
		hr.addNewEmployee(EmployeeFactory.createManager("Handan", "Production"));
		hr.addNewEmployee(EmployeeFactory.createDirector("Ahmet", "Management", 10_000));
		
		hr.listEmployees();

		System.out.println();
		
		// Now pay time!
		List<Employee> employees = hr.getEmployees();

		for (Employee employee : employees)
			po.paySalary(employee);
	}
}
