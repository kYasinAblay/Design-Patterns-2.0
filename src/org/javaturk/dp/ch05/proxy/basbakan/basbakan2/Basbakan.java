
package org.javaturk.dp.ch05.proxy.basbakan.basbakan2;

public class Basbakan {

	public void dertDinle(String dert) {
		System.out.println("Basbakan: Dinliyorum.");
		coz(dert);
	}

	public void isBul(String yakinim) {
		System.out.println("Basbakan: Bana boyle isteklerle gelmeyin.");
	}

	private void coz(String dert) {
		System.out.println("Basbakan: Bu derdi çözün: " + dert);
	}
}
