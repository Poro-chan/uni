
package schemas.eu;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Point complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Point"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="position" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}Position_Integer"/&gt;
 *         &lt;element name="in_Quantity.quantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="in_Quantity.quality" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}Quality_String" minOccurs="0"/&gt;
 *         &lt;element name="out_Quantity.quantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="out_Quantity.quality" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}Quality_String" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Point", propOrder = {
    "position",
    "inQuantityQuantity",
    "inQuantityQuality",
    "outQuantityQuantity",
    "outQuantityQuality"
})
public class Point {

    @XmlSchemaType(name = "integer")
    protected int position;
    @XmlElement(name = "in_Quantity.quantity")
    protected BigDecimal inQuantityQuantity;
    @XmlElement(name = "in_Quantity.quality")
    protected String inQuantityQuality;
    @XmlElement(name = "out_Quantity.quantity")
    protected BigDecimal outQuantityQuantity;
    @XmlElement(name = "out_Quantity.quality")
    protected String outQuantityQuality;

    /**
     * Ruft den Wert der position-Eigenschaft ab.
     * 
     */
    public int getPosition() {
        return position;
    }

    /**
     * Legt den Wert der position-Eigenschaft fest.
     * 
     */
    public void setPosition(int value) {
        this.position = value;
    }

    /**
     * Ruft den Wert der inQuantityQuantity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInQuantityQuantity() {
        return inQuantityQuantity;
    }

    /**
     * Legt den Wert der inQuantityQuantity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInQuantityQuantity(BigDecimal value) {
        this.inQuantityQuantity = value;
    }

    /**
     * Ruft den Wert der inQuantityQuality-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInQuantityQuality() {
        return inQuantityQuality;
    }

    /**
     * Legt den Wert der inQuantityQuality-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInQuantityQuality(String value) {
        this.inQuantityQuality = value;
    }

    /**
     * Ruft den Wert der outQuantityQuantity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutQuantityQuantity() {
        return outQuantityQuantity;
    }

    /**
     * Legt den Wert der outQuantityQuantity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutQuantityQuantity(BigDecimal value) {
        this.outQuantityQuantity = value;
    }

    /**
     * Ruft den Wert der outQuantityQuality-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutQuantityQuality() {
        return outQuantityQuality;
    }

    /**
     * Legt den Wert der outQuantityQuality-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutQuantityQuality(String value) {
        this.outQuantityQuality = value;
    }

}
