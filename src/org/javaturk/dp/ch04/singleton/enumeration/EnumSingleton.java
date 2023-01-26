package org.javaturk.dp.ch04.singleton.enumeration;

import java.io.Serializable;

/**
 * Implements Singleton patetrn using enumeration.
 * @author akin
 *
 */
public enum EnumSingleton implements Serializable{

	SINGLETON;

	// No need for default constructor. It is already defined as private
	private EnumSingleton() {
		System.out.println("in EnumSingleton()");
	}

	// In fact no need for this method because SINGLETON is already public.
	public static EnumSingleton getInstance() {
		return SINGLETON;
	}
}
