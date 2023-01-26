package org.javaturk.dp.ch04.builder.computer6;

public class Test {

	public static void main(String[] args) {

		Computer bareBoneComputer = Computer.getBaseBuilder("My Computer").buildRAM().buildCPU().buildHardDrive()
				.buildBaseComputer();
		bareBoneComputer.start();

		System.out.println();

		Computer computerWithDisplay = bareBoneComputer.getDisplayBuilder().buildGraphicCard().buildComputerDisplay();
		computerWithDisplay.start();

		System.out.println();

		Computer computerWithDisplayAndAccessories = computerWithDisplay.getAccessoryBuilder().buildKeyboard().buildMouse().buildAccessories();
		computerWithDisplayAndAccessories.start();
	}
}
