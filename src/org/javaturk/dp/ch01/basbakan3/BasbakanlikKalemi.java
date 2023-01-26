package org.javaturk.dp.ch01.basbakan3;

public class BasbakanlikKalemi {
	
	private Basbakan basbakan;
	
	public BasbakanlikKalemi(Basbakan basbakan){
		this.basbakan = new VekilBasbakan(basbakan);
	}

	public Basbakan banaBasbakaniVer(){
		System.out.println("Başbakanlık Kalemi: Tabi efendim");
		return basbakan;
	}
}
