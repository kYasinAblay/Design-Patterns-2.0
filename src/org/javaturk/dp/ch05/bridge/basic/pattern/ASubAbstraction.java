
package org.javaturk.dp.ch05.bridge.basic.pattern;

/**
 * @author akin
 *
 */
public class ASubAbstraction implements AnAbstraction{
	
	private AnAbstrationImplementation implementation;
	
	public ASubAbstraction(AnAbstrationImplementation implementation){
		this.implementation = implementation;
	}

	@Override
	public void doIt() {
		System.out.println("I am extending AnAbstraction.");
		implementation.doingIt();
	}
}
