
package main.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "berechneUmfangResponse", namespace = "http://www.axxg.de/ws/rechteck")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "berechneUmfangResponse", namespace = "http://www.axxg.de/ws/rechteck")
public class BerechneUmfangResponse {

    @XmlElement(name = "Umfang", namespace = "")
    private float umfang;

    /**
     * 
     * @return
     *     returns float
     */
    public float getUmfang() {
        return this.umfang;
    }

    /**
     * 
     * @param umfang
     *     the value for the umfang property
     */
    public void setUmfang(float umfang) {
        this.umfang = umfang;
    }

}
