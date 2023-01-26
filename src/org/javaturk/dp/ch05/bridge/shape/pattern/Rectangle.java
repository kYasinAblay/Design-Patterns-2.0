package org.javaturk.dp.ch05.bridge.shape.pattern;

public class Rectangle extends AbstractShape {

	public Rectangle(String name, ShapeDrawer drawer) {
		super(name, drawer);
	}

	@Override
	public void draw() {
		drawer.drawRectangle();
	}

	@Override
	public void erase() {
		drawer.eraseRectange();
	}
}
