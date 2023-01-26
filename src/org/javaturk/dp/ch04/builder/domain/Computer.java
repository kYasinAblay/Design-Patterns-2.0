package org.javaturk.dp.ch04.builder.domain;

public class Computer {
	private String name;
	private CPU cpu;
	private RAM ram;
	private HardDrive hd;
	private GraphicCard graphicCard;
	private Display display;
	private Keyboard keyboard;
	private Mouse mouse;
	
	public Computer(){}
	
	public Computer(String name, CPU cpu, RAM ram, HardDrive hd, GraphicCard graphicCard) {
		this.name = name;
		this.cpu = cpu;
		this.ram = ram;
		this.hd = hd;
		this.graphicCard = graphicCard;
	}
	
	public Computer(String name, CPU cpu, RAM ram, HardDrive hd, GraphicCard graphicCard, Display display) {
		this.name = name;
		this.cpu = cpu;
		this.ram = ram;
		this.hd = hd;
		this.graphicCard = graphicCard;
		this.display = display;
	}

	public Computer(String name, CPU cpu, RAM ram, HardDrive hd, GraphicCard graphicCard,
			Display display, Keyboard keyboard) {
		this.name = name;
		this.cpu = cpu;
		this.ram = ram;
		this.hd = hd;
		this.graphicCard = graphicCard;
		this.display = display;
		this.keyboard = keyboard;
	}
	
	public Computer(String name, CPU cpu, RAM ram, HardDrive hd, GraphicCard graphicCard,
			Display display, Keyboard keyboard, Mouse mouse) {
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
		graphicCard.start();
		if(display != null)
			display.start();
		if(keyboard != null)
			keyboard.start();
		if(mouse != null)
			mouse.start();
		System.out.println("Computer " + name + " has started.\n");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CPU getCpu() {
		return cpu;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public RAM getRam() {
		return ram;
	}

	public void setRam(RAM ram) {
		this.ram = ram;
	}

	public HardDrive getHd() {
		return hd;
	}

	public void setHd(HardDrive hd) {
		this.hd = hd;
	}

	public GraphicCard getGraphicCard() {
		return graphicCard;
	}

	public void setGraphicCard(GraphicCard graphicCard) {
		this.graphicCard = graphicCard;
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public Keyboard getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(Keyboard keyboard) {
		this.keyboard = keyboard;
	}

	public Mouse getMouse() {
		return mouse;
	}

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
}
