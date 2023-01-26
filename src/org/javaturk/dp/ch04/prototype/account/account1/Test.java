
package org.javaturk.dp.ch04.prototype.account.account1;

import org.javaturk.dp.ch04.prototype.account.domain.Customer;

public class Test {

	public static void main(String[] args) {
		// Normal credit account
		Account normalAccountPrototype = new Account("1", 1000, 1000, new Customer("Ali"), true, true, true);

		// Normal credit account. Credit amount is fixed at 1000.
		Account normalDefaultAccount = normalAccountPrototype.clone();
		normalDefaultAccount.setIban("2");
		normalDefaultAccount.setBalance(2000);
		normalDefaultAccount.setOwner(new Customer("Remzi"));

		// Negative default credit account
		// Account negativeDefaultAccount = new Account("2", -500, 1000, true,
		// new Customer("Zeynep"), true, true, false);
		Account negativeDefaultAccount = normalAccountPrototype.clone();
		negativeDefaultAccount.setIban("4");
		negativeDefaultAccount.setBalance(-600);
		negativeDefaultAccount.setOwner(new Customer("Mustafa"));
		negativeDefaultAccount.setOpenToWithdraw(true);
		negativeDefaultAccount.setOpenToPayment(false);
		negativeDefaultAccount.setOpenToTransfer(false);

		// Frozen default account
		Account frozenDefaultAccount = normalAccountPrototype.clone();
		frozenDefaultAccount.setBalance(-1_000);
		frozenDefaultAccount.setOwner(new Customer("Sukran"));
		frozenDefaultAccount.setOpenToWithdraw(false);
		frozenDefaultAccount.setOpenToPayment(false);
		frozenDefaultAccount.setOpenToTransfer(false);

	}
}
