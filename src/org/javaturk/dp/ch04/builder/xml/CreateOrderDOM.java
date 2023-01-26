
package org.javaturk.dp.ch04.builder.xml;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

/**
 * This class construcs an XML document in memory using DOM. It first creates
 * the root Order element and subsequently creates components of the order by
 * inserting nodes to the root element.
 */
public class CreateOrderDOM {

	/**
	 * DOM Document
	 */
	private Document document = null;

	public CreateOrderDOM() {
		DocumentBuilder builder = null;
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			builder = factory.newDocumentBuilder();
			document = builder.newDocument();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}

		// Insert Root Order
		Element root = (Element) document.createElement("Order");

		// Insert child Manifest
		document.appendChild(root);
		Node manifestChild = document.createElement("Manifest");
		root.appendChild(manifestChild);

		// Insert Items
		insertItem(document, manifestChild, "201", "Name twenty one", "229.99");
		insertItem(document, manifestChild, "208", "Name twenty two", "219.99");
		insertItem(document, manifestChild, "225", "Name twenty three", "239.99");
		insertItem(document, manifestChild, "243", "Name twenty four", "259.99");
		insertItem(document, manifestChild, "218", "Name twenty five", "299.99");

		// Normalizing the DOM
		document.getDocumentElement().normalize();
	}

	/**
	 * @return Document
	 */
	public Document getDocument() {
		return document;
	}

	/**
	 * Insert "Item" to Document
	 * 
	 * @param document
	 *            - Order Document
	 * @param parent
	 *            - Node where to insert a "Item"
	 * @param id
	 *            - Item's ID
	 * @param name
	 *            - Item's Name
	 * @param price
	 *            - Item's Price
	 */
	private void insertItem(Document document, Node parent, String id, String name, String price) {
		// Insert child Item
		Node itemChild = document.createElement("Item");
		parent.appendChild(itemChild);

		// Insert child ID
		Node item = document.createElement("ID");
		itemChild.appendChild(item);
		// Insert ID value
		Node value = document.createTextNode(id);
		item.appendChild(value);

		// Insert child NAME
		item = document.createElement("NAME");
		itemChild.appendChild(item);
		// Insert NAME value
		value = document.createTextNode(name);
		item.appendChild(value);

		// Insert child PRICE
		item = document.createElement("PRICE");
		itemChild.appendChild(item);
		// Insert PRICE value
		value = document.createTextNode(price);
		item.appendChild(value);
	}
}