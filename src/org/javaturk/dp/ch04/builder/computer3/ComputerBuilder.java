package org.javaturk.dp.ch04.builder.computer3;

import org.javaturk.dp.ch04.builder.domain.CPU;
import org.javaturk.dp.ch04.builder.domain.Computer;
import org.javaturk.dp.ch04.builder.domain.Display;
import org.javaturk.dp.ch04.builder.domain.GraphicCard;
import org.javaturk.dp.ch04.builder.domain.HardDrive;
import org.javaturk.dp.ch04.builder.domain.Keyboard;
import org.javaturk.dp.ch04.builder.domain.Mouse;
import org.javaturk.dp.ch04.builder.domain.RAM;

public class ComputerBuilder implements ComputerBuilderI{
	private static ComputerBuilder builder = new ComputerBuilder();
	
	private Computer computer;
	
	private ComputerBuilder(){ 
		computer = new Computer();
	}
	
	public static ComputerBuilder getBuilder() {
		return builder;
	}

	@Override
	public ComputerBuilderI buildRAM() {
		RAM ram = new RAM();
		computer.setRam(ram);
		return builder;
	}

	@Override
	public ComputerBuilderI buildCPU() {
		CPU cpu = new CPU();
		computer.setCpu(cpu);
		return builder;
	}

	@Override
	public ComputerBuilderI buildHardDrive() {
		HardDrive hd = new HardDrive();
		computer.setHd(hd);
		return builder;
	}
	
	@Override
	public ComputerBuilderI buildGraphicCard() {
		GraphicCard card = new GraphicCard();
		computer.setGraphicCard(card);
		return builder;
	}

	@Override
	public ComputerBuilderI buildDisplay() {
		Display display = new Display();
		computer.setDisplay(display);
		return builder;
	}

	@Override
	public ComputerBuilderI buildMouse() {
		Mouse mouse = new Mouse();
		computer.setMouse(mouse);
		return builder;
	}

	@Override
	public ComputerBuilderI buildKeyboard() {
		Keyboard keyboard = new Keyboard();
		computer.setKeyboard(keyboard);
		return builder;
	}
	
	@Override
	public Computer build() {
		return computer;
	}
}
