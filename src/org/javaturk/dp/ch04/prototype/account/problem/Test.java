
package org.javaturk.dp.ch04.prototype.account.problem;

import org.javaturk.dp.ch04.prototype.account.domain.Customer;

public class Test {

	public static void main(String[] args) {
		// Normal credit account
		Account normalAccount = new Account("1", 1000, 1000, new Customer("Ali"), true, true, true);

		// Negative credit account
		Account negativeAccount = new Account("2", -500, 1000, new Customer("Zeynep"), true, true, false);

		// Frozen account
		Account frozenAccount = new Account("3", -1000, 1000, new Customer("Metin"), false, false, false);
	}
}
