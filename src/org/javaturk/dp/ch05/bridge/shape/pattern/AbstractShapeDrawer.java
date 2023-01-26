package org.javaturk.dp.ch05.bridge.shape.pattern;

public abstract class AbstractShapeDrawer implements ShapeDrawer{
	protected String name;
	
	public AbstractShapeDrawer(String name){
		this.name = name;
	}
}
