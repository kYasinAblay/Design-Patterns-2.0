/*
 * All rights reserved
 * Written by Akin Kaldiroglu for Design Patterns Seminar
 * 27 May 2009
 * akink@bilginc.com
 */

package org.javaturk.dp.ch04.singleton;

public class Singleton {
	
	private static Singleton singleton = new Singleton();
	
	private static int count;
	private String name;

	private Singleton() {
		count++;
		name = "Singleton" + count;
	}

	public static Singleton getInstance() {
		return singleton;
	}

	public void printName() {
		System.out.println(name);
	}
}
