package org.javaturk.dp.ch04.prototype.customer.problem;

import java.util.Date;

import org.javaturk.dp.ch04.prototype.customer.domain.*;

public class Test {

	public static void main(String[] args) {
		// Unauthenticated and unvalidated individual customer
		IndividualCustomer ic1 = new IndividualCustomer(1, "address1", "phone1", false, false, new Date(), "Ali", "Kemal", new Date());

		// Authenticated and unvalidated individual customer
		IndividualCustomer ic2 = new IndividualCustomer(2, "address2", "phone2", true, false, new Date(), "Selim", "Ozel", new Date());

		// Unauthenticated and validated individual customer
		IndividualCustomer ic3 = new IndividualCustomer(3, "address3", "phone3", false, true, new Date(), "Selim", "Ozel", new Date());

		// Authenticated and validated individual customer
		IndividualCustomer ic4 = new IndividualCustomer(4, "address4", "phone4", true, true, new Date(), "Selim", "Ozel", new Date());

		// Unauthenticated and unvalidated corporate customer
		CorporateCustomer cc1 = new CorporateCustomer(5, "address5", "phone5", false, false, new Date(), "SmallCompany", 0.1);

		// Authenticated and unvalidated corporate customer
		CorporateCustomer cc2 = new CorporateCustomer(6, "address6", "phone6", true, false, new Date(), "BigCompany", 0.2);

		// Unauthenticated and validated corporate customer
		CorporateCustomer cc3 = new CorporateCustomer(7, "address7", "phone7", false, true, new Date(), "BiggerCompany", 0.25);

		// Authenticated and validated corporate customer
		CorporateCustomer cc4 = new CorporateCustomer(8, "address8", "phone8", true, true, new Date(), "BiggestCompany", 0.3);
	}
}
