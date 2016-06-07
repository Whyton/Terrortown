
package de.axxg.rechteckws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für berechneUmfangResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="berechneUmfangResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Umfang" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "berechneUmfangResponse", propOrder = {
    "umfang"
})
public class BerechneUmfangResponse {

    @XmlElement(name = "Umfang")
    protected float umfang;

    /**
     * Ruft den Wert der umfang-Eigenschaft ab.
     * 
     */
    public float getUmfang() {
        return umfang;
    }

    /**
     * Legt den Wert der umfang-Eigenschaft fest.
     * 
     */
    public void setUmfang(float value) {
        this.umfang = value;
    }

}
