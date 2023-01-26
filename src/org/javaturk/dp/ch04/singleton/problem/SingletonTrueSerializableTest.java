package org.javaturk.dp.ch04.singleton.problem;

import java.io.*;

/**
 * Created by Murat Öngüdü on 4/4/2015.
 */
public class SingletonTrueSerializableTest {

	public static void main(String[] args) {

		SingletonTrueSerializable singleton1 = SingletonTrueSerializable
				.getInstance();

		String filePath = "/Users/akin/Desktop/singleton.ser";
		serializeToFile(singleton1, filePath);

		SingletonTrueSerializable singleton2 = deserializeToObject(
				SingletonTrueSerializable.class, filePath);

		if (singleton1 == singleton2) {
			System.out.println("2 instances are equal");
		} else {
			System.out.println("2 instances are NOT equal");
		}

		System.out.println("Their names are same.");
		print(singleton1);
		print(singleton2);
	}

	private static void print(SingletonTrueSerializable singleton) {
		String msg = String.format("Name=%s, HashCode=%s", singleton.getName(),
				singleton.hashCode());
		System.out.println(msg);
	}

	private static <T> T deserializeToObject(Class<T> clazz, String filePath) {

		T o = null;

		try (FileInputStream fileIn = new FileInputStream(filePath);
				ObjectInputStream in = new ObjectInputStream(fileIn);) {
			o = (T) in.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return o;
	}

	private static void serializeToFile(Object o, String filePath) {

		try (FileOutputStream fileOut = new FileOutputStream(filePath);
				ObjectOutputStream out = new ObjectOutputStream(fileOut);) {
			out.writeObject(o);
			System.out.printf("Serialized data is saved in " + filePath);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
