
package org.javaturk.dp.ch05.bridge.basic.problem;

public class Test {

	public static void main(String[] args) {
		Client client = new Client(new AConcreteImplementation1());
		client.start();
		
		
		client = new Client(new AConcreteImplementation2());
		client.start();
	}
}
