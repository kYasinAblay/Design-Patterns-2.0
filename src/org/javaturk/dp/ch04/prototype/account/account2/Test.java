
package org.javaturk.dp.ch04.prototype.account.account2;

import org.javaturk.dp.ch04.prototype.account.domain.Customer;

/**
 * @author akin
 *
 */
public class Test {
	
	public static void main(String[] args) {
		Factory factory = new AccountFactory();
		
		// Normal account. Credit amount is fixed at 1000.
		Account normalAccount = factory.create(new Customer("Mustafa"), 2000);
		normalAccount.setIban("2222");
		System.out.println(normalAccount.isOpenToWithdraw());
		System.out.println(normalAccount.isOpenToPayment());
		System.out.println(normalAccount.isOpenToTransfer());

		System.out.println();
		
		// Negative account
		Account negativeAccount = factory.create(new Customer("Namik"), 500);
		negativeAccount.setIban("3333");
		negativeAccount.setOpenToTransfer(false);
		System.out.println(negativeAccount.isOpenToWithdraw());
		System.out.println(negativeAccount.isOpenToPayment());
		System.out.println(negativeAccount.isOpenToTransfer());

		System.out.println();
		
		// Frozen account
		Account frozenAccount = factory.create(new Customer("Zehra"), -5000);
		frozenAccount.setIban("4444");
		frozenAccount.setOpenToWithdraw(false);
		frozenAccount.setOpenToPayment(false);
		frozenAccount.setOpenToTransfer(false);
		System.out.println(frozenAccount.isOpenToWithdraw());
		System.out.println(frozenAccount.isOpenToPayment());
		System.out.println(frozenAccount.isOpenToTransfer());
	}
}
