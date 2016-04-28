
package main.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "berechneInhaltResponse", namespace = "http://www.axxg.de/ws/rechteck")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "berechneInhaltResponse", namespace = "http://www.axxg.de/ws/rechteck")
public class BerechneInhaltResponse {

    @XmlElement(name = "Flaecheninhalt", namespace = "")
    private float flaecheninhalt;

    /**
     * 
     * @return
     *     returns float
     */
    public float getFlaecheninhalt() {
        return this.flaecheninhalt;
    }

    /**
     * 
     * @param flaecheninhalt
     *     the value for the flaecheninhalt property
     */
    public void setFlaecheninhalt(float flaecheninhalt) {
        this.flaecheninhalt = flaecheninhalt;
    }

}
