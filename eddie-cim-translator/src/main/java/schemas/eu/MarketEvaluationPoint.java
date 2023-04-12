
package schemas.eu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MarketEvaluationPoint complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MarketEvaluationPoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mRID" type="{urn:entsoe.eu:wgedi:MyEnergyData:10:1}MeasurementPointID_String"/&gt;
 *         &lt;element name="connectionCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usagePointLocation.geoInfoReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketEvaluationPoint", propOrder = {
    "mrid",
    "connectionCategory",
    "usagePointLocationGeoInfoReference"
})
public class MarketEvaluationPoint {

    @XmlElement(name = "mRID", required = true)
    protected MeasurementPointIDString mrid;
    protected String connectionCategory;
    @XmlElement(name = "usagePointLocation.geoInfoReference")
    protected String usagePointLocationGeoInfoReference;

    /**
     * Ruft den Wert der mrid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementPointIDString }
     *     
     */
    public MeasurementPointIDString getMRID() {
        return mrid;
    }

    /**
     * Legt den Wert der mrid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementPointIDString }
     *     
     */
    public void setMRID(MeasurementPointIDString value) {
        this.mrid = value;
    }

    /**
     * Ruft den Wert der connectionCategory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionCategory() {
        return connectionCategory;
    }

    /**
     * Legt den Wert der connectionCategory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionCategory(String value) {
        this.connectionCategory = value;
    }

    /**
     * Ruft den Wert der usagePointLocationGeoInfoReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsagePointLocationGeoInfoReference() {
        return usagePointLocationGeoInfoReference;
    }

    /**
     * Legt den Wert der usagePointLocationGeoInfoReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsagePointLocationGeoInfoReference(String value) {
        this.usagePointLocationGeoInfoReference = value;
    }

}
