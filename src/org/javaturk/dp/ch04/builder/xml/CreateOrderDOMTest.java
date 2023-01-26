package org.javaturk.dp.ch04.builder.xml;

import org.w3c.dom.Document;

public class CreateOrderDOMTest {

	public static void main(String[] args) {
//		createOrderXMLUsingCreateOrderDOM();
		createDiscountedOrderXML();
	}
	
	/**
	 * User CreateOrderDOM to create a new order XML file.
	 */
	public static void createOrderXMLUsingCreateOrderDOM(){
		Document document = null;
		Order order = null;

		out("\nConstruct document using DOM in memory, save to file, and print it");
		// Build new DOM Document
		CreateOrderDOM cDOM = new CreateOrderDOM();
		document = cDOM.getDocument();
		out("New Order created");

		// Print XML content
		DOMUtil.printDOM(document);

		// Write to a file
		DOMUtil.writeXmlToFile("xml/NewOrder.xml", document);
		out("\n\nThe New Order stored to NewOrder.xml");

		// Create Order object based on Document
		order = new Order(document);
		out("\n\nPrint the Order's summary");
		order.print();
	}

	/**
	 * This method uses DOMUtil to parse, print and write XML file.
	 */
	public static void createDiscountedOrderXML() {
		Document document = null;
		out("\n\nConstruct document using existing XML Order," + " apply discount, insert Tax and Total info to the"
				+ " Order, save to file, and print it");
		// Read XML from file to DOM
		document = DOMUtil.parse("xml/Order2.xml");

		if (document != null) {
			out("\nPrint XML from file");
			DOMUtil.printDOM(document);

			// Get Order Price
			Order order = new Order(document);
			out("\nPrint the Order's summary");
			order.print();

			// Calculate total Items in Order
			int count = DOMUtil.countByTagName("Item", document);
			out("\nNumber Items in Order: " + count);

			out("Check for Discount");
			// Check for Discount
			if (order.isDiscount()) {
				out("Apply Discount");
				order.applyDiscount();
			}

			out("\nResult Order");
			order.print();

			// Add Tax and Total to the Order XML
			order.AddTaxAndTotal();
			// Print XML content
			out("\nPrint XML that include Tax and Total");
			DOMUtil.printDOM(document);

			// Write to a file
			DOMUtil.writeXmlToFile("xml/DiscountOrder.xml", document);
			out("\n\nThe Order modified and stored to DiscountOrder.xml");
		}
	}

	/**
	 * Prints to the System output a message
	 * 
	 * @param message
	 *            String
	 */
	private static void out(String message) {
		System.out.println(message);
	}
}
