package org.javaturk.dp.ch04.builder.xml;

import java.text.NumberFormat;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

/**
 * This class implements the business logic for the sample.
 */
public class Order {

	private Document doc;
	private final double TAX = 8.25;
	private final int DISCOUNT = 10;
	private final int DISCOUNT_PRICE = 100;
	private double orderPrice;
	private double orderTax;

	private double orderTotal;

	public Order(Document doc) {
		this.doc = doc;
		reCalculateOrder();
	}

	/**
	 * Re calculate Order - price, tax and total
	 */
	private void reCalculateOrder() {
		orderPrice = countPrice();
		orderTax = calculateTax();
		orderTotal = calculateOrder();
	}

	/**
	 * Calculate total amount for element PRICE
	 */
	private float countPrice() {
		float price = 0;
		String strValue = "";
		float floatValue = 0;
		final String tag = "PRICE";
		NodeList list = doc.getElementsByTagName(tag);

		for (int i = 0; i < list.getLength(); i++) {
			Node element = list.item(i);
			NodeList elementsList = element.getChildNodes();
			for (int j = 0; j < elementsList.getLength(); j++) {
				Node attribute = elementsList.item(j);
				if ((Node.TEXT_NODE == attribute.getNodeType()) && (attribute.getNodeValue() != null))
					strValue = attribute.getNodeValue().trim();
			}

			floatValue = Float.parseFloat(strValue);
			price += floatValue;
		}

		return price;
	}

	/**
	 * Calculate amount for element PRICE
	 * 
	 * @return Price
	 */
	public String getOrderPrice() {
		return NumberFormat.getCurrencyInstance().format(orderPrice);
	}

	/**
	 * Calculate the Tax
	 * 
	 * @return Tax
	 */
	private double calculateTax() {
		double theTax = orderPrice * TAX / 100;
		return theTax;
	}

	/**
	 * Returns Order's Tax
	 * 
	 * @return Tax
	 */
	public String getOrderTax() {
		return NumberFormat.getCurrencyInstance().format(orderTax);
	}

	/**
	 * Calculate the Order Total
	 * 
	 * @return Total
	 */
	private double calculateOrder() {
		return orderTax + orderPrice;
	}

	/**
	 * Returns Order Total
	 * 
	 * @return Total
	 */
	public String getOrderTotal() {
		return NumberFormat.getCurrencyInstance().format(orderTotal);
	}

	/**
	 * Create and append TAX and TOTAL elements
	 */
	public void AddTaxAndTotal() {
		// Add Tax Element to Manifest
		// Get Manifest Element
		Node manifest = doc.getElementsByTagName("Manifest").item(0);
		// Create TAX Element
		Node taxElement = doc.createElement("TAX");
		// Insert TAX Element
		manifest.appendChild(taxElement);
		// Insert TAX value
		Node value = doc.createTextNode(getOrderTax());
		taxElement.appendChild(value);

		// Add Total Element to Manifest
		// Create TOTAL Element
		Node totalElement = doc.createElement("TOTAL");
		// Insert TOTAL Element
		manifest.appendChild(totalElement);
		// Insert TOTAL value
		value = doc.createTextNode(getOrderPrice());
		totalElement.appendChild(value);
	}

	/**
	 * Calculate and apply discount
	 */
	public void applyDiscount() {
		String strValue = "";
		float floatValue = 0;
		final String tag = "PRICE";
		NodeList list = doc.getElementsByTagName(tag);

		for (int i = 0; i < list.getLength(); i++) {
			Node element = list.item(i);
			NodeList elementsList = element.getChildNodes();
			Node attribute = null;
			for (int j = 0; j < elementsList.getLength(); j++) {
				attribute = elementsList.item(j);
				if ((Node.TEXT_NODE == attribute.getNodeType()) && (attribute.getNodeValue() != null)) {
					strValue = attribute.getNodeValue().trim();
					break;
				}
			}
			floatValue = Float.parseFloat(strValue);
			floatValue = floatValue - floatValue * DISCOUNT / 100;
			if (null != attribute) {
				strValue = Float.toString(floatValue);
				attribute.setNodeValue(strValue);
			}
		}
		reCalculateOrder();
	}

	/**
	 * Check for Discount
	 * 
	 * @return true for Discount and false otherwise
	 */
	public boolean isDiscount() {
		if (orderPrice > DISCOUNT_PRICE)
			return true;
		else
			return false;
	}

	/**
	 * Print the Order's Info
	 */
	public void print() {
		System.out.println("Order price: " + getOrderPrice());
		System.out.println("Order tax: " + getOrderTax());
		System.out.println("Order total: " + getOrderTotal());
	}

}