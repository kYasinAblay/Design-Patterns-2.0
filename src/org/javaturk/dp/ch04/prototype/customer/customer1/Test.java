package org.javaturk.dp.ch04.prototype.customer.customer1;

import java.util.Date;

import org.javaturk.dp.ch04.prototype.customer.domain.*;

public class Test {

	public static void main(String[] args) {
		IndividualCustomer prototype = new IndividualCustomer(1, "dummy address", "dummy phone", false, false, new Date(), "dummy name", "dummy lastname", new Date());
		System.out.println(prototype);
		
		// Unauthenticated and unvalidated individual customer
		IndividualCustomer ic1 = (IndividualCustomer) prototype.clone();
		ic1.setFirstName("Ali");
		ic1.setLastName("Kemal");
		ic1.setAddress("address1");
		ic1.setPhone("phone1");
		ic1.setDob(new Date());
		System.out.println(ic1);
		
		// Authenticated and validated individual customer
		IndividualCustomer ic2 = (IndividualCustomer) prototype.clone();
		ic2.setId(4);
		ic2.setFirstName("Selim");
		ic2.setLastName("Ozel");
		ic2.setAddress("address4");
		ic2.setPhone("phone4");
		ic2.setDob(new Date());
		ic2.setAuthenticated(true);
		ic2.setValidated(true);
		System.out.println(ic2);
		
//		CorporateCustomer unAuthenticatedGECustomerPrototype = new CorporateCustomer(100, "Manolya Cad. No 5 Sariyer Istanbul", "2124199047", "GE", 0.25);
//		System.out.println(unAuthenticatedGECustomerPrototype);

	}
}
