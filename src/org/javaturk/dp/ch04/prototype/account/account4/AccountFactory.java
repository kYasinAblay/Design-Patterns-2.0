
package org.javaturk.dp.ch04.prototype.account.account4;

import org.javaturk.dp.ch04.prototype.account.domain.Customer;

/**
 * @author akin
 *
 */
public class AccountFactory implements Factory {


	@Override
	public Account createNormalAccount() {
		return AccountPrototypes.normalPrototype.clone();
	}

	@Override
	public Account createNormalAccount(Customer owner, double balance) {
		Account account = AccountPrototypes.normalPrototype.clone();
		account.setOwner(owner);
		account.setBalance(balance);
		return account;
	}

	@Override
	public Account createNegativeAccount(Customer owner, double balance) {
		Account account = AccountPrototypes.negativePrototype.clone();
		account.setOwner(owner);
		account.setBalance(balance);
		return account;
	}

	@Override
	public Account createFrozenAccount(Customer owner, double balance) {
		Account account = AccountPrototypes.frozenPrototype.clone();
		account.setOwner(owner);
		account.setBalance(balance);
		return account;
	}
	
	static class AccountPrototypes {
		// Normal account
		 static Account normalPrototype = new Account("1", 0, 1000, null, true, true, true);

		// Negative account
		 static Account negativePrototype = new Account("1", 0, 1000, null, true, true, false);

		// Frozen account
		 static Account frozenPrototype = new Account("1", -1000, 1000, null, false, false, false);

	}
}
