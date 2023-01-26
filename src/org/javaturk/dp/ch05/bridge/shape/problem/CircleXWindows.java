package org.javaturk.dp.ch05.bridge.shape.problem;

public class CircleXWindows extends Circle {

	public CircleXWindows(String name) {
		super(name);
	}
	
	@Override
	public void draw() {
		System.out.println("XWindows: Drawing a circle.");
	}

	@Override
	public void erase() {
		System.out.println("XWindows: Erasing a circle.");		
	}
}
