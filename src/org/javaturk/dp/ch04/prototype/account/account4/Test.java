
package org.javaturk.dp.ch04.prototype.account.account4;

import org.javaturk.dp.ch04.prototype.account.domain.Customer;

/**
 * @author akin
 *
 */
public class Test {
	private static Factory factory = new AccountFactory();
	
	public static void main(String[] args) {
		
		// Normal account. Credit amount is fixed at 1000.
		Account normalDefaultAccount = factory.createNormalAccount();
		normalDefaultAccount.setIban("2");
		normalDefaultAccount.setBalance(2000);
		normalDefaultAccount.setOwner(new Customer("Remzi"));

		// Negative account
		Account negativeDefaultAccount = factory.createNegativeAccount(new Customer("Mustafa"), -750);

		// Frozen default account
		Account frozenDefaultAccount = factory.createFrozenAccount(new Customer("Sukran"), -1000);

	}
}
