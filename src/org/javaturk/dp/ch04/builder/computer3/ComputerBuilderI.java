package org.javaturk.dp.ch04.builder.computer3;

import org.javaturk.dp.ch04.builder.domain.Computer;

public interface ComputerBuilderI {

	public ComputerBuilderI buildRAM();

	public ComputerBuilderI buildCPU();

	public ComputerBuilderI buildHardDrive();
	
	public ComputerBuilderI buildGraphicCard();

	public ComputerBuilderI buildDisplay();
	
	public ComputerBuilderI buildMouse();
	
	public ComputerBuilderI buildKeyboard();

	public Computer build();

}
