
package main.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "berechneUmfang", namespace = "http://www.axxg.de/ws/rechteck")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "berechneUmfang", namespace = "http://www.axxg.de/ws/rechteck", propOrder = {
    "laenge",
    "breite"
})
public class BerechneUmfang {

    @XmlElement(name = "Laenge", namespace = "")
    private float laenge;
    @XmlElement(name = "Breite", namespace = "")
    private float breite;

    /**
     * 
     * @return
     *     returns float
     */
    public float getLaenge() {
        return this.laenge;
    }

    /**
     * 
     * @param laenge
     *     the value for the laenge property
     */
    public void setLaenge(float laenge) {
        this.laenge = laenge;
    }

    /**
     * 
     * @return
     *     returns float
     */
    public float getBreite() {
        return this.breite;
    }

    /**
     * 
     * @param breite
     *     the value for the breite property
     */
    public void setBreite(float breite) {
        this.breite = breite;
    }

}
