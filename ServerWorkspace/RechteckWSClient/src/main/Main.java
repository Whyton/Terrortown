package main;

import de.axxg.rechteckws.RechteckWebService;
import de.axxg.rechteckws.RechteckWebService_Service;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		RechteckWebService_Service myRechteckWebService_Service = new RechteckWebService_Service();
		
		// Der eigentliche Ws - die Methode heiﬂt so, wie der Ws
		RechteckWebService myService = myRechteckWebService_Service.getRechteckWebServicePort();
		
		float ergUmfang = myService.berechneUmfang(4, 5);
		float ergInhalt = myService.berechneInhalt(4, 5);
		
		System.out.println("Fl‰cheninhalt: " + ergInhalt);
		System.out.println("Umfang: " + ergUmfang);
	}

}
