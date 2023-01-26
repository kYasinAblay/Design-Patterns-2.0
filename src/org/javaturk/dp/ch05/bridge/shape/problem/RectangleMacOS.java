package org.javaturk.dp.ch05.bridge.shape.problem;

public class RectangleMacOS extends Rectangle {

	public RectangleMacOS(String name) {
		super(name);
	}
	
	@Override
	public void draw() {
		System.out.println("MacOS: Drawing a rectangle.");
	}

	@Override
	public void erase() {
		System.out.println("MacOS: Erasing a rectangle.");		
	}
}
