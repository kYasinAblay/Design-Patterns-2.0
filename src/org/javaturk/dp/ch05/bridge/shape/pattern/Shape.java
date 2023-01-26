package org.javaturk.dp.ch05.bridge.shape.pattern;

public interface Shape{
	
	public void draw();
	
	public void erase();
	
	public void setDrawer(ShapeDrawer drawer);

}
