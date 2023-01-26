package org.javaturk.dp.ch05.bridge.shape.problem;

public abstract class AbstractShape implements Shape {
	protected String name;
	
	public AbstractShape(String name){
		this.name = name;
	}
}
