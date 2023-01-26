
package org.javaturk.dp.ch04.prototype.customer.customer1;

import java.util.Date;

import org.javaturk.dp.ch04.prototype.customer.domain.*;

/**
 * @author akin
 *
 */
public class IndividualCustomerFactory implements Factory{
	IndividualCustomer prototype = new IndividualCustomer(1, "dummy address", "dummy phone", false, false, new Date(), "dummy name", "dummy lastname", new Date());
	

	@Override
	public Customer create() {
		return prototype.clone();
	}

}
