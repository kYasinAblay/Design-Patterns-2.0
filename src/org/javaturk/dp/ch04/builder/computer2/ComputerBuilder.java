package org.javaturk.dp.ch04.builder.computer2;

import org.javaturk.dp.ch04.builder.domain.CPU;
import org.javaturk.dp.ch04.builder.domain.Computer;
import org.javaturk.dp.ch04.builder.domain.Display;
import org.javaturk.dp.ch04.builder.domain.GraphicCard;
import org.javaturk.dp.ch04.builder.domain.HardDrive;
import org.javaturk.dp.ch04.builder.domain.RAM;

public class ComputerBuilder implements ComputerBuilderI{
	private Computer computer;
	
	private void buildRAM() {
		RAM ram = new RAM();
		computer.setRam(ram);
	}

	private void buildCPU() {
		CPU cpu = new CPU();
		computer.setCpu(cpu);
	}

	private void buildHardDrive() {
		HardDrive hd = new HardDrive();
		computer.setHd(hd);
	}

	private void buildGraphicCard() {
		GraphicCard card = new GraphicCard();
		computer.setGraphicCard(card);		
	}
	
	private void buildDisplay() {
		Display display = new Display();
		computer.setDisplay(display);
	}

	@Override
	public Computer build() {
		computer = new Computer();
		buildRAM();
		buildCPU() ;
		buildHardDrive();
		buildGraphicCard();
		buildDisplay();
		return computer;
	}
}
