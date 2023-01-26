package org.javaturk.dp.ch04.builder.computer7;


public interface BaseComputerBuilderI {

	public BaseComputerBuilderI buildRAM();

	public BaseComputerBuilderI buildCPU();

	public BaseComputerBuilderI buildHardDrive();

	public ComputerDisplayBuilderI buildBaseComputer();

}
