
package org.javaturk.dp.ch05.bridge.basic.pattern;

/**
 * @author akin
 *
 */
public class Client {
	private AnAbstraction anAbstraction;
	
	public Client(AnAbstraction anAbstraction){
		this.anAbstraction = anAbstraction;
	}
	
	public void start(){
		anAbstraction.doIt();
	}

}
