/*
 * All rights reserved
 * Written by Akin Kaldiroglu for Design Patterns Seminar
 * 27 May 2009
 * akink@bilginc.com
 */

package org.javaturk.dp.ch04.singleton;

public class UpdatableSingletonClient extends Thread {
	private String name;
	private static int base = 0;
	private int price = 50;
	
	public UpdatableSingletonClient(){
		base++;
		price += base;
		name = "UpdatableSingletonClient-" + base;
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 3; i++){
			new UpdatableSingletonClient().start();
		}
	}
	
	public void run(){
		UpdatableSingleton us = UpdatableSingleton.getInstance();
		try {
			us.updateProduct(name, "Book", price);
		} catch (InterruptedException e) {
			System.out.println("InterruptedException: " + e.getMessage());
		}
	}
}
