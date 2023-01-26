package org.javaturk.dp.ch04.builder.computer4;


public class Test {

	public static void main(String[] args) {
		
		Computer bareBoneComputer = Computer.getBuilder("barebone computer").buildCPU().buildRAM().buildHardDrive().build();
		bareBoneComputer.start();
		
		

	}
}
