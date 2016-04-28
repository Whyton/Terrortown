
package de.axxg.rechteckws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.axxg.rechteckws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BerechneUmfangResponse_QNAME = new QName("http://www.axxg.de/ws/rechteck", "berechneUmfangResponse");
    private final static QName _BerechneUmfang_QNAME = new QName("http://www.axxg.de/ws/rechteck", "berechneUmfang");
    private final static QName _BerechneInhaltResponse_QNAME = new QName("http://www.axxg.de/ws/rechteck", "berechneInhaltResponse");
    private final static QName _BerechneInhalt_QNAME = new QName("http://www.axxg.de/ws/rechteck", "berechneInhalt");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.axxg.rechteckws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BerechneInhalt }
     * 
     */
    public BerechneInhalt createBerechneInhalt() {
        return new BerechneInhalt();
    }

    /**
     * Create an instance of {@link BerechneInhaltResponse }
     * 
     */
    public BerechneInhaltResponse createBerechneInhaltResponse() {
        return new BerechneInhaltResponse();
    }

    /**
     * Create an instance of {@link BerechneUmfangResponse }
     * 
     */
    public BerechneUmfangResponse createBerechneUmfangResponse() {
        return new BerechneUmfangResponse();
    }

    /**
     * Create an instance of {@link BerechneUmfang }
     * 
     */
    public BerechneUmfang createBerechneUmfang() {
        return new BerechneUmfang();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BerechneUmfangResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.axxg.de/ws/rechteck", name = "berechneUmfangResponse")
    public JAXBElement<BerechneUmfangResponse> createBerechneUmfangResponse(BerechneUmfangResponse value) {
        return new JAXBElement<BerechneUmfangResponse>(_BerechneUmfangResponse_QNAME, BerechneUmfangResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BerechneUmfang }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.axxg.de/ws/rechteck", name = "berechneUmfang")
    public JAXBElement<BerechneUmfang> createBerechneUmfang(BerechneUmfang value) {
        return new JAXBElement<BerechneUmfang>(_BerechneUmfang_QNAME, BerechneUmfang.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BerechneInhaltResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.axxg.de/ws/rechteck", name = "berechneInhaltResponse")
    public JAXBElement<BerechneInhaltResponse> createBerechneInhaltResponse(BerechneInhaltResponse value) {
        return new JAXBElement<BerechneInhaltResponse>(_BerechneInhaltResponse_QNAME, BerechneInhaltResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BerechneInhalt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.axxg.de/ws/rechteck", name = "berechneInhalt")
    public JAXBElement<BerechneInhalt> createBerechneInhalt(BerechneInhalt value) {
        return new JAXBElement<BerechneInhalt>(_BerechneInhalt_QNAME, BerechneInhalt.class, null, value);
    }

}
