package org.javaturk.dp.ch04.factoryMethod.employee.fm5;

import java.util.ArrayList;
import java.util.List;

import org.javaturk.dp.ch04.factoryMethod.employee.fm1.*;

/**
 * Class that represents Human Resources in a company.
 * 
 * @author akin
 *
 */
public class HR {

	private List<Employee> employees = new ArrayList<Employee>();

	public HR() {
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public int getNumberOfEmployees() {
		return employees.size();
	}

	public void addNewEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void listEmployees(){
		System.out.println("All Employees");
		for(Employee employee : employees)
			System.out.println(employee);
	}
}