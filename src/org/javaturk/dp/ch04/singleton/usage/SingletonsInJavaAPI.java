
package org.javaturk.dp.ch04.singleton.usage;

import java.awt.Desktop;
import java.io.Console;
import java.util.Map;
import java.util.Properties;

public class SingletonsInJavaAPI {

	public static void main(String[] args) {

		Runtime rt1 = Runtime.getRuntime();
		Runtime rt2 = Runtime.getRuntime();
		if (rt1 == rt2)
			System.out.println("It's a singleton!");

		Desktop d1 = Desktop.getDesktop();
		Desktop d2 = Desktop.getDesktop();
		if (d1 == d2)
			System.out.println("It's a singleton!");

		SecurityManager sm1 = System.getSecurityManager();
		SecurityManager sm2 = System.getSecurityManager();
		if (sm1 == sm2)
			System.out.println("It's a singleton!");

		Console cons1 = System.console();
		Console cons2 = System.console();
		if (cons1 == cons2)
			System.out.println("It's a singleton!");

		Properties props1 = System.getProperties();
		Properties props2 = System.getProperties();
		if (props1 == props2)
			System.out.println("It's a singleton!");

		Map map1 = System.getenv();
		Map map2 = System.getenv();
		if (map1 == map2)
			System.out.println("It's a singleton!");
	}
}
