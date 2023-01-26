
package org.javaturk.dp.ch04.prototype.account.account2;

import org.javaturk.dp.ch04.prototype.account.domain.Customer;

/**
 * @author akin
 *
 */
public class AccountFactory implements Factory {

	// Normal account
		private static Account prototype = new Account("1", 1000, 1000, new Customer("Ali"), true, true, true);

		@Override
		public Account create() {
			return prototype.clone();
		}

		@Override
		public Account create(Customer owner, double balance) {
			Account account = prototype.clone();
			account.setOwner(owner);
			account.setBalance(balance);
			return account;
		}
}
