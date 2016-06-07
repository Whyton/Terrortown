package main;

import de.axxg.rechteckws.RechteckWebService;
import de.axxg.rechteckws.RechteckWebService_Service;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		RechteckWebService_Service myRechteckWebService_Service = new RechteckWebService_Service();
		
		// Der eigentliche Ws - die Methode heißt so, wie der Ws
		RechteckWebService myService = myRechteckWebService_Service.getRechteckWebServicePort();
		
		float ergUmfang = myService.berechneUmfang(5, 5);
		float ergInhalt = myService.berechneInhalt(5, 5);
		
		System.out.println("Flächeninhalt: " + ergInhalt);
		System.out.println("Umfang: " + ergUmfang);
		
		String n = myService.makeMessage("Tschüss");
		
		System.out.println(n);
	}

}