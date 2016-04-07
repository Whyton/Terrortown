package TerrorTownServer;

import javax.jws.WebService;

@WebService(name = "TerrorTownService",  serviceName = "TerrorTownService", portName = "TerrorTownServicePort", targetNamespace = "http://www.axxg.de/ws/rechteck")
public class TerrorTownServer {

	public float berechneUmfang(float laenge, float breite) {
	      return 2 * (laenge + breite);
	   }
	 
	   public float berechneInhalt(float laenge, float breite) {
	      return laenge * breite;
	   }
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
