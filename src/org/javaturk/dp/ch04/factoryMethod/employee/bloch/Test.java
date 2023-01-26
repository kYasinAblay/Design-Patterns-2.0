
package org.javaturk.dp.ch04.factoryMethod.employee.bloch;

public class Test {

	public static void main(String[] args) {
		Employee newEmployee = Employee.createNewTemporaryEmployee(4, "Ali");
	}
}
