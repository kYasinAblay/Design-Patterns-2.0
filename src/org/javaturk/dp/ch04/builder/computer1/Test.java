package org.javaturk.dp.ch04.builder.computer1;

import org.javaturk.dp.ch04.builder.*;
import org.javaturk.dp.ch04.builder.domain.Computer;
import org.javaturk.dp.ch04.builder.domain.Display;
import org.javaturk.dp.ch04.builder.domain.RAM;

public class Test {

	public static void main(String[] args) {

		ComputerBuilderI builder = new ComputerBuilder();
		Computer computer = builder.buildComputer();
		computer.start();

		RAM ram = builder.buildRAM();
		Display display = builder.buildDisplay();

	}
}
