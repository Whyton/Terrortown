
package de.axxg.rechteckws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für berechneInhaltResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="berechneInhaltResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Flaecheninhalt" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "berechneInhaltResponse", propOrder = {
    "flaecheninhalt"
})
public class BerechneInhaltResponse {

    @XmlElement(name = "Flaecheninhalt")
    protected float flaecheninhalt;

    /**
     * Ruft den Wert der flaecheninhalt-Eigenschaft ab.
     * 
     */
    public float getFlaecheninhalt() {
        return flaecheninhalt;
    }

    /**
     * Legt den Wert der flaecheninhalt-Eigenschaft fest.
     * 
     */
    public void setFlaecheninhalt(float value) {
        this.flaecheninhalt = value;
    }

}
