package org.javaturk.dp.ch04.builder.computer2;

import org.javaturk.dp.ch04.builder.domain.Computer;

public class BuilderTest {

	public static void main(String[] args) {

		ComputerBuilderI builder = new ComputerBuilder();
		Computer computer = builder.build();
		computer.start();
	}
}
