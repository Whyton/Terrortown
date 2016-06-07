
package main.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "makeMessageResponse", namespace = "http://www.axxg.de/ws/rechteck")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "makeMessageResponse", namespace = "http://www.axxg.de/ws/rechteck")
public class MakeMessageResponse {

    @XmlElement(name = "makeMessage", namespace = "")
    private String makeMessage;

    /**
     * 
     * @return
     *     returns String
     */
    public String getMakeMessage() {
        return this.makeMessage;
    }

    /**
     * 
     * @param makeMessage
     *     the value for the makeMessage property
     */
    public void setMakeMessage(String makeMessage) {
        this.makeMessage = makeMessage;
    }

}
