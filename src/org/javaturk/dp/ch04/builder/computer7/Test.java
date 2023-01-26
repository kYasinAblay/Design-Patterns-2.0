package org.javaturk.dp.ch04.builder.computer7;

public class Test {

	public static void main(String[] args) {
		BaseComputerBuilderI baseBuilder = Computer.getBaseBuilder("My Computer");

		ComputerDisplayBuilderI displayBuilder = baseBuilder.buildRAM().buildCPU().buildHardDrive()
				.buildBaseComputer();

		AccessoryBuilderI accessoryBuilder = displayBuilder.buildGraphicCard().buildComputerDisplay();

		Computer computerWithDisplayAndAccessories = accessoryBuilder.buildKeyboard().buildMouse().build();
		
		computerWithDisplayAndAccessories.start();
	}
}
