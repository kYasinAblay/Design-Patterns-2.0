
package org.javaturk.dp.ch04.prototype.account.account4;

import org.javaturk.dp.ch04.prototype.account.domain.Customer;

/**
 * @author akin
 *
 */
public interface Factory {
	
	Account createNormalAccount();
	
	Account createNormalAccount(Customer owner, double balance);
	
	Account createNegativeAccount(Customer owner, double balance);
	
	Account createFrozenAccount(Customer owner, double balance);
	
}
