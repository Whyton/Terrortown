
package de.axxg.rechteckws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "RechteckWebService", targetNamespace = "http://www.axxg.de/ws/rechteck", wsdlLocation = "http://localhost:9202/rechteck/RechteckWebService?wsdl")
public class RechteckWebService_Service
    extends Service
{

    private final static URL RECHTECKWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException RECHTECKWEBSERVICE_EXCEPTION;
    private final static QName RECHTECKWEBSERVICE_QNAME = new QName("http://www.axxg.de/ws/rechteck", "RechteckWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9202/rechteck/RechteckWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RECHTECKWEBSERVICE_WSDL_LOCATION = url;
        RECHTECKWEBSERVICE_EXCEPTION = e;
    }

    public RechteckWebService_Service() {
        super(__getWsdlLocation(), RECHTECKWEBSERVICE_QNAME);
    }

    public RechteckWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), RECHTECKWEBSERVICE_QNAME, features);
    }

    public RechteckWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, RECHTECKWEBSERVICE_QNAME);
    }

    public RechteckWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RECHTECKWEBSERVICE_QNAME, features);
    }

    public RechteckWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RechteckWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RechteckWebService
     */
    @WebEndpoint(name = "RechteckWebServicePort")
    public RechteckWebService getRechteckWebServicePort() {
        return super.getPort(new QName("http://www.axxg.de/ws/rechteck", "RechteckWebServicePort"), RechteckWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RechteckWebService
     */
    @WebEndpoint(name = "RechteckWebServicePort")
    public RechteckWebService getRechteckWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.axxg.de/ws/rechteck", "RechteckWebServicePort"), RechteckWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RECHTECKWEBSERVICE_EXCEPTION!= null) {
            throw RECHTECKWEBSERVICE_EXCEPTION;
        }
        return RECHTECKWEBSERVICE_WSDL_LOCATION;
    }

}