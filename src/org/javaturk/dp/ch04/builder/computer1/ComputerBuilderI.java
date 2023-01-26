package org.javaturk.dp.ch04.builder.computer1;

import org.javaturk.dp.ch04.builder.*;
import org.javaturk.dp.ch04.builder.domain.CPU;
import org.javaturk.dp.ch04.builder.domain.Computer;
import org.javaturk.dp.ch04.builder.domain.Display;
import org.javaturk.dp.ch04.builder.domain.GraphicCard;
import org.javaturk.dp.ch04.builder.domain.HardDrive;
import org.javaturk.dp.ch04.builder.domain.RAM;

public interface ComputerBuilderI {

	public RAM buildRAM();

	public CPU buildCPU();

	public HardDrive buildHardDrive();
	
	public GraphicCard buildGraphicCard();

	public Display buildDisplay();

	public Computer buildComputer();

}
