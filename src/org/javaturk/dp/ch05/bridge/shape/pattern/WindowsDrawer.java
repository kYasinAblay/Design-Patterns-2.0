package org.javaturk.dp.ch05.bridge.shape.pattern;

public class WindowsDrawer extends AbstractShapeDrawer {

	public WindowsDrawer(String name) {
		super(name);
	}

	@Override
	public void drawCircle() {
		System.out.println("WindowsDrawer: Drawing a circle.");
	}

	@Override
	public void eraseCircle() {
		System.out.println("WindowsDrawer: Erasing a circle.");
	}

	@Override
	public void drawRectangle() {
		System.out.println("WindowsDrawer: Drawing a rectangle.");		
	}

	@Override
	public void eraseRectange() {
		System.out.println("WindowsDrawer: Erasing a rectangle.");		
	}
}
