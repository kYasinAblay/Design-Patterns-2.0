package org.javaturk.dp.ch04.prototype.customer.domain;

import java.util.Date;

public class CorporateCustomer extends Customer {

	private String corporateName;
	private double discount;

	public CorporateCustomer(int id, String address, String phone, boolean authenticated, boolean validated,
			Date membershipDate, String corporateName, double discount) {
		super(id, address, phone, authenticated, validated, membershipDate);
		this.corporateName = corporateName;
		this.discount = discount;
	}

	public String getCorporateName() {
		return corporateName;
	}

	public void setCorporateName(String corporateName) {
		this.corporateName = corporateName;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "CorporateCustomer [corporateName=" + corporateName
				+ ", discount=" + discount + ", id=" + id + ", address="
				+ address + ", phone=" + phone + ", authenticated="
				+ authenticated + "]";
	}
}
