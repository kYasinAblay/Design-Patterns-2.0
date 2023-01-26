
package org.javaturk.dp.ch04.prototype.account.account2;

import org.javaturk.dp.ch04.prototype.account.domain.Customer;

/**
 * @author akin
 *
 */
public interface Factory {
	
	Account create();
	
	Account create(Customer owner, double balance);
	
}
