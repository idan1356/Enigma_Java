//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.30 at 01:36:34 PM IDT 
//


package machine.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}CTE-Machine"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cteMachine"
})
@XmlRootElement(name = "CTE-Enigma")
public class CTEEnigma {

    @XmlElement(name = "CTE-Machine", required = true)
    protected CTEMachine cteMachine;

    /**
     * Gets the value of the cteMachine property.
     * 
     * @return
     *     possible object is
     *     {@link CTEMachine }
     *     
     */
    public CTEMachine getCTEMachine() {
        return cteMachine;
    }

    /**
     * Sets the value of the cteMachine property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTEMachine }
     *     
     */
    public void setCTEMachine(CTEMachine value) {
        this.cteMachine = value;
    }

}
