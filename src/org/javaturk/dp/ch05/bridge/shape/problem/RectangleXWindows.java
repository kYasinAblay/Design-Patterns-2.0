package org.javaturk.dp.ch05.bridge.shape.problem;

public class RectangleXWindows extends Rectangle {

	public RectangleXWindows(String name) {
		super(name);
	}
	
	@Override
	public void draw() {
		System.out.println("XWindows: Drawing a rectangle.");
	}

	@Override
	public void erase() {
		System.out.println("XWindows: Erasing a rectangle.");		
	}
}
