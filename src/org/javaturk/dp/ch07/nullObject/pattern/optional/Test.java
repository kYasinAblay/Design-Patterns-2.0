package org.javaturk.dp.ch07.nullObject.pattern.optional;

public class Test {

	public static void main(String[] args) {
		Factory factory = new Factory();
		Client client = new Client(factory);
		client.start();
	}
}
