
package org.javaturk.dp.ch04.prototype.account.account3;

import org.javaturk.dp.ch04.prototype.account.domain.Customer;

/**
 * @author akin
 *
 */
public class Test {
	
	public static void main(String[] args) {
		Factory factory = new AccountFactory();
		
		// Normal account. Credit amount is fixed at 1000.
		Account normalAccount = factory.createNormalAccount(new Customer("Remzi"), 4500);
		normalAccount.setIban("2");
		System.out.println(normalAccount.isOpenToWithdraw());
		System.out.println(normalAccount.isOpenToPayment());
		System.out.println(normalAccount.isOpenToTransfer());

		System.out.println();
		
		// Negative account
		Account negativeAccount = factory.createNegativeAccount(new Customer("Mustafa"), -750);
		System.out.println(negativeAccount.isOpenToWithdraw());
		System.out.println(negativeAccount.isOpenToPayment());
		System.out.println(negativeAccount.isOpenToTransfer());
		
		System.out.println();
		// Frozen default account
		Account frozenAccount = factory.createFrozenAccount(new Customer("Sukran"), -1000);
		System.out.println(frozenAccount.isOpenToWithdraw());
		System.out.println(frozenAccount.isOpenToPayment());
		System.out.println(frozenAccount.isOpenToTransfer());
	}
}
