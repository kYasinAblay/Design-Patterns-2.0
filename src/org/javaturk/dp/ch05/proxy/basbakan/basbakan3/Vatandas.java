package org.javaturk.dp.ch05.proxy.basbakan.basbakan3;

public class Vatandas {
	private Basbakan basbakan;
	
	public Vatandas(BasbakanlikKalemi kalem){
		basbakan = kalem.banaBasbakaniVer();
	}

	public String derdiniAnlat(){
		basbakan.dertDinle("Bir derdim var...");
		return "Yasasiiinnn!!!";
	}
	
	public String isIste(){
		basbakan.isBul("Oglum");
		return "Yasasiiinnn!!!";
	}
}
