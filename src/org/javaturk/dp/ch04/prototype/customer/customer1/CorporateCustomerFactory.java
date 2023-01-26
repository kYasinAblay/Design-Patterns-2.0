
package org.javaturk.dp.ch04.prototype.customer.customer1;

import java.util.Date;

import org.javaturk.dp.ch04.prototype.customer.domain.*;


/**
 * @author akin
 *
 */
public class CorporateCustomerFactory implements Factory {

	CorporateCustomer prototype = new CorporateCustomer(100, "Manolya Cad. No 5 Sariyer Istanbul", "2124199047", false, false, new Date(), "GE", 0.25);

	@Override
	public Customer create() {
		return prototype.clone();
	}
}
