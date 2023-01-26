
package org.javaturk.dp.ch05.bridge.basic.problem;

/**
 * @author akin
 *
 */
public class ASubAbstraction implements AnAbstraction{
	
	@Override
	public void doIt() {
		System.out.println("ASubAbstraction: I am doing.");
	}
}
