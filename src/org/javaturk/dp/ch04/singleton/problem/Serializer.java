
package org.javaturk.dp.ch04.singleton.problem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializer {

	public static <T> T deserializeToObject(Class<T> clazz, String filePath) {
		System.out.printf("\nCreating the object out of serialized data in " + filePath);
		T o = null;
		try (FileInputStream fileIn = new FileInputStream(filePath); ObjectInputStream in = new ObjectInputStream(fileIn);) {
			o = (T) in.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return o;
	}

	public static void serializeToFile(Object o, String filePath) {
		try (FileOutputStream fileOut = new FileOutputStream(filePath); ObjectOutputStream out = new ObjectOutputStream(fileOut);) {
			out.writeObject(o);
			System.out.printf("Serialized data is saved in " + filePath);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void print(Serializable singleton) {
		String msg = String.format("\nSingleton HashCode = %s", singleton.hashCode());
		System.out.println(msg);
	}
}
