package org.javaturk.dp.ch05.bridge.shape.pattern;

public class MacOSDrawer extends AbstractShapeDrawer {

	public MacOSDrawer(String name) {
		super(name);
	}

	@Override
	public void drawCircle() {
		System.out.println("MacOSDrawer: Drawing a circle.");
	}

	@Override
	public void eraseCircle() {
		System.out.println("MacOSDrawer: Erasing a circle.");
	}

	@Override
	public void drawRectangle() {
		System.out.println("MacOSDrawer: Drawing a rectangle.");		
	}

	@Override
	public void eraseRectange() {
		System.out.println("MacOSDrawer: Erasing a rectangle.");		
	}
}
