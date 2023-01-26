package org.javaturk.dp.ch04.builder.domain;


public class BIOS {
	private ROM rom;
	
	public BIOS() {
		rom = new ROM(2*1024);
	}
	
	public void start() {
		System.out.println("BIOS: Getting the image of OS kernel.");
		rom.getOSKernelImage();
	}
}
