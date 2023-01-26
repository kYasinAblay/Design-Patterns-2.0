
package org.javaturk.dp.ch04.singleton;

/**
 * @author akin
 *
 */
public class DoubleCheckedLockingSingletonClient extends Thread {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			new DoubleCheckedLockingSingletonClient().start();
		}
	}

	public void run() {
		DoubleCheckedLockingSingleton ls = DoubleCheckedLockingSingleton.getInstance();
		ls.printName();
	}
}
