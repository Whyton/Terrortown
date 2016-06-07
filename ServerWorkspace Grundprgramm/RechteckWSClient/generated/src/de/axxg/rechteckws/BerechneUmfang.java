
package de.axxg.rechteckws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für berechneUmfang complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="berechneUmfang">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Laenge" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="Breite" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "berechneUmfang", propOrder = {
    "laenge",
    "breite"
})
public class BerechneUmfang {

    @XmlElement(name = "Laenge")
    protected float laenge;
    @XmlElement(name = "Breite")
    protected float breite;

    /**
     * Ruft den Wert der laenge-Eigenschaft ab.
     * 
     */
    public float getLaenge() {
        return laenge;
    }

    /**
     * Legt den Wert der laenge-Eigenschaft fest.
     * 
     */
    public void setLaenge(float value) {
        this.laenge = value;
    }

    /**
     * Ruft den Wert der breite-Eigenschaft ab.
     * 
     */
    public float getBreite() {
        return breite;
    }

    /**
     * Legt den Wert der breite-Eigenschaft fest.
     * 
     */
    public void setBreite(float value) {
        this.breite = value;
    }

}
