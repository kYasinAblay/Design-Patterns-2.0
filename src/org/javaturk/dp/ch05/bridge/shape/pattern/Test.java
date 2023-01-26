package org.javaturk.dp.ch05.bridge.shape.pattern;

public class Test {

	public static void main(String[] args) {
		WindowsDrawer windowsDrawer = new WindowsDrawer("Windows Drawer");
		MacOSDrawer macOsDrawer = new MacOSDrawer("MacOS Drawer");
		
		
		Shape circle = new Circle("Circle", windowsDrawer);
		circle.draw();
		
		circle.setDrawer(macOsDrawer);
		circle.draw();

	}

}
