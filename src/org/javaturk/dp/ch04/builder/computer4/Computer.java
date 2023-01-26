package org.javaturk.dp.ch04.builder.computer4;

import org.javaturk.dp.ch04.builder.domain.CPU;
import org.javaturk.dp.ch04.builder.domain.Display;
import org.javaturk.dp.ch04.builder.domain.GraphicCard;
import org.javaturk.dp.ch04.builder.domain.HardDrive;
import org.javaturk.dp.ch04.builder.domain.Keyboard;
import org.javaturk.dp.ch04.builder.domain.Mouse;
import org.javaturk.dp.ch04.builder.domain.RAM;

public class Computer {
	private String name;
	private CPU cpu;
	private RAM ram;
	private HardDrive hd;
	private GraphicCard graphicCard;
	private Display display;
	private Keyboard keyboard;
	private Mouse mouse;

	private Computer(String name, CPU cpu, RAM ram, HardDrive hd, GraphicCard graphicCard) {
		super();
		this.name = name;
		this.cpu = cpu;
		this.ram = ram;
		this.hd = hd;
		this.graphicCard = graphicCard;
	}

	private Computer(String name, CPU cpu, RAM ram, HardDrive hd, GraphicCard graphicCard, Display display) {
		super();
		this.name = name;
		this.cpu = cpu;
		this.ram = ram;
		this.hd = hd;
		this.graphicCard = graphicCard;
		this.display = display;
	}

	private Computer(String name, CPU cpu, RAM ram, HardDrive hd, GraphicCard graphicCard, Display display,
			Keyboard keyboard) {
		super();
		this.name = name;
		this.cpu = cpu;
		this.ram = ram;
		this.hd = hd;
		this.graphicCard = graphicCard;
		this.display = display;
		this.keyboard = keyboard;
	}

	private Computer(String name, CPU cpu, RAM ram, HardDrive hd, GraphicCard graphicCard, Display display,
			Keyboard keyboard, Mouse mouse) {
		super();
		this.name = name;
		this.cpu = cpu;
		this.ram = ram;
		this.hd = hd;
		this.graphicCard = graphicCard;
		this.display = display;
		this.keyboard = keyboard;
		this.mouse = mouse;
	}

	public void start() {
		cpu.start();
		ram.loadOSKernelImage();
		ram.loadOS();
		ram.loadDrivers();
		ram.startServices();
		hd.start();
		if (graphicCard != null)
			graphicCard.start();
		if (display != null)
			display.start();
		if (keyboard != null)
			keyboard.start();
		if (mouse != null)
			mouse.start();
		System.out.println("Computer " + name + " has started.\n");
	}

	public String getName() {
		return name;
	}

	public CPU getCpu() {
		return cpu;
	}

	public RAM getRam() {
		return ram;
	}

	public HardDrive getHd() {
		return hd;
	}

	public GraphicCard getGraphicCard() {
		return graphicCard;
	}

	public Display getDisplay() {
		return display;
	}

	public Keyboard getKeyboard() {
		return keyboard;
	}

	public Mouse getMouse() {
		return mouse;
	}

	public static ComputerBuilderI getBuilder(String name) {
		return new ComputerBuilder(name);
	}

	/**
	 * https://dzone.com/articles/creational-design-patterns-builder-pattern
	 * 
	 * @author akin
	 *
	 */
	public static class ComputerBuilder implements ComputerBuilderI {

		private String name;
		private CPU cpu;
		private RAM ram;
		private HardDrive hd;
		private GraphicCard graphicCard;
		private Display display;
		private Keyboard keyboard;
		private Mouse mouse;

		private ComputerBuilder(String name) {
			this.name = name;
		}

		@Override
		public ComputerBuilderI buildCPU() {
			this.cpu = new CPU();
			return this;
		}

		@Override
		public ComputerBuilderI buildRAM() {
			this.ram = new RAM();
			return this;
		}

		@Override
		public ComputerBuilderI buildHardDrive() {
			this.hd = new HardDrive();
			return this;
		}

		@Override
		public ComputerBuilderI buildGraphicCard() {
			this.graphicCard = new GraphicCard();
			return this;
		}

		@Override
		public ComputerBuilderI buildDisplay() {
			this.display = new Display();
			return this;
		}

		@Override
		public ComputerBuilderI buildMouse() {
			this.mouse = new Mouse();
			return this;
		}

		@Override
		public ComputerBuilderI buildKeyboard() {
			this.keyboard = new Keyboard();
			return this;
		}

		@Override
		public Computer build() {
			Computer computer = new Computer(this.name, this.cpu, this.ram, this.hd, this.graphicCard, this.display,
					this.keyboard, this.mouse);
			return computer;
		}
	}
}
