package org.javaturk.dp.ch04.builder.computer7;

public interface AccessoryBuilderI {
	
	public AccessoryBuilderI buildMouse();
	
	public AccessoryBuilderI buildKeyboard();

	public Computer build();

}
