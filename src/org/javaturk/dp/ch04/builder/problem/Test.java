package org.javaturk.dp.ch04.builder.problem;

import org.javaturk.dp.ch04.builder.*;
import org.javaturk.dp.ch04.builder.domain.CPU;
import org.javaturk.dp.ch04.builder.domain.Computer;
import org.javaturk.dp.ch04.builder.domain.Display;
import org.javaturk.dp.ch04.builder.domain.GraphicCard;
import org.javaturk.dp.ch04.builder.domain.HardDrive;
import org.javaturk.dp.ch04.builder.domain.Keyboard;
import org.javaturk.dp.ch04.builder.domain.Mouse;
import org.javaturk.dp.ch04.builder.domain.RAM;

public class Test {

	public static void main(String[] args) {
		Test test = new Test();
		
		CPU cpu1 = test.produceCPU();
		RAM ram1 = test.produceRAM();
		HardDrive hd1 = test.produceHardDrive();
		GraphicCard graphicCard1 = test.produceGraphicCard();
		Computer computerWithoutDisplayKeyboardAndMouse = new Computer("computerWithoutDisplayKeyboardAndMouse", cpu1, ram1, hd1, graphicCard1);
		computerWithoutDisplayKeyboardAndMouse.start();
		
		
		CPU cpu2 = test.produceCPU();
		RAM ram2 = test.produceRAM();
		HardDrive hd2 = test.produceHardDrive();
		GraphicCard graphicCard2 = test.produceGraphicCard();
		Display display2 = test.produceDisplay();
		Keyboard keyboard2 = test.produceKeyboard();
		Mouse mouse2 = test.produceMouse();
		Computer computerFull1 = new Computer("computer full1", cpu2, ram2, hd2, graphicCard2, display2, keyboard2, mouse2);
		computerFull1.start();
		
		
		Computer computerFull2 = new Computer();
		computerFull2.setName("computer full2");
		CPU cpu3 = test.produceCPU();
		computerFull2.setCpu(cpu3);
		RAM ram3 = test.produceRAM();
		computerFull2.setRam(ram3);
		HardDrive hd3 = test.produceHardDrive();
		computerFull2.setHd(hd3);
		GraphicCard graphicCard3 = test.produceGraphicCard();
		computerFull2.setGraphicCard(graphicCard3);
		Display display3 = test.produceDisplay();
		computerFull2.setDisplay(display3);
		Keyboard keyboard3 = test.produceKeyboard();
		computerFull2.setKeyboard(keyboard3);
		Mouse mouse3 = test.produceMouse();
		computerFull2.setMouse(mouse3);
		
		computerFull2.start();
	}

	public CPU produceCPU(){
		return new CPU();
	}
	
	private RAM produceRAM() {
		return new RAM();
	}
	
	public HardDrive produceHardDrive(){
		return new HardDrive();
	}
	
	public GraphicCard produceGraphicCard(){
		return new GraphicCard();
	}
	
	private Display produceDisplay() {
		return new Display();
	}

	private Keyboard produceKeyboard() {
		return new Keyboard();
	}

	private Mouse produceMouse() {
		return new Mouse();
	}
}
