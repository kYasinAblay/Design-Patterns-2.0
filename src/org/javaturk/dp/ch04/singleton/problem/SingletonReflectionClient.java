package org.javaturk.dp.ch04.singleton.problem;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.javaturk.dp.ch04.singleton.Singleton;

/**
 * Client of Singleton.
 * 
 * @author akin
 *
 */
public class SingletonReflectionClient {

	public static void main(String[] args) {
		Class<Singleton> singletonClass = Singleton.class;
		Constructor<Singleton> defaultConstructor = null;
		try {
			defaultConstructor = singletonClass.getDeclaredConstructor(null);
		} catch (SecurityException e) {
			System.out.println("Problem with security: " + e.getMessage());
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			System.out.println("Problem with calling method: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Name: " + defaultConstructor.getName());
		System.out.println("Modifier: " + defaultConstructor.getModifiers());
		System.out.println("Is accessible: " + defaultConstructor.isAccessible());
		defaultConstructor.setAccessible(true);
		System.out.println("Modifier: " + defaultConstructor.getModifiers());
		System.out.println("Is accessible: " + defaultConstructor.isAccessible());

		Singleton newSingleton = null;

		System.out.println("\nCreating new singleton objects:");
		try {
			for (int i = 0; i < 100; i++) {
				newSingleton = defaultConstructor.newInstance(null);
				newSingleton.printName();
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

		Singleton anotherSingleton = null;
		Singleton yetAnotherSingleton = null;

		try {
			anotherSingleton = defaultConstructor.newInstance(null);
			yetAnotherSingleton = defaultConstructor.newInstance(null);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		if (anotherSingleton == yetAnotherSingleton)
			System.out.println("\nThe same object!");
		else
			System.out.println("\nDifferent object!");

//		Method[] methods = singletonClass.getMethods();
//		for(Method m : methods){
//			System.out.println(m.getName());
//			if(m.getName().equals("toString")){
//				try {
//					Object o = m.invoke(secondSingleton, null);
//					System.out.println(o);
//				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
//					e.printStackTrace();
//				}
//			}
//		}
	}

}
