package org.javaturk.dp.ch04.builder.computer6;


public interface BaseComputerBuilderI {

	public BaseComputerBuilderI buildRAM();

	public BaseComputerBuilderI buildCPU();

	public BaseComputerBuilderI buildHardDrive();

	public Computer buildBaseComputer();

}
