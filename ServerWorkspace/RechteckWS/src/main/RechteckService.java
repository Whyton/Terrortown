package main;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

	
@WebService(name = "RechteckWebService",  serviceName = "RechteckWebService", portName = "RechteckWebServicePort", targetNamespace = "http://www.axxg.de/ws/rechteck")
public class RechteckService {

		
	public  @WebResult(name= "Umfang") float berechneUmfang(
			@WebParam(name = "Laenge") float laenge, 
			@WebParam(name = "Breite") float breite) {
		return 2 * (laenge + breite);
	}

	public  @WebResult(name= "Flaecheninhalt")float berechneInhalt(
			@WebParam(name = "Laenge") float laenge, 
			@WebParam(name = "Breite") float breite) {
		return laenge * breite;
	}

	public static void main(String[] args) {}

}

