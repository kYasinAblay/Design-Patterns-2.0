
package org.javaturk.dp.ch05.bridge.violation;

/**
 * @author akin
 *
 */
public class AType {
	protected int anIntVariable;
	protected boolean aBoolVariable;
	
	public AType(int anIntVariable, boolean aBoolVariable) {
		this.anIntVariable = anIntVariable;
		this.aBoolVariable = aBoolVariable;
	}

	public int getAnIntVariable() {
		return anIntVariable;
	}

	public void setAnIntVariable(int anIntVariable) {
		this.anIntVariable = anIntVariable;
	}
	
	public boolean isABoolVariable() {
		return aBoolVariable;
	}

	public void setABoolVariable(boolean aBoolVariable) {
		this.aBoolVariable = aBoolVariable;
	}
	
	public void doIt(){
		if(aBoolVariable)
			System.out.println("My variable: " + anIntVariable);
		else
			System.out.println("Nothing happened!");
	}	
}
