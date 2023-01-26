package org.javaturk.dp.ch04.singleton.enumeration;

/**
 * Test class of EnumSingleton.
 * @author akin
 *
 */
public class EnumSingletonClient {

	public static void main(String[] args) {
		EnumSingleton instance1 = EnumSingleton.SINGLETON;
		EnumSingleton instance2 = EnumSingleton.getInstance();
		
		if(instance1 == instance2)
			System.out.println("The same!");
		else
			System.out.println("Different!");
		
	}
}
