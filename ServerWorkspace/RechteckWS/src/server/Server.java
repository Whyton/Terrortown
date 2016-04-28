package server;

import javax.xml.ws.Endpoint;

import main.RechteckService;

public class Server {

	/**
	    * @param args
	    */
	public static void main(String[] args) {
		
		 //http://192.168.201.33:9202/rechteck/RechteckWebService?wsdl
	      Endpoint.publish("http://localhost:9202/rechteck", new RechteckService());      
	      System.out.println("AxxG-RechteckWebService-Server ready!");

	}

}
